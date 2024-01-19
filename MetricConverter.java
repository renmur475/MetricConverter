import java.util.Scanner;

public class MetricConverter {

        public static void main(String[] args)
        {
            while(true)
            {
                System.out.println("Welcome to Metric Converter!");
            
                System.out.println("Please choose what you'd like to convert.");
                System.out.println("1. Kilograms -> Pounds");
                System.out.println("2. Centimeters -> Inches");
                System.out.println("3. Celsius -> Degrees");
                System.out.println("4. Meters -> Feet");
                System.out.println("Enter -1 to exit the converter.");

                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("-> ");
                    int choice = scanner.nextInt();

                    System.out.println();

                    if(choice == 1)
                    {
                        System.out.print("Enter kilogram value: ");
                        int kg = scanner.nextInt();
                        System.out.println(kg * 2.2046 + " lbs");
                        System.out.println();
                    }

                    if(choice == 2)
                    {
                        System.out.print("Enter centimeter value: ");
                        int cm = scanner.nextInt();
                        System.out.println(cm / 2.54 + " in");
                        System.out.println();
                    }

                    if(choice == 3)
                    {
                        System.out.print("Enter celsius value: ");
                        int c = scanner.nextInt();
                        System.out.println( (c / 1.8) + 32 + " degrees fahrenheit");
                        System.out.println();
                    }

                    if(choice == 4)
                    {
                        System.out.print("Enter meter value: ");
                        int feet = scanner.nextInt();
                        System.out.println(feet * 3.281 + " ft");
                        System.out.println();
                    }

                    if(choice == -1)
                    {
                        break;
                    }

                    if(choice > 4)
                    {
                        System.out.println("Invalid input.");
                        System.out.println();
                    }
                }
            }

        }

    }
