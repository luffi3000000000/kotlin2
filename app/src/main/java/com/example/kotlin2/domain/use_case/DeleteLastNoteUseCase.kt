package com.example.kotlin2.domain.use_case

import com.example.kotlin2.domain.repository.NoteRepository

class DeleteLastNoteUseCase(private val noteRepository: NoteRepository) {
    fun deleteLastNote(){
noteRepository.deleteLastNote()
    }
}