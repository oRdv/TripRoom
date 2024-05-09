package br.senai.sp.jandira.triproom.repository

import android.content.Context
import br.senai.sp.jandira.contatos.dao.ContatoDb
import br.senai.sp.jandira.contatos.model.Contatos

class UsuariosRepository(context: Context) {

    private val db = con.getBancoDeDados(context).contatoDao()

    fun salvar (contato: Contatos): Long {
        return db.salvar(contato)
    }

    fun listarTodosContatos(): List<Contatos> {
        return db.listarTodosContatos()
    }
}