package com.ozoneddigital.roomdatabaseandrelationships.entities.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.ozoneddigital.roomdatabaseandrelationships.entities.Student
import com.ozoneddigital.roomdatabaseandrelationships.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students:List<Student>
)
