package com.example.kotlin2.domain.repository

import com.example.kotlin2.domain.model.Note

interface NoteRepository {

    fun addNote(note: Note)

    fun  deleteLastNote()
}