/*
maps one value to another
no order
maps are good for holding a lot of elements into one place
map has (key, value);
*/
import java.util.*;

public class Mapping{
   public static void main(String[] args){
         
         HashMap<String, Integer> happy = new HashMap<String, Integer>();
         
         happy.put("a", 10);
         happy.put("b",3);
         happy.put("c",88);
         
         System.out.println(happy);
         System.out.println(happy.get("c"));
         
         System.out.println();
         
         HashMap<String, String> fun = new HashMap<String, String>();
         //user pass
         fun.put("mommy23", "ilovemommy9");
         fun.put("sugarsnort", "ineedmore11");
         fun.put("coolswagman", "lotspfswag");
         
         //fun.remove("mommy23"); //remove the key, also removes value
         System.out.println(fun.replace("sugarsnort", "thereisneverenough"));
            //returns old value and replaces it
         
         System.out.println(fun);
         
         System.out.println(fun.containsValue("ilovemommy9"));//checks password
         System.out.println(fun.containsKey("coolswagman"));//checks for username
         
         System.out.println(fun.size());
         System.out.println(fun.keySet());
         System.out.println(fun.values());
         
          ArrayList<Integer> list = new ArrayList<Integer>();
 list.add(0);
 list.add(1);
 list.add(2);
 list.add(1, 4);
 list.set(2, 30);
 System.out.println(list);
         
         
         
   }
}