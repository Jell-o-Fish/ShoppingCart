package com.estudillo.shoppingcart.viewmodel

import com.estudillo.shoppingcart.model.CartModel

interface CartLoadListener {
    fun onLoadCartSuccess(cartModelList: List<CartModel>)
    fun onLoadCartFailed(message: String?)
}