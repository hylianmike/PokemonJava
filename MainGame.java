/** Application Purpose: Contains the main method, plus the full game method that runs even more methods. Instantiates a ton of Moves and Pokémon, and utilizes them in combat
 *  Authour: Mike Rosanelli
 *  Date: November 2nd 2021
 *  Time: 4:43 PM
 */

//importing scanner and random classes
import java.util.Scanner;
import java.util.Random;

//initial class declaration
public class MainGame {

    //main method
    public static void main(String [] args){

        MainGame.game();

    }

    //static method with all the object instantiation and program flow outside of battle
    public static void game() {

        //creating the scanner and random objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //all Normal type attacks
        Move tackle = new Move("Tackle", "Normal", true, 40);
        Move scratch = new Move("Scratch", "Normal", true, 40);
        Move round = new Move("Round", "Normal", false, 55);
        Move facade = new Move("Facade", "Normal", true, 70);
        Move extremeSpeed = new Move("Extreme Speed", "Normal", true, 85);
        Move hyperVoice = new Move("Hyper Voice", "Normal", false, 90);
        Move razorWind = new Move("Razor Wind", "Normal", false, 80);
        Move swift = new Move("Swift", "Normal", false, 60);
        Move bodySlam = new Move("Body Slam", "Normal", true, 85);
        Move megaPunch = new Move("Mega Punch", "Normal", true, 80);
        Move strength = new Move("Strength", "Normal", true, 80);
        Move splash = new Move("Splash", "Normal", true, 0);

        //all Grass type attacks
        Move vineWhip = new Move("Vine Whip", "Grass", true, 45);
        Move seedBomb = new Move("Seed Bomb", "Grass", true, 80);
        Move energyBall = new Move("Energy Ball", "Grass", false, 90);
        Move magicalLeaf = new Move("Magical Leaf", "Grass", false, 60);
        Move powerWhip = new Move("Power Whip", "Grass", true, 120);
        Move solarBeam = new Move("Solar Beam", "Grass", false, 130);
        Move leafBlade = new Move("Leaf Blade", "Grass", true, 90);

        //all Fire type attacks
        Move ember = new Move("Ember", "Fire", false, 40);
        Move firePunch = new Move("Fire Punch", "Fire", true, 75);
        Move flamethrower = new Move("Flamethrower", "Fire", false, 95);
        Move fireBlast = new Move("Fire Blast", "Fire", false, 110);
        Move flameWheel = new Move("Flame Wheel", "Fire", true, 60);
        Move lavaPlume = new Move("Lava Plume", "Fire", false, 80);
        Move incinerate = new Move("Incinerate", "Fire", false, 60);

        //all Water type attacks
        Move waterGun = new Move("Water Gun", "Water", false, 40);
        Move bubbleBeam = new Move("Bubble Beam", "Water", false, 65);
        Move liquidation = new Move("Liquidation", "Water", true, 85);
        Move hydroPump = new Move("Hydro Pump", "Water", false, 110);
        Move waterPulse = new Move("Water Pulse", "Water", false, 60);
        Move aquaTail = new Move("Aqua Tail", "Water", true, 90);
        Move surf = new Move("Surf", "Water", false, 90);

        //all Electric type attacks
        Move thunderShock = new Move("Thunder Shock", "Electric", false, 40);
        Move thunderPunch = new Move("Thunder Punch", "Electric", true, 65);
        Move thunderbolt = new Move("Thunderbolt", "Electric", false, 90);
        Move spark = new Move("Spark", "Electric", true, 60);
        Move chargeBeam = new Move("Charge Beam", "Electric", false, 50);
        Move thunder = new Move("Thunder", "Electric", false, 110);

        //all Ice type attacks
        Move icicleCrash = new Move("Icicle Crash", "Ice", true, 85);
        Move iceBeam = new Move("Ice Beam", "Ice", false, 90);
        Move avalanche = new Move("Avalanche", "Ice", true, 60);
        Move iceFang = new Move("Ice Fang", "Ice", true, 65);
        Move freezeDry = new Move("Freeze-Dry", "Ice", false, 90);
        Move icyWind = new Move("Icy Wind", "Ice", false, 55);

        //all Fighting type attacks
        Move auraSphere = new Move("Aura Sphere", "Fighting", false, 90);
        Move closeCombat = new Move("Close Combat", "Fighting", true, 120);
        Move focusBlast = new Move("Focus Blast", "Fighting", false, 120);
        Move vacuumWave = new Move("Vacuum Wave", "Fighting", false, 40);
        Move revenge = new Move("Revenge", "Fighting", true, 60);
        Move brickBreak = new Move("Brick Break", "Fighting", true, 75);

        //all Poison type attacks
        Move venoshock = new Move("Venoshock", "Poison", false, 60);
        Move poisonJab = new Move("Poison Jab", "Poison", true, 80);
        Move sludgeBomb = new Move("Sludge Bomb", "Poison", false, 95);
        Move crossPoison = new Move("Cross Poison", "Poison ", true, 70);
        Move poisonTail = new Move("Poison Tail", "Poison", true, 50);
        Move acidSpray = new Move("Acid Spray", "Poison", false, 30);
        Move gunkShot = new Move("Gunk Shot", "Poison", false, 120);

        //all Ground type attacks
        Move bulldoze = new Move("Bulldoze", "Ground", true, 55);
        Move boneClub = new Move("Bone Rush", "Ground", true, 65);
        Move earthquake = new Move("Earthquake", "Ground", true, 110);
        Move earthPower = new Move("Earth Power", "Ground", false, 90);
        Move mudBomb = new Move("Mud Bomb", "Ground", false, 65);

        //all Flying type attacks
        Move aerialAce = new Move("Aerial Ace", "Flying", true, 60);
        Move hurricane = new Move("Hurricane", "Flying", false, 110);
        Move airCutter = new Move("Air Cutter", "Flying", false, 60);
        Move wingAttack = new Move("Wing Attack", "Flying", true, 55);
        Move drillPeck = new Move("Drill Peck", "Flying", true, 80);
        Move acrobatics = new Move("Acrobatics", "Flying", true, 55);

        //all Psychic type attacks
        Move psychoCut = new Move("Psycho Cut", "Psychic", true, 70);
        Move psychic = new Move("Psychic", "Psychic", false, 90);
        Move zenHeadbutt = new Move("Zen Headbutt", "Psychic", true, 80);
        Move extrasensory = new Move("Extrasensory", "Psychic", false, 80);
        Move psybeam = new Move("Psybeam", "Psychic", false, 65);

        //all Bug type attacks
        Move bugBite = new Move("Bug Bite", "Bug", true, 60);
        Move xScissor = new Move("X-Scissor", "Bug", true, 80);
        Move signalBeam = new Move("Signal Beam", "Bug", false, 75);
        Move megahorn = new Move("Megahorn", "Bug", true, 120);

        //all Rock type attacks
        Move rockThrow = new Move("Rock Throw", "Rock", true, 50);
        Move ancientPower = new Move("Ancient Power", "Rock", false, 60);
        Move powerGem = new Move("Power Gem", "Rock", false, 75);
        Move rockSlide = new Move("Rock Slide", "Rock", true, 85);
        Move stoneEdge = new Move("Stone Edge", "Rock", true, 120);

        //all Ghost type attacks
        Move shadowBall = new Move("Shadow Ball", "Ghost", false, 90);
        Move shadowClaw = new Move("Shadow Claw", "Ghost", true, 75);
        Move ominousWind = new Move("Ominous Wind", "Ghost", false, 60);
        Move lick = new Move("Lick", "Ghost", true, 30);
        Move hex = new Move("Hex", "Ghost", false, 65);

        //all Dragon type attacks
        Move dragonBreath = new Move("Dragon Breath", "Dragon", false, 60);
        Move dragonPulse = new Move("Dragon Pulse", "Dragon", false, 85);
        Move dragonClaw = new Move("Dragon Claw", "Dragon", true, 80);
        Move outrage = new Move("Outrage", "Dragon", true, 120);

        //all Dark type attacks
        Move snarl = new Move("Snarl", "Dark", false, 55);
        Move throatChop = new Move("Throat Chop", "Dark", true, 80);
        Move nightDaze = new Move("Night Daze", "Dark", false, 85);
        Move pursuit = new Move("Pursuit", "Dark", true, 40);
        Move foulPlay = new Move("Foul Play", "Dark", true, 95);
        Move bite = new Move("Bite", "Dark", true, 50);
        Move crunch = new Move("Crunch", "Dark", true, 80);
        Move payback = new Move("Payback", "Dark", true, 50);

        //all Steel type attacks
        Move metalClaw = new Move("Metal Claw", "Steel", true, 50);
        Move ironHead = new Move("Iron Claw", "Steel", true, 80);
        Move flashCannon = new Move("Flash Cannon", "Steel", false, 80);
        Move mirrorShot = new Move("Mirror Shot", "Steel", false, 65);
        Move ironTail = new Move("Iron Tail", "Steel", true, 100);
        Move steelWing = new Move("Steel Wing", "Steel", true, 70);
        Move bulletPunch = new Move("Bullet Punch", "Steel", true, 50);

        //all Fairy type attacks
        Move fairyWind = new Move("Fairy Wind", "Fairy", false, 40);
        Move drainingKiss = new Move("Draining Kiss", "Fairy", false, 50);
        Move dazzlingGleam = new Move("Dazzling Gleam", "Fairy", false, 80);
        Move moonblast = new Move("Moonblast", "Fairy", false, 95);
        Move playRough = new Move("Play Rough", "Fairy", true, 90);

        //all Legendary-Pokemon exclusive attacks
        Move psystrike = new Move("Psystrike", "Psychic", false, 130);
        Move sacredFire = new Move("Sacred Fire", "Fire", true, 100);
        Move aeroblast = new Move("Aeroblast", "Flying", false, 100);
        Move precipiceBlades = new Move("Precipice Blades", "Ground", true, 120);
        Move originPulse = new Move("Origin Pulse", "Water", false, 110);
        Move dragonAscent = new Move("Dragon Ascent", "Flying", true, 120);
        Move roarOfTime = new Move("Roar of Time", "Dragon", false, 100);
        Move spacialRend = new Move("Special Rend", "Dragon", false, 100);
        Move shadowForce = new Move("Shadow Force", "Ghost", true, 120);
        Move blueFlare = new Move("Blue Flare", "Fire", false, 130);
        Move boltStrike = new Move("Bolt Strike", "Electric", true, 130);
        Move glaciate = new Move("Glaciate", "Ice", false, 110);
        Move lightOfRuin = new Move("Light Of Ruin", "Fairy", false, 120);
        Move oblivionWing = new Move("Oblivion Wing", "Dark", false, 95);
        Move coreEnforcer = new Move("Core Enforcer", "Dragon", false, 100);
        Move sunsteelStrike = new Move("Sunsteel Strike", "Steel", true, 100);
        Move moongeistBeam = new Move("Moongeist Beam", "Ghost", false, 100);
        Move photonGeyser = new Move("Photon Geyser", "Psychic", false, 110);
        Move behemothBlade = new Move("Behemoth Blade", "Steel", true, 100);
        Move behemothBash = new Move("Behemoth Bash", "Steel", true, 100);
        Move dynamaxCannon = new Move("Dynamax Cannon", "Dragon", false, 105);

        //dummy Pokemon with 0 stats
        Pokemon none = new Pokemon("None", 0, "None", "None", 0, 0, 0, 0, 0, 0);

        //starter pokemon, base forms, middle evolutions, and final evolutions
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 5, "Grass", "Poison", 45, 49, 49, 65, 65, 45, tackle, vineWhip);
        Pokemon charmander = new Pokemon("Charmander", 5, "Fire", "None", 39, 52, 43, 60, 50, 65, scratch, ember);
        Pokemon squirtle = new Pokemon("Squirtle", 5, "Water", "None", 44, 48, 65, 50, 64, 43, tackle, waterGun);
        Pokemon ivysaur = new Pokemon("Ivysaur", 20, "Grass", "Poison", 60, 62, 63, 60, 80, 80, tackle, magicalLeaf, venoshock);
        Pokemon charmeleon = new Pokemon("Charmeleon", 20, "Fire", "None", 58, 64, 58, 80, 80, 65, scratch, firePunch, dragonBreath);
        Pokemon wartortle = new Pokemon("Wartortle", 20, "Water", "None", 59, 63, 80, 58, 65, 80, tackle, bubbleBeam, iceFang);
        Pokemon venusaur = new Pokemon("Venusaur", 36, "Grass", "Poison", 80, 82, 83, 80, 100, 100, seedBomb, sludgeBomb, facade, earthquake);
        Pokemon charizard = new Pokemon("Charizard", 36, "Fire", "Flying", 78, 84, 78, 100, 109, 85, flamethrower, dragonClaw, focusBlast, thunderPunch);
        Pokemon blastoise = new Pokemon("Blastoise", 36, "Water", "None", 79, 83, 100, 78, 85, 105, surf, flashCannon, avalanche, dragonPulse);

