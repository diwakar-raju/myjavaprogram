package data;

import java.util.*;

public class AlphabetPatterns {
	
			//*******A-Z Alphabet Patterns*******//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (k = 0; k < s.length(); k++) {
                switch (s.charAt(k)) {
                
                
                                   //****A****//
                
                
                    case 'A': {
                        for (j = 1; j <= (n + n) - 1; j++) {
                            if ((i + j == n + 1) || ((j > n) && (j - (n - 1) == i))
                                    || ((n + 1) / 2 == i && (j > i) && n + (n) / 2 > j)) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.print(" ");

                        break;
                    }

                    
                    //****B****//
 
 
                    case 'B': {
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n || j == n || ((n + 1) / 2 == i))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");

                        break;
                    }

                    
                    //****C****//
 
 
                    case 'C':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");

                        break;
                    case 'D':

                        
                        //****D****//
     
     
                        for (j = 1; j <= n; j++)

                        {
                            if (i == 1 || j == 1 || i == n || j == n) {
                                System.out.print("*");

                            } else
                                System.out.print(" ");

                        }
                        System.out.print(" ");

                        break;

                        
                        //****E****//
     
     
                    case 'E':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n || (n + 1) / 2 == i)
                                System.out.print("*");
                            else
                                System.out.print(" ");

                        }
                        System.out.print(" ");
                        break;

                        
                        //****F****//
     
     
                    case 'F':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || (n + 1) / 2 == i)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****G****//
     
     
                    case 'G':

                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n || ((n + 1) / 2 == i && i <= j)
                                    || (j == n && (n + 1) / 2 == i) || (j == n && (n + 1) / 2 <= i))

                                System.out.print("*");

                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****H****//
     
     
                    case 'H':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n || (n + 1) / 2 == i)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****I****//
     
     
                    case 'I':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || i == n || (n + 1) / 2 == j)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****J****//
     
     
                    case 'J':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || (n + 1) / 2 == j || (i == n && (i + j <= n + 3))
                                    || ((i == 1 && (n + 1) / 2 <= n + 1)))
                                System.out.print("*");

                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****K****//
     
     
                    case 'K':

                        for (j = 1; j <= n; j++) {
                            if (j == 1 || i + j == n
                                    || (i > j && (i + j) % 2 == 1 && i < n || ((i == n && i + j == n + 4))))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****L****//
     
     
                    case 'L':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || i == n)
                                System.out.print("*");
                            else
                                System.out.print(" ");

                        }
                        System.out.print(" ");
                        break;

                        
                        //****M****//
     
     
                    case 'M':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n || (i == j && i <= (n + 1) / 2) || (i + j == n + 1 && i < j))

                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****N****//
     
     
                    case 'N':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i == j)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****O****//
     
     
                    case 'O':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n || j == n) {
                                System.out.print("*");

                            } else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****P****//
     
     
                    case 'P':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || (n + 1) / 2 == i || (j == n && (n + 1) / 2 >= i))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****Q****//
     
     
                    case 'Q':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || i == n || j == n || (i == j && (n + 1) / 2 <= i))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****R****//
     
     
                    case 'R':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || j == 1 || (n + 1) / 2 == i || (j == n && (n + 1) / 2 >= i)
                                    || ((i == j && (n + 1) / 2 <= i)))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****S****//
     
     
                    case 'S':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || i == n || (n + 1) / 2 == i || (j == 1 && (n + 1) / 2 >= i)
                                    || (j == n && (n + 1) / 2 <= i))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****T****//
     
     
                    case 'T':

                        for (j = 1; j <= n; j++) {
                            if (i == 1 || (n + 1) / 2 == j)
                                System.out.print("*");
                            else
                                System.out.print(" ");

                        }
                        System.out.print(" ");
                        break;

                        
                        //****U****//
     
     
                    case 'U':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n || i == n) {
                                System.out.print("*");

                            } else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****V****//
     
     
                    case 'V':

                        for (j = 1; j <= n + n; j++) {
                            if (i == j || i + j == n + n)

                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }

                        System.out.print(" ");
                        break;

                        
                        //****W****//
     
     
                    case 'W':
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n || (i == j && i >= (n + 1) / 2) || (i + j == n + 1 && i > j))
                                System.out.print("*");
                            else
                                System.out.print(" ");

                        }
                        System.out.print(" ");
                        break;

                        
                        //****X****//
     
     
                    case 'X':
                        for (j = 1; j <= n; j++) {
                            if (i + j == n + 1 || i == j)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****Y****//
     
     
                    case 'Y':
                        for (j = 1; j <= n; j++) {
                            if ((i == j && i <= (n + 1) / 2) || (i + j == n + 1 && i < j) || (n + 1) / 2 == j && i > j)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print(" ");
                        break;

                        
                        //****Z****//
     
     
                    case 'Z':
                        for (j = 1; j <= n; j++) {
                            if (i == 1 || i == n || i + j == n + 1)
                                System.out.print("*");
                            else
                                System.out.print(" ");

                        }
                        System.out.print(" ");
                        break;

                        case ' ':
                        for(j=1;j<=n;j++)
                        {
                            System.out.print(" ");
                            
                        }
                        System.out.print(" ");
                        break;


                        default:
                        {
                            System.out.print("not");
                            break;
                        }


                }
              
            }
            System.out.println();
        }
    }
}
            //*******************************************************************************//