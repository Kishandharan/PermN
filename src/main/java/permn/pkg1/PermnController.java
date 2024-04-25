package permn.pkg1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;

@RestController
public class PermnController {
	@GetMapping("/perm3/{word3}")
	public ArrayList<String> perm3(@PathVariable String word3){
		ArrayList<String> list1 = new ArrayList<>();
		String ch1 = word3.substring(0,1);
		String ch2 = word3.substring(1,2);
		String ch3 = word3.substring(2,3);
		list1.add(ch1+ch2+ch3);
		list1.add(ch1+ch3+ch2);
		list1.add(ch2+ch3+ch1);
		list1.add(ch2+ch1+ch3);
		list1.add(ch3+ch1+ch2);
		list1.add(ch3+ch2+ch1);
		return list1;		
	}
	
	@GetMapping("/perm4/{word4}")	
	public ArrayList<String> perm4(@PathVariable String word4){
		//list
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		String s1, s2, temp1;
		s1=word4.substring(0,3);
		s2=word4.substring(3,4);
		list1=perm3(s1);
		for(int i = 0; i<list1.size(); i++) {
			temp1=list1.get(i);
			list2.add(temp1+s2);
			list2.add(s2+temp1);
		}
		s1=word4.substring(1,4);
		s2=word4.substring(0,1);
		list1=perm3(s1);
		for(int i = 0; i<list1.size(); i++) {
			temp1=list1.get(i);
			list2.add(temp1+s2);
			list2.add(s2+temp1);
		}
		
		return list2;
	}
	
	@GetMapping("/perm5/{word5}")
	public ArrayList<String> perm5(@PathVariable String word5){
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		String s1, s2, temp1;
		s1=word5.substring(0,4);
		s2=word5.substring(4,5);
		list1=perm4(s1);
		for(int i = 0; i<list1.size(); i++) {
			temp1=list1.get(i);
			list2.add(temp1+s2);
			list2.add(s2+temp1);
		}
		s1=word5.substring(1,5);
		s2=word5.substring(0,1);
		list1=perm4(s1);
		for(int i = 0; i<list1.size(); i++) {
			temp1=list1.get(i);
			list2.add(temp1+s2);
			list2.add(s2+temp1);
		}
		return list2;
	}
}
