package com.ozoneddigital.roomdatabaseandrelationships.entities.relation

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val studentName:String,
    val subjectName:String
)
