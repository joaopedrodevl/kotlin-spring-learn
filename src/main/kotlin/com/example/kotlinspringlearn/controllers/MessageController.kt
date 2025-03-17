package com.example.kotlinspringlearn.controllers

import com.example.kotlinspringlearn.models.Message
import com.example.kotlinspringlearn.services.MessageService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/")
class MessageController(
    private val service: MessageService
) {
    @GetMapping
    fun listMessage() = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message): ResponseEntity<Message> {
        val savedMessage = service.save(message)
        return ResponseEntity.created(URI("/${savedMessage.id}")).body(savedMessage)
    }

    @GetMapping("/{id}")
    fun getMessage(@PathVariable id: String): ResponseEntity<Message> = service.findMessageById(id).toResponseEntity()

    private fun Message?.toResponseEntity(): ResponseEntity<Message> = this?.let {
        ResponseEntity.ok(it)
    } ?: ResponseEntity.notFound().build()
}