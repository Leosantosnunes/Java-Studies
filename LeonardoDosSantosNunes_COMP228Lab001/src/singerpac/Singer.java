package singerpac;
import java.time.LocalDate;
public class Singer {
	//Instance variable declaration
	int singerId;
	String name;
	String address;
	LocalDate birth;
	int numberOfAlbuns;
	
	//no arg constructor
	public Singer() {
		
	}
	
	//one args constructor 
	public Singer(String name) {
		this.name = name;
	}
	
	//two args constructor
	public Singer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//three args constructor
	public Singer(int singerId,String name, String address) {
		this.singerId = singerId;
		this.name = name;
		this.address = address;		
	}
	
	//four args constructor
	public Singer(int singerId,String name, String address,LocalDate birth) {
		this.singerId = singerId;
		this.name = name;
		this.address = address;		
		this.birth = birth;
	}
	//five args constructor
	public Singer(int singerId,String name, String address,LocalDate birth, int numberOfAlbuns){
		this.singerId = singerId;
		this.name = name;
		this.address = address;		
		this.birth = birth;
		this.numberOfAlbuns = numberOfAlbuns;
	}
	
	//getters
	public int getSingerId() {
		return singerId;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return address;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public int getNumberOfAlbuns() {
		return numberOfAlbuns;
	}
	
	//setters
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public void setNumberOfAlbuns(int numberOfAlbuns) {
		this.numberOfAlbuns = numberOfAlbuns;
	}
	public void setAll(int singerId,String name,String address,LocalDate birth,int numberOfAlbuns) {
		this.singerId = singerId;
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.numberOfAlbuns = numberOfAlbuns;
	}
	public String toString() {
		return ("Singer ID " + singerId + " Name: " + name + "\n" + " Adress: " + address + " Birth: "+ birth + " numberOfAlbuns: " + numberOfAlbuns + "\n");
	}
}
