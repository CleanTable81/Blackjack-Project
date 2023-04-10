package ca.sheridancollege.project;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gamer
 */
public class FrenchSuitedCard extends Card {
    public FrenchSuitedCard() {
        makeDeck();
    }
    
    private ArrayList<Card> makeDeck() {
        for (int i = 0; i < 13; i++) { // create a deck
            for (int k = 0; k < 4; k++) {
                // TODO code logic for creating a deck
            }
        }
        return new ArrayList<Card>();
    }
    
    @Override
    public String toString() {
        return new String();
    }
}
