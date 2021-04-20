import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	ArrayList<String> List = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	String[] name = { "황용철", "정유빈", "하지현", "심시환", "조하영", "윤지현", "표효은", "강원식", "설승용", "최인혁" };
	String[] rank = { "사원", "주임", "대리", "과장", "차장", "부장", "이사" };
	String[] career = { "신입", "경력" };
	String[] dept = { "인사", "경리", "개발", "영업", "기획", "총무" };

	int num = 0;
	int count = 0;
	int rand;

	setup set = new setup();
	consoleUi ui = new consoleUi();

	// 파일 불러오기
	public void fileImport() {
		List.clear();

		System.out.println("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(set.getPath()));
			try {
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					List.add(line);
				}
			} catch (IOException e) {
				System.err.println("파일 불러오기 실패 !");
			}

		} catch (FileNotFoundException e) {
			System.err.println("파일 불러오기 실패 !");
		}
	}
	
	// 유저 생성
	public void userCreate() {
		List.clear();

		System.out.println("\n생성할 사원의 수를 입력해주세요.");
		System.out.print("@ >> ");
		count = sc.nextInt();
		
		ui.CWLUi();
		for (int i = 0; i < count; i++) {

			rand = (int) (Math.random() * name.length);
			set.setName(name[rand]);

			rand = (int) (Math.random() * rank.length);
			set.setRank(rank[rand]);

			rand = (int) (Math.random() * career.length);
			set.setCareer(career[rand]);

			rand = (int) (Math.random() * dept.length);
			set.setDept(dept[rand]);

			this.num++;
			List.add(num + "     |  " + set.name + "  |  " + set.getRank() + "  |  " + set.getCareer() + "  |  "
					+ set.getDept() + "  |  ");

			System.out.print("|    ");
			System.out.println(List.get(i));
		}
		System.out.println("");
		num = 0;
	}

	// 유저 삭제
	public void userRemove() {

		ui.removeUi();
		for (int i = 0; i < List.size(); i++) {
			System.out.print("   " + i + "    |    ");
			System.out.println(List.get(i));
		}

		System.out.println("\n삭제할 유저의 인덱스를 입력해주세요.");
		System.out.print("@ >> ");
		int indexDelete = sc.nextInt();

		ui.CWLUi();
		System.out.print("|    ");
		System.out.println(List.get(indexDelete) + "의 정보를 삭제했습니다.\n");
		List.remove(indexDelete);
	}

	// 리스트 정보 파일에 저장
	public void fileWrite() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(set.getPath()));
			for (int i = 0; i < List.size(); i++) {
				pw.write(List.get(i) + "\n");

			}
			pw.close();
		} catch (IOException e) {
			System.out.println("파일 저장 실패 !");
		}
		System.out.println("\n파일 저장 성공 !\n");
	}

	// 리스트 전체 내용 출력
	public void userList() {
		
		ui.CWLUi();
		for (int i = 0; i < List.size(); i++) {
			System.out.print("|    ");
			System.out.println(List.get(i));
		}
		System.out.println("");
	}
}
