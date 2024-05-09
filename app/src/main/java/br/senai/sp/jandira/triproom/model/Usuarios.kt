package br.senai.sp.jandira.triproom.model

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update

@Entity(tableName = "tbl_usuarios")
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    var nome: String = "",
    var telefone: String = "",
    var email: String = "",
    var senha: String = "",

    @ColumnInfo(name = "is_minor")
    var over18: Boolean = false
)
