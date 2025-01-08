public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;


  // Non-default Dog constructor
  public Dog(string name){
    this.name = name;
    numDogs++;
    this.ID = numDogs * numDogs;
  }
  // Default Dog constructor

  // Setters - instance variables only
  private void setName(String name){this.name = name;}
  private void setID(int ID){this.ID = ID;}
  private void setNum(int numDogs){this.numDogs = numDogs;}

  // Getters - instance variables only
  private String getName(){return name;}
  private int getID(){return ID;}
  private int getNumDogs(){return numDogs;}
  // method getNumDogs
}
