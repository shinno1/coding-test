package codingTest;

public class test1 {
	//���￡�� �輭�� ã��
	public static void main(String[] args) {
		String[] seoul = {"sss", "kkk", "zzz", "Kim", "Kim"};
		solution(seoul);
		
	}

	
	    public static String solution(String[] seoul) {
	        String answer = "";
	        String Kim = "Kim";
	        
	        for (int i = 0 ; i < seoul.length ; i++) {
	        	if(seoul[i].equals("Kim")) {
	        		answer = "�輭���� " + i + "�� �ִ�.";
	        		System.out.println(answer);
	        		break;
	        	}
			}
	        
	        return answer;
	    }
	
}
