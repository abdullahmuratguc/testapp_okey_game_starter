import java.util.*;
public class People{
  
  String name;
  int priority;
  List<Integer> billiard = new ArrayList<Integer>();
  
  public People(String name, int priority){
    this.name = name;
    this.priority = priority;
  }
  
  public static winChance(boss){
    // get the win chance of the persons
    
    if(billiard.contains(boss)){
      return 100;
    }
    return 0;
  }
}