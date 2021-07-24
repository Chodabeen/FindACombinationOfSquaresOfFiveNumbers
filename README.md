# FindACombinationOfSquaresOfFiveNumbers

# H06 -   5개 숫자의 제곱수 조합 구하기
2에서 9사이의 숫자 5개를 입력받아 배열에 저장한 후, 이 5개의 숫자들 중 임의의 2개의 숫자 a와 b를 선택하여 a b의 값을 계산하여 이 중에서 가장 큰 수와 가장 작은 수를 만들 수 있는 경우를 찾아내라. 계산 할 때에는 메소드 pow()를 사용하라. 예를 들어 2, 3, 4, 5, 6을 입력한 경우에는 가장 작은 수는 2 3이고, 가장 큰 수는 5 6이 된다.

변수는 다음과 같이 사용하라.

int number[] = new int[5]; // 입력받은 5개의 숫자 리스트

int pow_value[][] = new int[5][5]; //임의의 두 수 a, b로 만들 수 있는 a

b의 값 들, 5 * 5 리스트

int max, min; // 최댓값과 최솟값

int max_a, max_b; // 최댓값을 만들어 내는 경우의 a와 b의 값

int min_a, min_b; // 최솟값을 만들어 내는 경우의 a와 b의 값

int i, j; // 반복문을 위한 변수

실행예시
```
Enter 5 numbers from 2 to 9 > 2 3 4 5 6
Max number is 15625 which is 6 squared of 5
Min number is 8 which is 3 squared of 2
```

```
Enter 5 numbers from 2 to 9 > 5 6 7 8 9
Max number is 134217728 which is 9 squared of 8
Min number is 7776 which is 5 squared of 6
```