package com.rajajawahar.basicsetup

import android.content.Context
import com.rajajawahar.setupandutils.base.BaseActivity

class HomeActivity : BaseActivity<HomeView, HomePresenter>() {

    override var presenter: HomePresenter = HomePresenter()

    override fun getContext(): Context = this
}