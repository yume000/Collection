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
			out.print("----------------------\n" + 
			"Commands below:\n" + 
			"1:list  2:add  3:reset\n" + 
			"4:delete(name)  5:delete(index)  6:clear\n" + 
			"0:quit\n" +
			"Please enter>>");
			cmd = scanner.nextLine();
			switch(cmd){
				case "1":
					showList();
					break;
				case "2":
					addMember();
					break;
				case "3":
					resetMember();
					break;
				case "4":
					deleteMember();
					break;
				case "5":
					deleteMember2();
					break;
				case "6":
				  clearMember();
				  break;
				case "0":
					break;
				default:
					System.out.println("Invalid command!!");
					break;
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
	//reset a element in list
	static void resetMember(){
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int index = 0;
		int maxIndex = members.size() - 1;
		String name;
		do{
			out.print("Please enter a index in list(0~" + maxIndex + ")>>");
			index = scanner.nextInt();
		}while(index < 0 || index > maxIndex);
		out.print("The old name is "+members.get(index)+"! Please enter a new name>>");
		name = scanner2.nextLine();
		members.set(index,name);
	}
	//show list
	static void showList(){
		if (members.isEmpty()){
			System.out.println("Here's no member in this list!!!!");
		} else {
			/*
			for(String member:members){
				System.out.println(member);
			}
			*/
			Iterator iterator = members.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
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
	//clear all members
	static void clearMember(){
		members.clear();
	}
}