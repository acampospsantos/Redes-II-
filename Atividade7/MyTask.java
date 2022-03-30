package Atividade7;

public class MyTask extends Thread{
	
	//Atributo
	private String anyData;
	
	//M�todo Construtor
	public MyTask(String anyData) {
		this.setAnyData(anyData);
	}
	
	//M�todo Modificador(set)
	public void setAnyData(String anyData) {
		this.anyData = anyData;
	}
	
	//M�todos da Classe
	public void run() {
		for(int i=0; i<10; i=i+1) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message " + i);	
		}
	}
	
}

