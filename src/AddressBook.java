/**
 * 
 */

/**
 * @author Mrunal Patel
 *
 */

import java.util.*;

public class AddressBook {

	/**
	 * @param args
	 */
	
	ArrayList<BuddyInfo> addressbook = new ArrayList<BuddyInfo>();
	

	
	void addbuddy (BuddyInfo bud) {
		addressbook.add(bud);
	}
	
	void addbuddypos (BuddyInfo bud, int postion)throws IndexOutOfBoundsException {
		if ((postion > 0) &&  (postion <= addressbook.size())) {
			addressbook.add(postion, bud);
		}
		throw new IndexOutOfBoundsException();
	}
	
	void removebuddy (int index) throws IndexOutOfBoundsException{
		if ((index > 0) && (index <= addressbook.size())) {
			addressbook.remove(index);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook addressbook = new AddressBook ();
		BuddyInfo friend1 = new BuddyInfo ("Homer", "Springfield", "1-800-420-6969");
		BuddyInfo friend2 = new BuddyInfo ("Marge", "Springfield", "1-800-420-6969");
		BuddyInfo friend3 = new BuddyInfo ("Bart", "Springfield", "1-800-420-6969");
		BuddyInfo friend4 = new BuddyInfo ("Lisa", "Springfield", "1-800-420-6969");
		BuddyInfo friend5 = new BuddyInfo ("Maggie", "Springfield", "1-800-420-6969");
		addressbook.addbuddy(friend1);
		addressbook.addbuddy(friend2);
		addressbook.addbuddy(friend3);
		addressbook.addbuddy(friend4);
		addressbook.addbuddy(friend5);
		
		System.out.println("Address Book finished adding elements to the list");
		
		}

}
