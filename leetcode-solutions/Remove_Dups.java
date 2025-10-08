//Ismail Abu-shanab 
// 10/7/2025
 // we are looking into an array 
 // of numbers and we are then 
 // taking out all the numbers that are dups
 // then we are sending back how many should be in 
 // the arrry  
//Start 11:52 pm  Solved at 12:23 
// 32 mins 
 // https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=v2ac6gs5 
class Solution {
    public int removeDuplicates(int[] nums) {
     int count = 1 ;  
     for (int i=1 ; i<nums.length; i++)s
     {
      if(nums[i] != nums[i - 1])
      {
         nums [count] = nums [i]; 
         count ++ ; 
      }
   
     }
    return count ;
    }
}
   
 