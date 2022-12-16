#Author: HAMOUDI_HARAL
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_000 Lancer une partie
  En tant que joueur 
	Je veux choisir mon champion et lancer une partie.
	Afin de m entrainer.

  @tag1
  Scenario Outline: Creation d une partie d entrainement
    Given le choix du <champion> du <joueur>
    And la sélection du <champion> adverse
    When la selection des champions est terminé
    Then la partie doit se lancer

    Examples: 
      | joueur | champion |
      | kidood |    Akali |
      | boulbi | Panthéon |

   @tag2
   Scenario Outline: Creation d une partie avec plusieurs joueurs
   	Given le choix des champions par les <joueur1> <joueur2> <joueur3> <joueur4> <joueur5> pour l <équipe> bleu
   	And le choix des champions par les <joueur1> <joueur2> <joueur3> <joueur4> <joueur5> pour l <équipe> rouge
   	When les 2 équipes sont complètes
   	Then la partie soit se lancer
   	
   	Examples: 
      | équipe | joueur1   | joueur2   | joueur3   | joueur4   | joueur5   |
			| Bleu   | Volibear  | Veigar    | Udyr      | Akali     | Cailtyn   |
			| Rouge  | Zilean    | Jinx      | Syndra    | Pantheon  | Syllas    |
