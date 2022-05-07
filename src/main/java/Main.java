import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Parser parser = new Parser();

        Root root = parser.parse();

        output(root);
    }

    private static void output(Root root) {
        List<Integer> conway = root.getConway();
        List<Integer> fibonacci = root.getFibonacci();

        String head = "|CONWAY          |FIBONACCI      |";
        String upperlines = "-".repeat(head.length());
        System.out.println(upperlines + "\n" + head + "\n" + upperlines);

        List<Integer> maxLengthList = fibonacci.size() > conway.size() ? fibonacci : conway;
        List<Integer> minLengthList = fibonacci.size() < conway.size() ? fibonacci : conway;

        for (int i = 0; i < maxLengthList.size(); i++) {
            if (minLengthList.size() <= i) {
                System.out.printf("| %5s \t | %5d \t |\n", " ", fibonacci.get(i));
            } else {
                System.out.printf("| %5d \t | %5d \t |\n", conway.get(i), fibonacci.get(i));
            }
        }

        System.out.println(upperlines);
    }

}
