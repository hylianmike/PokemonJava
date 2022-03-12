/** Application Purpose: Blueprint Class for a Pokémon object. Instance variables include the name, level, types, passive stats, and attacks. There are getters for each, four constructors, but only a few setters, for only the instance variables that require them in the program
 *  Authour: Mike Rosanelli
 *  Date: November 12th 2021
 *  Time: 5:32 PM
 */

public class Pokemon {  //initial class declaration

    //instance variables for the name, level, types, passive stats, and attacks
    private String name;
    private int level;
    private String type1;
    private String type2;
    private int HP;
    private int maxHP;
    private double attack;
    private double defense;
    private double speed;
    private double spAttack;
    private double spDefense;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    //constructor specifically for the dummy Pokemon with 0 stats
    public Pokemon(String name, int level, String type1, String type2, int HP, double attack, double defense, double speed, double spAttack, double spDefense){
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.maxHP = HP;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
    }

    //constructor for Pokemon with 2 moves
    public Pokemon(String name, int level, String type1, String type2, int HP, double attack, double defense, double speed, double spAttack, double spDefense, Move move1, Move move2){
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.maxHP = HP;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.move1 = move1;
        this.move2 = move2;
    }

    //constructor for Pokemon with 3 moves
    public Pokemon(String name, int level, String type1, String type2, int HP, double attack, double defense, double speed, double spAttack, double spDefense, Move move1, Move move2, Move move3){
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.maxHP = HP;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
    }

    //constructor for Pokemon with all 4 moves
    public Pokemon(String name, int level, String type1, String type2, int HP, double attack, double defense, double speed, double spAttack, double spDefense, Move move1, Move move2, Move move3, Move move4){
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.maxHP = HP;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    //only setter that are required for this program
    public void setLevel(int level) {
        this.level = level;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }

    //getters for the instance variables
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public int getMaxHP(){
        return maxHP;
    }
    public double getHP() {
        return HP;
    }
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public double getSpeed() {
        return speed;
    }
    public double getSpAttack() {
        return spAttack;
    }
    public double getSpDefense() {
        return spDefense;
    }
    public Move getMove1() {
        return move1;
    }
    public Move getMove2() {
        return move2;
    }
    public Move getMove3() {
        return move3;
    }
    public Move getMove4() {
        return move4;
    }

    //method that levels up the Pokemon by 15 (used on line 606 and 622 to bring the 5th party member up to par with the others)
    public void levelUp(){
        level = level + 15;
    }
}
