package com.example.kotlin2.domain.use_case

import com.example.kotlin2.domain.model.Note
import com.example.kotlin2.domain.repository.NoteRepository

class AddNoteUseCase(private val noteRepository: NoteRepository) {

    fun addNote(note: Note) {
        noteRepository.addNote(note)
    }
}