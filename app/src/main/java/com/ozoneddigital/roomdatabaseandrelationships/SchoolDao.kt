package com.ozoneddigital.roomdatabaseandrelationships

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.ozoneddigital.roomdatabaseandrelationships.entities.Director
import com.ozoneddigital.roomdatabaseandrelationships.entities.School
import com.ozoneddigital.roomdatabaseandrelationships.entities.Student
import com.ozoneddigital.roomdatabaseandrelationships.entities.relation.SchoolAndDirector
import com.ozoneddigital.roomdatabaseandrelationships.entities.relation.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>
}