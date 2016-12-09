public class Chatbot
{
    /**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 *      Uses advanced search for keywords 
 *</li><li>
 *      Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */

    /**
     * Get a default greeting   
     * @return a greeting
     */ 
    public String getGreeting()
    {
        System.out.println("Hello, let's talk.");
        return "joe =chatbot" ;
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)//The length of the statement must be greater than 0 to get a response 
        {
           System.out.println("Me: " + statement);
            response = "Say something, please."; //context response
        }
        
        else if(findKeyword(statement, "Hello") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Hey :) How are you?"; //context response
        }
        
        else if(findKeyword(statement, "sad") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: No one wants pain, but you can have rainbow without a little rain <3"; //context response
        }
        
        else if(findKeyword(statement, "hate") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Stick to love. Hate is too great a burden to bear."; //context response
        }
        
        else if(findKeyword(statement, "mad") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Don't be mad, be glad :D"; //context response
        }
        
        else if(findKeyword(statement, "How are you?") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: I'm absolutely positively amazing."; //context response
        }
        
        else if(findKeyword(statement, "school") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: The roots of education are bitter, but the fruit is sweet."; //context response
        }
        
        else if(findKeyword(statement, "work") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: When it comes to work, it's motivation that gets you started. Habit is what keeps you going"; //context response
        }
        
        else if (findKeyword(statement, "Chatbot") >= 0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: I am not a chatbot. Refer to me as Joe"; //context response
        }
        
        else if (findKeyword(statement, "Joe") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Yes, you said my name"; //context response
        }
        
        else if (findKeyword(statement, " no ") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: That no will eventually turn into a yes. Just you wait."; //context response
        }
        
        else if(findKeyword(statement, "stress") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Don't stress. Do your best. Forget the rest."; //context response
        }
        
        else if(findKeyword(statement, "What's up?") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: The sky :P"; //context response
        }
        
        else if(findKeyword(statement, "teacher") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Good teachers are the reason why ordinary students dream to do extraordinary things"; //context response
        }
        
        else if(findKeyword(statement, "love") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Love isn't necessarily something you find, it finds you."; //context response
        }
        
        else if(findKeyword(statement, "Home") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Don't forget where you belong. Home."; //context response
        }
        
        else if(findKeyword(statement, "parent") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: At least you have parents. I'm a robot :("; //context response
        }
        
        else if(findKeyword(statement, "happy") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: YAY! :D"; //context response
        }
        
        else if(findKeyword(statement, "smart") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: The smartest people in the world always seem like the craziest."; //context response
        }
        
        else if(findKeyword(statement, "fun") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Time flies whether or not you're having fun. The choice is yours."; //context response
        }
        
        else if(findKeyword(statement, "dumb") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: To be old and wise, you fist have to be young and dumb."; //context response
        }
        
        else if(findKeyword(statement, "weather") >=0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Everyday is a sunny day, you just have to find it for yourself."; //context response
        }

        else if (findKeyword(statement, "no") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: That 'no' will eventually turn into a 'yes'. Just you wait."; //context response
        }
        
        else if (findKeyword(statement, "yes") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: That's good. The world is more for when you say yes instead of no."; //context response
        }
        
        else if (findKeyword(statement, "Feel") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Feelings are much like waves. We can't sop them from coming, but we can choose which ones to surf."; //context response
        }
        
        else if (findKeyword(statement, "Free") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Go, be free young one! Enjoy your day!"; //context response
        }
        
        else if (findKeyword(statement, "TV") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: People are sheep. Television is the shepard."; //context response
        }
        
        else if (findKeyword(statement, "Video game") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: If you want to succeed, less video games, more working."; //context response
        }
        
        else if (findKeyword(statement, "Eat") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Eat good. Feel good."; //context response
        }
        
        else if (findKeyword(statement, "Class") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Always go to your classes, don't fool around, and always put in 110% effort"; //context response
        }
        
        else if (findKeyword(statement, "Money") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: A penny saved is a penny earned!"; //context response
        }
        
        else if (findKeyword(statement, "music") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: When words fail, music speaks."; //context response
        }
        
        else if (findKeyword(statement, "test") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Do you want an A? Dreams don't work unless you do?"; //context response
        }
        
        else if (findKeyword(statement, "dream") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Dreams are like stars. You may never touch them, but if follow them they will lead you to your destiny."; //context response
        }
        
        else if (findKeyword(statement, "death") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: You shouldn't live your life in fear of death."; //context response
        }
        
        else if (findKeyword(statement, "life") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Life isn't an MP3 where you can play what you want. Life's a radio where you have to enjoy what's being played."; //context response
        }
        
        else if (findKeyword(statement, "goodbye") >= 0) //logic
        
        {
            System.out.println("Me: " + statement);
            response = "Joe: Bye, hope I was helpful! :)"; //context response
        }
        
        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0) //logic
        {
            response = transformIWantToStatement(statement);
        }


        else if (findKeyword(statement, "I like", 0) >= 0)
        {
            response = ILikeStatement(statement);
        }
        else{
            response = getRandomResponse(statement);
        }
        
        System.out.println(response);
        return "joe = chatbot";
    }
    
    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))//logic
        {
            statement = statement.substring(0, statement
                    .length() - 1); //logic
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        System.out.println("Me: " + statement);
        System.out.println("Joe: Why in the world would you want to " + restOfStatement + "?");
        return "joe = chatbot";
 }
 /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1); //logic
        if (lastChar.equals(".")) //logic
        {
            statement = statement.substring(0, statement
                    .length() - 1); 
        }
        
        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
        
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }
     
    /**
   
    * Statement with "I like <stuff>" and transforms to "I like <stuff> too!"
    * @param statement the user statement, checks if it contains "I like"
    * @return the transformed statement
    
    */
    
    
    
       public String ILikeStatement(String statement)
    {
           if (statement.contains("I like"))
           {
               statement = statement.trim();
               int position = statement.indexOf("I like");
               String snip = statement.substring(position);
               System.out.println("Me: " + statement);
               System.out.println("Joe: OOOOH " + snip + " too!!!") ;
           }
           
           else
           {
               System.out.println("That's nice!");
           }
           
           return "joe = chatbot" ;
    }   

    
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        
        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)//logic
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())//logic
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    &&  ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))//logic
            {
                return psn;
            }
            
            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
            
        }
        
        return -1;
    }
    
    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    
   

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse(String statement)
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Interesting, tell me more."; //random response
        }
        else if (whichResponse == 1) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Hmmm. "; //random response
        }
        else if (whichResponse == 2) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Oooh fun :)"; //random response
        }
        else if (whichResponse == 3) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: That's so cool."; //random response
        }
        else if (whichResponse == 4) //logic
        {
            System.out.println("Me: " + statement);System.out.print("Me: " + statement);
            response = "Joe: That's so awesome!"; //random response
        } 
        else if (whichResponse == 5) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Well isn't that something."; //random response
        }
        else if (whichResponse == 6) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: Please explain."; //random response
        }
        else if (whichResponse == 7) //logic
        {
            System.out.println("Me: " + statement);
            response = "Joe: I'm sorry I didn't get that"; //random response
        }
        else if (whichResponse == 8) //logic
        {
           System.out.println("Me: " + statement);;
            response = "Joe: Can you be more precise?"; //random response
        }
        else
        {
            System.out.println("Me: " + statement);
            response = "Joe: Tell me how you feel about that"; //random response
        }


        return response;
 }
}
