import javax.swing.JOptionPane;
//2.2.5
public class Calculate {
    public static void main (String[] args) {
        String snum1, snum2 ; 
        String Res; 
        snum1 = JOptionPane.showInputDialog(null, "Please input 1st num: ", "Input 1st num", JOptionPane.INFORMATION_MESSAGE);
        snum2 = JOptionPane.showInputDialog(null, "Please input 2nd num: ", "Input 2nd num", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(snum1);
        double num2 = Double.parseDouble(snum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double div = num1/num2;

        

        if (num2 == 0){
            Res = "Sum: " + sum + "\nDifference: " + diff + "\nProduct: " + prod + "\nQuotient: Error, divisor must diff from 0"  ;
            JOptionPane.showMessageDialog(null, Res, "Calculator101", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Res = "Sum: " + sum + "\nDifference: " + diff + "\nProduct: " + prod + "\nQuotient: " + div;
            JOptionPane.showMessageDialog(null, Res, "Calculator101", JOptionPane.INFORMATION_MESSAGE);
        }
        
        

        
    }
}


