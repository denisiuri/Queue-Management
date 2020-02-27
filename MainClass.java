package PT2019.Tema2.Tema2Project;
public class MainClass {

	public static void main(String[] args) {
		Store s = new Store();
		View v = new View();
		Controller c = new Controller(v, s);
	}

}
