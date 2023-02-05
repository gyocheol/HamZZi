package com.team.teamrestructuring.service

import android.provider.ContactsContract.CommonDataKinds.Nickname
import com.team.teamrestructuring.dto.Todo
import retrofit2.Call
import retrofit2.http.*

// 각  API 설명 확인 해서 다시 해야함
//
interface TodoService {
    // 투두 가져옴
    @GET("api/todo/{nickname}/{datetime}")
    fun getTodo(@Path("nickname") nickname: String, @Path("datetime") datetime: String): Call<MutableList<Todo>>

    // 투두리스트 생성
    @POST("api/todo")
    fun createTodo(@Body todo: Todo): Call<Todo>

    // 투두 클리어
    @PUT("api/todo/check/{id}")
    fun checkTodo(@Path("id") id: String): Call<String>

    // 투두 수정
    @PUT("api/todo/{id}")
    fun modifyTodo(@Path("id") id:String , @Body todo: Todo): Call<Todo>


    // 투두 삭제
    @DELETE("api/todo/{id}")
    fun deleteTodo(@Path("id") id: String): Call<String>

}