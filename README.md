#Hackathon1_2620030359

Question 1: Household Water-Usage & Billing Monitor

1a) Data Types:

Write a Java program to store and display the following details of a household:

Number of family members – integer
Water consumed in litres – decimal value
House number – integer
Water usage status – character
Use appropriate Java data types for each value and display all the details.

SAMPLE OUTPUT

Enter number of family members: 4

Enter water consumed in litres: 450.5

Enter house number: 102

Enter water usage status: A

Household Details
Family Members: 4

Water Consumed: 450.5 litres

House Number: 102

Usage Status: A

1b) If-Else Condition:

Write a Java program to calculate the water bill based on water consumption. Read the water consumption in litres.

If consumption is 500 litres or less, the bill is Rs.100.
If consumption is more than 500 litres, the bill is Rs.200.
Use an if-else statement and display the water bill.

SAMPLE OUTPUT

Output 1: When water consumption is less than or equal to 500 litres

Enter water consumption in litres: 400

Water Bill: Rs.100

Output 2: When water consumption is more than 500 litres

Enter water consumption in litres: 700

Water Bill: Rs.200

1c) Methods:

Write a Java program to calculate the total water consumption of a household using a method.

Create the following method:

calculateTotal(int morningUsage, int eveningUsage)
The method should return the total water consumption. Read the morning and evening water usage from the user, call the method, and display the total consumption.

SAMPLE OUTPUT 

Enter morning water usage: 300

Enter evening water usage: 200

Total water consumption: 500 litres


HACKATHON 2

Write a Java program to implement a Bank Account Management System.

Create a class named BankAccount with the following data members: accountNumber, accountHolderName and balance.

Create a parameterized constructor to initialize all the account details.

Implement the following methods:

deposit(double amount) - Adds the given amount to the balance.
withdraw(double amount) - Withdraws money only if sufficient balance is available.
checkBalance() - Returns the current balance.
displayAccount() - Displays account details and balance.
In the main() method, read the account details and initial balance. Create an object using the parameterized constructor. Perform one deposit and one withdrawal operation and display the final account details.

Use separate methods for each operation. Do not perform all the calculations directly inside the main() method.

SAMPLE OUTPUT 

Enter Account Number: 101

Enter Account Holder Name: Namratha

Enter Initial Balance: 5000

Enter Amount to deposit: 20000

Amount deposited: 20000.0

Enter Amount to withdraw: 10000

Amount withdrawn: 10000.0


 Account Details

Account Number: 101

Account Holder Name: Namratha

Balnce: 15000.0
