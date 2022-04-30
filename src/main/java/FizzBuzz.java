public class FizzBuzz {

    public static String fizzbuzz(int number){
       // if (number == 3) {
        if (number % 3 == 0 && number % 5 ==0){
            return "fizzbuzz";
        }

        else if (number % 3 ==0) {
            return "fizz";
            //fixing the error of return 5

            //}else if (number == 5 )
            //return "buzz";
        }else if (number % 5 == 0 )
            return "buzz";

        return String.valueOf(number);
    }
}
