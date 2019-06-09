class JavaDemo1{

	public static void main(String[] args) {
		
		Dog obj = new Dog("labrador",1,"gold");

		System.out.println("breed :"+ obj.getBreed() + " age :"+ obj.getAge() + " color :"+ obj.getColor());
		obj.setBreed("VAIBHAVSHEEP");
		obj.setAge(9000);
		obj.setColor("pink");
		System.out.println("breed :"+ obj.getBreed() + " age :"+ obj.getAge() + " color :"+ obj.getColor());
		Dog [] arrayExam = new Dog [3];
        arrayExam[0] = new Dog("bandar", 89, "mota");
        arrayExam[1] = new Dog("bhalu", 200, "motaaaaa");
        arrayExam[2] = new Dog("shaun the sheep",900 ,"gadha");


        for(int i =0; i<3 ; i++){
        	System.out.println("breed :"+ arrayExam[i].getBreed()+ " age :"+ arrayExam[i].getAge() + " color :"+ arrayExam[i].getColor());
        }
	}
}