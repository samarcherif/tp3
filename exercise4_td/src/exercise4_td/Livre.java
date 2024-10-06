package exercise4_td;


public class Livre {
    private String titre, auteur;
    private float nbPages;
    private double prix;
    private boolean prixFixe;

    

  
    public String getAuteur() {
        return auteur;
    }

  
    public void setNbPages(float nb) {
        this.nbPages = nb;
    }

   
    public String getTitre() {
        return titre;
    }

    
    public float getNbPages() {
        return nbPages;
    }

    
    public void setAuteur(String a) {
        this.auteur = a;
    }

    
    public void setTitre(String t) {
        this.titre = t;
    }
    public void  setNbPages_1 (float nb) {
        if (nb > 20) {
            this.nbPages = nb;
        } else {
            System.out.println("Le nombre de pages indiqué est trop faible.");
        }
    }
  
   
    public double  getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Livre(String auteur, String titre, float nbPages, double prix ) {
        this.auteur = "";
        this.titre = "";
        this.nbPages=nbPages;
        this.prix=0;
        this.prixFixe=true;
        }
    public boolean testPrix() {
    	if (this.prix>0) { return true;}
    	else {return false;}
    }
    public void setPrix1 (double prix) {
    	if (prixFixe==false) {
    		setPrix(prix);
    	}
    	else {
    		System.out.println("prix ne pourra pas etre fixé");
    	}
    }
    
    
    
    public String toString() {
    	return ("livre intitulé" +titre+ "contenant" +nbPages+ "pages");
    }
    public void decrire() {
        System.out.println(this.toString());
        
   
    }
    public Livre() {
        this.nbPages =0;
        this.prixFixe = false;
        
    	}
    
    public Livre(String titre,float nbPages) {
    	this.titre=titre;
    	this.nbPages=nbPages;
    	
    	this.prixFixe = false; 
    }
   

   
    	public static void main(String[] args) {
           Livre[] tab = new Livre[3];

           
            tab[0] = new Livre("L'alchimiste ", "Paulo Coelho", 225, 19.99);
            tab[1] = new Livre("La Tunisie ", 508);
            

            
            tab[1].setPrix(24.4);  
            tab[1].setPrix(29.0);  

            

            
            for (int i = 0; i < 3; i++) {
                tab[i].decrire();
            }
         
         }
    	
    	
    	
}	
    	
    	
    
    	 
    
   



