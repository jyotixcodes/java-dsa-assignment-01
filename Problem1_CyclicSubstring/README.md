# Problem 1: Cyclic Substring Max Sum

You are given a string S consisting of lowercase English alphabets. Each character has a value equal to its position in the alphabet (i.e., a = 1, b = 2, ..., z = 26). 
You are allowed to perform the following operation: • Choose any cyclic substring of the string (i.e., substring can wrap from end to beginning). 
Your task is to: 
Find the maximum possible sum of character values from any cyclic substring such that no character appears more than once in the chosen substring. 

Answer => 
## Logic
The program doubles the string to handle the cyclic nature and uses a sliding window with a HashSet to find the maximum sum of unique characters.

## Input : abca
## Output : 6



