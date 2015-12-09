import java.util.*;
import java.lang.*;
import static java.lang.System.out;
public class MemberForList {
	private static List<String> members;
	public static void main(String[] args){
		members = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String cmd;
		do{
			out.print("command(1:add member  2:show list  3:delete member by name  4:delete member by index  0:quit)>>");
			cmd = scanner.nextLine();
			switch(cmd){
				case "1":
					addMember();
					break;
				case "2":
					showList();
					break;
				case "3":
					deleteMember();
					break;
				case "4":
					deleteMember2();
					break;
				case "0":
					break;
				default:
					System.out.println("Invalid command!!");
			}
			if("0".equals(cmd)){break;}
		}while(true);
	}
	//add a element in list
	static void addMember(){
		Scanner scanner = new Scanner(System.in);
		String name;
		out.print("Please enter a name>>");
		name = scanner.nextLine();
		members.add(name);
	}
	//show list
	static void showList(){
		for(String member:members){
			System.out.println(member);
		}
	}
	//remove a element by name in list
	static void deleteMember(){
		String delMember="";
		for(String member:members){
			delMember+=((delMember.length()>0)?",":"")+member;
		}
		Scanner scanner = new Scanner(System.in);
		String name;
		out.print("Please enter a name in list(" + delMember + ")>>");
		name = scanner.nextLine();
		members.remove(name);
	}
	//remove a element by index in list
	static void deleteMember2(){
		Scanner scanner = new Scanner(System.in);
		int index;
		out.print("Please enter a index in list(0~" + (members.size()-1) + ")>>");
		index = scanner.nextInt();
		members.remove(index);
	}
}