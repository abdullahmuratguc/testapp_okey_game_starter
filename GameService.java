import java.util.*;
import java.lang.*;

public class GameService{
  
  //Karıştır
  public static List<Integer> mixTheStones(List<Integer> stones){
    Collections.shuffle(stones);
    return stones;
  }
  
  //Rastgele Gösterge Seç
  public static int getChiefStone(List<Integer> stones){
    Random chiefRandom = new Random();
    int chiefIndex = chiefRandom.nextInt(51);
    
    return stones.get(chiefIndex);
  }
  //Okey Taşını dön
  public static int getBossStone(int chief){
    if(chief==13){
      return 1;
    }
    if(chief==26){
      return 14;
    }
    if(chief==39){
      return 27;
    }
    if(chief==52){
      return 40;
    }
    return chief+1;
  }
  public static List<Integer> dealStones(People person, List<Integer> stones){
    if(person.priority == 4){
      for(int i = 0; i<14; i++){
        Random q = new Random();
        int index = q.nextInt(stones.size());
        person.billiard.add(stones.get(index));
        stones.remove(index);
      }
      return stones;
    }
    if(person.priority == 5){
      for(int i = 0; i<15; i++){
        Random q = new Random();
        int index = q.nextInt(stones.size());
        person.billiard.add(stones.get(index));
        stones.remove(index);
      }
      return stones;
    }
    return stones;
  }

}