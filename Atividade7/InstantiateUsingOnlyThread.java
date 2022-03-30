package Atividade7;

public class InstantiateUsingOnlyThread {
	
	public static void main(String[]args) {
		
		System.out.println("Thread main iniciada");
		
		/*  //1º QUESTÃO
		//Instância - 2 Threads
		Thread thread1 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread2 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");	
		
		//Inicialização
		thread1.start();
		thread2.start();		
		
		//Loop
		boolean premissa=true;
		while (premissa==true) {
			thread1.run();
			thread2.run();			
		}
		*/
		
		
		/*  //2º QUESTÃO
		//Instância - 10 Threads
		Thread thread1 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread2 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread3 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread4 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread5 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread6 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread7 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread8 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread9 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		Thread thread10 = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");
		
		//Inicialização
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		//Loop
		boolean premissa=true;
		while (premissa==true) {
			thread1.run();
			thread2.run();
			thread3.run();
			thread4.run();
			thread5.run();
			thread6.run();
			thread7.run();
			thread8.run();
			thread9.run();
			thread10.run();
		}
		*/
		
		
		/*   //3º Questão		
	    //Loop
	    boolean premissa=true;
	    while(premissa==true){
	      Thread thread = new MyTask("quaisquer dados que o Thread possa necessitar para processar ");	
	      thread.start();
	      thread.run();
	    } 
	    */
		
		
		System.out.println("Thread main finalizada");	
	}
}
