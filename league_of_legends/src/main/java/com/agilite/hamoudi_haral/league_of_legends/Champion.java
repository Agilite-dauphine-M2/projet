package com.agilite.hamoudi_haral.league_of_legends;


/**
 * Décrivez votre classe Champion ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Champion
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private String histoire;

    /**
     * Constructeur d'objets de classe Champion
     */
    public Champion()
    {
        // initialisation des variables d'instance
        nom = "";
        histoire = "";
    }

    /**
     * Accesseur du nom du champion
     *
     * @return     l'attribut nom
     */
    public String getNom()
    {
        // Insérez votre code ici
        return this.nom;
    }
    
    /**
     * Accesseur de l'histoire du champion
     *
     * @return     l'attribut histoire
     */
    public String getHistoire()
    {
        // Insérez votre code ici
        return this.histoire;
    }
    
    /**
     * Modificateur du nom du champion
     *
     * @param     le nouveau nom
     */
    public void setNom(String nom)
    {
        // Insérez votre code ici
        this.nom = nom;
    }
    
    /**
     * Modificateur de l'histoire du champion
     *
     * @param     la nouvelle histoire
     */
    public void setHistoire(String histoire)
    {
        // Insérez votre code ici
        this.histoire = histoire;
    }
}
