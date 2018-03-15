import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person Jasmine = new Person("Jasmine",28,"Teacher");
		Person Kyle = new Person("Kyle", 32,"Doctor");
		Person Alisha = new Person("Alisha",20,"hairdresser");
		Person Tina = new Person("Tina",19,"Model");
		Person Andrew = new Person("Andrew",42,"Scientist");
		
		ArrayList<Person> People = new ArrayList<>();
		
		People.add(Jasmine);
		People.add(Kyle);
		People.add(Alisha);
		People.add(Tina);
		People.add(Andrew);
		
		for(Person element : People)
		{
			System.out.println(element.toString());
		}
		
		System.out.print(findPersonByName("Kyle", People).toString());

	}
	
	public static Person findPersonByName(String name, ArrayList<Person> people)
	{
		for (Person element : people)
		{
			if(element.getName()==name) return element;
		}
		return null;
	}

}

