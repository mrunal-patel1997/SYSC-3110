/**
 * 
 */

/**
 * @author Mrunal Patel
 *
 */
public class BuddyInfo {

	/**
	 * @param args
	 */
	
	private String BuddyName;
	private String BuddyAddress;
	private String BuddyPhoneNum;
	
	public BuddyInfo () {
		BuddyName = null;
		BuddyAddress = null;
		BuddyPhoneNum = null;
	}
	
	public BuddyInfo (String a, String b, String c) {
		super();
		this.BuddyName = a;
		this.BuddyAddress = b;
		this.BuddyPhoneNum = c;
	}
	
	public String getBuddyName() {
		return BuddyName;
	}

	public void setBuddyName(String buddyName) {
		this.BuddyName = buddyName;
	}

	public String getBuddyAddress() {
		return BuddyAddress;
	}

	public void setBuddyAddress(String buddyAddress) {
		this.BuddyAddress = buddyAddress;
	}

	public String getBuddyPhoneNum() {
		return BuddyPhoneNum;
	}

	public void setBuddyPhoneNum(String buddyPhoneNum) {
		this.BuddyPhoneNum = buddyPhoneNum;
	}

	//static BuddyInfo friend1 = new BuddyInfo ();
	//BuddyInfo friend2 = new BuddyInfo ("Homer", "Springfield", "1-800-420-6969");
	//String name = friend2.getBuddyName();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World =D");
			BuddyInfo friend2 = new BuddyInfo ("Homer", "Springfield", "1-800-420-6969");
			String name = friend2.getBuddyName();
			System.out.println(name);
	}

}
