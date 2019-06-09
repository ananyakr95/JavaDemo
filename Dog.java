class Dog{

  private String breed;
  private int age;
  private String color;

  Dog(String breed, int age, String color){
  	this.breed = breed;
  	this.age = age;
  	this.color = color;
 }

   public String getBreed(){
   	return breed;
   }

   public String getColor(){
   	return color;
   }
   
    public int getAge(){
   	return age;
   }
   
   public void setBreed(String breed)
   {
     this.breed = breed;
   }
   
   public void setColor(String color)
   {
     this.color = color;
   }

   public void setAge(int age)
   {
     this.age = age;
   }
}

