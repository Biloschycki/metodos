package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	static Scanner entrada = new Scanner(System.in);
	static DecimalFormat fm = new DecimalFormat("R$ #,## 0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//CHAMA FUNÇÕES
		char[]sexo=lerSexo();
		char[]cabelo=lerCabelo();
		char[]olho=lerOlho();
		int[]idade=lerIdade();
		double  media=mediaHab(idade,olho,cabelo);
		double maiorIdade= maiorIdade(idade);
		int cont=Contagem(sexo,  idade,  cabelo, olho);
				
		System.out.println(" Média de idade das pessoas com olhos castanhos e cabelos pretos: " +media);
		System.out.println("Maior idade entre os habitantes:"+maiorIdade);
		System.out.println("Quantidade de indivíduos do sexo feminino com idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros: "+cont);
		
	}//MAIN
	
	public static char[] lerSexo() {
		char[]sexo=new char[5];
	
		for(int i=0;i<5;i++) {
			System.out.println("Informe o seu sexo:");
			sexo[i]=Character.toUpperCase(entrada.next().charAt(0)); 
		}
		
		return sexo;
	}
	
	public static char[] lerCabelo() {
		char[]cabelo=new char[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Informe a cor do seu cabelo:");
			cabelo[i]=Character.toUpperCase(entrada.next().charAt(0));
			while(cabelo[i]!='L'&&cabelo[i]!='C'&&cabelo[i]!='P') {
				System.out.println("Informe uma cor de cabelo válida l-Louros, C-castanhos e P-pretos:");
				cabelo[i]=Character.toUpperCase(entrada.next().charAt(0));
			}
		}
		
		return cabelo;
	}
	public static char[] lerOlho() {

		char[]olho=new char[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Informe a cor do seu olho:");
			olho[i]=Character.toUpperCase(entrada.next().charAt(0)); 
			while( olho[i]!='A'&& olho[i]!='C') {
				System.out.println("Informe uma cor de olho válida A-azuis e C-castanhos:");
				olho[i]=Character.toUpperCase(entrada.next().charAt(0)); 
			}
		}
		
		return olho;
	}
	public static int[] lerIdade() {

		int[]idade=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Informe a sua idade:");
			idade[i]=entrada.nextInt();
		}
		return idade;
	}
	
	public static double mediaHab(int []idade, char [] olho, char [] cabelo) {
		double  media=0;
		for(int i=0; i<5;i++) {
			if(olho[i]=='C' && cabelo[i]=='P') {
				media+=idade[i];
			}
		}
		media=media/5;
		
		return media;
	}

public static double maiorIdade(int []idade) {
	double maiorIdade=0;
	for(int i =0;i<5;i++) {
		if(i==0) {
			maiorIdade=idade[i];
		}else {
			if(idade[i]>maiorIdade) {
				maiorIdade=idade[i];
			}
		}
	}
	
	
	
	return maiorIdade;
	
}

public static int Contagem(char [] sexo, int[] idade, char[] cabelo, char[]olho) {
	
	int cont=0;
	
	for(int i=0;i<5;i++) {
		
		if(sexo[i]=='F'&& idade[i]>=18 && idade[i]<=35 && olho[i]=='A' && cabelo[i]=='L') {
			cont++;
		}
	}
	
	
	
	return cont;
}
}//CLASS
