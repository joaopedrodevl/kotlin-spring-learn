package com.example.kotlinspringlearn.repositories

import com.example.kotlinspringlearn.models.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>