/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_1.dao;

import java.sql.*;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dto.ClienteDTO;

public class ClienteDAO {

    public ClienteDAO() {

    }
    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            //Comando para inserir dados no DB
            String comando = "Insert into cliente (nome_cli , logradouro_cli , numero_cli ,"
                    + "bairro_cli, cidade_cli,estado_cli, cep_cli, cpf_cli, rg_cli) values ("
                    + "'" + clienteDTO.getNome_cli() + "', "
                    + "'" + clienteDTO.getLogradouro_cli() + "', "
                    + clienteDTO.getNumero_cli() + ", "
                    + "'" + clienteDTO.getBairro_cli() + "', "
                    + "'" + clienteDTO.getCidade_cli() + "', "
                    + "'" + clienteDTO.getEstado_cli() + "', "
                    + "'" + clienteDTO.getCep_cli() + "', "
                    + "'" + clienteDTO.getCpf_cli() + "', "
                    + "'" + clienteDTO.getRg_cli() + "')";
            stmt.execute(comando.toUpperCase());

            ConexaoDAO.con.commit();

            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.closeDB();
        }
    }

    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        try {

            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "Select c.* "
                            + "from cliente c "
                            + "where nome_cli like '" + clienteDTO.getNome_cli() + "%' "
                            + "order by c.nome_cli";
                    break;
                case 2:
                    comando = "Select c.* "
                            + "from cliente c "
                            + "where c.id_cli = " + clienteDTO.getNome_cli();
                    break;
                case 3:
                    comando = "Select c.id_cli, c.nome_cli from cliente c";
                    break;

                    
            }
            System.out.println(comando);
            rs = stmt.executeQuery(comando.toLowerCase());
                    return rs;
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}
