class Student{
           int roll_No;
		   String Name;
		   String Branch;
		   

 void insertRecord(int R,String N,String B){

           roll_No=R;
           Name=N;
           Branch=B;
        }
void display(){
        
           System.out.println(roll_No+" "+Name+" "+Branch);

        }
    }
class Student_detail{
               
			   public static void main(String   D []){
			     
				 Student S1=new Student();
				 Student S2=new Student();
				 S1.insertRecord(20,"UDVIP MAURYA","CSE");
				 S2.insertRecord(12,"HCT","CSE");
				 S1.display();
				 S2.display();
			    }
		    }