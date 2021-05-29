package com.easygesture.mvvm_architecture.data.api

import com.easygesture.mvvm_architecture.data.model.User
import io.reactivex.Single

interface ApiInterface {
    fun getUsers(): Single<List<User>>
}