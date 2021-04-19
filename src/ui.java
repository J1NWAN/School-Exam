import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ui {
	public static void menu() {
		System.out.println("0. 파일 불러오기");
		System.out.println("1. 사원 생성");
		System.out.println("2. 사원 삭제");
		System.out.println("3. 사원 리스트");
		System.out.println("4. 파일 저장");
		System.out.println("5. 종료");
		System.out.println("6. 소감문");
		System.out.print("@ >> ");
	}
	
	public static void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void report() {
		System.out.println("");
		try {
			BufferedReader br = new BufferedReader(new FileReader("소감문.txt"));
			try {
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					System.out.println(line);
				}
			} catch (IOException e) {
				System.err.println("파일 불러오기 실패 !");
			}

		} catch (FileNotFoundException e) {
			System.err.println("파일 불러오기 실패 !");
		}
	}
}

class consoleUi {
	
	public void CWLUi() {
		System.out.println("\n|  사원번호  |  " + " 이름   |  " + "직급  |  " + "경력  |  " + "부서  |");
		System.out.println("---------------------------------------------");
	}
	
	public void removeUi() {
		System.out.println("\n INDEX  |  사원번호  |  " + " 이름   |  " + "직급  |  " + "경력  |  " + "부서  |");
		System.out.println("-----------------------------------------------------");
	}
}
