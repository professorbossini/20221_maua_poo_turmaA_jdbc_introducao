/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._maua_poo_turmaa_introducao_jdbc;

/**
 *
 * @author rodri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    //cláusula catch or declare
    public void inserir(){
        //try/catch
        try{
            String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES(?, ?, ?)";
            String usuario = "root";
            String senha = "1234"; //ECA302
            String host = "localhost";
            String port = "3306";
            String db ="20221_maua_poo_turmaA_pessoas";
            Connection conexao = DriverManager.getConnection(
                String.format(
                        //jdbc:mysql://localhost:3306/nomeBanco?useTimezone=true&serverTimeZone=UTC
                        "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                        host,
                        port,
                        db
                ),
                usuario,
                senha
            );
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, getNome());
            ps.setString(2, getFone());
            ps.setString(3, getEmail());
            
            ps.execute();
            ps.close();
            conexao.close();         
        }
        catch(Exception e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
