package com.ozoneddigital.roomdatabaseandrelationships.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.ozoneddigital.roomdatabaseandrelationships.entities.Director
import com.ozoneddigital.roomdatabaseandrelationships.entities.School

data class SchoolAndDirector (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director,
)