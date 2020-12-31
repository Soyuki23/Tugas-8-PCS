package com.appgame.app.data.model

data class ActionState<T>(
    val data: T? = null,
    val message: String? = null,
    val isSucceess: Boolean = true,
    var isConsumed: Boolean = false
)