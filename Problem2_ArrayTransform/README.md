## Problem 2: Array Transformation Cost Minimization
You are given an integer array A of size N. You can perform the following operation any number of times: Choose any index i and replace A[i] with A[i] + K or A[i] - K, where K is a fixed integer. Your task is to: Find the minimum total number of operations required to make all elements equal, or -1 if it is not possible.

Answer =>

## Logic
The program first checks if all elements can be made equal by verifying if the difference between each element and the first element is divisible by K. It then transforms the array by dividing the differences by K and finds the median of the resulting values. The minimum number of operations is the sum of absolute differences between each transformed value and the median.

## Input :
Array A: [2, 4, 6, 8, 10]
K: 2

## Output : Minimum Operations: 6