        //all the Pokemon that the user has access to
        Pokemon ferroseed = new Pokemon("Ferroseed", 21, "Grass", "Steel", 44, 50, 91, 10, 24, 86, seedBomb, ironHead, thunderbolt);
        Pokemon growlithe = new Pokemon("Growlithe", 22, "Fire", "None", 55, 70, 45, 60, 70, 50, flameWheel, closeCombat, round);
        Pokemon dewpider = new Pokemon("Dewpider", 21, "Water", "Bug", 41, 40, 52, 27, 40, 72, bubbleBeam, bugBite, bite);
        Pokemon mareep = new Pokemon("Mareep", 21, "Electric", "None", 55, 40, 40, 65, 45, 35, thunderShock, swift, ironTail);
        Pokemon pidgeotto = new Pokemon("Pidgeotto", 21, "Normal", "Flying", 63, 60, 55, 71, 50, 50, aerialAce, facade, ominousWind);
        Pokemon koffing = new Pokemon("Koffing", 22, "Poison", "None", 40, 65, 95, 35, 60, 45, venoshock, flameWheel, payback);
        Pokemon riolu = new Pokemon("Riolu", 24, "Fighting", "None", 40, 70, 40, 60, 35, 40, vacuumWave, facade, crunch);
        Pokemon gastly = new Pokemon("Gastly", 24, "Ghost", "Poison", 47, 35, 30, 80, 100, 35, lick, acidSpray, facade);
        Pokemon roggenrola = new Pokemon("Roggenrola", 23, "Rock", "None", 55, 75, 85, 15, 25, 25, ancientPower, flashCannon, bulldoze);
        Pokemon aipom = new Pokemon("Aipom", 22, "Normal", "None", 70, 85, 70, 100, 55, 70, megaPunch, pursuit, thunderPunch);
        Pokemon snubbull = new Pokemon("Snubbull", 22, "Fairy", "None", 60, 80, 50, 30, 40, 40, drainingKiss, revenge, snarl);
        Pokemon aron = new Pokemon("Aron", 20, "Steel", "Rock", 50, 70, 100, 30, 40, 40, mirrorShot, powerGem, waterPulse);
        Pokemon gligar = new Pokemon("Gligar", 20, "Ground", "Flying", 65, 75, 105, 85, 35, 65, acrobatics, bulldoze, wingAttack);
        Pokemon natu = new Pokemon("Natu", 22, "Psychic", "Flying", 40, 50, 45, 70, 70, 45, zenHeadbutt, signalBeam, drillPeck);
        Pokemon kirlia = new Pokemon("Kirlia", 24, "Psychic", "Fairy", 48, 35, 35, 50, 65, 50, psybeam, fairyWind, chargeBeam);
        Pokemon snorunt = new Pokemon("Snorunt", 23, "Ice", "None", 44, 50, 50, 50, 50, 50, iceFang, bodySlam, hex);
        Pokemon gible = new Pokemon("Gible", 23, "Dragon", "Ground", 58, 70, 45, 42, 40, 45, mudBomb, rockThrow, metalClaw);
        Pokemon zorua = new Pokemon("Zorua", 22, "Dark", "None", 40, 65, 40, 65, 80, 40, snarl, aerialAce, incinerate);

        //Evolved forms of all the Pokémon above
        Pokemon ferrothorn = new Pokemon("Ferrothorn", 35, "Grass", "Steel", 74, 94, 131, 20, 54, 116, powerWhip, ironHead, thunderbolt, shadowClaw);
        Pokemon arcanine = new Pokemon("Arcanine", 35, "Fire", "None", 90, 110, 80, 95, 100, 80, lavaPlume, crunch, hyperVoice, moonblast);
        Pokemon araquanid = new Pokemon("Araquanid", 36, "Water", "Bug", 68, 70, 92, 42, 50, 132, liquidation, xScissor, poisonJab, iceBeam);
        Pokemon ampharos = new Pokemon("Ampharos", 37, "Electric", "None", 90, 75, 85, 115, 90, 55, thunderbolt, psychic, firePunch, brickBreak);
        Pokemon pidgeot = new Pokemon("Pidgeot", 35, "Normal", "Flying", 83, 80, 75, 101, 70, 70, hurricane, aerialAce, razorWind, steelWing);
        Pokemon weezing = new Pokemon("Weezing (Galar Form)", 36, "Poison", "Fairy", 65, 90, 120, 60, 85, 70, gunkShot, playRough, flamethrower, thunderbolt);
        Pokemon lucario = new Pokemon("Lucario", 34, "Fighting", "Steel", 70, 110, 70, 90, 115, 70, auraSphere, boneClub, extremeSpeed, closeCombat);
        Pokemon gengar = new Pokemon("Gengar", 36, "Ghost", "Poison", 60, 65, 60, 110, 130, 75, shadowBall, sludgeBomb, thunderbolt, focusBlast);
        Pokemon boldore = new Pokemon("Boldore", 37, "Rock", "None", 70, 105, 105, 20, 50, 40, rockSlide, bulldoze, flashCannon, bodySlam);
        Pokemon ambipom = new Pokemon("Ambipom", 37, "Normal", "None", 90, 115, 81, 130, 75, 81, megaPunch, foulPlay, solarBeam, firePunch);
        Pokemon granbull = new Pokemon("Granbull", 36, "Fairy", "None", 90, 120, 75, 45, 60, 60, playRough, brickBreak, iceFang, incinerate);
        Pokemon lairon = new Pokemon("Lairon", 37, "Steel", "Rock", 60, 90, 140, 40, 50, 50, ironHead, aerialAce, rockSlide, spark);
        Pokemon gliscor = new Pokemon("Gliscor", 35, "Ground", "Flying", 75, 95, 125, 95, 45, 75, earthquake, hurricane, crossPoison, razorWind);
        Pokemon xatu = new Pokemon("Xatu", 37, "Psychic", "Flying", 65, 75, 70, 95, 95, 70, psychic, airCutter, dazzlingGleam, ominousWind);
        Pokemon gallade = new Pokemon("Gallade", 35, "Psychic", "Fighting", 68, 125, 65, 80, 65, 115, psychoCut, closeCombat, leafBlade, poisonJab);
        Pokemon froslass = new Pokemon("Froslass", 35, "Ice", "Ghost", 70, 50, 70, 110, 80, 70, icicleCrash, shadowClaw, thunderbolt, dazzlingGleam);
        Pokemon gabite = new Pokemon("Gabite", 37, "Dragon", "Ground", 68, 90, 65, 82, 50, 55, earthPower, dragonClaw, rockThrow, strength);
        Pokemon zoroark = new Pokemon("Zoroark", 34, "Dark", "None", 60, 105, 60, 105, 120, 60, nightDaze, sludgeBomb, shadowBall, extrasensory);

