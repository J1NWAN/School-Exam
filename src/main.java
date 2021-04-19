
public class main extends ui {

	public static void main(String[] args) {
		Data data = new Data();
		int select = 0;
		
		while(true) {
			menu();
			select = data.sc.nextInt();
			
			if (select == 0) {
				data.fileImport();
				continue;
			} else if(select == 1) {
				data.userCreate();
				continue;
			} else if (select == 2) {
				data.userRemove();
				continue;
			} else if (select == 3) {
				data.userList();
				continue;
			} else if (select == 4) {
				data.fileWrite();
				continue;
			} else if (select == 5) {
				exit();
				break;
			} else if (select == 6) {
				report();
				break;
			}
		}
	}

}
