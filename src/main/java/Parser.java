import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Parser {

    private static final String FILEPATH = "src/main/resources/data.json";
    private static final String CONWAY = "Conway";
    private static final String FIBONACCI = "Fibonacci";

    public Root parse() throws IOException, ParseException {
        Root root = new Root();
        JSONParser parser = new JSONParser();

        FileReader reader = new FileReader(FILEPATH);

        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

        JSONArray conwayArray = (JSONArray) rootJsonObject.get(CONWAY);
        root.setConway(conwayArray);
        JSONArray fibonacciArray = (JSONArray) rootJsonObject.get(FIBONACCI);
        root.setFibonacci(fibonacciArray);

        return root;
    }

}
