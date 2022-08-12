package com.example.kotlin2.presentation.main

import androidx.lifecycle.ViewModel
import com.example.kotlin2.data.repository.NoteRepositoryImpl
import com.example.kotlin2.domain.model.Note
import com.example.kotlin2.domain.use_case.AddNoteUseCase
import com.example.kotlin2.domain.use_case.DeleteLastNoteUseCase

class MainViewModel: ViewModel() {
    private val repository = NoteRepositoryImpl()
    private val addNoteUseCase = AddNoteUseCase(repository)
    private val deleteLastNoteUseCase = DeleteLastNoteUseCase(repository)


    val liveData = repository.liveData

    fun addNote(note: Note) {
        addNoteUseCase.addNote(note)
    }
    fun deleteLastNote(){
        deleteLastNoteUseCase.deleteLastNote()
    }
}