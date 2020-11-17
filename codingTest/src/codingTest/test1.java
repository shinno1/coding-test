package codingTest;

public class test1 {
	//서울에서 김서방 찾기
	public static void main(String[] args) {
		String[] seoul = {"sss", "kkk", "zzz", "Kim", "Kim"};
		solution(seoul);
		
	}

	
	    public static String solution(String[] seoul) {
	        String answer = "";
	        String Kim = "Kim";
	        
	        for (int i = 0 ; i < seoul.length ; i++) {
	        	if(seoul[i].equals("Kim")) {
	        		answer = "김서방은 " + i + "에 있다.";
	        		System.out.println(answer);
	        		break;
	        	}
			}
	        
	        return answer;
	    }
	
}
