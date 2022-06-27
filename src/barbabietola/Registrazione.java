package barbabietola;

/*Consegna:
Creare una classe Utente con attributi nome, cognome, email, password ed età.
Aggiungere un costruttore con parametri e metodi getter e setter.
Implementare dei metodi di validazione in modo che:
- email contenga un carattere @ e un .
- password sia lunga tra 8 e 12 caratteri
- età sia maggiore di 18 anni
In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi 
e nel costruttore, sollevando opportune eccezioni.
Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente 
e si prova a creare un nuovo oggetto Utente.
Gestire tramite try e catch eventuali errori in fase di creazione in modo che il programma non si interrompa 
bruscamente ma chieda all’utente di inserire dei dati corretti.*/

import java.util.Scanner;

public class Registrazione {
	
 public static void main(String[] args) throws Exception {
	
	 Scanner keyboard = new Scanner (System.in);
	 
	 System.out.println("Registrati qui:\nInserisci il tuo nome");
	 String nome = keyboard.nextLine();
	 System.out.println("Inserisci il tuo cognome:");
	 String cognome = keyboard.nextLine();
	 
	 try {
		 System.out.println("Inserisci indirizzo e-mail");
		 String email = keyboard.nextLine();
		 System.out.println("Crea una chiave:");
		 String password = keyboard.nextLine();
		 System.out.println("Inserisci la tua età;");
		 String inputEta = keyboard.nextLine();
		 int eta = Integer.parseInt(inputEta);
		 
	     Utente nuovoUtente = new Utente(nome, cognome,email,password,eta);
	 }
	 catch(Exception exception) {
		 System.out.println("OPS...Qualcosa è andato storto");
		 System.out.println(exception.getMessage());
	 }
	 
	 keyboard.close();
}
}
