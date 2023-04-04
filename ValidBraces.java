public class ValidBraces {
 public static boolean validBraces(String braces) {
     boolean status = false;
     //Contains the count of valid braces in each category
     int numBraces= 0;
     int numBrackets =0;
     int numParenthesis = 0;
    
     char brace1 = '{';
     char brace2 = '}';
     char bracket1 = '[';
     char bracket2 = ']';
     char parenthesis1 = '(';
     char parenthesis2 = ')';
     //Adds one to the count of valid braces from their responding categories
     for( int i=0; i < braces.length();i++){
         if(braces.charAt(i)== brace1 || braces.charAt(i)== brace2 ){
         numBraces ++;
         }
         if(braces.charAt(i)== bracket1|| braces.charAt(i)== bracket2){
         numBrackets++;
         }
         if(braces.charAt(i)== parenthesis1 || braces.charAt(i)== parenthesis2){
         numParenthesis++;
         }
     }
     int middleOfString = braces.length()/2-1;
     
     //Checks that all valid braces count is even
     if( numBraces%2==0 && numBrackets %2==0 && numParenthesis %2==0){
         if( braces.charAt(middleOfString) == brace1 &&
           braces.charAt(middleOfString+1) == brace2){
            status = true;
         }else if(braces.charAt(middleOfString) == bracket1 &&
            braces.charAt(middleOfString+1) == bracket2){
            status = true;
         }else if( braces.charAt(middleOfString) == parenthesis1 &&
            braces.charAt(middleOfString+1) == parenthesis2){
            status = true;
         }
     }
     return status;
    }
}
