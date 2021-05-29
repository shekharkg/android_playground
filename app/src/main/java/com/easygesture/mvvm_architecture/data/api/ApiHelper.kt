package com.easygesture.mvvm_architecture.data.api

class ApiHelper (private val apiInterface: ApiInterface) {

    fun getUsers() = apiInterface.getUsers()

}