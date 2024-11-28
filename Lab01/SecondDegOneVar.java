import javax.swing.JOptionPane;
//2.2.6 3
public class SecondDegOneVar {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Solve the equation ax^2 + bx + c = 0", "Equation Solver", JOptionPane.INFORMATION_MESSAGE);

        String aStr = JOptionPane.showInputDialog(null, "Input a: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(aStr);  

        String bStr = JOptionPane.showInputDialog(null, "Input b: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(bStr);

        String cStr = JOptionPane.showInputDialog(null, "Input b: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(cStr);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid Equation! 'a' cannot be 0.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Two real solutions: x1 = " + x1 + ", x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "One real solution: x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No real solutions! The delta is negative", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
