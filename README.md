# Understanding the Program:
**Overview** <br>
    This program takes two numbers from the user and then computes the sum of Fibonacci numbers up to those two numbers then computes the greater common divisor (gcd) of the two sums created. Lines by line explanation is below.

*Lines 9 - 43:* <br>
    These lines are used to obtain two values. Each value will be used to compute the sum of the Fibonacci numbers up to those two numbers. The lines also include code to make sure the inputs are valid, this means the user can not input non-numeric values and negative values. 

*Lines 46 - 47:* <br>
    These lines are used to find the sum of the Fibonacci numbers up to the two values from above. This is done by passing in the obtained indexes and adding two to them to a function that finds the nth Fibonacci number (explained below). The results from the Fibonacci function are then subtracted by 1, and this gives us the sum of the Fibonacci numbers up to the numbers obtained above. 

*Lines 50 - 54:* <br>
    These lines are used to make sure the first parameter parsed into GCD function (explained below), is the larger out of the two sums that were calculated.

*Line 57:* <br>
    This line is used to call the gcd function and output the answer with an output message.

*Lines 63 - 70, nthFib Function:* <br>
    This function takes the index as an input and finds the Fibonacci number at the index. The first variable to store phi (golden ratio), and psi (reciprocal of golden ratio), were created. Then Binet's equation was used to find the nth Fibonacci number: phi^n - psi^n / sqrt(5). This finds the nth Fibonacci number. 

*Lines 73 - 85, gcd Function:* <br>
    This function is used to find the gcd between two numbers. The base case is if the remainder (num2), is 0 then the previous num2 (num1) is output as the gcd. If the remainder (num2) doesn't equal zero then we output messages to track the progress of the algorithm, finally, we use recursion and call the gcd function again, but this time the gcd function is called with num2 being the new num1, and num1 % num2 (gives the remainder when dividing num2 by num1) as the new num2. 

# Using the Program:
### Example 1:

Enter first nth number to find the Fibonacci sum for: 8 <br>
Enter second nth number to find the Fibonacci sum for: 6

A: 33 <br>
B: 12 <br>
Remainder: 9 <br>

A: 12<br>
B: 9 <br>
Remainder: 3 <br>

A: 9<br>
B: 3 <br>
Remainder: 0<br>

Greatest common divisor between 33 and 12 is: 3 

### Example 2:

Enter first nth number to find Fibonacci sum for: 3 <br>
Enter second nth number to find Fibonacci sum for: 5

A: 7 <br>
B: 2 <br>
Remainder: 1 <br>

A: 2<br>
B: 1 <br>
Remainder: 0 <br>

Greatest common divisor between 7 and 2 is: 1 

# Important Notes:
In the nthFib function, the values phi and psi were stored as doubles but the final output to the function is long, this is because when using Binet's formula, the output is always an integer, meaning we can convert the doubles to long without losing information. <br>
<br> In Java the long variable can store up to 64 bits, meaning the maximum number the long variables can store is, 9,223,372,036,854,775,807 (9.2 quintillion). More information is below in the constraints section. <br>
<br>Binet's formals assume zero-indexing, meaning the first Fibonacci number is F(0) = 0, but when users are inputting a number they are not assuming zero-indexing, this means when a user inputs 4, they want to find the sum of the first 4 Fibonacci numbers, but with zero-indexing, the index must be 3, hence on lines 13 and 17, the values obtained by the user are decremented by 1.

# Constraints:
The max value that can be inputted is 91. Any value above 91 will round to the maximum number a long can store; 9,223,372,036,854,775,807 (9.2 quintillion). The program will still run but it can not compute the sum of the first >91 Fibonacci numbers. <br>
<br> Values inputted must be positive integers. 

# How to compile code:
1. Go to the folder location where all the files for this program is saved. <br>
2. Open the terminal at this folder: <br>
Different ways to do this but the easiest way is to copy the folder path, then open up cmd/terminal (window/mac), and finally type in the command cd followed by a space and then the folder path. <br>
3. Once you have opened a terminal at the folder, type in the command **javac fibGcd.java**, this will compile the code.<br>
4. Finally, you can run the code by typing in the command **java fibGcd**. <br>
<br>
<b>Alternatively, you can open this folder in any IDE and simply run the code.<b>



