import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, House> westeros = new HashMap<>();

        westeros.put("Stark", new House("Stark", "Wolf"));
        westeros.put("Lanistar", new House("Lanistar", "lion"));
        westeros.put("Barateon", new House("Barateon", "Deer"));

        westeros.remove("Lanistar");

        System.out.println(westeros.get("Barateon").getSigil());

        for (Map.Entry<String,  House> x : westeros.entrySet())
            System.out.println("Home name: " + x.getValue().getName() + " sigil: " + x.getValue().getSigil());
    }
}
