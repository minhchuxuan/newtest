import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main (String[] args) {
        String Num1, Num2;
        String Noti = "You've just entered: ";
        Num1 = JOptionPane.showInputDialog(null, "Please input 1st num: ", "Input 1st num", JOptionPane.INFORMATION_MESSAGE);
        Noti += Num1 + " and ";
        Num2 = JOptionPane.showInputDialog(null, "Please input 2nd num: ", "Input 2nd num", JOptionPane.INFORMATION_MESSAGE);
        Noti += Num2;
        
        JOptionPane.showMessageDialog(null, Noti, "Show two num", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
