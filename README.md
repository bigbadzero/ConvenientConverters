# ConvenientConverters
This application was developed for mobile in android studio with java
The program is a conversion tool that will give the user conversions for: 

1.) Miles per hour to kilos per hour

2.) A tip calculator that will calculate a tip based on the total of the ticket, percentage tip that should be left such as 15%, and number of people that will split the ticket

3.) Temperature in Farenheight to temperature in Celsius

The program is designed within four classes

1.)MainActivity.java

  The main activity is where the application is instantiated. 
  
  It creates the activity, toolbar, actionbar and the onCreateOptionsMenu that all apps have.
  
  It sets the id of the three diffrent subactivities for MilesToKilos, TipCalculator, and FarenheitToCelsius. 
  
  These subactivities are represented as buttons and clicking on one of them will activate the activity and initiate the appropriate class.
  
2.)MilesToKilos.java

  The MilesToKilos Class is activated if the button that says MilesToKilos button is pressed on the main activity page.
  
  The MilesToKilos converter is useful if a person wants to do a simple conversion from miles to kilos or kilos to miles
  
  This class activates a new activity layout that has two boxes with the text Miles to Kilo or Kilo to miles.
  
  There are also two buttons, one that is called clear and one that is called conversion.
  
  If the user enters a value in either box, and hits the conversion button the converDistance method would activate and will convert that value from miles to kilos or kilos miles. 
  
  You have the option to convert both values or only one. 
  
  The clear button will clear all values. 

3.)TipCalculator.java
  The TipCalculator Class is activated if the button that says TipCalculator button is pressed on the main activity page.
  
  The TipCalculator is useful if a peron or group of people is trying to figure out the appropriate tip at dinner
  
  It allows a person to enter the total of the ticket, a percent of tip that the group wants to leave such as 15% or whatever they want to enter, the amount of people that will be slitting the check, and a message to display what the tip should be for each person.
 
  
  It has four views called totalText, percentText, peopleText, and message that control these fields
  
  The app requires that a total amount is entered and a percentage but an amount of people is not required and will default to 1 person
  
  The button layout is just like the MilesToKilos and has a conversion button and a clear button. The Conversion button triggers the calculateTip method and displays the tip in the message view
  
  The clear button will clear all fields

4.)FarenheitToCelsiusConverter.java
  
  The FarenheitToCelsiusConverter Class is activated if the button that says FarenheitToCelsiusConverter button is pressed on the main activity page.
  
  The FarenheitToCelsiusConverter is useful if a person wants to convert a temperature from farenheit to celsius or celsius to farenheit.
  
  This class activates a new activity layout that has two boxes with the text farenheit to celsius or celsius to farenheit.
  
  There are also two buttons, one that is called clear and one that is called conversion.
  
  If the user enters a value in either box, and hits the conversion button the converDegrees method will activate and will convert that value from farenheit to celsius or celsius to farenheit.
  
  You have the option to convert both values or only one. 
  
  The clear button will clear all values. 
