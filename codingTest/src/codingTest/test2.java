package codingTest;

public class test2 {
	//���ڼ��ڼ��ڼ��ڼ��ڼ�?
	public static void main(String[] args) {
		solution(4);
	}
	
	public static String solution(int n) {
        String answer = "";
        
        for (int i = 0 ; i < n ; i++) {
			if(i % 2 == 0) {
				answer += "��";
			}
			else {
				answer += "��";
			}
		}
        System.out.println(answer);
        
        return answer;
    }
}
