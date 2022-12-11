import java.util.Scanner;
public class CD
{
	//data fields
	private String author;
	private String title;
	private String owner;
	//contructor
	public CD(String author,String title){
		this.author = author; 
		this.title = title;
		setOwner(owner);
	}
	public void printCD(){
		System.out.println("Author : " +author);
		System.out.println("Title : " +title);
	}
	public void printOwnerCD(){
		System.out.println("Name of the owner : " +owner);
	}
	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
}
