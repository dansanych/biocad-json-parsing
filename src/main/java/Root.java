import java.util.ArrayList;
import java.util.List;

public class Root {
    private List<Integer> conway = new ArrayList();
    private List<Integer> fibonacci = new ArrayList();

    public List<Integer> getConway() {
        return conway;
    }

    public void setConway(List<Integer> conway) {
        this.conway = conway;
    }

    public List<Integer> getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(List<Integer> fibonacci) {
        this.fibonacci = fibonacci;
    }
}
