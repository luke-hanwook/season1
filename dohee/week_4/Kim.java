package week_4;

public class Kim {

    public static String solution(String[] seoul){
        String answer = "";
        for(int i=0; i<seoul.length; i++) {

            if(seoul[i].equals("Kim")) {
                return "김서방은 "+i+"에 있다";
            }

        }

        return answer;
    }

    public static void main(String[] args) {

    }

}
