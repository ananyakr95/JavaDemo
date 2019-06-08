class ArrayDemo2{


	// public int [] arrayLength(int len){

	// 	int [] arr = new int [len];

 //    	return arr;
 //    }

     public static void main(String[] args){

  //    	ArrayDemo1 obj = new ArrayDemo1();
     
		// int [] arrDisp = obj.arrayLength(5);
        
        Student [] arrDisp = new Student[3];

        arrDisp[0] = new Student(1,98,"ananya");
        arrDisp[1] = new Student(2,100,"Ram");
        arrDisp[2] = new Student(3,0,"vaibhav");


        for (int i =0; i<3; i++){
        	System.out.println("Studnet"+arrDisp[i].name+"at index"+ i + "with roll number"+ arrDisp[i].rollNum + " has scored "+ arrDisp[i].marks+"marks");
        }
	}
}