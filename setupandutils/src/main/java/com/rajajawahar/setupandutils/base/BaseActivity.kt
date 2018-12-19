package com.rajajawahar.setupandutils.base

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.rajajawahar.setupandutils.utils.UiUtils

@Suppress("UNCHECKED_CAST")
abstract class BaseActivity<in V : BaseView, T : BasePresenter<V>> : AppCompatActivity(),
    BaseView {

    protected abstract var presenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(view = this as V)
    }

    override fun showError(error: String) {
        UiUtils.showSnackBar(findViewById(android.R.id.content), error, Snackbar.LENGTH_SHORT)
    }

    override fun showError(stringResId: Int) {

    }

    override fun showMessage(srtResId: Int) {

    }

    override fun showMessage(message: String) {
        UiUtils.showSnackBar(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}