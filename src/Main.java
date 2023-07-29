public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome----------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("isPalindrome2----------");
        System.out.println(isPalindrome2(-1221));
        System.out.println(isPalindrome2(707));
        System.out.println(isPalindrome2(11212));
        System.out.println("isPerfectNum---------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));



    }
    //1.çözüm
    public static boolean isPalindrome(int num1){
        //MUTLAK DEĞERE ÇEVİRİR
        num1 = Math.abs(num1);

        //STRINGE ÇEVİR
        char[] digits = String.valueOf(num1).toCharArray();
        String reversed = "";

        for(int i= digits.length-1; i>=0;  i--){
            reversed +=digits[i];
        }
        //return  Integer.parseInt(reversed) == num1;
        return reversed.equals(String.valueOf(num1));

    }
     //2.ÇÖZÜM
    public static boolean isPalindrome2(int num1){
        num1 = Math.abs(num1);
        int originalNum = num1;
        int reversedNum = 0;
        while (num1>0){
            int digit = num1 % 10;
            reversedNum = reversedNum*10+ digit;
            num1 = num1 /10;
        }
        return originalNum == reversedNum;
    }


    public static boolean isPerfectNumber(int num){
        if(num <= 0){
            return false;
        }
        int sum = 0;
        for(int i = 1; i<=num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }

    public static String numberToWords(int num){
        if(num <0){
            return "Invalid Value";
        }
       char[] numArray= String.valueOf(num).toCharArray();
        for (char digits:numArray){
            switch (digits){
                case "0": "zero"
            }
        }
    }
}