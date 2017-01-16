package com.harishblog.consider.java


object SquareOfNumberScalaCalculator extends App {

      //Create a list. No need of New 
      val list = List(1, 2, 3, 4, 5)
    
      println("Printing original list")
      list.foreach ( println ( _ ) )
    
      //Square every element in the list by calling map method on list
      val squaredList = list.map( x => x * x)
      println("Printing squared list")
      squaredList.foreach ( println _ )
      
      //Assign a function to a variable 
      //Both take input of type Int and return a Int
      val square: Int => Int = (x: Int) =>  x * x
      val cube = (x: Int) => x * x * x
      val newSquare = (x: Double) => x * x
      
      //Function that takes a list and function as parameter
      //The function name is "operation" of type Int input and Int output
      def operateOnList(list: List[Int], operation: (Int) => Int): List[Int] = {
        list.map(operation(_))
      }
     
      //square 
      val squareList = operateOnList(list, square)
      
      //Cube
      val cubeList = operateOnList(list, cube)
      
      //Below code will not work as method signature for newSquare ( (Double) => Double) 
      //doesn't match expected (Int) => Int
      //val squareOfDoubles = operateOnList(list, newSquare)
      
      println("Squared list \n")
      squareList.foreach( println _ )
      println("Cubed list \n")
      cubeList.foreach( println _ )
      
      //filter. Filter operation with function literal
      //val cubeGT15 = cubeList.filter( (x) => x > 15)
      
      //Simplified function literal
      val cubeGT15 = cubeList.filter( _ > 15)
      
      println("Cubes > 15")
      cubeGT15.foreach( println _ )
     
      //Define a class
      case class Person(firstName: String, lastName: String)

      //Instantiate a class
      val obama = Person("Barack", "Obama")
      println("first Name: " + obama.firstName)
      println("last Name: " + obama.lastName)
      
      val trump = Person("Donald", "Trump")
      val bush = Person("George", "W Bush")
      val clinton = Person("Bill", "Clinton")

      //Create a list
      val presidents = List(trump, obama, bush, clinton)
      
      //Find the presidents with first names starting with B. Creates a new immutable list
      val presidentsWithFirstNameB = presidents.filter( _.firstName.startsWith("B"))
      
      //Print first names
      presidentsWithFirstNameB.foreach(x => println(x.firstName))
      
      val companies = List("Twitter", "LinkedIn", "Foursquare", "NetFlix", "AirBnB", "The Guardian", "Apple", "Precog", "Sony", 
          "Coursera", "Workday", "Comcast")
          
      val sortedCompanies = companies.sorted
      println()
      sortedCompanies.foreach( println _)
}


