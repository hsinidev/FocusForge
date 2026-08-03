package com.example.focusforge.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "app_logs")
data class AppLogEntity(
    @PrimaryKey val id: String,
    val title: String,
    val content: String,
    val timestamp: Long
)

@Dao
interface AppDao {
    @Query("SELECT * FROM app_logs ORDER BY timestamp DESC")
    fun getLogs(): Flow<List<AppLogEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLog(log: AppLogEntity)

    @Query("DELETE FROM app_logs")
    suspend fun clearLogs()
}

@Database(entities = [AppLogEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}
