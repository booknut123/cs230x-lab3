
/**
 * Creates a Zoo containing an array of Animals.
 *
 * @author Kailyn Lau
 * @version v1.2
 */
public class Zoo
{
    private Animal[] members;
    private int size;
    
    /**
     * Constructs a zoo with 3 spaces.
     */
    public Zoo() {
        this(3);
    }
    
    /**
     * Constructs a Zoo with arraySize spaces.
     * 
     * @param arraySize the size of the array (number of elements)
     */
    public Zoo(int arraySize) {
        members = new Animal[arraySize];
        size = 0;
    }
    
    /**
     * Adds a new Animal to the Zoo. 
     * 
     * @param newAnimal the animal to add
     */
    public void addAnimal(Animal newAnimal) {
        try {
            members[size] = newAnimal;
        } catch (Exception e) {
            extendCapacity();
            members[size] = newAnimal;
        }
        size++;
    }
    
    /**
     * Doubles the capacity of the Zoo (increases size of array and therefore increases number of Animals the Zoo contains).
     */
    public void extendCapacity() {
        Animal[] members2 = new Animal[members.length * 2];
        for (int i = 0; i < members.length; i++) {
            members2[i] = members[i];
        }
        members = new Animal[members2.length];
        members = members2;
    }
    
    /**
     * Returns the number of animals in the zoo
     * 
     * @return the number of constructed Animals in the Zoo
     */
    public int getNumOfAnimals() {
        return size;
    }
    
    /**
     * Returns a String containing a list of all of the food types needed to maintain the zoo.
     * 
     * @return list of all of food types needed to maintain the zoo
     */
    public String getGroceryShoppingList() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += members[i].getFoodType() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Returns a double representing the total amount of food eaten per day
     * 
     * @return sum of all food eaten in a day, regardless of type
     */
    public double getAmountOfFoodPerDay() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += members[i].amountEatenPerDay();
        }
        return total;
    }
    
    /**
     * Iterates through members[] and finds the Animal with the given type and name.
     * 
     * @param type the type of the animal to find
     * @param name the name of the animal to find
     * @return     the index of the wanted Animal or -1 if not there.
     */
    public int findAnimal(String type, String name) {
        for (int i = 0; i < size; i++) {
            if (members[i].getType().equals(type) && members[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Returns a String representation of the Zoo, with the number of animals and a String representation of each animal.
     * 
     * @return number of animals and string representation of each animal
     */
    public String toString() {
        String s = "Number of animals: " + size + "\n";
        for (int i = 0; i < size; i++) {
            s += members[i] + "\n";
        }
        
        return s;
    }
    
    /**
     * Driver class to test
     */
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        System.out.println("Empty zoo: \n" + myZoo);
        
        myZoo.addAnimal(new Animal("armadillo","Charlotte", 15, "grain", 4, 0.05));
        myZoo.addAnimal(new Animal("hedgehog","Heidi", 1, "grass", 10, 0.2));
        myZoo.addAnimal(new Animal("koala","Chichi", 20, "eucalyptus", 1, 0.05));
        
        System.out.println("Added three animals...\n" + myZoo);
        
        myZoo.addAnimal(new Animal("dog", "Lani", 60, "treats", 2, 0.05));
        
        System.out.println("Added one more animal...\n" + myZoo);
        System.out.println("Number of animals in zoo: Expected 4 | Computed " + myZoo.getNumOfAnimals());
        System.out.println("Expected shopping list: grain, grass, eucalyptus, treats | Computed: " + myZoo.getGroceryShoppingList());
        System.out.println("Expected amount of food per day: 12.0 | Computed: " + myZoo.getAmountOfFoodPerDay());
        
        System.out.println("Where's Chichi the koala? Expected 3 | Computed " + myZoo.findAnimal("koala", "Chichi"));
        System.out.println("Where's Mila the dog? Expected 0 (not found) | Computed " + myZoo.findAnimal("dog", "Mila"));
    }
}
