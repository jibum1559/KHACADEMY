package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항 연산자
		/*
		 삼항 = 일항 ? 이항 : 삼항
		 조건을 평가하고 세 가지 값 중 하나를 반환합
		 조건 ? 값1       : 값2        형태로 사용
		 조건 ? 값1(=true): 값2(false)
		 값 1은 조건이 참일 때 출력
		 값 2는 조건이 거짓일 때 출력
		 
		int age = 20;
		String status = (age >= 20) ? "성인" : "미성년자";
		System.out.println(status);
		 
		 * */
		//ex) 나이가 20이상은 성인인가 미성년자인가
		int age = 20;
		String status = (age >= 20 ? "성인" : "미성년자");
		System.out.println(status);
		
		int score = 40;
		String result = (score >= 70 ? "합격" : "불합격");
		System.out.println(result);
		
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign : " + sign);
		
		int temperature = 17;
		String weather = (temperature > 25 ? "더운 날씨" : "선선한 날씨");
		System.out.println(weather);
		
		// 숫자 7의 값을 짝수인지 홀수인지 출력 1 
		int num1 = 22;
		String result1 = (num1 % 2 == 0 ? "짝수" : "홀수");
		System.out.println(result1);
		
		int num2 = 1;
		String result2 = (num2 > 0) ? "양수" : (num2 < 0) ? "음수" : "0";
		System.out.println(result2);
		
				
	}

}
