
public class Person 
{
	public Person()
	{
		
	}
	
	public Person(String name, int age, String jobTitle)
	{
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	 public String toString() 
	 {
	 return("Name: "+name+" Age: "+age+" Job Title: "+jobTitle);
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	
	private String name;
	private int age;
	private String jobTitle;
	
}
