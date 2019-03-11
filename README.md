# Scale_Balancing_Script
Scale_Balancing_Script that will accept two elements, the first being the two positive integer weights on a balance scale (left and right sides) and the second element being a list of available weights as positive integers.
The goal is to determine if you can balance the scale by using the least amount of weights from the list, but using at most 2 weights. You can only use the available weights from the list once.
For example: if the given input is ["[5, 9]", "[1, 2, 6, 7]"] then this means there is a balance scale with a weight of 5 on the left side and 9 on the right side. It is possible to balance this scale by adding a 6 to the left side from the list of weights and adding a 2 to the right side. Both scales will now equal 11 and they are perfectly balanced.
This program should:● Able to accept the inputs  ● Return a comma separated string of the weights that were used from the list in ascending order, so for this example your program should return the string “2,6”  ● Return proper error messaging (For example, that the scale is not able to be balanced)
Example Test Case1: Input:"[3, 4]", "[1, 2, 7, 7]"        Output:"1" 
Example Test Case2: Input:"[13, 4]", "[1, 2, 3, 6, 14]"   Output:"3,6"
Example Test Case3: Input:"[8, 3]", "[8]"                 Output:"No possible solution. Please try again.” 
