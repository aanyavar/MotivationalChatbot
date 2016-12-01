
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
        return "Hello, let's talk.";
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
            response = "Say something, please."; //context response
        }
        
        else if(findKeyword(statement, "Hello") >=0)
        {
            response = "Hey :)"; //context response
        }
        
        else if(findKeyword(statement, "sad") >=0)
        {
            response = "No one wants pain, but you can have rainbow without a little rain <3"; //context response
        }
        
        else if(findKeyword(statement, "hate") >=0)
        {
            response = "Stick to love. Hate is too great a burden to bear."; //context response
        }
        
        else if(findKeyword(statement, "mad") >=0)
        {
            response = "Don't be mad, be glad :D"; //context response
        }
        
        else if(findKeyword(statement, "How are you?") >=0)
        {
            response = "I'm absolutely positively amazing."; //context response
        }
        
        else if(findKeyword(statement, "school") >=0)
        {
            response = "The roots of education are bitter, but the fruit is sweet."; //context response
        }
        
        else if(findKeyword(statement, "work") >=0)
        {
            response = "When it comes to work, it's motivation that gets you started. Habit is what keeps you going"; //context response
        }
        
        else if (findKeyword(statement, "Chatbot") >= 0)
        {
            response = "I am not a chatbot. Refer to me as Joe"; //context response
        }
        
        else if (findKeyword(statement, "Joe") >= 0)
        
        {
            response = "Yes, you said my name"; //context response
        }
        
        else if (findKeyword(statement, " no ") >= 0)
        
        {
            response = "That no will eventually turn into a yes. Just you wait."; //context response
        }
        
        else if(findKeyword(statement, "stress") >=0)
        {
            response = "Don't stress. Do your best. Forget the rest."; //context response
        }
        
        else if(findKeyword(statement, "What's up?") >=0)
        {
            response = "The sky :P"; //context response
        }
        
        else if(findKeyword(statement, "teacher") >=0)
        {
            response = "Good teachers are the reason why ordinary students dream to do extraordinary things"; //context response
        }
        
        else if(findKeyword(statement, "love") >=0)
        {
            response = "Love isn't necessarily something you find, it finds you."; //context response
        }
        
        else if(findKeyword(statement, "Home") >=0)
        {
            response = "Don't forget where you belong. Home."; //context response
        }
        
        else if(findKeyword(statement, "parent") >=0)
        {
            response = "At least you have parents. I'm a robot :("; //context response
        }
        
        else if(findKeyword(statement, "happy") >=0)
        {
            response = "YAY! :D"; //context response
        }
        
        else if(findKeyword(statement, "smart") >=0)
        {
            response = "The smartest people in the world always seem like the craziest."; //context response
        }
        
        else if(findKeyword(statement, "fun") >=0)
        {
            response = "Time flies whether or not you're having fun. The choice is yours."; //context response
        }
        
        else if(findKeyword(statement, "dumb") >=0)
        {
            response = "To be old and wise, you fist have to be young and dumb."; //context response
        }
        
        else if(findKeyword(statement, "weather") >=0)
        {
            response = "Everyday is a sunny day, you just have to find it for yourself."; //context response
        }

        else if (findKeyword(statement, "yes") >= 0)
        
        {
            response = "That's good. The world is more for when you say yes instead of no."; //context response
        }
        
        else if (findKeyword(statement, "Feel") >= 0)
        
        {
            response = "Feelings are much like waves. We can't sop them from coming, but we can choose which ones to surf."; //context response
        }
        
        else if (findKeyword(statement, "Free") >= 0)
        
        {
            response = "Go, be free young one! Enjoy your day!"; //context response
        }
        
        else if (findKeyword(statement, "TV") >= 0)
        
        {
            response = "People are sheep. Television is the shepard."; //context response
        }
        
        else if (findKeyword(statement, "Video game") >= 0)
        
        {
            response = "If you want to succeed, less video games, more working."; //context response
        }
        
        else if (findKeyword(statement, "Eat") >= 0)
        
        {
            response = "Eat good. Feel good."; //context response
        }
        
        else if (findKeyword(statement, "Class") >= 0)
        
        {
            response = "Always go to your classes, don't fool around, and always put in 110% effort"; //context response
        }
        
        else if (findKeyword(statement, "Money") >= 0)
        
        {
            response = "A penny saved is a penny earned!"; //context response
        }
        
        else if (findKeyword(statement, "music") >= 0)
        
        {
            response = "When words fail, music speaks."; //context response
        }
        
        else if (findKeyword(statement, "test") >= 0)
        
        {
            response = "Do you want an A? Dreams don't work unless you do?"; //context response
        }
        
        else if (findKeyword(statement, "Dream") >= 0)
        
        {
            response = "Dreams are like stars. You may never touch them, but if follow them they will lead you to your destiny."; //context response
        }
        
        else if (findKeyword(statement, "death") >= 0)
        
        {
            response = "You shouldn't live your life in fear of death."; //context response
        }
        
        else if (findKeyword(statement, "Life") >= 0)
        
        {
            response = "Life isn't an MP3 where you can play what you want. Life's a radio where you have to enjoy what's being played."; //context response
        }
        
        else if (findKeyword(statement, "Technology") >= 0)
        
        {
            response = "Technology is a useful servant, but a dangerous master"; //context response
        }
        
        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }


        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);


            if (psn >= 0
                    && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }
    
    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
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
                .length() - 1);
        if (lastChar.equals("."))
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
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    &&  ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
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
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more."; //random response
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm. "; //random response
        }
        else if (whichResponse == 2)
        {
            response = "Oooh fun :)"; //random response
        }
        else if (whichResponse == 3)
        {
            response = "That's so cool."; //random response
        }
        else if (whichResponse == 4)
        {
            response = "That's so awesome!"; //random response
        } 
        else if (whichResponse == 5)
        {
            response = "Well isn't that something."; //random response
        }
        else if (whichResponse == 6)
        {
            response = "Please explain."; //random response
        }
        else if (whichResponse == 7)
        {
            response = "I'm sorry I didn't get that"; //random response
        }
        else if (whichResponse == 8)
        {
            reponse = "Can you be more precise?"; //random response
        else
        {
            response = "Tell me how you feel about that"; //random response
        }


        return response;
 }
}
