package com.airplane;

import java.util.Arrays;

public class Person {
	private String nome;
	private String nacionalidade;
	private String datadeNascimento;
	private int numeroAcento;
	private String[]passaporte;
	
	
	public Person(String nome,String nacionalidade,String datadeNascimento, int numeroAcento) {
		this.nome=nome;
		this.nacionalidade=nacionalidade;
		this.passaporte=new String[3];
		this.datadeNascimento=datadeNascimento;
		this.numeroAcento=numeroAcento;
		
	}
	
	public Person(Person outraPessoa) {
		this.nome=outraPessoa.nome;
		this.nacionalidade=outraPessoa.nacionalidade;
		this.datadeNascimento=outraPessoa.datadeNascimento;
		this.numeroAcento=outraPessoa.numeroAcento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getDatadeNascimento() {
		return datadeNascimento;
	}


	public void setDatadeNascimento(String datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}


	public int getNumeroAcento() {
		return numeroAcento;
	}


	public void setNumeroAcento(int numeroAcento) {
		this.numeroAcento = numeroAcento;
	}


	public String[] getPassaporte() {
		return Arrays.copyOf(passaporte,passaporte.length);
	}


	public void setPassaporte(String[] passaporte) {
		this.passaporte[0]=nome;
		this.passaporte[1]=nacionalidade;
		this.passaporte[2]=datadeNascimento;
	}
	
	public boolean aplicarPassaporte() {  
		int number = (int)(Math.random()*2);   //Gerar  numero aleatorio ,0 é falso e 1 positivo.
		return number == 1;
	}
	
	public void escolhaAssento() {
		numeroAcento=(int)(Math.random()*11 +1);
	}
	
	public String toString() {
		return "Nome: "+ nome + "\n" + "Nacionalidade: "+ nacionalidade + " Data de Nascimento: " + datadeNascimento + 
				"Numero de Acento:" + numeroAcento + "Passaporte: " + Arrays.toString(passaporte);
	}
	

	
}
