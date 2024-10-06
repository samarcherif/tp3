package exercise3_td;

public class livre {
    private String titre, auteur;
    private float nbPages;

    
    public livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

  
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
    public String toString() {
    	return ("livre intitulé" +titre+ "contenant" +nbPages+ "pages");
    }
    public void decrire() {
        System.out.println(this.toString());
    	
    	
    }
    public livre() {
        this.nbPages = 0;
        
    	}
    public livre(String titre,float nbPages) {
    	this.titre=titre;
    	this.nbPages=nbPages;
    }
    public livre(String titre,String auteur ,float nbPages) {
    	this.titre=titre;
    	this.nbPages=nbPages;
    	this.auteur=auteur;}
    
    public static void main(String[]args) {
    	livre[]tab=new livre[3];
    	tab[0] = new livre("L'alchimiste ", "Paulo Coelho ", 225);
        tab[1] = new livre("La Tunisie ", 508);  
        tab[2] = new livre("Harry Potter ", "JK Rowling ");  
         
        tab[1].setAuteur("Paulo Coelho");

   
        tab[2].setNbPages(461);

        for (int i=0;i<3;i++) {tab[i].decrire();}
         }
    	
    	
    	
    }
    	 
    
   
