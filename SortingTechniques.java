/*
SortingTechniques.java
ICS4U - Solving Linear and Binary Search Questions
Sudhanya Golla
Created July 10th, 2024
Last Modified July 10th 2024
*/

// Java setup
import java.util.*;

class SortingTechniques {
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();

	// Main program
	public static void main(String[] args) throws InterruptedException {

	// Question 1 - Linear search - see whether inputted name is within list of names
	String [] names = {"Nicholas", "Sara", "Jonathan", "Jaclyn", "Amos", "Max", "Chloe", "Christoffer", "Adriano", "Eliseo", "Soren", "Casey", "Wais", "Marcus", "Jack","Amy", "Albert", "Ethan", "Victoria", "Parsa", "Thomas","Sebastian","Jordan","Julian","Karen","Isaac","Prince","Nicholas","Jaden","Ivy","Sarah","Aidan","Andy","Joseph","Navid","Christine","Ryan","Chris","Jeffrey","Dylan","Jessica","Zachary","Raymond"};
					   

	// Prompt user for name and search for it linearlly to determine whether it is in list
	System.out.println("Enter name to be searched for: ");
	String input = in.nextLine();
	searchWordLinear(names, input, true);

	// Question 2 - Binary search - see whether inputted name is within list of names
	String [] names2 = {" Adriano "," Aidan "," Albert "," Amos "," Amy "," Andy "," Casey "," Chloe "," Chris "," Christine "," Christoffer "," Dylan "," Eliseo "," Ethan "," Isaac "," Ivy "," Jack "," Jaclyn "," Jaden "," Jeffrey "," Jessica "," Jonathan "," Jordan "," Joseph "," Julian "," Karen "," Marcus "," Max "," Navid "," Nicholas "," Nicholas "," Parsa "," Prince "," Raymond "," Ryan "," Sara "," Sarah "," Sebastian "," Soren "," Thomas "," Victoria "," Wais "," Zachary "};

	// Prompt user for name to search for
	// Search for word using binary search
	System.out.println("\nEnter name to be searched for: ");
	String inputClass = in.nextLine();
	searchWordBinary(names2, inputClass, true);

	// Question 3 - Search for occurences of a number using linear search
	int [] randomIntegers = new int[100];

	System.out.println("\nValues for an array are as follows: \n");

	// Randomize and print out values for an array at each index
	for (int repeat = 0; repeat < 100; repeat ++)
	{
		int randomNum = rand.nextInt(1, 11);
		randomIntegers[repeat] = randomNum;
		System.out.print(randomNum + " ");
	}

	// Prompt user for number and find number of occurences
	System.out.println("\n\nWhat number do you want to search for?");
	int number = in.nextInt();
	getIntLinear(randomIntegers, number);

	// Question 4 - Search for a word using linear and binary search
	String[] wordleWords = { "ABOUT", "ACTOR", "ADDED", "ADULT", "AFTER", "AGAIN", "AGENT", "AGREE", "ALLOW", "ALONE", "ALONG", "ALSO", "AMONG", "ANGLE", "ANGER", "ANIMAL", "ANKLE", "ANNEX", "ANSER", "APPLE", "APPLY", "APRON", "ARISE", "ARMOR", "ARRAY", "ASIDE", "AURUM", "AVOID", "AVOWS", "AWFUL", "BABY", "BACON", "BADLY", "BAGEL", "BASIC", "BEACH", "BEADS", "BEAMS", "BEEFY", "BEING", "BELOW", "BENEF", "BENIN", "BERRY", "BETTY", "BIBLE", "BIDEN", "BIGOT", "BINGO", "BIRDS", "BIRTH", "BITCH", "BLAME", "BLANK", "BLEND", "BLESS", "BLUES", "BLUSH", "BOAST", "BOMBS", "BONUS", "BOOST", "BOOTS", "BOTCH", "BOUND", "BOWEL", "BOWIE", "BRAIN", "BRAND", "BRAVE", "BRAVO", "BREAD", "BRIEF", "BRINK", "BROKE", "BRUTE", "BUNCH", "BURNT", "BURST", "BUSHY", "BUTTS", "BUZZY", "CABIN", "CABLE", "CAKED", "CALMS", "CANDY", "CAPED", "CARDS", "CARVE", "CASES", "CASHY", "CASTS", "CAUSE", "CEASE", "CELLS", "CETUS", "CHAIN", "CHAIR", "CHASE", "CHATS", "CHEAP", "CHEEK", "CHEFS", "CHESS", "CHIEF", "CHILD", "CHINA", "CHOSE", "CIDER", "CITIZ", "CIVIL", "CIVIS", "CLAMS", "CLEAN", "CLEAR", "CLICK", "CLIMB", "CLONE", "CLOSE", "CLOTH", "CLOUD", "CLOWN", "CLUNK", "COAST", "COFFEE", "COLDS", "COMES", "COMIC", "CONES", "CONGO", "CONIC", "COOKS", "CORGI", "COURT", "CRAFT", "CRAZY", "CREEP", "CROPS", "CROWN", "CURLY", "CURSE", "CYCLE", "DAILY", "DAIRY", "DALES", "DANCE", "DARKS", "DARTS", "DAVID", "DEATH", "DECAY", "DECOR", "DEITY", "DELTA", "DESKS", "DEVIL", "DIEGO", "DIGIT", "DILDO", "DINER", "DINES", "DIODE", "DIRTY", "DISCO", "DISHY", "DOERS", "DOORS", "DORKY", "DOTTY", "DOUBT", "DOVES", "DOWNS", "DRAPE", "DREAD", "DREAM", "DRESS", "DRIFT", "DRINK", "DRIVE", "DRONE", "DROWN", "DRUGS", "DRUNK", "DRYER", "DUCES", "DUDES", "DUMMY", "DUNES", "DUSTY", "DWELL", "DYING", "EARLY", "EARTH", "EATEN", "EATER", "EGYPT", "ELBOW", "ELDER", "ELECT", "EMAIL", "EMPTY", "ENEMY", "ENGLY", "ENIGM", "ENJOY", "ENJOY", "ENTRY", "ERROR", "EVADE", "EVENT", "EVOKE", "EXALT", "EXAMS", "EXITS", "EXPEL", "EXTRA", "FAITH", "FANCY", "FAREW", "FARTS", "FATAL", "FATTS", "FAULT", "FAVOR", "FAWNY", "FEARS", "FEAST", "FEELS", "FEWEL", "FIBER", "FIGHT", "FINDS", "FINGE", "FINNS", "FIREY", "FIRMS", "FIVER", "FLAIR", "FLANK", "FLAPS", "FLARE", "FLASH", "FLAWS", "FLEAS", "FLEET", "FLESH", "FLIPS", "FLOOD", "FLOOR", "FLUFF", "FLUTE", "FOAMY", "FONDS", "FOOLS", "FOOTY", "FORKS", "FORUM", "FOURS", "FRAME", "FREED", "FRESH", "FRUIT", "FUDGE", "FUMES", "FUNNY", "GAINS", "GAITS", "GATOR", "GEARS", "GELLS", "GENIE", "GENTS", "GERMS", "GHOST", "GIRLS", "GLASS", "GLORY", "GLOWS", "GNOME", "GOALS", "GOATS", "GODLY", "GOING", "GOLDS", "GOODS", "GOTTA", "GRADE", "GRAIN", "GRAND", "GRAVE", "GREAT", "GREED", "GREEK", "GREEN", "GREYS", "GRIEF", "GRINS", "GROOM", "GROSS", "GROUP", "GUARD", "GUESS", "GUILT", "GUMBO", "GUSTY", "GUYED", "GYROE", "HAILS", "HAIRS", "HANDS", "HAPPY", "HARDY", "HASTE", "HATCH", "HATED", "HAUNT", "HAVEN", "HAWKS", "HEALS", "HEARD", "HEARS", "HEART", "HEATS", "HELLO", "HENNA", "HERBS", "HERDS", "HIDES", "HILLS", "HILLY", "HINDS", "HINTS", "HITCH", "HOBBY", "HOLES", "HOMES", "HONEY", "HONKS", "HOPES", "HORSE", "HOUSE", "HOWLS", "HUMAN", "HUMID", "HUMOR", "HUNTS", "HYDRA", "HYDRO", "ILOVE", "IMPAT", "IMPET", "IMPLO", "IMPOT", "INCIS", "INERT", "INFRE", "INLAW", "INLAY", "INNIS", "INPUT", "INSET", "IRAQS", "IRONY", "ISSUE", "IVORY", "JAILS", "JAMMY", "JAPAN", "JELLY", "JENNY", "JERKS", "JOINT", "JOKER", "JOKES", "JOLLY", "JUDGE", "JULIA", "JUMPS", "JUNKY", "JUNTA", "JUNKY", "JUROR", "JUTTY", "KARMA", "KEEPS", "KEVIN", "KICKS", "KINDS", "KINGS", "KINKY", "KITES", "KNEES", "KNITS", "KNOLL", "KNOWS", "KOALA", "LABOR", "LADEN", "LADLE", "LAKES", "LAMPS", "LANCE", "LANDS", "LARGE", "LARVA", "LATEX", "LAUGH", "LAYER", "LEADS", "LEAKS", "LEAPS", "LEARN", "LEASE", "LEASH", "LEAVE", "LEGAL", "LEMON", "LEOFR", "LETHA", "LEVER", "LEVEL", "LIGHT", "LIMES", "LINDA", "LINED", "LINER", "LIONS", "LISPS", "LITRE", "LIVES", "LIVIN", "LONER", "LOOSE", "LOPPY", "LOSER", "LOTUS", "LOVED", "LOVER", "LOWER", "LUCKS", "LUNGS", "LUSTY", "LYRIC", "MACRO", "MAINE", "MAKES", "MALAY", "MALES", "MARCH", "MARES", "MARIE", "MARKS", "MARRI", "MARRY", "MARSH", "MATES", "MATHS", "MAYBE", "MAYOR", "MEALS", "MEANS", "MEATY", "MEDIC", "MEEKS", "MEETI", "MELOD", "MEOWS", "MERGE", "MERRY", "METAL", "METER", "METHS", "METRO", "MICKY", "MIDAS", "MIDDY", "MIDST", "MILES", "MILKS", "MINDS", "MINDY", "MINES", "MINOR", "MINUS", "MIRTH", "MISER", "MIXED", "MIXER", "MOANS", "MOATS", "MODEL", "MOJOS", "MOLDS", "MOMMA", "MONEY", "MONGO", "MONKS", "MONTH", "MOOSE", "MORAL", "MORON", "MOTHS", "MOTOR", "MOULD", "MOUSE", "MOUTH", "MOVES", "MOWED", "MULES", "MUMMY", "MURAL", "MUSIC", "MUTED", "MYTHS", "NAKED", "NAMES", "NANNY", "NAPPY", "NASTY", "NATAL", "NEARS", "NECKS", "NEEDS", "NENES", "NEONS", "NERDS", "NERVE", "NEVER", "NEWER", "NIGHT", "NINJA", "NIXON", "NOISE", "NORSE", "NOTED", "NOTES", "NOUNS", "NUDES", "NURSE", "NUTTY", "OBESE", "OCTET", "OFFER", "OILED", "OLIVE", "ONION", "ONSET", "ONTOO", "OPERA", "OPTIC", "ORBIT", "ORDEA", "ORGAN", "OTHER", "OUTER", "OVERT", "OXIDE", "PACKS", "PADRE", "PAGAN", "PAGES", "PAILS", "PAINS", "PAINT", "PALMS", "PANDA", "PANTS", "PAPER", "PARKS", "PARTY", "PASTE", "PASTS", "PATCH", "PATSY", "PAUSE", "PAVED", "PAWSY", "PEAKS", "PEELS", "PEERS", "PELES", "PENNY", "PENNY", "PERCY", "PERIL", "PETER", "PETTY", "PHASE", "PHOTO", "PIANO", "PICKS", "PIECE", "PIGGS", "PINKS", "PIZZA", "PLACE", "PLANE", "PLANS", "PLAST", "PLATE", "PLAZA", "PLIES", "PLUGS", "PLUMS", "PLUTO", "POETR", "POINT", "POOLS", "POUND", "POWER", "PRAWN", "PRESS", "PRICE", "PRIME", "PRINT", "PRISM", "PRIZE", "PROOF", "PROUD", "PROWL", "PULSE", "PUNCH", "PUPPY", "PURSE", "PUTTY", "PYRAM", "QUACK", "QUADS", "QUAIL", "QUAKE", "QUALM", "QUANT", "QUARK", "QUART", "QUICK", "QUIET", "QUILL", "QUOTA", "QUOTE", "RACER", "RACKS", "RAILS", "RAINS", "RALLY", "RAMPS", "RANCH", "RANDOM", "RANGE", "RANKS", "RAPID", "RATED", "RATES", "RAVEN", "RAVET", "RAVIS", "RAZOR", "REACH", "READS", "READY", "REALM", "REARM", "REARS", "REBEL", "REBUT", "RECAP", "RECKS", "RECYC", "REEDS", "REFIT", "REGAL", "REGIS", "RELAX", "RELAY", "RENEW", "RENSE", "REPLY", "RESIN", "RESOL", "RESOR", "RESTS", "RETRO", "REVEL", "REVEN", "REVER", "REVUE", "REXES", "RIDER", "RIDES", "RIFLE", "RIGHT", "RILES", "RILLS", "RINSE", "RISKS", "RITZY", "RIVER", "ROADS", "ROAST", "ROCKS", "ROGER", "ROLES", "ROMAN", "ROOKS", "ROOMS", "ROSES", "ROUGE", "ROUGH", "ROUND", "ROUTE", "ROVER", "ROWED", "ROYAL", "RUBYS", "RUGBY", "RULED", "RULES", "RUMOR", "RUNES", "RUNNY", "RUPEE", "RUSTY", "SABER", "SADLY", "SAFES", "SAINT", "SALEM", "SALTS", "SALTY", "SANDS", "SAUCE", "SAUCY", "SAVES", "SAWED", "SCALE", "SCARS", "SCARY", "SCENE", "SCENT", "SCHOL", "SCOPE", "SCORE", "SCOTS", "SCREW", "SCRIPT", "SCUBA", "SCULL", "SEALS", "SEATS", "SECTS", "SEDAN", "SEEDS", "SEEMS", "SENSE", "SERVE", "SETUP", "SEVEN", "SHAKE", "SHALL", "SHAME", "SHAPE", "SHARE", "SHARP", "SHAVE", "SHELF", "SHELL", "SHIFT", "SHINE", "SHIPS", "SHIRK", "SHIRT", "SHITK", "SHOES", "SHOTS", "SHOUT", "SHOWN", "SHOWS", "SHRED", "SHUTS", "SICKS", "SIDES", "SIGNS", "SILKS", "SILLY", "SINCE", "SINUS", "SITES", "SITTS", "SKATE", "SKELE", "SKIDS", "SKIES", "SKIRT", "SLAMS", "SLASH", "SLATE", "SLEEK", "SLEEP", "SLEPT", "SLIDE", "SLIME", "SLOTH", "SLOWE", "SLUMP", "SMALL", "SMART", "SMELL", "SMILE", "SMITH", "SMOKE", "SNACK", "SNAIL", "SNAKE", "SNAKY", "SNEAK", "SNEER", "SNIPE", "SNIPE", "SNOOP", "SNORE", "SNORT", "SNOWS", "SOARS", "SOBER", "SOCKS", "SODAS", "SOFAS", "SOFTY", "SOLAR", "SOLVE", "SONAR", "SONGS", "SOOTH", "SOUND", "SOURY", "SPACE", "SPADE", "SPARK", "SPEAK", "SPEED", "SPELL", "SPEND", "SPENT", "SPERM", "SPICE", "SPIES", "SPLIT", "SPOIL", "SPOON", "SPORT", "SPOTS", "SPRAW", "SPRAY", "SPURS", "STAGE", "STAGS", "STAKE", "STALK", "STALL", "STAND", "STARS", "STASH", "STATE", "STAYS", "STEEL", "STEER", "STEMS", "STEPS", "STERN", "STILL", "STINK", "STIRF", "STOCK", "STOMP", "STONE", "STOOL", "STORM", "STOUT", "STRIP", "STUCK", "STUDY", "STUMP", "STUNG", "STUNT", "STYLE", "SUBSO", "SUITS", "SULKS", "SUNNY", "SUNUP", "SUPER", "SWAMP", "SWANS", "SWAYS", "SWEAR", "SWEET", "SWIFT", "SWINE", "SWING", "SWISS", "SWORD", "SYRUP", "TABLE", "TACOS", "TANGO", "TAUNT", "TEAMS", "TEARS", "TEETH", "TELLS", "TENES", "TENTS", "TERMS", "THICK", "THIEF", "THINK", "THIRD", "THUMB", "THYME", "TIDES", "TIGER", "TIMER", "TITAN", "TITLE", "TOAST", "TOKEN", "TONES", "TOOLS", "TOOTH", "TORCH", "TOTAL", "TOUCH", "TOUGH", "TOWER", "TRACE", "TRACK", "TRACY", "TRADE", "TRAIL", "TRAIN", "TRAIT", "TRAMP", "TRAPS", "TRASH", "TRAYS", "TREAT", "TREES", "TRIBE", "TRICK", "TRIPS", "TROTS", "TROUT", "TUNES", "TURKS", "TURNP", "TWINE", "TWINS", "TYING", "ULTRA", "UNCLE", "UNDER", "UNIFY", "UNITS", "UNSEA", "UNTIL", "UNWED", "UPPER", "URINE", "USERS", "USHER", "UTTER", "VALID", "VALUE", "VEINS", "VENUS", "VIDEO", "VINES", "VIRAL", "VIRGO", "VIRUS", "VISIT", "VISTA", "VOCAL", "VOTES", "WAFER", "WAGES", "WAGON", "WALLS", "WALTS", "WANDS", "WARMS", "WASTE", "WATCH", "WATER", "WATTS", "WAVES", "WEARS", "WEARY", "WEAVE", "WEEKS", "WEIRD", "WHALE", "WHARF", "WHENEVER", "WHEREAS", "WHICHEVER", "WHILE", "WHISPER", "WHISTLE", "WHITE", "WHOEVER", "WHOMEVER", "WHOSE", "WHYEVER", "WIDOW", "WIDOWS", "WIDTH", "WINGS", "WINNER", "WINTER", "WISELY", "WISHES", "WOMAN", "WOMEN", "WONDER", "WONKY", "WOVEN", "WRATH", "WRIST", "WRITTEN", "WRONG", "WROTE", "YACHT", "YOUNG", "YUMMY", "ZEAL", "ZEBRA", "ZOOM", "ZOOS"};

	// Prompt user to enter a 5-letter word
	System.out.println("\nEnter a 5-letter word: ");
	in.nextLine();
	String word = in.nextLine().toUpperCase();

	// Output whether word is found using both linear and binary search
	System.out.println("Using linear search: ");
	searchWordLinear(wordleWords, word, false);
	System.out.println("Using binary search: ");
	searchWordBinary(wordleWords, word, false);

	// Question 5 - Determine whether inputted country is real
	String[] countries = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};

