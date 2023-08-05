package GraphWithHashTable;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    public static void main(String[] args) {

    }

    public Map<String, String[]> getGraph(){
        Map<String, String[]> map = new HashMap<>();
         map.put("you", new String[]{"alice", "bob", "claire"});
         map.put("bob", new String[]{"anuj", "peggy"});
         map.put("alice", new String[]{"peggy"});
         map.put("claire",new String[]{"tom", "jonny"});
         map.put("anuj", null);
         map.put("peggy", null);
         map.put("tom",null);
         map.put("jonny", null);
         return map;
    }

    public void deepSearch(){

    }
}
