public class Main {

    public static void main (final String[] args) {

        Personnage[] t= Personnages0();

        int tour=0;

        while (Jeu(t)){
            System.out.println("___________________________________________________________");
            System.out.println("tour: "+tour);
            tour++;
            Affichage(t);
            t=Tour(t);
        }   
        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("tour: "+tour);
        System.out.println("tour: "+tour);
        System.out.println("tour: "+tour);
        t=Tour(t);
        Affichage(t);
        System.out.println("le jeu est fini");  
    }

    public static void Affichage (Personnage[] tab) {

        for (int i = 0; i < 5; i++) {

            tab[i] = new Monstre("Monstre" + i, tab[i].Point_de_vie);
            tab[i + 5] = new Sorcier("Sorcier" + i, tab[i].Point_de_vie);
            System.out.println(tab[i]);
            System.out.println(tab[i + 5]);
        }
    }

    public static Personnage[] Personnages0() {

        // création personnages

        final Personnage[] tab = new Personnage[10];

        for (int i = 0; i < 5; i++) {

            tab[i] = new Monstre("Monstre" + i, (int) (Math.random() * 100));
            tab[i + 5] = new Sorcier("Sorcier" + i, (int) (Math.random() * 100));
        
        }
        return tab;
    }

    public static Personnage[] Tour (Personnage[] tab){

        int ind1= (int)(Math.random()*10);
        int ind2= (int)(Math.random()*10);

        int coup=20;


        tab[ind1].attaque(tab[ind2]);
        tab[ind2].subitFrappe(coup);
        tab[ind2].subitCharme(coup);

        return tab;
    }

    public static boolean Jeu(Personnage[] tab) {

    
     int compteur=0;

       for(int i=0;i<10;i++){
           if (tab[i].mort()){
                compteur++;
            } 
        }

        if (compteur<9){ return true;
        }
        else {return false;}

    }
}


    
      
