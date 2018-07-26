
public class UglyNumber {
	public int getNthUgly(int n) {
		int[] ugly = new int[n];
		int i2 = 0, i3 = 0, i5 = 0;
		int next_multipleofTwo = 2;
		int next_multipleofThree = 3;
		int next_multipleofFive = 5;
		int nextUglyNumber = 1;

		ugly[0] = 1;

		for (int i = 1; i < n; i++) {
			nextUglyNumber = Math.min(next_multipleofTwo, Math.min(next_multipleofThree, next_multipleofFive));

			ugly[i] = nextUglyNumber;

			if (nextUglyNumber == next_multipleofTwo) {
				i2 = i2 + 1;
				next_multipleofTwo = ugly[i2] * 2;
			}

			if (nextUglyNumber == next_multipleofThree) {
				i3 = i3 + 1;
				next_multipleofThree = ugly[i3] * 3;
			}

			if (nextUglyNumber == next_multipleofFive) {
				i5 = i5 + 1;
				next_multipleofFive = ugly[i5] * 5;
			}
		}

		return nextUglyNumber;
	}

	public static void main(String[] args) {
		int n = 150;
		UglyNumber obj = new UglyNumber();
		System.out.println(obj.getNthUgly(n));
	}

}
