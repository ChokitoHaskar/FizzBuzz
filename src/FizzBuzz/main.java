package FizzBuzz;

public class main {
    public static void main(String[] args) {

        //Chokito F. S. Haskar, 02:04 PM, 1 July 2020

        for (var i = 1; i <= 100; i++) {

            var output = "";

            if (i % 3 == 0) { output += "Fizz"; }
            if (i % 5 == 0) { output +="Buzz";  }

            if (output == "") { output += i; }

            System.out.println(output);

        }

    }
}
