package com.example.kotlin2.data.mapper

import com.example.kotlin2.data.model.NoteDto
import com.example.kotlin2.domain.model.Note

class NoteMapper {

    fun toNote(note: NoteDto) = Note(
        title = note.title,
        text = note.text
    )
    fun toNoteDto(note: Note) = NoteDto(
        title = note.title,
        text = note.text
    )
}