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
	
	private ArrayList<BuddyInfo> addressbook = new ArrayList<BuddyInfo>();
	
	public void addbuddy (BuddyInfo bud) {
		this.addressbook.add(bud);
	}
	
	public void addbuddypos (BuddyInfo bud, int postion) throws IndexOutOfBoundsException {
		if ((postion > 0) &&  (postion <= addressbook.size())) {
			this.addressbook.add(postion, bud);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public BuddyInfo removebuddy (int index) throws IndexOutOfBoundsException{
		if ((index >= 0) && (index < this.addressbook.size())) {
			return this.addressbook.remove(index);
		}
			throw new IndexOutOfBoundsException();
	}
	
	public void  doesNothing () {
		//does nothing
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook addressbook = new AddressBook ();
		BuddyInfo friend1 = new BuddyInfo ("Homer", "Springfield", "1-800-420-6969");
		BuddyInfo friend2 = new BuddyInfo ("Marge", "Springfield", "1-800-420-6969");
		BuddyInfo friend3 = new BuddyInfo ("Bart", "Springfield", "1-800-420-6969");
		BuddyInfo friend4 = new BuddyInfo ("Lisa", "Springfield", "1-800-420-6969");
		BuddyInfo friend5 = new BuddyInfo ("Maggie", "Springfield", "1-800-420-6969");
		BuddyInfo friend6 = new BuddyInfo ("Grandpa", "Springfied", "1-800-420-6969");
		addressbook.addbuddy(friend1);
		addressbook.addbuddy(friend2);
		addressbook.addbuddy(friend3);
		addressbook.addbuddy(friend4);
		addressbook.addbuddy(friend5);
		addressbook.addbuddy(friend6);
		//addressbook.removebuddy(4);
		addressbook.removebuddy(5);
		System.out.println("Address Book finished adding elements to the list");
		
		}

}
