import java.util.*;

public class OkeyGame extends GameService{
  
  static List<Integer> OKEY_STONES = new ArrayList<Integer>();
  
  static List<Integer> mixedStone;
  static int chief;
  static int boss;
  final static String[] peopleNames = new String[]{"Sema", "Ayşe", "Cengiz", "Kemal", "Salih", "Fadime", "Digitoy", "Erkan"};
  static List<String> PEOPLE_POOL = new ArrayList<String>();
  
  static People player1, player2, player3, player4;
  
  public static void main(String[] args){
    
    getOkeyStones();
    getPeopleName();
    startGame();
    logPeople();
  }
  
  public static void startGame(){
    GameService service = new GameService();
    mixedStone = service.mixTheStones(OKEY_STONES);
    chief = service.getChiefStone(mixedStone);
    boss = service.getBossStone(chief);
    
    player1 = new People(generateName(), 5);
    player2 = new People(generateName(), 4);
    player3 = new People(generateName(), 4);
    player4 = new People(generateName(), 4);
    
    service.dealStones(player1, OKEY_STONES);
    service.dealStones(player2, OKEY_STONES);
    service.dealStones(player3, OKEY_STONES);
    service.dealStones(player4, OKEY_STONES);
    
  }
  public static void getOkeyStones(){
    for(int j = 0; j<2;j++){
      for(int i=1;i<53;i++){
        OKEY_STONES.add(i);
      }
    }
  }
  
  public static void getPeopleName(){
    for(int i=0; i<peopleNames.length; i++){
      PEOPLE_POOL.add(peopleNames[i]);
    }
  }
  public static String generateName(){
    int random = new Random().nextInt(PEOPLE_POOL.size());
    String value = PEOPLE_POOL.get(random);
    PEOPLE_POOL.remove(random);
    return value;
  }
  public static void printChances(){
    if(player1.winChance(boss)==100){
      System.out.println(player1 + " can win this game.");
    }
    if(player2.winChance(boss)==100){
      System.out.println(player1 + " can win this game.");
    }
    if(player3.winChance(boss)==100){
      System.out.println(player1 + " can win this game.");
    }
    if(player4.winChance(boss)==100){
      System.out.println(player1 + " can win this game.");
    }
  }
  
  static void logPeople(){
    System.out.println(player1.name + " "+ player1.billiard + " "+ player1.priority);
    System.out.println(player2.name + " "+ player2.billiard + " "+ player2.priority);
    System.out.println(player3.name + " "+ player3.billiard + " "+ player3.priority);
    System.out.println(player4.name + " "+ player4.billiard + " "+ player4.priority);
    printChances();
    
    //System.out.println(OKEY_STONES);
    //System.out.println(OKEY_STONES.size());
  }
  
}


// Avantajlı olanı belirle