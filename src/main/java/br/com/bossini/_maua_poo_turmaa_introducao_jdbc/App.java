/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._maua_poo_turmaa_introducao_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) throws Exception {
        
        String usuario = "root";
        String senha = "1234";
        String host = "localhost";
        String port = "3306";
        String db = "20221_maua_poo_turmaA_pessoas";
        
        Connection conexao;
        
        conexao = DriverManager.getConnection(
            //essa é a string de conexão
            //jdbc:mysql://localhost:3306/20221_maua_poo_turmaA_pessoas
            "jdbc:mysql://" + host + ":" + port + "/" + db,
            usuario,
            senha
        );
        
        if (conexao != null){
            System.out.println("Conexão OK");
        }
        else{
            System.out.println("Conexão NOK");
        }
        
        
    }
}
