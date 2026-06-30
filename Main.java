package com.airplane;

public class Main {

	public static void main(String[] args) {
//		Person person = new Person("Gustavo Silva","Brasileiro","01/01/2000",5);
//		person.setNumeroAcento(10);///Atualização 
//		
//		System.out.println("Nome: "+ person.getNome() + "/n" + "Nacionalidade: "+ person.getNacionalidade());
//		System.out.println("Data de Nascimento: " + person.getDatadeNascimento() + "/n"+ "Numero de Acento: " + person.getNumeroAcento() );
//		
//		
//		///Outra Pessoa 
//		Person gemeo=new Person(person);
//		gemeo.setNome("Thiago Silva");
//		gemeo.setNumeroAcento(9);
//		
//		
//		System.out.println("Nome: "+ gemeo.getNome() + "/n" + "Nacionalidade: "+ gemeo.getNacionalidade());
//		System.out.println("Data de Nascimento: " + gemeo.getDatadeNascimento() + "/n"+ "Numero de Acento: " + gemeo.getNumeroAcento() );
//
//		
		Person[] passageiros = new Person[] { 
				 new Person("Cleopatra", "Egypt", "69 BC", 1),
			     new Person("Alexander the Great", "Macedon", "356 BC", 2),
			     new Person("Julius Caesar", "Rome", "100 BC", 3),
			     new Person("Hannibal", "Carthage", "247 BC", 4),
			     new Person("Confucius", "China", "551 BC", 5),
			     new Person("Pericles", "Greece", "429 BC", 6),
			     new Person("Spartacus", "Thrace", "111 BC", 7),
			     new Person("Marcus Aurelius", "Rome", "121 AD", 8),
			     new Person("Leonidas", "Greece", "540 BC", 9),
			     new Person("Sun Tzu", "China", "544 BC", 10),
			     new Person("Hammurabi", "Babylon", "1750 BC", 11),
				};
		
		Airline airline=new Airline();
		
		for(int i=0;i<passageiros.length;i++) {
			boolean passaporteAprovado=passageiros[i].aplicarPassaporte();
			if(passaporteAprovado) {
				airline.criarReserva(passageiros[i]);
			}else {
				System.out.println("Desculpe."+ passageiros[i].getNome() +" seu passaporte esta invalido");
				
			}
		}

//		if(person.aplicarPassaporte()) {
//			System.out.println("Parabens "+ person.getNome() + "seu Passaporte foi aprovado!");
//		}else {
//			System.out.println("Desculpe "+ person.getNome()+ "seu Passaporte está invalido!");
//		}
	
	
//		System.out.println(airline.getPerson(1));	
//		System.out.println(airline.getPerson(5));	
//		System.out.println(airline.getPerson(8));	

	
	}

}
