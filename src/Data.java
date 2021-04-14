import java.util.ArrayList;

public class Data {
	ArrayList<String> List = new ArrayList<String>();
	
	String[] name = {"황용철", "정유빈", "하지현", "심시환", "조하영", "윤지현", "표효은", "강원식", "설승용", "최인혁"};
	String[] rank = {"사원","주임","대리","과장","차장","부장","이사"};
	String[] career = {"신입", "경력"};
	String[] dept = {"인사", "경리", "개발", "영업", "기획", "총무"};
	int rand;
	
	public void Print() {
		for(int i = 0; i < 2; i++) {
			
			setup set = new setup();
			
			rand = (int)(Math.random() * name.length);
			set.setName(name[rand]);
			
			rand = (int)(Math.random() * rank.length);
			set.setRank(rank[rand]);
			
			rand = (int)(Math.random() * career.length);
			set.setCareer(career[rand]);
			
			rand = (int)(Math.random() * dept.length);
			set.setDept(dept[rand]);
			List.add((i+1) + " | " + set.name + " | " + set.rank + " | " + set.career + " | " + set.dept +" | ");
			
			System.out.println(List.get(i));
		}
	}
}
