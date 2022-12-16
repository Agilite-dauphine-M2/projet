package com.agilite.hamoudi_haral.league_of_legends;

import java.util.ArrayList;
/**
 * Décrivez votre classe FailleInvocateur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FailleInvocateur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Champion> equipeRouge;
    private ArrayList<Champion> equipeBleu;


    /**
     * Constructeur d'objets de classe FailleInvocateur
     */
    public FailleInvocateur()
    {
        // initialisation des variables d'instance
        equipeRouge = new ArrayList<Champion>();
        equipeBleu = new ArrayList<Champion>();
    }
    
    /**
     * Ajoute un champion dans l'équipe bleu 
     *
     * @param  champion   le nouveau champion
     */
    public void addEquipeBleu(Champion c)
    {
        // Insérez votre code ici
        this.equipeBleu.add(c);
    }
    
    /**
     * Ajoute un champion dans l'équipe bleu 
     *
     * @param  champion   le nouveau champion
     */
    public void addEquipeRouge(Champion c)
    {
        // Insérez votre code ici
        this.equipeRouge.add(c);
    }
    
    /**
     * Accesseur de l'équipe bleu 
     *
     * @return  equipeBleu
     */
    public ArrayList<Champion> getEquipeBleu()
    {
        // Insérez votre code ici
        return this.equipeBleu;
    }
    
    /**
     * Accesseur de l'équipe rouge 
     *
     * @return  equipeRouge
     */
    public ArrayList<Champion> getEquipeRouge()
    {
        // Insérez votre code ici
        return this.equipeRouge;
    }

    /**
     * Modificateur de l'équipe bleu 
     *
     * @param  equipeBleu   la nouvelle équipe bleu
     */
    public void setEquipeBleu(ArrayList<Champion> equipeBleu)
    {
        // Insérez votre code ici
        this.equipeBleu = equipeBleu;
    }
    
    /**
     * Modificateur de l'équipe rouge 
     *
     * @param  equipeRouge   la nouvelle équipe rouge
     */
    public void setEquipeRouge(ArrayList<Champion> equipeRouge)
    {
        // Insérez votre code ici
        this.equipeRouge = equipeRouge;
    }
}
