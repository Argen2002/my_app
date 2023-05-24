package com.example.my_app.domain

data class TaskModel(
    val title: String,
    val description: String,
    val pictureUri: String?= null,
    val datetime: String? = null


)