        //further evolved forms of specific Pokémon in the above code: Lairon -> Aggron, Boldore -> Gigalith, Gabite -> Garchomp
        Pokemon gigalith = new Pokemon("Gigalith", 37, "Rock", "None", 85, 125, 130, 25, 60, 80, stoneEdge, flashCannon, throatChop, earthPower);
        Pokemon aggron = new Pokemon("Aggron", 37, "Steel", "Rock", 70, 110, 180, 50, 60, 60, ironTail, thunderPunch, brickBreak, aerialAce);
        Pokemon garchomp = new Pokemon("Garchomp", 36, "Dragon", "Ground", 108, 130, 95, 102, 80, 85, outrage, earthquake, aquaTail, shadowClaw);

        //all the Pokemon that the opponent has access to
        Pokemon cacnea = new Pokemon("Cacnea", 20, "Grass", "None", 50, 85, 40, 35, 85, 40, magicalLeaf, venoshock, brickBreak);
        Pokemon vulpix = new Pokemon("Vulpix", 21, "Fire", "None", 43, 41, 40, 65, 50, 65, flameWheel, zenHeadbutt, bodySlam);
        Pokemon mantyke = new Pokemon("Mantyke", 23, "Water", "Flying", 45, 20, 50, 50, 60, 120, aerialAce, waterPulse, bulldoze);
        Pokemon ekans = new Pokemon("Ekans", 22, "Poison", "None", 45, 60, 44, 55, 40, 54, poisonTail, venoshock, bite);
        Pokemon electrike = new Pokemon("Electrike", 23, "Electric", "None", 40, 45, 40, 65, 65, 40, thunderShock, bite, swift);
        Pokemon sneasel = new Pokemon("Sneasel", 20, "Dark", "Ice", 55, 95, 55, 115, 35, 75, payback, avalanche, shadowClaw);
        Pokemon duskull = new Pokemon("Duskull", 21, "Ghost", "None", 42, 40, 90, 25, 30, 90, ominousWind, revenge, icyWind);
        Pokemon dwebble = new Pokemon("Dwebble", 22, "Bug", "Rock", 50, 65, 85, 55, 35, 35, rockThrow, bugBite, aerialAce);
        Pokemon phanpy = new Pokemon("Phanpy", 23, "Ground", "None", 90, 60, 60, 40, 40, 40, bulldoze, ancientPower, waterGun);
        Pokemon shroomish = new Pokemon("Shroomish", 22, "Grass", "None", 60, 40, 60, 35, 40, 60, magicalLeaf, revenge, venoshock);
        Pokemon marill = new Pokemon("Marill", 22, "Water", "Fairy", 70, 20, 50, 40, 20, 50, bubbleBeam, fairyWind, icyWind);
        Pokemon solosis = new Pokemon("Solosis", 20, "Psychic", "None", 45, 30, 40, 20, 105, 50, psybeam, rockThrow, round);
        Pokemon doduo = new Pokemon("Doduo", 22, "Normal", "Flying", 42, 85, 45, 75, 35, 35, swift, aerialAce, pursuit);
        Pokemon makuhita = new Pokemon("Makuhita", 21, "Fighting", "None", 72, 60, 30, 25, 20, 30, brickBreak, thunderPunch, rockThrow);
        Pokemon karrablast = new Pokemon("Karrablast", 22, "Bug", "None", 50, 75, 45, 60, 40, 45, bugBite, pursuit, aerialAce);
        Pokemon pikachu = new Pokemon("Pikachu", 21, "Electric", "None", 40, 55, 40, 90, 50, 50, spark, ironTail, megaPunch);
        Pokemon inkay = new Pokemon("Inkay", 22, "Dark", "Psychic", 53, 54, 53, 45, 37, 46, payback, aerialAce, psybeam);
        Pokemon magikarp = new Pokemon("Magikarp", 19, "Water", "None", 40, 10, 55, 80, 15, 20, splash, tackle);

        //Evolved forms of all the Pokémon above
        Pokemon cacturne = new Pokemon("Cacturne", 36, "Grass", "Dark", 70, 115, 60, 55, 115, 60, powerWhip, foulPlay, focusBlast, thunderPunch);
        Pokemon ninetales = new Pokemon("Ninetales", 37, "Fire", "None", 73, 76, 75, 100, 81, 100, incinerate, energyBall, playRough, zenHeadbutt);
        Pokemon mantine = new Pokemon("Mantine", 36, "Water", "Flying", 85, 40, 70, 70, 80, 140, surf, hurricane, iceBeam, bodySlam);
        Pokemon arbok = new Pokemon("Arbok", 37, "Poison", "None", 60, 95, 69, 80, 65, 79, poisonJab, venoshock, aquaTail, iceFang);
        Pokemon manectric = new Pokemon("Manectric", 36, "Electric", "None", 70, 75, 60, 105, 105, 60, thunderbolt, crunch, iceFang, ironTail);
        Pokemon weavile = new Pokemon("Weavile", 35, "Dark", "Ice", 70, 120, 65, 125, 45, 85, throatChop, icicleCrash, xScissor, shadowBall);
        Pokemon dusclops = new Pokemon("Dusclops", 36, "Ghost", "None", 64, 70, 130, 25, 130, 60, shadowBall, nightDaze, bulldoze, brickBreak);
        Pokemon crustle = new Pokemon("Crustle", 37, "Bug", "Rock", 70, 105, 125, 45, 65, 75, rockSlide, xScissor, solarBeam, shadowClaw);
        Pokemon donphan = new Pokemon("Donphan", 36, "Ground", "None", 90, 120, 120, 50, 60, 60, earthquake, playRough, iceFang, seedBomb);
        Pokemon breloom = new Pokemon("Breloom", 35, "Grass", "Fighting", 60, 130, 80, 70, 60, 60, seedBomb, closeCombat, bulletPunch, sludgeBomb);
        Pokemon azumarill = new Pokemon("Azumarill", 36, "Water", "Fairy", 100, 50, 80, 50, 60, 80, liquidation, playRough, iceBeam, hyperVoice);
        Pokemon duosion = new Pokemon("Duosion", 36, "Psychic", "None", 65, 40, 50, 30, 125, 60, extrasensory, signalBeam, rockSlide, spark);
        Pokemon dodrio = new Pokemon("Dodrio", 36, "Normal", "Flying", 65, 110, 70, 110, 60, 60, drillPeck, extremeSpeed, steelWing, foulPlay);
        Pokemon hariyama = new Pokemon("Hariyama", 36, "Fighting", "None", 144, 120, 60, 50, 40, 60, closeCombat, earthquake, ironHead, poisonJab);
        Pokemon escavalier = new Pokemon("Escavalier", 37, "Bug", "Steel", 70, 135, 105, 20, 60, 105, megahorn, ironHead, drillPeck, energyBall);
        Pokemon raichu = new Pokemon("Raichu (Alolan Form)", 36, "Electric", "Psychic", 60, 85, 50, 110, 95, 85, thunder, psychic, surf, ironTail);
        Pokemon malamar = new Pokemon("Malamar", 36, "Dark", "Psychic", 86, 92, 88, 73, 68, 75, psychic, nightDaze, thunderbolt, signalBeam);
        Pokemon gyarados = new Pokemon("Gyadrados", 35, "Water", "Flying", 95, 125, 79, 81, 60, 100, aquaTail, hurricane, crunch, dragonPulse);

        //further evolved forms of specific Pokémon in the above code: Dusclops -> Dusknoir, Duosion -> Reuniclus
        Pokemon dusknoir = new Pokemon("Dusknoir", 36, "Ghost", "None", 70, 100, 135, 45, 65, 135, shadowClaw, earthquake, iceBeam, flamethrower);
        Pokemon reuniclus = new Pokemon("Reuniclus", 37, "Psychic", "None", 110, 65, 75, 30, 125, 85, psychic, energyBall, signalBeam, thunder);

