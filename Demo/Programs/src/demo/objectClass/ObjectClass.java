package demo.objectClass;
/**
 * 
 * @author jayanti.vishnoi
 * <p>Class Object
	java.lang.Object
	public class Object
	Class Object is the root of the class hierarchy. Every class has Object as a superclass.
	All objects, including arrays, implement the methods of this class.
	<p>
 */
public class ObjectClass {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Sam");
		Employee emp2 = new Employee(1, "Sam");
		/**
		 *  Some IDs are coming in console 
		 *  Comment toString() override to see
		 */
		System.out.println(emp1);
		System.out.println(emp2);
		
		//Lets override toString() method to not get this ID value
		System.out.println(emp1.getClass());
		System.out.println(emp2.getClass());
		
		//Object Equality
		System.out.println("Hashcode: Defalut Impl --> Derived hash code value --> MemoryAddOf(Object)");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		//Rmv Override hashcode method to see real hash vals
		System.out.println("Equal method");
		System.out.println(emp1.equals(emp2));
		
		/**Equal Method: 
		 * compare object on basis of Memory Address
		 * if MemAdd(Obj1)== MemAdd(Obj2) true;
		 * else false
		 *"==" behave in the same way 
		 *
		 *As in our usecase hashcode method is overriden , same empID make 
		 *object same , hence equal()method should be also overriden.
		 */
		
		/**
		 * hashcode() and equals contract: Both must be overriden to maintain the contract
		 * If two obj1 == obj2 then hashcode(obj1)(must)== hashcode(obj2)
		 * If even hashcode are same , then too if and only if equal return true ,
		 * then only objs are considered equal
		 */
	}
}
