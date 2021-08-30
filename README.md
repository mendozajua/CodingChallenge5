# CodingChallenge5

Description:
- Write a code to Convert sorted array to balanced binary search tree.

Logical Reasoning:

A watch, which loses time uniformly, was observed to be 5 minutes fast at 8.00 p.m. on Thursday. It was noticed to be 7 minutes slow at 8.00 a.m. on the subsequent Monday. When did the watch show the correct time ? Explanation needed.

a) 7 a.m. Saturday b) 7 a.m. on Friday

c) 10a.m. on Sunday d) 11 a.m. on Friday

 1) time loss is (12 min = 5min + 7 min)
 2) time from Thursday(8pm) and Monday(8am) is 3 days 12 hours or (72 + 12 = 84 hours)
 3) we need to loss the fast (5 min out of the 12 min of lost time)
 	- so we do (5/12 * 84hr = 35 hours after Thursday time should be right)
 4) 35 hours = 1day + 11 hours = corrected
 	- Thurday(8pm) + corrected = Saturday 7:00 am
 5) ANSWER -> A  