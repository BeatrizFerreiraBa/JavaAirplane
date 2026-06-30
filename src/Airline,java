package com.airplane;

public class Airline {
	Person[]passageiros;    ////Esse array representa os assentos do avião. Cada posição do array guarda um objeto Person (um passageiro).
	
	public Airline() {
		this.passageiros=new Person[11];     ////o avião tem 11 assentos
	}
	
	public Person getPerson(int index) {
		Person person=passageiros[index];    ////index é a posição do array (0 a 10).
		return new Person(person);		////Ele retorna uma cópia do passageiro (new Person(person)), não o objeto original.
	}
	
	public void  setPerson(Person person) {         ////Esse método coloca uma pessoa em um assento específico.
		int index=person.getNumeroAcento() -1;   ////Como os assentos começam em 1, mas arrays começam em 0, usamos -1.
		passageiros[index]=new Person(person);            /////é criada uma cópia da pessoa para evitar alterações externas.
	}

	public void criarReserva(Person person) {
		while(passageiros[person.getNumeroAcento()-1] !=null) {          ///Se o assento já estiver ocupado (!= null), entra no loop. Pede para a pessoa escolher outro assento
			System.out.println("Por favor." + person.getNome() +" escolha outro assento");
			person.escolhaAssento();
		}
	
	int index=person.getNumeroAcento()-1;     ///Aqui o código converte o número do assento (que o passageiro escolheu) para o índice do array.Assento 1 → posição 0
	passageiros[index]=new Person(person);   //Essa linha coloca o passageiro dentro do aviãoo.passageiros  é o array que guarda todos os passageirosi.ndex é a posição do assento
	System.out.println("Obrigado! "+person.getNome()+" por escolher nossa companhia "+ "seu assento é: "+person.getNumeroAcento());
	
	}

}
