import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {

//TDD works by writing the test first

//You are being asked to practice TDD to  write a function called
//fizzBuzz()

//That function will take in and int and:

    //Return "Fizz" if number is/3 *tick
    //Return "Buzz" if number is /5 *tick
    //return "FizzBuzz" if number is / by 3 and 5 *tick
    //return input as a String otherwise *tick

    @Test
    public void fizzBuzz__3_returns_fizz() {
        assertThat(FizzBuzz.fizzbuzz(3)).isEqualTo("fizz");
        //fizzbuzz method is red so lets go to class and create a method
    }

    @Test
    public void fizzBuzz__9_returns_fizz() {
        assertThat(FizzBuzz.fizzbuzz(9)).isEqualTo("fizz");
    }

    //first test passes second fails as expected, need to go back and refactor code in main to get passing test

    @Test
    public void fizzBuzz__5_returns_buzz() {
        assertThat(FizzBuzz.fizzbuzz(5)).isEqualTo("buzz");
    }
    @Test
    public void fizzBuzz__10_returns_buzz() {
        assertThat(FizzBuzz.fizzbuzz(10)).isEqualTo("buzz");
    }
    //this fails, so lets go back and write }else if (number % 5 == 0 )
    //            return "buzz";
    @Test
    public void fizzBuzz__15_returns_fizzbuzz() {
        assertThat(FizzBuzz.fizzbuzz(15)).isEqualTo("fizzbuzz");
        //again fails so lets fix it again on the main fizzbuzz.java by doing the 3 && 5
    }

    // just want to make sure the 3 & 5 works for other cases, lets choose 30
    @Test
    public void fizzBuzz__30_returns_buzz() {
        assertThat(FizzBuzz.fizzbuzz(30)).isEqualTo("fizzbuzz");

    }

    //let's do a test for "return input as a String otherwise" if the number & 3 ==0 && number %5 == 0 fails
    // Just to make sure that the final return statement actually works
    @Test
    public void fizzBuzz__4_returns_buzz() {
        assertThat(FizzBuzz.fizzbuzz(4)).isEqualTo("4");

    }

}












