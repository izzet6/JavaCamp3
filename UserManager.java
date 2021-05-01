
public class UserManager {
	public void add(Base base) {
		System.out.println("User eklendi: "+base.getFirstName()+" "+base.getLastName()+".");
	}
	
	public void remove(Base base) {
		System.out.println("User silindi: "+base.getFirstName()+" "+base.getLastName());
	}
	
	public void addMultiple(Base [] base) {
		for (Base base2 : base) {
			add(base2);
		}
	}
	
	public void removeMultiple(Base[] base) {
		for (Base base2 : base) {
			remove(base2);
		}
	}

}
