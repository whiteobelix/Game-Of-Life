package gameOfLive;

import java.util.Set;

public class Bug {
	private int x;
	private int y;

	public Bug(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int calculateBugsToDelete(int xySize, Set<Bug> boardSet, Set<Bug> toDraw, Set<Bug> toDelete) {
		int i = 0;
		int j = 0;
//		int n = 0;
		int k = 0;
		int m = 0;
		int nearNumberForThisBug = 0;
		int nearNumberForThisDethCell = 0;
		// Iterator<Bug> iter = boardSet.iterator();
		for (Bug bug : boardSet) { // pêtla do sprawdzania iloœci s¹siadow
			// sprawdziæ czy istniej¹ bugi o wspó³rzêdnych dooko³a tego buga
			// Bug nextBug = boardSet.iterator().next();
			int x = bug.getX();
			int y = bug.getY();

			xySize = MyInterface.inputNumber;
			for (i = x - 1; i < x + 2; i++) {
				for (j = y - 1; j < x + 2; j++) {
					Bug pixelUnderBugFromBoardSet = new Bug(i, j);
					
					if (boardSet.contains(pixelUnderBugFromBoardSet) && 1 <= x && x <= xySize && 1 <= y && y <= xySize
							&& !pixelUnderBugFromBoardSet.equals(bug)) {
						nearNumberForThisBug++;
					} else {
					}
					for (k = i - 1; k < i + 2; k++) {
						for (m = j - 1; m < j + 2; m++) {
							if (!pixelUnderBugFromBoardSet.equals(bug) && 1 <= x && x <= xySize && 1 <= y && y <= xySize && i > x - 1
									&& i < x + 2 && boardSet.contains(bug)) {
								nearNumberForThisDethCell++;
							}
						}
					}
					if (nearNumberForThisDethCell == 3){
						toDraw.add(pixelUnderBugFromBoardSet);
					} else {
					}
				}
			}
			if (nearNumberForThisBug < 2) {
				toDelete.add(bug);
			} else if (nearNumberForThisBug == 2 && nearNumberForThisBug == 3) {
				toDraw.add(bug);
			} else if (nearNumberForThisBug > 3) {
				toDelete.add(bug);
			} else {
				
			}

//			if (boardSet.contains(bug)) {
//				// int code = bug.hashCode();
//				System.out.println("X: " + x + " Y: " + y);
//				// Thread.sleep(500);
//				n++;
//				System.out.println("k = " + k);
//				// System.out.println("iter = " + iter);
//			}
		}
		return nearNumberForThisBug;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}