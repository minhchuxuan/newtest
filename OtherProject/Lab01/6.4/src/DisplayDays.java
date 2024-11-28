import java.util.Scanner;


public class DisplayDays {
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; 
                } else {
                    return false; 
                }
            } else {
                return true; 
            }
        } else {
            return false; 
        }
    }

    public static int getDaysInMonth(String monthInput, int year) {
        int month = getMonthNumber(monthInput);
        if (month == -1) {
            return -1; 
        }

        boolean leapYear = isLeapYear(year);

        switch (month) {
            case 1: return 31; 
            case 2: return (leapYear) ? 29 : 28; 
            case 3: return 31; 
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31; 
            case 9: return 30; 
            case 10: return 31;
            case 11: return 30; 
            case 12: return 31; 
            default: return -1; 
        }
    }

    public static int getMonthNumber(String monthInput) {
        monthInput = monthInput.trim().toLowerCase();

        switch (monthInput) {
            case "january": case "jan": case "jan.": case "1": return 1;
            case "february": case "feb": case "feb.": case "2": return 2;
            case "march": case "mar": case "mar.": case "3": return 3;
            case "april": case "apr": case "apr.": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sept": case "sep": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine();

            System.out.print("Enter year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); 
                if (year >= 0) {
                    int days = getDaysInMonth(monthInput, year);
                    if (days != -1) {
                        System.out.println("Number of days: " + days);
                        break;
                    } else {
                        System.out.println("Invalid month. Please try again.");
                    }
                } else {
                    System.out.println("Invalid year. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
