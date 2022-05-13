package exercises;

public class Exercise1 {

	public Exercise1() {
		int CurrentNr = 0;
		int PreviousNr = 0;
		int Buffer = 0;
		int loop = 100;
		int count = 0;
		System.out.print(CurrentNr+", ");
		CurrentNr=1;
		while (count < loop) {
			Buffer=CurrentNr;
			CurrentNr=CurrentNr+PreviousNr;
			System.out.print(Buffer+", ");
			PreviousNr=Buffer;
			count++;
		}
	}
}
