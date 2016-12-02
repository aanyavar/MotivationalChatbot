------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Motivational Chatbot
PURPOSE OF PROJECT: To provide users with motivational and inspirational quotes/sayings based on context. 
VERSION or DATE: 16 November 2016
HOW TO START THIS PROJECT: We started this project by looking back at our Magpie Assignment and working off of it to make a different chatbot
AUTHORS: Aanya Varanasi and Aryan Jadhav
USER INSTRUCTIONS: Run the program and type as you please. Whatever you say will initiate a response by the chatbot. The chatbot will need you to type in words, instead of leaving it blank, in order for it to give back an appropriate response. 
PROGRAM HIGHLIGHTS: Our program has many methods but only four public ones. There is a getResponse(String statement) and a getGreeting() that will return context responses and greetings. There is a transformIWantToStatement(String statement) that transforms as particular statement from the user and returns a question. Our unique method is called ILike(String statement) where the user says "I like..." and the chatbot returns a statement stating that they like the same thing. Our other methods our private that find keywords in statements, transform a you me statement into a question. We used the basic logic for our context responses where multiple conditionals check for certain keywords in a statement and that the statement's length is greater than 0 and responded accordingly. We used basic conditionals for our random responses as well. For our unique method we used indexes, substrings and the .contains() method to return back statements. Each method has a docstring and most of the code is commented out. This chatbot should return motivational and inspirational quotes/sayings to you based on the context you provide. If it doesn't recognize what you are saying it will send back a random response. For the best results type in your feelings and the reasons you are feeling the way you are, this will ensure that the chatbot give you back apporpriate responses. 
