package com.ehb.wc4relationschatroom.dto

import com.ehb.wc4relationschatroom.models.User
import java.util.Date

data class MessageResponse(val message: String, val userId: Long, val user: User,
                           val chatroomId: Long, val time: Date)
