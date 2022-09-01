/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno1;
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/**
 *
 * @author Darlan Wilson
 */
public class NewClass {
    
}
//Importações
import java.util.Random;
	
	//Classe
	public class Aluno {
	//Atributos    
	private String nome;
	private int idade;
	private double codigo_identificador;
	private Random aleatorio;
	
	//Métodos
	public void Aluno ( String nome , int idade ) {
		aleatorio = new Random ();
		this.nome = nome;
		this.idade = idade;
		this.codigo_identificador = aleatorio.nextDouble ();
	}
	public void definirNome ( String nome ) {
		this.nome = nome;
	}  
	public void definirIdade ( int idade ) {
		this.idade = idade;
	}
}