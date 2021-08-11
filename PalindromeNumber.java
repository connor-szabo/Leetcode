class PalindromeNumber{
    public boolean isPalindrome(int x) {
        //If number is a negative, return false because you cant have a negative
        //symbol on both ends of an integer
        if(x < 0){
            return false;
        }
        
        //Convert the integer to a string and split it into individual parts
        String number = Integer.toString(x);
        String array[] = number.split("");
        
        //Go through the new array and check for the palindrome.
        for(int i = 0; i < array.length-1/2; i++){
           
            if(array[i].equals(array[array.length- 1 - i]) == false){
                return false;
            }
        }
        return true;
    }
}