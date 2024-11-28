import javax.swing.JOptionPane;
//2.2.6 2
public class FirstDegTwoVar {
    public static void main(String[] args) {

    String a1Str = JOptionPane.showInputDialog(null, "Input a1 (coefficient of x in the first equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double a1 = Double.parseDouble(a1Str);

    String b1Str = JOptionPane.showInputDialog(null, "Input b1 (coefficient of y in the first equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double b1 = Double.parseDouble(b1Str);

    String c1Str = JOptionPane.showInputDialog(null, "Input c1 (constant term in the first equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double c1 = Double.parseDouble(c1Str);

    String a2Str = JOptionPane.showInputDialog(null, "Input a2 (coefficient of x in the second equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double a2 = Double.parseDouble(a2Str);

    String b2Str = JOptionPane.showInputDialog(null, "Input b2 (coefficient of y in the second equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double b2 = Double.parseDouble(b2Str);

    String c2Str = JOptionPane.showInputDialog(null, "Input c2 (constant term in the second equation): ", "Input", JOptionPane.INFORMATION_MESSAGE);
    double c2 = Double.parseDouble(c2Str);

    double delta = a1 * b2 - a2 * b1;

    if (delta == 0) {
        if (a1 == 0 && b1 == 0 && c1 == 0 && a2 == 0 && b2 == 0 && c2 == 0) {
            JOptionPane.showMessageDialog(null, "Infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {

            JOptionPane.showMessageDialog(null, "Infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No solution", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {

        double x = (c1 * b2 - c2 * b1) / delta;
        double y = (a1 * c2 - a2 * c1) / delta;
        JOptionPane.showMessageDialog(null, "Solution: x = " + x + ", y = " + y, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}

}
