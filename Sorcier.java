public class Sorcier extends Personnage{

    double pouvoir=Math.random();

    public Sorcier (String Nom, int Point_de_vie){

        super(Nom, Point_de_vie);
      

    
    }

    public void attaque(Personnage p){

        if (p.Mort==false){p.Point_de_vie=p.Point_de_vie/2;

        if (p instanceof Monstre){this.Point_de_vie=this.Point_de_vie-p.Point_de_vie/2;}
        else{ this.Point_de_vie=this.Point_de_vie-(int)(p.Point_de_vie*pouvoir);

        }
    }
    }

    public int subitCharme(int coup) {
        this.Point_de_vie=this.Point_de_vie-coup;
        return Point_de_vie;
    }

}