	// Gather name of country from user
	System.out.println("\nEnter a country: ");
	String country = in.nextLine();
	boolean isReal = determineCountry(countries, country, 0, countries.length - 1);

	// Output whether country exists or not based on whether user input is realistic or not
	if (isReal == true)
	{
		System.out.println("Country that user inputted exists.");
	}
	else
	{
		System.out.println("Country that user inputted does not exist.");
	}
		
	}

	// All subprograms
	// Question 1 and 4 Subprogram - Finding a value in a list using Linear Search
	public static void searchWordLinear(String[] names, String input, boolean isQuestion1)
	{
		int count = 0;
		boolean isFound = false;

		// Determine whether inputted value matches with any value in array
		for (int name = 0; name < names.length; name++)
		{
			count += 1;

			// Determine whether inputted user value matches with specific value in array
			if (names[name].equals(input))
			{
				isFound = true;
				break;
			}
			else
			{
				isFound = false;
			}

		}

		// Change output based on the question user is at
		if (isQuestion1 == true)
		{
			// Determine whether name is found in Question 1
			// If found, output how many times it took to find it
			if (isFound == true)
			{
				System.out.println("Name found after " + count + " iterations.");
			}
			else
			{
				System.out.println("Name not found. It took " + count + " iterations.");
			}
		}
		else
		{
			// Determine whether word is found in Question 4
			// If found, output how many times it took to find the word
			if (isFound == true)
			{
				System.out.println("Word found after " + count + " iterations.");
			}
			else
			{
				System.out.println("Word not found. It took " + count + " iterations.");
			}
		}
	}

	// Questions 2 and 4 Subprogram - Search through a list using Binary Search
	public static void searchWordBinary(String[] names2, String inputClass, boolean isQuestion2)
	{
		int start = 0;
		int end = names2.length - 1;
		boolean found = false;
		int countName = 0;

		// Check if indexed value in array is the same as inputted value until only 0 or 1 values are being looked at
		while (start <= end)
		{
			int mid = (start + end)/2;
			countName += 1;

			// Output statement depending on whether user is at question 2 or 4
			if (names2[mid].trim().equals(inputClass))
			{
				found = true;					
				
				// Output number of iterations it took to find person in array
				if (isQuestion2 == true)
				{
					System.out.println("Student is in class. \nName found after " + countName + " iterations.");
				}
				
				// Output number of iterations it took to find word in array
				else
				{
					System.out.println("Word found after " + countName + " iterations.");
				}
					
				break;
			}
				
			// Determine whether indexed value is after or before inputted value alphabetically
			// Halve the array further until value is found
			if (names2[mid].trim().compareTo(inputClass) > 0)
			{
				end = mid - 1;
			}
			
			if (names2[mid].trim().compareTo(inputClass) < 0)
			{
				start = mid + 1;
			}
		}

		// Output statement if value is not found
		if (found == false)
		{
			// Output statment depending on whether user is at question 2 or 4
			if (isQuestion2 == true)
			{
				System.out.println("Person is not in class. It took " + countName + " iterations.");
			}
			else
			{
				System.out.println("Word is not in array. It took " + countName + " iterations.");
			}
		}

	}

	// Question 3Subprogram - Get number of occurences of a number using Linear Search
	public static void getIntLinear(int [] randomIntegers, int number)
	{
		boolean foundNumberOnce = false;
		int countInt = 0;

		// Look at every single value in array to see if it matches with inputted number
		for (int num = 0; num < randomIntegers.length; num++)
		{
			// Determine whether indexed value in array matches with inputted number
			// Output the index it was found it
			if (randomIntegers[num] == number)
			{
				countInt += 1;
				foundNumberOnce = true;
				System.out.println("Number found at index " + num);
			}
		}

		// Determine whether number was found at all in array
		// If it was, output how many times it was found, and state that it was not found if otherwise
		if (foundNumberOnce == false)
		{
			System.out.println("Number not in array");
		}
		else
		{
			System.out.println("Number found " + countInt + " times.");
		}

	}

	// Question 5 Subprogram - Determine whether country that user inputted is real
	public static boolean determineCountry(String[]countries, String country, int startCount, int endCount)
	{
		
		// Output number of iterations completed no matter whether input is real or not
		// Base case - make sure starting index does not exceed ending index
		if (startCount <= endCount)
		{
			int midCount = (startCount + endCount) / 2;
			
			// Determine whether user input is real
			if (countries[midCount].compareTo(country) == 0)
			{
				return true;
			}

			// If user input does not match with indexed value, continue searching
			if (countries[midCount].compareTo(country) > 0)
			{
				return determineCountry(countries, country, startCount, midCount - 1);
			}
			
			if (countries[midCount].compareTo(country) < 0)
			{
				return determineCountry(countries, country, midCount + 1, endCount);
			}
		}

		return false;
	}

}