/*
___ set - such as HashSet or TreeSet
generic set of vaules
simular to lists - but no duplicates (maybe good for like user names)

   hashsets position of each item is random
      treesets are sorted - it implements comparable
      
dynamic sets - grow or shrink over time
[
insert or delete elemenets
test of a membership (does there exist)
]set supports them are called dictionary


LinkedHashMaps can be retrieved in the order the elements entered
*/
import java.util.*;

public class Sets{
   public static void main(String args[]){
      
      HashSet<String> stringSet = new HashSet<String>();
      
      stringSet.add("Gorilla");
      stringSet.add("Curious George");
      stringSet.add("Oranganattung");
      stringSet.add("Curious George");
      stringSet.add("Banana");
      System.out.println(stringSet);
      System.out.println();
      //stringSet.remove("Banana");
      
      System.out.println(stringSet.size());
      System.out.println(stringSet.contains("Banana"));
      System.out.println(stringSet.isEmpty());
      System.out.println(stringSet);
      
      System.out.println();
      //to array
      Object[] h = stringSet.toArray();
      System.out.println(h[0]);// see it's random compared to how we put them in
      
      System.out.println();
      //iterating
      Iterator<String> it = stringSet.iterator();
      while(it.hasNext()){
         System.out.println(it.next());
      }
      
      stringSet.clear();//removes all elements
      
      System.out.println();
      //treeset
      Set<String> treeSet = new TreeSet<String>();
      treeSet.add("Gorilla");
      treeSet.add("Curious George");// only shows up once despite it being here 3x
      treeSet.add("Curious George");
      treeSet.add("Curious George");
      treeSet.add("Oranganattung");
      treeSet.add("Banana");
      
      System.out.println(treeSet);//in aphabetical order
                                  // there is some way to reverse it shown in the generic file i think
      
      
   }
}