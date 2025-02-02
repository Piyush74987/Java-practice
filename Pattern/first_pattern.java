package Pattern;

public class first_pattern {
        public static void pattern_1(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");

            }
    //        * * * * *
    //        * * * * *
    //        * * * * *
    //        * * * * *
    //        * * * * *
        }
        public static void pattern_2(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
    //            *
    //            * *
    //            * * *
    //            * * * *
    //            * * * * *
        }

        public static void pattern_3(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println(" ");
            }
    //        1
    //        1 2
    //        1 2 3
    //        1 2 3 4
    //        1 2 3 4 5
        }

        public static void pattern_4(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println(" ");
            }
    //        1
    //        2 2
    //        3 3 3
    //        4 4 4 4
    //        5 5 5 5 5
        }

        public static void pattern_5(int n){
            for(int i=n;i>=0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
           }
    //        * * * * *
    //        * * * *
    //        * * *
    //        * *
    //        *

        }
        public static void pattern_6(int n) {
            for (int i = n; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    //        1 2 3 4 5
    //        1 2 3 4
    //        1 2 3
    //        1 2
    //        1
        }

        public static void pattern_7(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i*2-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
    //        *
    //       ***
    //      *****
    //     *******
    //    *********
        }

        public static void pattern_8(int n){
            for(int i=n;i>=0;i--) {
                for (int j = 1;j<=n-i+1; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    //         *********
    //          *******
    //           *****
    //            ***
    //             *

        }

        public static void pattern_9(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i*2-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n-1;i>=0;i--) {
                for (int j = 1;j<=n-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    //                                     *
    //                                    ***
    //                                   *****
    //                                  *******
    //                                 *********
    //                                  *******
    //                                   *****
    //                                    ***
    //                                     *




        public static void pattern_10(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int k=n-1;k>=0;k--){
                for(int j=0;j<=k;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    //
    //        *
    //        **
    //        ***
    //        ****
    //        *****
    //        *****
    //        ****
    //        ***
    //        **
    //        *

        }


        public static void pattern_11(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
    //        1
    //        01
    //        101
    //        0101
    //        10101

        }


        public static void pattern_13(int n){
            int a=1;
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(a+++" ");
                }
                System.out.println();
            }

    //        1
    //        2 3
    //        4 5 6
    //        7 8 9 10
    //        11 12 13 14 15

        }

        public static void pattern_14(int n) {
            for (int i = 0; i <= n; i++) {
                for (char ch = 'A';ch<='A'+i; ch++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
    //        A
    //        A B
    //        A B C
    //        A B C D
    //        A B C D E
    //        A B C D E F
       }

       public static void pattern_15(int n){
            char ch='A';
           for (int i = 1; i <= n; i++) {
               for(int j=0;j<i;j++){
                   System.out.print(ch);
                   ch+=1;
               }
               System.out.println();
           }
    //                   A
    //                   BC
    //                   DEF
    //                   GHIJ
    //                   KLMNO
       }

       public static void pattern_16(int n){
           for (int i = n; i >= 0; i--) {
               char ch='A';
               for (int j=1 ;j<=i; j++) {
                   System.out.print( ch+ " ");
                   ch+=1;
               }
               System.out.println();
           }
//           A B C D E
//           A B C D
//           A B C
//           A B
//           A

       }

       public static void pattern_17(int n){
           char ch='A'-1;
           for (int i = n; i >= 0; i--) {
               ch+=1;
               for (int j=1 ;j<=i; j++) {
                   System.out.print( ch+ " ");

               }
               System.out.println();
           }
//           A A A A A
//           B B B B
//           C C C
//           D D
//           E
       }

       public static void pattern_18(int n) {
           char ch = 'A'-1;
           for (int i = 1; i <= n; i++) {
               ch += 1;
               for (int j = 0; j < i; j++) {
                   System.out.print(ch);

               }
               System.out.println();
           }
//                   A
//                   BB
//                   CCC
//                   DDDD
//                   EEEEE
       }



        public static void main(String[] args) {
            pattern_18(5);

        }

}



