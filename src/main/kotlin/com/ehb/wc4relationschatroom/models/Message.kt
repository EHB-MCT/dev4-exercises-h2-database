package com.ehb.wc4relationschatroom.models

import jakarta.persistence.*
import java.util.Date

@Entity
// Message is a reserved keyword, which means we can't use it easily
// As such, we use an annotation to change the table name slightly
// @Table(name = "messages")
data class Message(
    @Id
    @GeneratedValue
    var id:Long = -1,

    // Value is a reserved keyword, which means we can't use it easily
    // As such, we'll use "content" instead
    var content: String,
    var time: Date
){
    @ManyToOne
    open lateinit var chatroom: Chatroom

    @ManyToOne
    open lateinit var user: User
}
