package br.senai.sp.jandira.triproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface Usuarios {

    @Insert
    fun salvar(usuarios: Usuarios): Long

    @Update
    fun atualizar(usuarios: Usuarios): Int

    @Delete
    fun excluir(usuarios: Usuarios): Int

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosContatos(): List<Usuarios>

    @Query("SELECT * FROM tbl_usuarios WHERE id = :id")
    fun buscarContatoPorID(id: Long): Usuarios

    @Query("SELECT * FROM tbl_usuarios WHERE id = :id")
    fun buscarContatoPorAmigo(id: Long): Usuarios
}
