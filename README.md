[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/y4ISReSl)
# CS230X-lab3-F24
# Arrays of Objects

In this lab, you will work with two collection classes: Zoo that keeps a collection of Animals, and ShapeCollection for managing Shapes.

Goals:
- [ ] Practice creating classes in java
- [ ] Using arrays, and in particular arrays of Objects
- [ ] Searching algorithms


# A Zoo of Animals

1. **Start by studying the new Animal class:**

Download the starter code for this lab. Open the provided Animal class, it will look familiar. Notice a new instance method named equals(). This is an important method for our purposes of maintaining a collection of Animal objects! 
What does it mean for two animal instances to be "equal" according to the way the equals() is defined?

In the case of this implementation of Animal, we will consider two animals to be "equal" if they are the same type and have the same name.

1. **Defining a Zoo:**

In this task you will write a class from scratch, namely the class Zoo.java, to create and maintain a Zoo. 
An instance of the Zoo class has animals, and the user should be able to interact with it. 
For example, the user should be able to create a Zoo, to add animals to it, to remove animals, etc.
 
Create a new class in the BlueJ project called Zoo.

2. **The instance variables and constructor:** 

We will use an array instance variable member as the container that will hold Animal objects in the Zoo. Define a new instance variable:
```
private Animal[] members;
```

In the constructor, initialize this array with a small capacity (let’s say, 3). 

Keep in mind that, in general during execution, the array will not be full, but it will have available spots to hold more animals. 
(When it becomes full, it will be expanded so that it can accommodate more animals. More on this later.) 
Therefore, the length of the array -in general- will not be the same as the number of the animals it currently contains! 
That's why you need another variable -let's call it size- to hold the actual number of animals the array holds at any point.
Add another instance variable, size.
```
private int size;
```
 
The next step is to define a 1-parameter (the array capacity) constructor in the Zoo class. In this method allocate the necessary memory space to hold the array, and initialize the instance variable size.

3. **THE toString() AND main() METHODS:** 

Now we need to prepare our class methods that will help with testing. 
Define Zoo’s method `toString()`. This method should return a string representation of a Zoo instance, including the number of Animal objects it contains, as well as a description of each animal instance in the zoo. For this you should use the `toString()` method in the Animal class that has already been defined!

Next, add the `main()` method to your class to start testing your code. Create an (empty) Zoo instance, and print it. 

4. **Adding animals to our Zoo:**

Define the `addAnimal()` method, to do exactly that: add an animal to this Zoo. Does this method need an input? What type? Should this method return anything?

How should this method behave if there is no more available space in the array to hold the new animal? Let it double the size of the members array and copy the Animals from the old members array into the new. What should be the visibility modifier to use for this `expandCapacity()` method? Public or private?

Now, use this new method to add a few animals to the Zoo. Initially add only 1, then 2, and print the Zoo to make sure they are added correctly. After that add a couple more to make sure the method to expand the member array works correctly.

5. **Other methods**

Define a public method, `getNumOfAnimals()` to return the number of all animals in the zoo.

Define a public method, `getGroceryShoppingList()` to return a string containing a list of all of the food types needed to maintain the zoo.

Define a public method, `getAmountOfFoodPerDay()` to return the total amount of food (regardless of the type of food) that the zoo animals eat each day as a double.

Make sure to test your methods in the `main()`.

6. **Finding animals in the zoo:**

Define a method, `findAnimal()`, which should return the index in the array the animal was found at. This method needs to search for animals based on their type and name.
What should this method return if the animal was not found in the array? How about a number that could never be a correct index? 
Make sure to test this method thoroughly.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Animal.java and Zoo.java to your Gradescope account for Lab3. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
