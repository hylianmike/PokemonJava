/** Application Purpose: Blueprint Class for a Trainer object. Instance variables include the name and an array of Pokémon, as well as their setters and getters
 *  Authour: Mike Rosanelli
 *  Date: November 13th 2021
 *  Time: 1:02 PM
 */

public class Trainer {  //initial class declaration

    //2 instance variables, one for the name, the other is a Pokemon array of length 6
    private String name;
    private Pokemon[] mons = new Pokemon[6];

    //constructor that takes no arguments
    public Trainer(){}

    //setter for the name
    public void setName(String name) {
        this.name = name;
    }

    //setters for the individual elements in the mons array
    public void setMon1(Pokemon mon1) {
        mons[0] = mon1;
    }
    public void setMon2(Pokemon mon2) {
        mons[1] = mon2;
    }
    public void setMon3(Pokemon mon3) {
        mons[2] = mon3;
    }
    public void setMon4(Pokemon mon4) {
        mons[3] = mon4;
    }
    public void setMon5(Pokemon mon5) {
        mons[4] = mon5;
    }
    public void setMon6(Pokemon mon6) {
        mons[5] = mon6;
    }

    //getter for the name
    public String getName() {
        return name;
    }

    //getter for the entire mons array
    public Pokemon[] getMons(){
        return mons;
    }

    //getters for the individual elements in the mons array
    public Pokemon getMon1() {
        return mons[0];
    }
    public Pokemon getMon2() {
        return mons[1];
    }
    public Pokemon getMon3() {
        return mons[2];
    }
    public Pokemon getMon4() {
        return mons[3];
    }
    public Pokemon getMon5() {
        return mons[4];
    }
    public Pokemon getMon6() {
        return mons[5];
    }

    //method that "heals" the Pokemon by bringing their level and HP values up
    public void healUp(){

        try{
            //increment all the levels by 15
            for (int i = 0; i < mons.length; i++)
                mons[i].setLevel(mons[i].getLevel() + 15);

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on
        }

        try{
            //increment all maxHP values by 50
            for (int i = 0; i < mons.length; i++)
                mons[i].setMaxHP(mons[i].getMaxHP() + 50);

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on
        }

        try {
            //set the actual HP values to their new value based on the maxHP value. this also basically "heals" any damage taken from last battle
            for (int i = 0; i < mons.length; i++)
                mons[i].setHP(mons[i].getMaxHP());

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on

        }

    }
}
