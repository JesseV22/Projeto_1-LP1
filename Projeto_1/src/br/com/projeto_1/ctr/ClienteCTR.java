/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_1.ctr;

import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;
import br.com.projeto_1.dto.ClienteDTO;
import java.sql.ResultSet;

/**
 *
 * @author Aluno
 */
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public ClienteCTR(){
        
    }
    public String inserirCliente(ClienteDTO cdto){
            try {
             if(clienteDAO.inserirCliente(cdto)){
                 return "Cliente cadastrado com sucesso!";
             }else{
                 return "Cliente não cadastrado!";
             }
            } catch (Exception e) {
                System.out.println("Erro: "+e.getMessage());
                 return "Cliente não cadastrado!";
            }
    }
    public String excluirCliente(ClienteDTO cdto){
            try {
             if(clienteDAO.excluirCliente(cdto)){
                 return "Cliente excluido com sucesso!";
             }else{
                 return "Cliente não excluido!";
             }
            } catch (Exception e) {
                System.out.println("Erro: "+e.getMessage());
                 return "Cliente não excluido!";
            }
    }
    public String atualizarCliente(ClienteDTO cdto){
            try {
             if(clienteDAO.atualizarCliente(cdto)){
                 return "Cliente atualizado com sucesso!";
             }else{
                 return "Cliente não atualizado!";
             }
            } catch (Exception e) {
                System.out.println("Erro: "+e.getMessage());
                 return "Cliente não atualizado!";
            }
    }
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        ResultSet rs = null;
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
