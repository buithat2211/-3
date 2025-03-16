import java.io.PrintWriter;
import java.util.Scanner;

public class HoaDonMenu {
	PrintWriter out;
	Scanner in;
	String prompt;
	HoaDonInput hoadonInput;
	DSHoaDonControl dshoadonControl;
	HoaDonMenu(){
		out = new PrintWriter(System.out);
		in  = new Scanner(System.in);
		prompt = "-->";
	}
	HoaDonMenu(PrintWriter _out,Scanner _in,String _prompt){
		out = _out;
		in =_in;
		prompt = _prompt;
	}
	void controlLoop () {
		String command = " ";
		out.println("gõ lệnh \"help\" để được hổ trợ");
		while (true) {
			out.print(prompt);
			out.flush();
			command = in.nextLine();
			command = command.trim();
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
	}
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
	}
			if ("delete".equalsIgnoreCase(command)) {
				delete();
				continue;
			}
			if ("edit".equalsIgnoreCase(command)) {
				edit();
				continue;
			}
			if ("search".equalsIgnoreCase(command)) {
				search();
				continue;
			}
			if ("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
			if("exit".equalsIgnoreCase(command)) {
				break;
		}
	}
}
	void help() {
		out.println("----------User Help Menu-----------");
		out.flush();
		out.println("[HELP] HUONG DAN SU DUNG PHAN MEN");
		out.flush();
		out.println("[ADD] THEM HANG HOA");
		out.flush();
		out.println("[DELETE] XOA HANG HOA");
		out.flush();
		out.println("[SEARCH] TIM KIEM TAT HANG HOA");
		out.flush();
		out.println("[PRINT] IN DS TAT CA HANG HOA");
		out.flush();
		out.println("[EXIT] THOAT KHOI PHAM MEM");
		out.flush();
		out.println("----------User Help Menu-----------");
		out.flush();
	}
	void add () {
		HoaDonInput.input();
	}
	void edit() {
		HDEdit.input();
	}
	void search() {
		HDSearch.input();
	}
	void print() {
		DSHoaDonControl.input();
	}
	void delete () {
		HDDelete.input();
	}
}

