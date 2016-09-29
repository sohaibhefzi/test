
package lab3;
import java.util.*;

public class AddressBook {
	ArrayList <buddyinfo>list;
	
	public AddressBook(){
		list = new ArrayList<buddyinfo>();
		
	}
	//dflgksruotig 
	public void addBuddy(buddyinfo b){
		list.add(b);
	}
	
	public void removeBuddy(buddyinfo b){
		list.remove(b);
	}
	
	public buddyinfo getB(int index){
		return list.get(index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buddyinfo x1, x2, x3;
		AddressBook temp = new AddressBook();
		
		x1 = new buddyinfo("sohaib", "1755", 613);
		x2 = new buddyinfo("zak", "100", 416);
		x3 = new buddyinfo("sam", "126", 800);
		
		temp.addBuddy(x1);
		temp.addBuddy(x2);
		temp.addBuddy(x3);
	
		
		System.out.println("Hello " + temp.getB(1).getName() + "!");
		temp.removeBuddy(x2);
		System.out.println("Hello " + temp.getB(1).getName() + "!");
		
		System.out.println("addressbook");
		System.out.println("addressbook");
		
		
		System.out.println("addressbook");
		
		
		// fdilugyadsiu boiusaydfoa u
		
		
		
		temp.addBuddy(x1);
		System.out.println("addressbook");
	}

}
