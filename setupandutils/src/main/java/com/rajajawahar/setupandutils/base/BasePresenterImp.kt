package com.rajajawahar.setupandutils.base

abstract class BasePresenterImp<V : BaseView> : BasePresenter<V> {

    protected var view: V? = null


    init {

    }

    override fun attachView(view: V) {
        this.view = view

    }

    override fun detachView() {
        view = null
    }

    protected fun isViewAttached(): Boolean = view != null
}