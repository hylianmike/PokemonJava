/** Application Purpose: Blueprint Class for a Pokémon object. Instance variables include attacks name, type, whether it targets the Defense or Special Defense stat, and its power. There is one constructor, as well as getters for each instance variable
 *  Authour: Mike Rosanelli
 *  Date: November 10th 2021
 *  Time: 2:54 PM
 */

public class Move { //initial class declaration

    //instance variables for the attacks name, type, whether it targets the Defense or Special Defense stat, and its power
    private String name;
    private String type;
    private boolean physical;
    private int power;

    //full constructor that uses all four instance variables
    public Move(String name, String type, boolean physical, int power){
        this.name = name;
        this.type = type;
        this.physical = physical;
        this.power = power;
    }

    //getters for all the instance variables
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public boolean getPhysical() {
        return physical;
    }
    public int getPower() {
        return power;
    }
}
