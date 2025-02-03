package com.ozoneddigital.roomdatabaseandrelationships.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.ozoneddigital.roomdatabaseandrelationships.entities.School
import com.ozoneddigital.roomdatabaseandrelationships.entities.Student

data class SchoolWithStudents (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)