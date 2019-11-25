import java.util.Scanner;
import java.security.*;

public class HomeworkHelperMain
{
    public static void main(String[] args)
    {
        int counter = -1;
        int failureCounter = 0;
        int correctCounter = 0;

        int max = 10, min = 0;
        int max2 = 3, min2 = 0;
        int max3 = 99;

        SecureRandom randomNum = new SecureRandom();
        Scanner input = new Scanner (System.in);

        int [] num1 = new int [10];
        int [] num2 = new int [10];
        int [] result = new int[10];

        int operationType;
        int difficultyLevel;

        String [] caPrompt = new String [4];

        caPrompt [0] = "Very Good!\n";
        caPrompt [1] = "Excellent!\n";
        caPrompt [2] = "Nice work!\n";
        caPrompt [3] = "Keep up the good work!\n";

        String [] iaPrompt = new String [4];

        iaPrompt [0] = "No. Please try again\n";
        iaPrompt [1] = "Wrong. Try once more\n";
        iaPrompt [2] = "Don't give up!\n";
        iaPrompt [3] = "No. Keep trying.\n";

        int [] caType = new int [10];
        int [] iaType = new int [10];

        System.out.println("Welcome to the Homework Helper!");
        System.out.println("What level of difficulty of problems would you like to solve today? Please type 1 for 1 digits problems (0-9) or 2 for 2 digit problems (0-99).");
        difficultyLevel = input.nextInt();
        if (difficultyLevel == 1)
        {
            System.out.println("What type of problems would you help with today?");
            System.out.println("Please type 1 for Addition, 2 for subtraction, 3 for multiplication, or 4 for division");

            operationType = input.nextInt();

            switch (operationType)
            {
                case 1:
                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d plus %d?\n", num1[i] = (randomNum.nextInt(max-min+1)+min), num2[i] = (randomNum.nextInt(max-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]+num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 2:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d subtracted by %d?\n", num1[i] = (randomNum.nextInt(max-min+1)+min), num2[i] = (randomNum.nextInt(max-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]-num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 3:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d times %d?\n", num1[i] = (randomNum.nextInt(max-min+1)+min), num2[i] = (randomNum.nextInt(max-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]*num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 4:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d divided by %d?\n", num1[i] = (randomNum.nextInt(max-min+1)+min), num2[i] = (randomNum.nextInt(max-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == ((float)num1[i]/(float)num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");

                    break;
                default: System.out.println("Sorry. That is not a valid answer choice, please try again.");
                    break;
            }
        }

        else
        {
            System.out.println("What type of problems would you help with today?");
            System.out.println("Please type 1 for Addition, 2 for subtraction, 3 for multiplication, or 4 for division");

            operationType = input.nextInt();

            switch (operationType)
            {
                case 1:
                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d plus %d?\n", num1[i] = (randomNum.nextInt(max3-min+1)+min), num2[i] = (randomNum.nextInt(max3-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]+num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 2:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d subtracted by %d?\n", num1[i] = (randomNum.nextInt(max3-min+1)+min), num2[i] = (randomNum.nextInt(max3-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]-num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 3:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d times %d?\n", num1[i] = (randomNum.nextInt(max3-min+1)+min), num2[i] = (randomNum.nextInt(max3-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == (num1[i]*num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");


                    break;
                case 4:

                    for (int i = 0; i <= 10; i++)
                    {
                        if(i == 10)
                        {
                            break;
                        }
                        System.out.printf("How much is %d divided by %d?\n", num1[i] = (randomNum.nextInt(max3-min+1)+min), num2[i] = (randomNum.nextInt(max3-min+1)+min));

                        result[i] = input.nextInt();

                        if ( result[i] == ((float)num1[i]/(float)num2[i]))
                        {
                            int j = 0;
                            System.out.println(caPrompt[caType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            correctCounter++;
                        }
                        else
                        {
                            int j = 0;
                            System.out.println(iaPrompt[iaType[j] = (randomNum.nextInt(max2-min2+1)+min2)]);
                            j++;

                            failureCounter++;
                        }
                    }

                    System.out.printf("You got %.1f%% of the questions correct.\n", ((float)correctCounter/10)*100);

                    if (((float)correctCounter/10)*100 > 75.0)
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    else
                        System.out.println("Sorry, but you need more practice.");

                    break;
                default: System.out.println("Sorry. That is not a valid answer choice, please try again.");
                    break;
            }
        }

    }
}




