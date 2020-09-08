public class Monstre extends Personnage{

    public Monstre (String Nom, int Point_de_vie){
        super(Nom, Point_de_vie);

    }

    public void attaque(Personnage p){

        if (p.Mort==false){p.Point_de_vie=p.Point_de_vie/2;}

        if (p instanceof Monstre){this.Point_de_vie=this.Point_de_vie-p.Point_de_vie/2;}
        else{ this.Point_de_vie=this.Point_de_vie-(int)(p.Point_de_vie*p.pouvoir);}
    }
    
    public int subitCharme(int coup) {
        this.Point_de_vie=this.Point_de_vie-coup;
        return this.Point_de_vie;
    }

}