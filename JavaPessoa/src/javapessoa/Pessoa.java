/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapessoa;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Pessoa {
   private String nome;
   private LocalDate dataNasc;
   private float altura;
   
   public Pessoa(){
       
   }
   
   /*metodo para calculo de idade a partir da data atual do sistema que é retornada pelo metodo now da 
   classe java.time.LocalDate*/
   public int CalcularIdade(){
       LocalDate data = LocalDate.now();
       int idade = data.getYear() - dataNasc.getYear();
       return idade;
   }

   public void imprimirPessoa(){
       System.out.println("Nome: " + getNome());
       System.out.println("Data: " + getDataNasc());
       System.out.println("Altura: " + getAltura());
   }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
