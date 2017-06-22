/**
 * This is an example of bad programming - kept as a reminder to me of when I first 
 * started circa 2011. I did not know about object-orientation or arrays.
 * 
 * The inspiration for this came fromthe answer to the "100 Prisoners and a 
 * Lightbulb" riddle:
 *  
 * There are 100 prisoners in solitary cells. There's a central living room with one
 * light bulb; this bulb is initially off. No prisoner can see the light bulb from
 * his or her own cell. Everyday, the warden picks a prisoner equally at random, 
 * and that prisoner visits the living room. While there, the prisoner can toggle 
 * the bulb if he or she wishes. Also, the prisoner has the option of asserting 
 * that all 100 prisoners have been to the living room by now. If this assertion 
 * is false, all 100 prisoners are executed. However, if it is indeed true, all 
 * prisoners are set free. Thus, the assertion should only be made if the prisoner 
 * is 100% certain of its validity. The prisoners are allowed to get together one 
 * night in the courtyard, to discuss a plan. What plan should they agree on, so 
 * that eventually, someone will make a correct assertion?
 * 
 * I wanted to know how long it would take. Prisoners runs each simulation numRuns
 * times and outputs the shortest time it took, the longest time it took, and the
 * average time taken of the total number of runs.
 * 
 */
import java.util.*;

public class Prisoners

{

	public static void main(String[] args)

