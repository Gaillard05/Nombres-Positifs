		public class NombresPositif{
			public static void main(String [] args){
				char choix;
				int nb;
				int somNbInf;
				int somNbSup;
				int compt1;
				int compt2;
				int moyNbInf;
				int moyNbSup;

			compt1 = 0;
			somNbInf = 0;

			compt2 = 0;
			somNbSup = 0;

	System.out.print("Voulez vous donner un nombre (O/N) ? ");
		choix = Lire.c();
	while(choix=='O'){
	System.out.print("Donnez un nombre strictement positif : ");
		nb = Lire.i();
	if(nb <= -0){
		System.out.println("Veuillez renseigner un nombre strictement positif");
	}
	else{
		if(nb < 10){
		somNbInf = somNbInf + nb;
		compt1 = compt1 + 1;
		} 
		if(nb >= 10){
		 somNbSup = somNbSup + nb;
		 compt2 = compt2 + 1;
		}
	}
	System.out.print("Voulez vous donner un nombre (O/N) ? ");
		choix = Lire.c();
		}
	if((compt1 == 0) && (compt2 == 0)){
		System.out.print("\n Aucun nombre n est renseigne");
	}

	if(compt1 >= 1){	
		moyNbInf = somNbInf / compt1;
		System.out.print("\n La moyenne des nombres inferieurs a 10 vaut : "+moyNbInf+"\n");

	}

	if(compt2 >= 1){	
		moyNbSup = somNbSup / compt2;
		System.out.print("\n La moyenne des nombres superieur ou egal a 10 vaut : "+moyNbSup+"\n");

	}
	System.out.println("\n Fin du programme");
     }
  }	