        //All legendary pokemon (only usable in 6th and final battle)
        Pokemon mewtwo = new Pokemon("Mewtwo", 80, "Psychic", "None", 106, 110, 90, 130, 154, 90, psystrike, auraSphere, shadowBall, thunderPunch);
        Pokemon hoOh = new Pokemon("Ho-Oh", 80, "Fire", "Flying", 106, 130, 90, 90, 110, 154, sacredFire, hurricane, shadowBall, thunder);
        Pokemon lugia = new Pokemon("Lugia", 80, "Psychic", "Flying", 106, 60, 130, 90, 154, 110, aeroblast, psychic, hydroPump, iceBeam);
        Pokemon groudon = new Pokemon("Groudon", 80, "Ground", "None", 100, 150, 140, 90, 100, 90, precipiceBlades, fireBlast, solarBeam, megaPunch);
        Pokemon kyogre = new Pokemon("Kyogre", 80, "Water", "None", 100, 100, 90, 90, 150, 140, originPulse, freezeDry, stoneEdge, earthquake);
        Pokemon rayquaza = new Pokemon("Rayquaza", 80, "Dragon", "Flying", 105, 150, 90, 95, 150, 90, dragonAscent, outrage, hydroPump, ironTail);
        Pokemon dialga = new Pokemon("Dialga", 80, "Steel", "Dragon", 100, 120, 120, 90, 150, 100, roarOfTime, powerGem, flashCannon, hyperVoice);
        Pokemon palkia = new Pokemon("Palkia", 80, "Water", "Dragon", 90, 120, 100, 150, 120, 100, spacialRend, hydroPump, thunder, fireBlast);
        Pokemon giratina = new Pokemon("Giratina", 80, "Ghost", "Dragon", 150, 100, 120, 90, 100, 120, shadowForce, dragonClaw, aquaTail, energyBall);
        Pokemon reshiram = new Pokemon("Reshiram", 80, "Dragon", "Fire", 100, 120, 100, 90, 150, 120, blueFlare, fireBlast, stoneEdge, dragonPulse);
        Pokemon zekrom = new Pokemon("Zekrom", 80, "Dragon", "Electric", 100, 150, 120, 90, 120, 100, boltStrike, dragonClaw, earthPower, zenHeadbutt);
        Pokemon kyurem = new Pokemon("Kyurem", 80, "Dragon", "Ice", 125, 130, 90, 95, 130, 90, glaciate, dragonBreath, focusBlast, shadowBall);
        Pokemon xerneas = new Pokemon("Xerneas", 80, "Fairy", "None", 126, 131, 95, 99, 131, 98, lightOfRuin, megahorn, thunder, zenHeadbutt);
        Pokemon yveltal = new Pokemon("Yveltal", 80, "Dark", "Flying", 126, 131, 95, 99, 131, 98, oblivionWing, nightDaze, dragonClaw, psychic);
        Pokemon zygarde = new Pokemon("Zygarde", 80, "Dragon", "Ground", 108, 100, 121, 95, 81, 95, coreEnforcer, earthquake, crunch, ironTail);
        Pokemon solgaleo = new Pokemon("Solgaleo", 80, "Psychic", "Steel", 137, 137, 107, 97, 113, 89, sunsteelStrike, psychoCut, fireBlast, snarl);
        Pokemon lunala = new Pokemon("Luanala", 80, "Psychic", "Ghost", 137, 113, 89, 97, 137, 107, moongeistBeam, moonblast, psychic, nightDaze);
        Pokemon necrozma = new Pokemon("Necrozma", 80, "Psychic", "None", 97, 107, 101, 79, 127, 89, photonGeyser, earthPower, xScissor, solarBeam);
        Pokemon zacian = new Pokemon("Zacian", 80, "Fairy", "Steel", 92, 130, 115, 138, 80, 115, behemothBlade, playRough, closeCombat, iceFang);
        Pokemon zamazenta = new Pokemon("Zamazenta", 80, "Fighting", "Steel", 92, 130, 115, 138, 80, 115, behemothBash, crunch, focusBlast, hyperVoice);
        Pokemon eternatus = new Pokemon("Eternatus", 80, "Poison", "Dragon", 140, 85, 95, 130, 145, 95, dynamaxCannon, flamethrower, gunkShot, flashCannon);

        //setting all above Pokémon in their arrays
        //starters go in their own array
        Pokemon[] starters = {bulbasaur, charmander, squirtle, ivysaur, charmeleon, wartortle, venusaur, charizard, blastoise};

        //2D array for all the player's Pokémon
        Pokemon[][] playerMons = {{ferroseed, growlithe, dewpider, mareep, pidgeotto, koffing, riolu, gastly, roggenrola, aipom, snubbull, aron, gligar, natu, kirlia, snorunt, gible, zorua},
                {ferrothorn, arcanine, araquanid, ampharos, pidgeot, weezing, lucario, gengar, boldore, ambipom, granbull, lairon, gliscor, xatu, gallade, froslass, gabite, zoroark}};

        //2D array for all the opponent's Pokémon
        Pokemon[][] opponentMons = {{cacnea, vulpix, mantyke, ekans, electrike, sneasel, duskull, dwebble, phanpy, shroomish, marill, solosis, doduo, makuhita, karrablast, pikachu, inkay, magikarp},
                {cacturne, ninetales, mantine, arbok, manectric, weavile, dusclops, crustle, donphan, breloom, azumarill, duosion, dodrio, hariyama, escavalier, raichu, malamar, gyarados}};

        //array for all the legendary Pokémon
        Pokemon[] legendaries = {mewtwo, hoOh, lugia, groudon, kyogre, rayquaza, dialga, palkia, giratina, reshiram, zekrom, kyurem, xerneas, yveltal, zygarde, solgaleo, lunala, necrozma, zacian, zamazenta, eternatus};

        //instantiate two new trainers, one for the player, another for the opponent
        Trainer player = new Trainer();
        Trainer opponent = new Trainer();

        //welcome message, and ask for user's name
        System.out.println("Welcome to the wonderful world of Pokemon!");
        System.out.println("In this program, you will choose your Pokemon and take place in six battles");
        System.out.println("To start, we must ask you for your name");
        player.setName(input.next());

        //ask the user to input a number to select their first Pokémon
        System.out.println("And now, you will have to answer the lifelong question:\nType 1 to choose Bulbasaur (Grass Type), type 2 to choose Charmander (Fire Type), or type 3 to choose Squirtle (Water Type)");
        int starter;

        //do-while loop to make sure a valid number is inputted
        do
            starter = input.nextInt();
        while (starter < 1 || starter > 3);

        //depending on the user's input, set both trainer's first Pokémon to a specific index in the starters array
        switch (starter) {
            case 1:
                player.setMon1(bulbasaur);
                opponent.setMon1(squirtle);
                break;
            case 2:
                player.setMon1(charmander);
                opponent.setMon1(bulbasaur);
                break;
            case 3:
                player.setMon1(squirtle);
                opponent.setMon1(charmander);
                break;
        }

        System.out.println("You have chosen " + player.getMon1().getName());
        System.out.println("Your opponent has chosen " + opponent.getMon1().getName());

        System.out.println("\nWe will now commence the first battle.");

        //commence the first battle
        boolean result = MainGame.battle(player, opponent);

