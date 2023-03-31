package com.ehb.wc4relationschatroom.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany

@Entity
data class Chatroom(
    @Id
    @GeneratedValue
    var id: Long = -1,
    var name: String = "",
    var iconUrl: String = ""
){
    @ManyToMany
    open var users: List<User> = listOf()

    @OneToMany
    open var messages: List<Message> = listOf()

}
