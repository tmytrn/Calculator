# csc413-p1
Name: Tommy Tran
Link to repository: https://github.com/CSC-413-SFSU-02/csc413_02_p1-tmytrn

Summary: 
The program in this repository is a simple calculator with a basic calculator GUI. To run this program, clone the repo and open it in NetBeans. After successfully opening the project in NetBeans, simply press the play button in the top toolbar. The calculator is fully functional, which means it will solve balanced, integer expressions that have a valid result. The calculator will not solve divide by zero expressions or expressions involving negative numbers. It will also only return integer answers, meaning that solutions are rounded down to the nearest integer. 

Assumptions: 
The skeleton code provided is broken and needs to be fixed. However the program as given will not run, most of the code there is valuable and it is highly recommended that it is reworked and not overwritten completely. 

Implementation:
The data structures used to implement this calculator were two stacks and a hashmap. The hashmap was used to hold the operators and to help perform the calculator’s calculations. The two stacks were used to organize and ensure the balance of the expressions(as seen in the figure below). Using the operator priority chart below, a hierarchy of operator importance was created to help adhere to the PEMDAS mathematical order. The main logic of the program lies in the eval() function. This function utilizes a while loop that compares the priorities of incoming operators, and performs operations accordingly. 
The GUI was mostly done from the start, and just required some code to implement the button functionality.

Results and Conclusions:
The result is a fully functional calculator that can perform simple integer-based expressions. The main lesson learned from this project was in using polymorphism to create simpler and more readable code. This project could be done in less classes/files, but it would have been a lot less readable and maintainable over time. The challenge in doing this project was in understanding the code given to us at the start, and understanding how the hashmap was supposed to aid in our work. These challenges were overcome through taking the time to read the code before typing, and talking to classmates about how the hashmap should be implemented.
