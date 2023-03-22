/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_1.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class ConexaoDAO {

    public static Connection con = null;

    public ConexaoDAO() {

    }

    public static void ConectDB() {
        try {
            String DSN = "projeto_1";
            String USER = "postgres";
            String SENHA = "postdba";
            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5432/" + DSN;
            con = DriverManager.getConnection(url, USER, SENHA);
            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("erro ao abrir o banco");
            }

        } catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }
    }

    public static void CloseDB() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }
    }
}
