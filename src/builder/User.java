package builder;

public class User {
	private String firstname;
	private String middlename;
	private String lastname;
	private String state;
	private String pin;
	private String id;
	
	private User(UserBuilder builder) {
		
		this.firstname = builder.firstname;
		this.middlename = builder.middlename;
		this.lastname = builder.lastname;
		this.state = builder.state;
		this.pin = builder.pin;
		this.id = builder.id;
	}
	public static class UserBuilder{
		private String firstname;
		private String middlename;
		private String lastname;
		private String state;
		private String pin;
		private String id;
		
		public UserBuilder(String firstname) {
			super();
			this.firstname=firstname;
		}

		public String getFirstname() {
			return firstname;
		}

		public UserBuilder setFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public String getMiddlename() {
			return middlename;
		}

		public UserBuilder setMiddlename(String middlename) {
			this.middlename = middlename;
			return this;
		}

		public String getLastname() {
			return lastname;
		}

		public UserBuilder setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public String getState() {
			return state;
		}

		public UserBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public String getPin() {
			return pin;
		}

		public UserBuilder setPin(String pin) {
			this.pin = pin;
			return this;
		}

		public String getId() {
			return id;
		}

		public UserBuilder setId(String id) {
			this.id = id;
			return this;
		}
		
		public User build()
		{
			return new User(this);
		}
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", state="
				+ state + ", pin=" + pin + ", id=" + id + "]";
	}
	
	
}

