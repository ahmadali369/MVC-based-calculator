import controller.CalculatorController;
import edu.cal.view.CalculatorView;
import edu.fast.model.CalculatorModel;

public class NewCalculator {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view, model);

        view.display();
    }
}
