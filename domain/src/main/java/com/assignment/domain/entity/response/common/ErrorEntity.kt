package com.assignment.domain.entity.response.common

/**
 * Keep all the error related model class here
 * Created by: Rajesh Madasu
 **/
sealed class ErrorEntity {
    data class Error(val errorCode: Any?, val errorMessage: String? = "") : ErrorEntity()
}