	{

		// define var
		int numRuns = 0;
		int count = 0;
		int days = 0;
		int shortestDays = 123456789;
		int longestDays = 0;
		int averageDays = 0;

		while (numRuns < 10000) {

			days = 0;
			count = 0;
			boolean switchON = false, one = false, two = false, three = false, four = false, five = false, six = false, seven = false, eight = false, nine = false, ten = false, eleven = false, twelve = false, thirteen = false, fourteen = false, fifteen = false, sixteen = false, seventeen = false, eighteen = false, nineteen = false, twenty = false, twentyOne = false, twentyTwo = false, twentyThree = false, twentyFour = false, twentyFive = false, twentySix = false, twentySeven = false, twentyEight = false, twentyNine = false, thirty = false, thirtyOne = false, thirtyTwo = false, thirtyThree = false, thirtyFour = false, thirtyFive = false, thirtySix = false, thirtySeven = false, thirtyEight = false, thirtyNine = false, forty = false, fortyOne = false, fortyTwo = false, fortyThree = false, fortyFour = false, fortyFive = false, fortySix = false, fortySeven = false, fortyEight = false, fortyNine = false, fifty = false, sixty = false, seventy = false, eighty = false, ninety = false, fiftyNine = false, sixtyNine = false, seventyNine = false, eightyNine = false, ninetyNine = false, fiftyEight = false, sixtyEight = false, seventyEight = false, eightyEight = false, ninetyEight = false, fiftySeven = false, sixtySeven = false, seventySeven = false, eightySeven = false, ninetySeven = false, fiftySix = false, sixtySix = false, seventySix = false, eightySix = false, ninetySix = false, fiftyFive = false, sixtyFive = false, seventyFive = false, eightyFive = false, ninetyFive = false, fiftyFour = false, sixtyFour = false, seventyFour = false, eightyFour = false, ninetyFour = false, fiftyThree = false, sixtyThree = false, seventyThree = false, eightyThree = false, ninetyThree = false, fiftyTwo = false, sixtyTwo = false, seventyTwo = false, eightyTwo = false, ninetyTwo = false, fiftyOne = false, sixtyOne = false, seventyOne = false, eightyOne = false, ninetyOne = false;

			while (count < 99) {
				int RANDOM = (int) (Math.round(Math.random() * 99));
				days++;

				switch (RANDOM) {

				case 1:
					if (switchON == false && one == false) {
						
						one = true;
						switchON = true;
						
						break;
						
					} else {
						
						break;
						
					} // end else

				case 2:
					if (switchON == false && two == false) {

						two = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 3:
					if (switchON == false && three == false)

					{

						three = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 4:
					if (switchON == false && four == false)

					{

						four = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 5:
					if (switchON == false && five == false)

					{

						five = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 6:
					if (switchON == false && six == false)

					{

						six = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 7:
					if (switchON == false && seven == false)

					{

						seven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 8:
					if (switchON == false && eight == false)

					{

						eight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 9:
					if (switchON == false && nine == false)

					{

						nine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 10:
					if (switchON == false && ten == false)

					{

						ten = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 11:
					if (switchON == false && eleven == false)

					{

						eleven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 12:
					if (switchON == false && twelve == false)

					{

						twelve = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 13:
					if (switchON == false && thirteen == false)

					{

						thirteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 14:
					if (switchON == false && fourteen == false)

					{

						fourteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 15:
					if (switchON == false && fifteen == false)

					{

						fifteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 16:
					if (switchON == false && sixteen == false)

					{

						sixteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 17:
					if (switchON == false && seventeen == false)

					{

						seventeen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 18:
					if (switchON == false && eighteen == false)

					{

						eighteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 19:
					if (switchON == false && nineteen == false)

					{

						nineteen = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 20:
					if (switchON == false && twenty == false)

					{

						twenty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 21:
					if (switchON == false && twentyOne == false)

					{

						twentyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 22:
					if (switchON == false && twentyTwo == false)

					{

						twentyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 23:
					if (switchON == false && twentyThree == false)

					{

						twentyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 24:
					if (switchON == false && twentyFour == false)

					{

						twentyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 25:
					if (switchON == false && twentyFive == false)

					{

						twentyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 26:
					if (switchON == false && twentySix == false)

					{

						twentySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 27:
					if (switchON == false && twentySeven == false)

					{

						twentySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 28:
					if (switchON == false && twentyEight == false)

					{

						twentyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 29:
					if (switchON == false && twentyNine == false)

					{

						twentyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 30:
					if (switchON == false && thirty == false)

					{

						thirty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 31:
					if (switchON == false && thirtyOne == false)

					{

						thirtyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 32:
					if (switchON == false && thirtyTwo == false)

					{

						thirtyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 33:
					if (switchON == false && thirtyThree == false)

					{

						thirtyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 34:
					if (switchON == false && thirtyFour == false)

					{

						thirtyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 35:
					if (switchON == false && thirtyFive == false)

					{

						thirtyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 36:
					if (switchON == false && thirtySix == false)

					{

						thirtySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 37:
					if (switchON == false && thirtySeven == false)

					{

						thirtySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 38:
					if (switchON == false && thirtyEight == false)

					{

						thirtyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 39:
					if (switchON == false && thirtyNine == false)

					{

						thirtyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 40:
					if (switchON == false && forty == false)

					{

						forty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 41:
					if (switchON == false && fortyOne == false)

					{

						fortyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 42:
					if (switchON == false && fortyTwo == false)

					{

						fortyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 43:
					if (switchON == false && fortyThree == false)

					{

						fortyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 44:
					if (switchON == false && fortyFour == false)

					{

						fortyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 45:
					if (switchON == false && fortyFive == false)

					{

						fortyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 46:
					if (switchON == false && fortySix == false)

					{

						fortySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 47:
					if (switchON == false && fortySeven == false)

					{

						fortySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 48:
					if (switchON == false && fortyEight == false)

					{

						fortyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 49:
					if (switchON == false && fortyNine == false)

					{

						fortyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 50:
					if (switchON == false && fifty == false)

					{

						fifty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 51:
					if (switchON == false && fiftyOne == false)

					{

						fiftyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 52:
					if (switchON == false && fiftyTwo == false)

					{

						fiftyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 53:
					if (switchON == false && fiftyThree == false)

					{

						fiftyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 54:
					if (switchON == false && fiftyFour == false)

					{

						fiftyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 55:
					if (switchON == false && fiftyFive == false)

					{

						fiftyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 56:
					if (switchON == false && fiftySix == false)

					{

						fiftySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 57:
					if (switchON == false && fiftySeven == false)

					{

						fiftySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 58:
					if (switchON == false && fiftyEight == false)

					{

						fiftyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 59:
					if (switchON == false && fiftyNine == false)

					{

						fiftyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 60:
					if (switchON == false && sixty == false)

					{

						sixty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 61:
					if (switchON == false && sixtyOne == false)

					{

						sixtyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 62:
					if (switchON == false && sixtyTwo == false)

					{

						sixtyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 63:
					if (switchON == false && sixtyThree == false)

					{

						sixtyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 64:
					if (switchON == false && sixtyFour == false)

					{

						sixtyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 65:
					if (switchON == false && sixtyFive == false)

					{

						sixtyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 66:
					if (switchON == false && sixtySix == false)

					{

						sixtySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 67:
					if (switchON == false && sixtySeven == false)

					{

						sixtySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 68:
					if (switchON == false && sixtyEight == false)

					{

						sixtyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 69:
					if (switchON == false && sixtyNine == false)

					{

						sixtyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 70:
					if (switchON == false && seventy == false)

					{

						seventy = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 71:
					if (switchON == false && seventyOne == false)

					{

						seventyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 72:
					if (switchON == false && seventyTwo == false)

					{

						seventyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 73:
					if (switchON == false && seventyThree == false)

					{

						seventyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 74:
					if (switchON == false && seventyFour == false)

					{

						seventyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 75:
					if (switchON == false && seventyFive == false)

					{

						seventyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 76:
					if (switchON == false && seventySix == false)

					{

						seventySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 77:
					if (switchON == false && seventySeven == false)

					{

						seventySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 78:
					if (switchON == false && seventyEight == false)

					{

						seventyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 79:
					if (switchON == false && seventyNine == false)

					{

						seventyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 80:
					if (switchON == false && eighty == false)

					{

						eighty = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 81:
					if (switchON == false && eightyOne == false)

					{

						eightyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 82:
					if (switchON == false && eightyTwo == false)

					{

						eightyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 83:
					if (switchON == false && eightyThree == false)

					{

						eightyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 84:
					if (switchON == false && eightyFour == false)

					{

						eightyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 85:
					if (switchON == false && eightyFive == false)

					{

						eightyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 86:
					if (switchON == false && eightySix == false)

					{

						eightySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 87:
					if (switchON == false && eightySeven == false)

					{

						eightySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 88:
					if (switchON == false && eightyEight == false)

					{

						eightyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 89:
					if (switchON == false && eightyNine == false)

					{

						eightyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 90:
					if (switchON == false && ninety == false)

					{

						ninety = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 91:
					if (switchON == false && ninetyOne == false)

					{

						ninetyOne = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 92:
					if (switchON == false && ninetyTwo == false)

					{

						ninetyTwo = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 93:
					if (switchON == false && ninetyThree == false)

					{

						ninetyThree = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 94:
					if (switchON == false && ninetyFour == false)

					{

						ninetyFour = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 95:
					if (switchON == false && ninetyFive == false)

					{

						ninetyFive = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 96:
					if (switchON == false && ninetySix == false)

					{

						ninetySix = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 97:
					if (switchON == false && ninetySeven == false)

					{

						ninetySeven = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 98:
					if (switchON == false && ninetyEight == false)

					{

						ninetyEight = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 99:
					if (switchON == false && ninetyNine == false)

					{

						ninetyNine = true;
						switchON = true;

						break;

					} else {

						break;

					} // end else

				case 0:
					if (switchON == true)

					{

						switchON = false;
						count++;
						break;

					} else {

						break;

					} // end else

				default:
					break;

				} // end switch

			} // end while

			numRuns++;

			// sets the shortest and longest days (if applicable)
			if (days < shortestDays) {
				shortestDays = days;
			}

			if (days > longestDays) {
				longestDays = days;
			}

			// keeps a running count of the number of days for the average
			averageDays = averageDays + days;

		}

		// calculates the time taken and outputs it to the console
		averageDays = averageDays / 10000;

		int remainder = averageDays % 365;
		int years = averageDays / 365;
		System.out.print("Average length: " + years + " years and " + remainder
				+ " days \n");
		System.out.print("Longest time taken: " + longestDays / 365
				+ " years and " + longestDays % 365 + " days \n");
		System.out.print("Shortest time taken: " + shortestDays / 365
				+ " years and " + shortestDays % 365 + " days ");
	}
}
