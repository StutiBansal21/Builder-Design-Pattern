package builder;

/**
 * @author anuchinu
 *
 */
public class Application {

	public static void main(String[] args) {
		User user=new User.UserBuilder("Mukti").setMiddlename(" ").setLastname("Vardhaan").setState("Mumbai").setPin("1001").setId("1").build();
		System.out.println("User details: "+user);

	}

}
