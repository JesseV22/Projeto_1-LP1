/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_1.ctr;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;

/**
 *
 * @author Aluno
 */
public class ClienteCTR {
    //Nesta classe iremos criar métodos que irão fazer a  ligacao da classe VIEW 
    //com a classse DAO.Vamos instanciar
    ClienteDAO clienteDAO = new ClienteDAO() ;
    
    public ClienteCTR() {}
        
    public String inserirCliente(ClienteDTO clienteDTO) {
        try {

            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente Cadastrado com sucesso!!!" ;
            }else{
                return"Cliente NÂO Cadastrado!!!";                    
            }
        }
        catch (Exception e ){
            System.out.print(e.getMessage());
            return "Clientte NÂO Cadastrado";
        }
    }
     /*Metodo Consultar cliente    
    */   
    
    public ResultSet consultarCliente(ClienteDTO  clienteDTO, int opcao ) {
        
        ResultSet rs = null;
        
        
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
        
    }
    
    /**
     * Metodo utilizado para fechar o banco de dados 
     */
   public void CloseDB() {
       ConexaoDAO.closeDB();
   } //Fechar Metodo CloseDB
}
