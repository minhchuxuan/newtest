import javax.swing.JOptionPane;
//2.2.6 1
public class FirstDegOneVar {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Solve the equation ax + b = 0", "Equation Solver", JOptionPane.INFORMATION_MESSAGE);

        String aStr = JOptionPane.showInputDialog(null, "Input a: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(aStr);  

        String bStr = JOptionPane.showInputDialog(null, "Input b: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(bStr);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid Equation!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Solution is: " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
