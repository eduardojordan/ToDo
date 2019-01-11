package io.keepcoding.todo.data.repository.datasource.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "tasks")
data class TaskEntity(
   @PrimaryKey(autoGenerate = true)
   val id: Long,
   @ColumnInfo(name = "content")
   val content: String,
   @ColumnInfo(name = "create_at")
   val createdAt: Date,
   @ColumnInfo(name = "is_done")
   val isDone: Boolean
)