        //if the user wins, continue the program
        if (result){

            System.out.println("\nFollowing your first battle, you set out on a journey, and collected a wide variety of Pokemon");

            //swaps out the first Pokémon with their first evolved form
            switch(starter){
                case 1:
                    player.setMon1(starters[3]);
                    opponent.setMon1(starters[5]);
                    break;
                case 2:
                    player.setMon1(starters[4]);
                    opponent.setMon1(starters[3]);
                    break;
                case 3:
                    player.setMon1(starters[5]);
                    opponent.setMon1(starters[4]);
                    break;
            }

            System.out.println("Your starter Pokemon has since evolved into " + player.getMon1().getName() + ", and you will need to choose one of your new friends to join them in the next battle!");

            //prints out the options for the user to select from for their second Pokemon
            for (int i = 0; i < 18; i++)
                System.out.println("Type " + (i + 1) + " to select " + playerMons[0][i].getName());

            int choice;

            //do-while loop to make sure the input is valid
            do
                choice = input.nextInt();
            while (choice < 1 || choice > 18);

            //set second Pokemon based on user option
            player.setMon2(playerMons[0][choice-1]);

            System.out.println("You selected " + player.getMon2().getName());

            //create new variable to randomize the opponent's second Pokemon
            int opponentChoice = rand.nextInt(18);

            opponent.setMon2(opponentMons[0][opponentChoice]);

            System.out.println("They chose " + opponent.getMon2().getName());

            //commence the second battle
            result = MainGame.battle(player, opponent);

            //if the user wins, continue the program
            if (result) {

                //another switch statement to bring the starter Pokemon to their final evolved form
                switch(starter){
                    case 1:
                        player.setMon1(starters[6]);
                        opponent.setMon1(starters[8]);
                        break;
                    case 2:
                        player.setMon1(starters[7]);
                        opponent.setMon1(starters[6]);
                        break;
                    case 3:
                        player.setMon1(starters[8]);
                        opponent.setMon1(starters[7]);
                        break;
                }

                System.out.println("\nFast forward to the point where your starter Pokemon has fully evolved into " + player.getMon1().getName());

                //evolve the previous choice the user made, and set the index to the bogus Pokemon so its not picked up by the future loops
                player.setMon2(playerMons[1][choice -1]);
                playerMons[1][choice - 1] = none;

                System.out.println("Your other Pokemon evolved into " + player.getMon2().getName());
                System.out.println("Now choose another Pokemon to join your party");

                //prints out the options for the user to select from for their third Pokemon (ignores the none Pokemon)
                for (int i = 0; i < 18; i++) {
                    if (playerMons[1][i].getHP() != 0)
                        System.out.println("Type " + (i + 1) + " to select " + playerMons[1][i].getName());
                }

                //do-while loop to make sure the input is valid
                do
                    choice = input.nextInt();
                while (choice < 1 || choice > 18 || playerMons[1][choice - 1].getHP() == 0);

                //set the third Pokemon and index of the array based on the choice
                player.setMon3(playerMons[1][choice - 1]);
                playerMons[1][choice - 1] = none;

                System.out.println("You selected " + player.getMon3().getName());

                opponent.setMon2(opponentMons[1][opponentChoice]);
                opponentMons[1][opponentChoice] = none;

                //making a new random choice for the opponent
                do {
                    opponentChoice = rand.nextInt(18);
                } while (opponentMons[1][opponentChoice].getHP() == 0);

                //set the opponents third Pokemon based on the random number
                opponent.setMon3(opponentMons[1][opponentChoice]);
                opponentMons[1][opponentChoice] = none;

                System.out.println("They chose " + opponent.getMon3().getName());

                //commence the third battle
                result = MainGame.battle(player, opponent);

                //if the user wins, continue the program
                if (result) {

                    //from here to line 531, replace all occurrences of specific Pokemon with their respective fully evolved versions
                    for (int i = 0; i < 18; i++){
                        if (playerMons[1][i] == lairon)
                            playerMons[1][i] = aggron;
                        if (playerMons[1][i] == gabite)
                            playerMons[1][i] = garchomp;
                        if (playerMons[1][i] == boldore)
                            playerMons[1][i] = gigalith;
                        if (opponentMons[1][i] == duosion)
                            opponentMons[1][i] = reuniclus;
                        if (opponentMons[1][i] == dusclops)
                            opponentMons[1][i] = dusknoir;
                    }

                    if (player.getMon2() == gabite)
                        player.setMon2(garchomp);
                    else if (player.getMon3() == gabite)
                        player.setMon3(garchomp);
                    else if (player.getMon4() == garchomp)
                        player.setMon4(garchomp);

                    if (player.getMon2() == lairon)
                        player.setMon2(aggron);
                    else if (player.getMon3() == lairon)
                        player.setMon3(aggron);
                    else if (player.getMon4() == lairon)
                        player.setMon4(aggron);

                    if (player.getMon2() == boldore)
                        player.setMon2(gigalith);
                    else if (player.getMon3() == boldore)
                        player.setMon3(gigalith);
                    else if (player.getMon4() == boldore)
                        player.setMon4(gigalith);

                    if (opponent.getMon2() == duosion)
                        opponent.setMon2(reuniclus);
                    else if (opponent.getMon3() == duosion)
                        opponent.setMon3(reuniclus);
                    else if (opponent.getMon4() == duosion)
                        opponent.setMon4(reuniclus);

                    if (opponent.getMon2() == dusclops)
                        opponent.setMon2(dusknoir);
                    else if (opponent.getMon3() == dusclops)
                        opponent.setMon3(dusknoir);
                    else if (opponent.getMon4() == dusclops)
                        opponent.setMon4(dusknoir);

                    System.out.println("\nPrepare for battle number 4");

                    System.out.println("Your other Pokemon have levelled up quite a bit");
                    System.out.println("Now choose another Pokemon to join your party");

                    //loop through the user's options
                    for (int i = 0; i < 18; i++) {
                        if (playerMons[1][i].getHP() != 0)
                            System.out.println("Type " + (i + 1) + " to select " + playerMons[1][i].getName());
                    }

                    //make sure the user's input is valid
                    do
                        choice = input.nextInt();
                    while (choice < 1 || choice > 18 || playerMons[1][choice - 1].getHP() == 0);

                    //set the fourth Pokemon to the player's choice, and make the index in the array none
                    player.setMon4(playerMons[1][choice - 1]);
                    playerMons[1][choice - 1] = none;

                    System.out.println("You selected " + player.getMon4().getName());

                    //call the heal up method to bring the player's Pokemon back up to full health, and increase their levels
                    player.healUp();

                    //making another random choice for the opponent
                    do {
                        opponentChoice = rand.nextInt(18);
                    } while (opponentMons[1][opponentChoice].getHP() == 0);

                    //set the opponents fourth Pokemon based on the random number
                    opponent.setMon4(opponentMons[1][opponentChoice]);
                    opponentMons[1][opponentChoice] = none;

                    System.out.println("They chose " + opponent.getMon4().getName());

                    //call the heal up method to bring the opponent's Pokemon back up to full health, and increase their levels
                    opponent.healUp();

                    //commence the fourth battle
                    result = MainGame.battle(player, opponent);

                    //if the user wins, continue the program
                    if (result){

                        System.out.println("\nPrepare for Battle 5");

                        //print out the remaining Pokemon that are available
                        for (int i = 0; i < 18; i++) {
                            if (playerMons[1][i].getHP() != 0)
                                System.out.println("Type " + (i + 1) + " to select " + playerMons[1][i].getName());
                        }

                        //make sure the user's input is valid
                        do
                            choice = input.nextInt();
                        while (choice < 1 || choice > 18 || playerMons[1][choice - 1].getHP() == 0);

                        //set the fifth Pokemon to the player's choice, and make the index in the array none
                        player.setMon5(playerMons[1][choice - 1]);
                        playerMons[1][choice - 1] = none;

                        System.out.println("You selected " + player.getMon5().getName());

                        //heal up the trainer's Pokemon
                        player.healUp();
                        //level up the most recent addition to the player's team so that it's on-par with the rest of the team
                        player.getMon5().levelUp();

                        //making another random choice for the opponent
                        do {
                            opponentChoice = rand.nextInt(18);
                        } while (opponentMons[1][opponentChoice].getHP() == 0);

                        //set the opponents fourth Pokemon based on the random number
                        opponent.setMon5(opponentMons[1][opponentChoice]);
                        opponentMons[1][opponentChoice] = none;

                        System.out.println("They chose " + opponent.getMon5().getName());

                        //heal up the opponent's Pokemon
                        opponent.healUp();
                        //level up the most recent addition to the opponent's team so that it's on-par with the rest of the team
                        opponent.getMon5().levelUp();

                        //commence the fifth battle
                        result = MainGame.battle(player, opponent);

                        //if the user wins, continue the program
                        if (result) {

                            //heal up both Trainer's teams
                            player.healUp();
                            opponent.healUp();

                            System.out.println("Here we are, at the final battle. For such a grand occasion, choose from these Pokemon who only appear in legend");

                            //prints out all legendary Pokemon for the user to choose from
                            for (int i = 0; i < 21; i++) {
                                System.out.println("Type " + (i + 1) + " to select " + legendaries[i].getName());
                            }

                            //makes sure the input is valid
                            do
                                choice = input.nextInt();
                            while (choice < 1 || choice > 21);

                            //set the final team member on the user's team to the legendary Pokemon they selected
                            player.setMon6(legendaries[choice - 1]);

                            System.out.println("You chose " + player.getMon6().getName());

                            //make sure the opponent's random value is not the same as the player's input value so that they don't have the same legendary Pokemon
                            do
                                opponentChoice = rand.nextInt(21);
                            while (opponentChoice == (choice - 1));

                            //set the legendary Pokemon to the final team member for the opponent
                            opponent.setMon6(legendaries[opponentChoice]);

                            System.out.println("They selected " + opponent.getMon6().getName());

                            //commence the final battle
                            result = MainGame.battle(player, opponent);

                            //if the user wins, give them a goodbye, and a thanks for playing message
                            if (result)
                                System.out.println("You have completed this Java Pokemon game! \nCongrat's " + player.getName() + "! \nThank-you for playing!");
                            else //if the player loses, end the program
                                System.out.println("You were so close... \nRestart the program to try again");
                        }
                        else //if the player loses, end the program
                            System.out.println("Only two more battles... \nRestart the program to try again");
                    }
                    else //if the player loses, end the program
                        System.out.println("Better luck next time... \nRestart the program to try again");
                }
                else //if the player loses, end the program
                    System.out.println("Restart the program to try again...");
            }
            else //if the player loses, end the program
                System.out.println("Restart the program to try again...");
        }
        else //if the player loses, end the program
            System.out.println("Restart the program to try again...");
    }

    //static method that has all the logic in place for the battle between the trainers
    public static boolean battle(Trainer player, Trainer opponent) {

        //initialize return variable
        boolean result = false;

        //create new scanner and random objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //initializing damage variables
        double damage = 0;
        double damageTaken = 0;
        int writtenDamage = 0;
        int writtenDamageTaken = 0;

        //initializing Pokémon variables to be used in the battle
        Pokemon playerMon;
        Pokemon opponentMon = opponent.getMon1();

        //initializing total HP counts for both trainers
        double totalPlayerHP = 0;
        double totalOpponentHP = 0;

        //Add up all the Pokemon's HP stats to the variables above for both the player and opponent
        try {
            totalPlayerHP = totalPlayerHP + player.getMon1().getMaxHP();
            totalPlayerHP = totalPlayerHP + player.getMon2().getMaxHP();
            totalPlayerHP = totalPlayerHP + player.getMon3().getMaxHP();
            totalPlayerHP = totalPlayerHP + player.getMon4().getMaxHP();
            totalPlayerHP = totalPlayerHP + player.getMon5().getMaxHP();
            totalPlayerHP = totalPlayerHP + player.getMon6().getMaxHP();
        } catch (NullPointerException e) {

        }

        try {
            totalOpponentHP = totalOpponentHP + opponent.getMon1().getMaxHP();
            totalOpponentHP = totalOpponentHP + opponent.getMon2().getMaxHP();
            totalOpponentHP = totalOpponentHP + opponent.getMon3().getMaxHP();
            totalOpponentHP = totalOpponentHP + opponent.getMon4().getMaxHP();
            totalOpponentHP = totalOpponentHP + opponent.getMon5().getMaxHP();
            totalOpponentHP = totalOpponentHP + opponent.getMon6().getMaxHP();
        } catch (NullPointerException e) {

        }

        //prints out the Pokémon in the user's team that they can choose from
        System.out.println("Select Your Pokemon to do battle");

        try {
            System.out.println("Type 1 for " + player.getMon1().getName() + " Lv: " + player.getMon1().getLevel());
            System.out.println("Type 2 for " + player.getMon2().getName() + " Lv: " + player.getMon2().getLevel());
            System.out.println("Type 3 for " + player.getMon3().getName() + " Lv: " + player.getMon3().getLevel());
            System.out.println("Type 4 for " + player.getMon4().getName() + " Lv: " + player.getMon4().getLevel());
            System.out.println("Type 5 for " + player.getMon5().getName() + " Lv: " + player.getMon5().getLevel());
            System.out.println("Type 6 for " + player.getMon6().getName() + " Lv: " + player.getMon6().getLevel());
        } catch (NullPointerException e) {

        }

        //create 2 more variables for the user's Pokemon HP and their choice
        int playerHP;
        int monPlayer;

        try {
            //take the input of the user as long as it is between 1 and 6
            do {
                monPlayer = input.nextInt();
            } while (monPlayer < 0 || monPlayer > 6);

            if (monPlayer == 1)
                playerMon = player.getMon1();
            else if (monPlayer == 2)
                playerMon = player.getMon2();
            else if (monPlayer == 3)
                playerMon = player.getMon3();
            else if (monPlayer == 4)
                playerMon = player.getMon4();
            else if (monPlayer == 5)
                playerMon = player.getMon5();
            else
                playerMon = player.getMon6();

            playerHP = (int) playerMon.getHP();
        }
        //if the try statement finds a null value, automatically assigns the Pokemon to be the first one in the party
        catch (NullPointerException e) {
            monPlayer = 1;
            playerMon = player.getMon1();
            playerHP = (int) playerMon.getHP();
        }

        //create variables for the opponent's choice, and their HP stat
        double monOpponent = 1;

        int opponentHP = (int) opponentMon.getHP();

        //print lines to say the battle is starting
        System.out.println("\nGo, " + playerMon.getName() + "!");
        System.out.println("The opponent sent out " + opponentMon.getName() + "!" + " (Lv: " + opponentMon.getLevel() + ")");

        //while loop that continues until either Trainer's team is defeated
        while (totalPlayerHP > 0 && totalOpponentHP > 0) {

            //if the player's Pokemon is alive, then run the below code
            if (playerHP > 0) {
                //prints out the move selection
                System.out.println("\nSelect Your Move:");
                System.out.println("Type 1 for " + playerMon.getMove1().getName() + " | Type: " + playerMon.getMove1().getType());
                System.out.println("Type 2 for " + playerMon.getMove2().getName() + " | Type: " + playerMon.getMove2().getType());
                try {    //these print lines may not get printed, since some Pokemon only have 2 or 3 attacks
                    System.out.println("Type 3 for " + playerMon.getMove3().getName() + " | Type: " + playerMon.getMove3().getType());
                    System.out.println("Type 4 for " + playerMon.getMove4().getName() + " | Type: " + playerMon.getMove4().getType());
                }
                //if that is the case, then simply continue
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) {

                }

                //create new variable for the player's move choice
                int action;

                //do while loop to make sure the number is valid
                do {
                    action = input.nextInt();
                } while (action < 1 || action > 4);

                //creates new Move variable to store what attack will come out from the player
                Move playerMove;

                try {   //the user may enter a number that results in a null exception
                    //set the Move to the Pokemon's move that corresponds to the user's input
                    if (action == 1)
                        playerMove = playerMon.getMove1();
                    else if (action == 2)
                        playerMove = playerMon.getMove2();
                    else if (action == 3)
                        playerMove = playerMon.getMove3();
                    else
                        playerMove = playerMon.getMove4();
                    System.out.println("You selected " + playerMove.getName());

                }
                //if there is an exception found, set it to the second attack that the Pokemon has access to
                catch (NullPointerException e) {
                    playerMove = playerMon.getMove2();
                }

                //call typeCheck method to calculate the type match-up multiplier for the future interactions
                double playerTypeMultiplier = typeCheck(playerMove, opponentMon);

                //calculate the damage that will be dealt to the opposing Pokemon, based on the level, attack and defense stats, power of the attack, and type multiplier
                //attack and defense stats which affect the damage are based on if the physical variable in the move is true or not
                if (playerMove.getPhysical())
                    damage = ((((((playerMon.getLevel() * 2.0) / 5.0) + 2.0) * playerMove.getPower() * (playerMon.getAttack() / opponentMon.getDefense())) / 50) + 2) * playerTypeMultiplier;
                else
                    damage = ((((((playerMon.getLevel() * 2.0) / 5.0) + 2.0) * playerMove.getPower() * (playerMon.getSpAttack() / opponentMon.getSpDefense())) / 50) + 2) * playerTypeMultiplier;

                //if a critical hit occurs, (1/20 odds), then double the damage
                Integer playerCriticalHit = rand.nextInt(20);
                if (playerCriticalHit.equals(0))
                    damage = damage * 2;

                //set the "writtenDamage" variable to an integer, so that it is printed out nicely
                writtenDamage = (int) Math.round(damage);

                //creates new Move variable to store what attack will come out from the opponent
                Move opponentMove;

                //randomize which move will be used by the opponent, based on the amount of Moves the Pokemon has to choose from
                int opponentAction = rand.nextInt(2);
                try {
                    if (opponentMon.getMove3().getPower() != 0)
                        opponentAction = rand.nextInt(3);
                    if (opponentMon.getMove4().getPower() != 0)
                        opponentAction = rand.nextInt(4);
                } catch (NullPointerException e) {

                }

                //set the opponent's move based on what the random value was
                if (opponentAction == 0)
                    opponentMove = opponentMon.getMove1();
                else if (opponentAction == 1)
                    opponentMove = opponentMon.getMove2();
                else if (opponentAction == 2)
                    opponentMove = opponentMon.getMove3();
                else
                    opponentMove = opponentMon.getMove4();

                //call typeCheck method to calculate the type match-up multiplier for the future interactions
                double opponentTypeMultiplier = typeCheck(playerMon, opponentMove);

                //calculate the damage that will be dealt to the opposing Pokemon, based on the level, attack and defense stats, power of the attack, and type multiplier
                //attack and defense stats which affect the damage are based on if the physical variable in the move is true or not
                if (opponentMove.getPhysical())
                    damageTaken = ((((((opponentMon.getLevel() * 2.0) / 5.0) + 2.0) * opponentMove.getPower() * (opponentMon.getAttack() / playerMon.getDefense())) / 50) + 2) * opponentTypeMultiplier;
                else
                    damageTaken = ((((((opponentMon.getLevel() * 2.0) / 5.0) + 2.0) * opponentMove.getPower() * (opponentMon.getSpAttack() / playerMon.getSpDefense())) / 50) + 2) * opponentTypeMultiplier;

                //if a critical hit occurs, (1/20 odds), then double the damage
                Integer opponentCriticalHit = rand.nextInt(20);
                if (opponentCriticalHit.equals(0))
                    damageTaken = damageTaken * 2;

                //set the "writtenDamageTaken" variable to an integer, so that it is printed out nicely
                writtenDamageTaken = (int) Math.round(damageTaken);

                //if player's speed is larger than the opponent's, then the user attacks first
                if (playerMon.getSpeed() >= opponentMon.getSpeed()) {

                    //print out the attack, and its type-effectiveness
                    System.out.println(playerMon.getName() + " used " + playerMove.getName());
                    if (playerTypeMultiplier > 1)
                        System.out.println("It's super-effective!!");
                    else if (playerTypeMultiplier == 0)
                        System.out.println("It had no effect...");
                    else if (playerTypeMultiplier < 1)
                        System.out.println("It's not very effective...");

                    //if it was a critical hit, say so
                    if (playerCriticalHit.equals(0))
                        System.out.println("A critical hit!");

                    //if it KO'd, then say so, but if not, just say how much damage it did
                    if (opponentHP - writtenDamage <= 0) {
                        System.out.println("It KO'd the opposing " + opponentMon.getName() + "!");
                        System.out.println(opponentMon.getName() + "'s HP bar: " + opponentHP + " ---> 0");
                    } else {
                        System.out.println("It did " + writtenDamage + " damage");
                        System.out.println(opponentMon.getName() + "'s HP bar: " + opponentHP + " ---> " + (opponentHP - writtenDamage));
                    }

                    //calculate the opponent's HP after the attack
                    opponentHP = opponentHP - writtenDamage;

                    //if the opponent survived it, then the opponent attacks the user
                    if (opponentHP > 0) {

                        //print out the attack, and its type-effectiveness
                        System.out.println("\nThe opponent's " + opponentMon.getName() + " used " + opponentMove.getName());
                        if (opponentTypeMultiplier > 1)
                            System.out.println("It's super-effective!!");
                        else if (opponentTypeMultiplier == 0)
                            System.out.println("It had no effect...");
                        else if (opponentTypeMultiplier < 1)
                            System.out.println("It's not very effective...");

                        //if it was a critical hit, say so
                        if (opponentCriticalHit.equals(0))
                            System.out.println("A critical hit!");

                        //if it KO'd, then say so, but if not, just say how much damage it did
                        if (playerHP - writtenDamageTaken <= 0) {
                            System.out.println("It KO'd your " + playerMon.getName() + "!");
                            System.out.println(playerMon.getName() + "'s HP bar: " + playerHP + " ---> 0");
                        } else {
                            System.out.println("It did " + writtenDamageTaken + " damage");
                            System.out.println(playerMon.getName() + "'s HP bar: " + playerHP + " ---> " + (playerHP - writtenDamageTaken));
                        }

                        //calculate the player's HP after the attack
                        playerHP = playerHP - writtenDamageTaken;

                    }

                }

                //if opponent's speed is larger than the player's, then the opponent attack first
                if (playerMon.getSpeed() < opponentMon.getSpeed()) {

                    //print out the attack, and its type-effectiveness
                    System.out.println("The opponent's " + opponentMon.getName() + " used " + opponentMove.getName());
                    if (opponentTypeMultiplier > 1)
                        System.out.println("It's super-effective!!");
                    else if (opponentTypeMultiplier == 0)
                        System.out.println("It had no effect...");
                    else if (opponentTypeMultiplier < 1)
                        System.out.println("It's not very effective...");

                    //if it was a critical hit, say so
                    if (opponentCriticalHit.equals(0))
                        System.out.println("A critical hit!");

                    //if it KO'd, then say so, but if not, just say how much damage it did
                    if (playerHP - writtenDamageTaken <= 0) {
                        System.out.println("It KO'd your " + playerMon.getName() + "!");
                        System.out.println(playerMon.getName() + "'s HP bar: " + playerHP + " ---> 0");
                    } else {
                        System.out.println("It did " + writtenDamageTaken + " damage");
                        System.out.println(playerMon.getName() + "'s HP bar: " + playerHP + " ---> " + (playerHP - writtenDamageTaken));
                    }

                    //calculate the player's HP after the attack
                    playerHP = playerHP - writtenDamageTaken;

                    if (playerHP > 0) {

                        //print out the attack, and its type-effectiveness
                        System.out.println(playerMon.getName() + " used " + playerMove.getName());
                        if (playerTypeMultiplier > 1)
                            System.out.println("It's super-effective!!");
                        else if (playerTypeMultiplier == 0)
                            System.out.println("It had no effect...");
                        else if (playerTypeMultiplier < 1)
                            System.out.println("It's not very effective...");

                        //if it was a critical hit, say so
                        if (playerCriticalHit.equals(0))
                            System.out.println("A critical hit!");

                        //if it KO'd, then say so, but if not, just say how much damage it did
                        if (opponentHP - writtenDamage <= 0) {
                            System.out.println("It KO'd the opposing " + opponentMon.getName() + "!");
                            System.out.println(opponentMon.getName() + "'s HP bar: " + opponentHP + " ---> 0");
                        } else {
                            System.out.println("It did " + writtenDamage + " damage");
                            System.out.println(opponentMon.getName() + "'s HP bar: " + opponentHP + " ---> " + (opponentHP - writtenDamage));
                        }

                        //calculate the opponent's HP after the attack
                        opponentHP = opponentHP - writtenDamage;

                    }
                }
            }

            //if the player's Pokemon was defeated, then run the below code
            if (playerHP <= 0) {

                //remove the current Pokemon's HP from the totalPlayerHP
                totalPlayerHP = totalPlayerHP - playerMon.getMaxHP();

                //set the corresponding Pokemon's HP to 0, so it is ignored by the print statements later in the loop
                if (monPlayer == 1)
                    player.getMon1().setHP(0);
                else if (monPlayer == 2)
                    player.getMon2().setHP(0);
                else if (monPlayer == 3)
                    player.getMon3().setHP(0);
                else if (monPlayer == 4)
                    player.getMon4().setHP(0);
                else if (monPlayer == 5)
                    player.getMon5().setHP(0);
                else if (monPlayer == 6)
                    player.getMon6().setHP(0);

                //print out the player's choices of healthy Pokemon to send out next
                if (totalPlayerHP > 0)
                    System.out.println("Choose which Pokemon to send out");
                try {
                    if (player.getMon1().getHP() != 0)
                        System.out.println("Type 1 for " + player.getMon1().getName());
                    if (player.getMon2().getHP() != 0)
                        System.out.println("Type 2 for " + player.getMon2().getName());
                    if (player.getMon3().getHP() != 0)
                        System.out.println("Type 3 for " + player.getMon3().getName());
                    if (player.getMon4().getHP() != 0)
                        System.out.println("Type 4 for " + player.getMon4().getName());
                    if (player.getMon5().getHP() != 0)
                        System.out.println("Type 5 for " + player.getMon5().getName());
                    if (player.getMon6().getHP() != 0)
                        System.out.println("Type 6 for " + player.getMon6().getName());
                } catch (NullPointerException e) {
                    //if any Pokemon do not exist and are null, simply ignore and continue
                }

                //if the player's team is not wiped out, run the below code
                if (totalPlayerHP > 0) {

                    try {   //get a valid user input
                        do {
                            monPlayer = input.nextInt();
                        } while (monPlayer < 1 || monPlayer > 6 || player.getMons()[monPlayer - 1].getHP() == 0);
                    }
                    //if the input catches a null value, jump to this catch block which will choose from the other available options and select the first one that pops up
                    catch (NullPointerException e) {
                        if (player.getMon1().getHP() != 0)
                            monPlayer = 1;
                        else if (player.getMon2().getHP() != 0)
                            monPlayer = 2;
                        else if (player.getMon3().getHP() != 0)
                            monPlayer = 3;
                        else if (player.getMon4().getHP() != 0)
                            monPlayer = 4;
                        else if (player.getMon5().getHP() != 0)
                            monPlayer = 5;
                        else if (player.getMon6().getHP() != 0)
                            monPlayer = 6;

                    }

                    //set the correct Pokemon based on the variable that was manipulated above
                    if (monPlayer == 1)
                        playerMon = player.getMon1();
                    else if (monPlayer == 2)
                        playerMon = player.getMon2();
                    else if (monPlayer == 3)
                        playerMon = player.getMon3();
                    else if (monPlayer == 4)
                        playerMon = player.getMon4();
                    else if (monPlayer == 5)
                        playerMon = player.getMon5();
                    else
                        playerMon = player.getMon6();

                    //get the HP stat of the next Pokemon so it can be used in the future rounds of combat
                    playerHP = (int) playerMon.getHP();

                    System.out.println("Go, " + playerMon.getName() + "!");

                }
            }

            //if the opponent's Pokemon was defeated, then run the below code
            if (opponentHP <= 0) {

                //remove the current Pokemon's HP from the totalOpponentHP
                totalOpponentHP = totalOpponentHP - opponentMon.getMaxHP();

                try {

                    //depending on the opponent's previous "choice", set the next Pokemon to go out, so it goes in sequential order
                    if (monOpponent == 1) {
                        opponentMon = opponent.getMon2();
                    } else if (monOpponent == 2) {
                        opponentMon = opponent.getMon3();
                    } else if (monOpponent == 3) {
                        opponentMon = opponent.getMon4();
                    } else if (monOpponent == 4) {
                        opponentMon = opponent.getMon5();
                    } else if (monOpponent == 5) {
                        opponentMon = opponent.getMon6();
                    }

                    //increment the monOpponent variable so that the next time we come around, the next Pokemon in line goes out
                    monOpponent++;

                    //get the HP stat of the next Pokemon so it can be used in the future rounds of combat
                    opponentHP = (int) opponentMon.getHP();
                    //if the opponent's team has not been wiped out yet, then print this message
                    if (totalOpponentHP > 0)
                        System.out.println("They sent out " + opponentMon.getName() + "! (Lv: " + opponentMon.getLevel() + ")");

                }
                //if a null exception was caught in the code, simply ignore it
                catch (NullPointerException | ArrayIndexOutOfBoundsException e) {

                }
            }
        }

        //if the opponent's team has been wiped out, then print lines that say so, and set the return variable to true
        if (totalOpponentHP <= 0) {

            System.out.println("\nThe opponent is out of healthy Pokemon.");
            System.out.println("You won the battle!");

            result = true;

        }

        //if the player's team has been wiped out, then print lines that say so, and set the return variable to false
        if (totalPlayerHP <= 0) {

            System.out.println("\nYou are out of healthy Pokemon.");
            System.out.println("You lost the battle...");

            result = false;
        }

        //return the result of the battle
        return result;
    }

    //One of Two overloaded methods that calculate the type match-ups between an attack and a Pokemon
    public static double typeCheck(Move move, Pokemon mon) {

        //create multiplier variable that will be returned to the caller
        double multiplier = 1;
        //create variables that store the String type values in them
        String moveType = move.getType();
        String monType = mon.getType1();
        String monType2 = mon.getType2();

        //if the Move is a Normal Type, compare to Rock, Steel and Ghost type Pokemon
        if (moveType.equals("Normal")) {
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0;
        }

        //if the Move is a Grass Type, compare to Water, Ground, Rock, Grass, Fire, Poison, Flying, Bug, Dragon and Steel type Pokemon
        if (moveType.equals("Grass")) {
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fire Type, compare to Grass, Ice, Bug, Steel, Fire, Water, Rock and Dragon type Pokemon
        if (moveType.equals("Fire")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
        }

        //if the Move is a Water Type, compare to Fire, Ground, Rock, Grass, Water and Dragon type Pokemon
        if (moveType.equals("Water")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
        }

        //if the Move is an Electric Type, compare to Water, Flying, Grass, Electric, Dragon and Ground type Pokemon
        if (moveType.equals("Electric")) {
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;

            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0;
        }

        //if the Move is an Ice Type, compare to Grass, Ground, Flying, Dragon, Fire, Water, Ice and Steel type Pokemon
        if (moveType.equals("Ice")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fighting Type, compare to Normal, Ice, Rock, Dark, Steel, Poison, Flying, Psychic, Bug, Fairy and Ghost type Pokemon
        if (moveType.equals("Fighting")) {
            if (monType.equals("Normal") || monType2.equals("Normal"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;

            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0;
        }

        //if the Move is a Poison Type, compare to Grass, Fairy, Poison, Ground, Rock, Ghost and Steel type Pokemon
        if (moveType.equals("Poison")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 2;

            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0.5;

            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0;
        }

        //if the Move is a Ground Type, compare to Fire, Electric, Poison, Rock, Steel, Grass, Bug and Flying type Pokemon
        if (moveType.equals("Ground")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 2;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;

            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0;
        }

        //if the Move is a Flying Type, compare to Grass, Fighting, Bug, Electric, Rock and Steel type Pokemon
        if (moveType.equals("Flying")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;

            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Psychic Type, compare to Fighting, Poison, Psychic, Steel, Dark type Pokemon
        if (moveType.equals("Psychic")) {
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 2;

            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Bug"))
                multiplier *= 0.5;

            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0;
        }

        //if the Move is a Bug Type, compare to Grass, Psychic, Dark, Fire, Fighting, Poison, Flying, Ghost, Steel and Fairy type Pokemon
        if (moveType.equals("Bug")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;
        }

        //if the Move is a Rock Type, compare to Fire, Ice, Flying, Bug, Fighting, Ground and Steel type Pokemon
        if (moveType.equals("Rock")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;

            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Ghost Type, compare to Psychic, Ghost, Dark and Normal type Pokemon
        if (moveType.equals("Ghost")) {
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 2;

            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0.5;

            if (monType.equals("Normal") || monType2.equals("Normal"))
                multiplier *= 0;
        }

        //if the Move is a Dragon Type, compare to Dragon, Steel and Fairy type Pokemon
        if (moveType.equals("Dragon")) {
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;

            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;

            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0;
        }

        //if the Move is a Dark Type, compare to Psychic, Ghost, Fighting, Dark and Fairy type Pokemon
        if (moveType.equals("Dark")) {
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 2;

            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;
        }

        //if the Move is a Steel Type, compare to Ice, Rock, Fairy, Fire, Water, Electric and Steel type Pokemon
        if (moveType.equals("Steel")) {
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fairy Type, compare to Fighting, Dragon, Dark, Fire, Poison and Steel type Pokemon
        if (moveType.equals("Fairy")) {
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //return the new multiplier value
        return multiplier;
    }

    public static double typeCheck(Pokemon mon, Move move) {

        //create multiplier variable that will be returned to the caller
        double multiplier = 1;
        //create variables that store the String type values in them
        String moveType = move.getType();
        String monType = mon.getType1();
        String monType2 = mon.getType2();

        //if the Move is a Normal Type, compare to Rock, Steel and Ghost type Pokemon
        if (moveType.equals("Normal")) {
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0;
        }

        //if the Move is a Grass Type, compare to Water, Ground, Rock, Grass, Fire, Poison, Flying, Bug, Dragon and Steel type Pokemon
        if (moveType.equals("Grass")) {
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fire Type, compare to Grass, Ice, Bug, Steel, Fire, Water, Rock and Dragon type Pokemon
        if (moveType.equals("Fire")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
        }

        //if the Move is a Water Type, compare to Fire, Ground, Rock, Grass, Water and Dragon type Pokemon
        if (moveType.equals("Water")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;
        }

        //if the Move is an Electric Type, compare to Water, Flying, Grass, Electric, Dragon and Ground type Pokemon
        if (moveType.equals("Electric")) {
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 0.5;

            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0;
        }

        //if the Move is an Ice Type, compare to Grass, Ground, Flying, Dragon, Fire, Water, Ice and Steel type Pokemon
        if (moveType.equals("Ice")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fighting Type, compare to Normal, Ice, Rock, Dark, Steel, Poison, Flying, Psychic, Bug, Fairy and Ghost type Pokemon
        if (moveType.equals("Fighting")) {
            if (monType.equals("Normal") || monType2.equals("Normal"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;

            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0;
        }

        //if the Move is a Poison Type, compare to Grass, Fairy, Poison, Ground, Rock, Ghost and Steel type Pokemon
        if (moveType.equals("Poison")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 2;

            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0.5;

            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0;
        }

        //if the Move is a Ground Type, compare to Fire, Electric, Poison, Rock, Steel, Grass, Bug and Flying type Pokemon
        if (moveType.equals("Ground")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 2;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 2;

            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 0.5;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 0.5;

            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0;
        }

        //if the Move is a Flying Type, compare to Grass, Fighting, Bug, Electric, Rock and Steel type Pokemon
        if (moveType.equals("Flying")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;

            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Psychic Type, compare to Fighting, Poison, Psychic, Steel, Dark type Pokemon
        if (moveType.equals("Psychic")) {
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 2;

            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Bug"))
                multiplier *= 0.5;

            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0;
        }

        //if the Move is a Bug Type, compare to Grass, Psychic, Dark, Fire, Fighting, Poison, Flying, Ghost, Steel and Fairy type Pokemon
        if (moveType.equals("Bug")) {
            if (monType.equals("Grass") || monType2.equals("Grass"))
                multiplier *= 2;
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 0.5;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;
        }

        //if the Move is a Rock Type, compare to Fire, Ice, Flying, Bug, Fighting, Ground and Steel type Pokemon
        if (moveType.equals("Rock")) {
            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 2;
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Flying") || monType2.equals("Flying"))
                multiplier *= 2;
            if (monType.equals("Bug") || monType2.equals("Bug"))
                multiplier *= 2;

            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Ground") || monType2.equals("Ground"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Ghost Type, compare to Psychic, Ghost, Dark and Normal type Pokemon
        if (moveType.equals("Ghost")) {
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 2;

            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0.5;

            if (monType.equals("Normal") || monType2.equals("Normal"))
                multiplier *= 0;
        }

        //if the Move is a Dragon Type, compare to Dragon, Steel and Fairy type Pokemon
        if (moveType.equals("Dragon")) {
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;

            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;

            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0;
        }

        //if the Move is a Dark Type, compare to Psychic, Ghost, Fighting, Dark and Fairy type Pokémon
        if (moveType.equals("Dark")) {
            if (monType.equals("Psychic") || monType2.equals("Psychic"))
                multiplier *= 2;
            if (monType.equals("Ghost") || monType2.equals("Ghost"))
                multiplier *= 2;

            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 0.5;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 0.5;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 0.5;
        }

        //if the Move is a Steel Type, compare to Ice, Rock, Fairy, Fire, Water, Electric and Steel type Pokemon
        if (moveType.equals("Steel")) {
            if (monType.equals("Ice") || monType2.equals("Ice"))
                multiplier *= 2;
            if (monType.equals("Rock") || monType2.equals("Rock"))
                multiplier *= 2;
            if (monType.equals("Fairy") || monType2.equals("Fairy"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Water") || monType2.equals("Water"))
                multiplier *= 0.5;
            if (monType.equals("Electric") || monType2.equals("Electric"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //if the Move is a Fairy Type, compare to Fighting, Dragon, Dark, Fire, Poison and Steel type Pokemon
        if (moveType.equals("Fairy")) {
            if (monType.equals("Fighting") || monType2.equals("Fighting"))
                multiplier *= 2;
            if (monType.equals("Dragon") || monType2.equals("Dragon"))
                multiplier *= 2;
            if (monType.equals("Dark") || monType2.equals("Dark"))
                multiplier *= 2;

            if (monType.equals("Fire") || monType2.equals("Fire"))
                multiplier *= 0.5;
            if (monType.equals("Poison") || monType2.equals("Poison"))
                multiplier *= 0.5;
            if (monType.equals("Steel") || monType2.equals("Steel"))
                multiplier *= 0.5;
        }

        //return the new multiplier value
        return multiplier;
    }
}

