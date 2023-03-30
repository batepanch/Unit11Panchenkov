package academy.it.homework.my;

/*14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class Task14 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = mas.length - 1; i >=0; i--) {
			for(int j = mas[i].length-1; j >=0; j--) {
				mas[mas.length-1-j][j] = mas.length - j;

			}
	}
		

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();

		}

	}

}
