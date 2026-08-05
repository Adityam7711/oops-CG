class Person {
    String name = "Aditya";
    int age = 19;
    String email = "aditya@0011gmail.com";
		 
    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    } 
}
 
class emp extends Person {
    String role = "HR";
    int empId = 115;
    int sal = 70000;
	 
    void show() {
        System.out.println(role);
        System.out.println(empId);
        System.out.println(sal);
    }
}

class Main {
   
    void testcall(Person obj) {
        obj.display(); 
    }

    public static void main(String[] args) {
    
        Main m = new Main();
        Person p = new Person();
        m.testcall(p);
    }
}
