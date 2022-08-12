package com.example.kotlin2.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.kotlin2.data.mapper.NoteMapper
import com.example.kotlin2.data.model.NoteDto
import com.example.kotlin2.domain.model.Note
import com.example.kotlin2.domain.repository.NoteRepository

class NoteRepositoryImpl: NoteRepository {

    private val noteMapper = NoteMapper()
    val liveData = MutableLiveData<List<NoteDto>>()
    private val notes = arrayListOf<NoteDto>()


    override fun addNote(note: Note) {
    notes.add(noteMapper.toNoteDto(note))
    liveData.value = notes
    }

    override fun deleteLastNote() {
        notes.removeLast()
        liveData.value = notes
    }




}