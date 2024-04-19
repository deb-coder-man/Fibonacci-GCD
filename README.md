# Understanding the Program:
**Overview** <br>
    This program takes two numbers from the user, and then computes the sum of fibonacci numbers up to those two numbers, then computes the greater common divisor (gcd) of the two sums created. Lines by line explation is below.

*Lines 6 - 17:* <br>
    These lines are used to obtain two values. Each value will be used to compute the sum of the fibonacci numbers up to those two numbers.

*Lines 20 - 21:* <br>
    These lines are used to find the sum of the fibonacci numbers up to the two values from above. This is done by passing in the obtained indexes and adding two to them to a function that finds the nth fibonaci number (explained below). The results from the fibonacci function is then subtracted by 1, and this gives us the sum of the fibonacci numbers up to the numbers obtained above. 

*Lines 24 - 28* <br>
    These lines are used to make sure the fist parameter of the gcd function (explained below), is the larger out of the two sums that were calculated.

*Line 31* <br>
    This line is used to call the gcd function and output the answer with an output message.

*Lines 36 - 43, nthFib Function* <br>
    This function takes the index as an input and find the fibonacci number at the index. First variable to store phi (golden ratio), and psi (reciporal of golden ratio), were created. Then the Binet's equation was used to find the nth fibonacci number: phi^n - psi^n / sqrt(5). This finds the nth fibonacci number. 

*Lines 46 - 58, gcd Function* <br>
    This function is used to find the gcd between two numbers. First the base case is if the remainder (num2), is 0 then the previous num2 (num1) is outputed as the gcd. If remainder (num2) doesn't equal zero then we output messages to track progess of the algorith, finally we use recursion and call the gcd function again, but this time the gcd function is called with num2 being the new num1, and num1 % num2 (gives the remainder when dividing num2 by num1) as the new num2. 

# Using the Program:
Enter first nth number to find fibonacci sum for: 8 

<b> Enter second nth number to find fibonacci sum for: 6

<b>
A: 33<b>
B:12 <b>
Remainder: 9 <b>
<b>
A: 12<b>
B:9 <b>
Remainder: 3 <b>
<b>
A: 9<b>
B:3 <b>
Remainder: 0<b>
<b>
<b> Greatest common divisor between 33 and 12 is: 3 

# Important Notes:
In the nthFib function the values phi and psi were stored as doubles but the final output to the function is a long, this is because when using Binet's formula, the output is always an integer, meaning we can convert the doubles to long without losing information. <br>
<br> In Java the long variable can store up to 64 bits, meaning the max number the long variables can store is, 9,223,372,036,854,775,807 (9.2 quintillion). More on contrasint below. <br>
<br>The Binet's formals assumes zero-indexing, meaning the first fibonacci number is F(0) = 0, but when users are inputting a number they are not assuming zero-indexing, this means when a users inputs 4, they want to the find the sum of the first 4 fibonacci numbers, but with zero-indexing, the index must be 3, hence on lines 13 and 17, the values obtained by the user are decremented by 1.

# Contrainst:
The max value that can be inputted is: 91. Any value above 91 will round to the max number a long can store; 9,223,372,036,854,775,807 (9.2 quintillion). The program will still run but it can not compute the sum of the first >91 fibonacci numbers. <br>
<br> Values inputted must be positive integers. 

# How to complie code:
1. Go to the folder location where all the files for this program is save. <br>
2. Open the terminal at this folder: <br>
Different ways to do this but easiest way is to copy the folder path, then open up cmd/terminal (window/mac), finally type in the commad cd followed by a space and then the folder path. <br>
3. Once you have opened a terminal at the folder, type in the command <b>*javac fibGcd.java*<b>, this will compile the code.<br>
4. Finally you can run the code by typing in the command <b>*java fibGcd*<b>. <br>
<br>
<b>Alternatively, you can open this folder in any IDE and simply run the code.<b>



