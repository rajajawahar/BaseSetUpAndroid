package com.rajajawahar.setupandutils.base


interface BasePresenter<in V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}