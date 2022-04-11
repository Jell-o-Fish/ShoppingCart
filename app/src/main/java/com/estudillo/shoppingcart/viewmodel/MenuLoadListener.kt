package com.estudillo.shoppingcart.viewmodel

import com.estudillo.shoppingcart.model.MenuModel

interface MenuLoadListener {
    fun onMenuLoadSuccess(menuLoadListener:List<MenuModel>?)
    fun onMenuLoadFailed(message:String?)
}