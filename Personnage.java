public abstract class Personnage {

    protected boolean Mort;
    public String Nom;
    public int Point_de_vie;
    public double pouvoir;

    public Personnage (String Nom, int Point_de_vie){

        this.Nom=Nom;
        this.Point_de_vie=Point_de_vie;
        
    }

    public String toString (){

        if(this.Point_de_vie<0) {return this.Nom + " est mort.";}

        else {return "Je suis "+ this.Nom + " et j'ai " + this.Point_de_vie + "Point_de_vie"; }
    }

    public String getNom(){

        return this.Nom;
    }

    public boolean mort(){
        if(this.Point_de_vie<0) {
            this.Mort=true;
            return this.Mort;
        }

        else {
            this.Mort=false;
            return this.Mort;}

    }

    public int getVie(){
        return this.Point_de_vie;
    }

    public void addVie (int num) {

        this.Point_de_vie=this.Point_de_vie + num;

    }

    public int subitFrappe(int coup) {

        this.Point_de_vie=this.Point_de_vie-coup;
        return this.Point_de_vie;
    }

    public abstract void attaque (Personnage p);

    public abstract int subitCharme (int coup); 

}
    



    
    

