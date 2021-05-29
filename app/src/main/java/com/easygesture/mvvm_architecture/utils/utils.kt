package com.easygesture.mvvm_architecture.utils

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}


data class Resource<out T>(val status: Status, val data: T?, var msg: String?) {

    companion object {
        fun <T> success(data: T?) = Resource(Status.SUCCESS, data, null)
        fun <T> error(msg: String?, data: T?) = Resource(Status.ERROR, data, msg)
        fun <T> loading(data: T?) = Resource(Status.LOADING, data, null)
    }

}