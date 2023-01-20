package com.ehb.wc4relationschatroom.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
// Message is a reserved keyword, which means we can't use it easily
// As such, we use an annotation to change the table name slightly
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue
    var id: Long = -1,

    var username: String,
    var email: String,
    var picture: String


){
    @ManyToMany
    open var chatrooms: List<Chatroom> = listOf()

    @OneToMany
    open var messages: List<Message> = listOf()
}
