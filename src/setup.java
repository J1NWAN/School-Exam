import java.util.ArrayList;

public class setup implements DataBase {
	String name;
	String rank;
	String career;
	String dept;
	
	ArrayList<String> fileList = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getCareer() {
		return career;
	}
	
	public void setCareer(String career) {
		this.career = career;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}	
}
