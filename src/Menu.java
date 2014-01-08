import java.io.*;
public class Menu {

	public static void main(String[] args)
            throws IOException
		{
			spellsMenu spellsMenu = new spellsMenu();
			featsMenu featsMenu = new featsMenu();
			skillsMenu skillsMenu = new skillsMenu();
                        referenceMenu referenceMenu = new referenceMenu();
			int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
				System.out.println("Welcome To The Dungeons & Dragons V3.5 Database App.");
				System.out.println("What Would You Like To View?");
				System.out.println("");
				System.out.println("1:Spells, 2:Feats, 3:Skills, 4 Reference; 5:About, 6:Quit");
				System.out.println("");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: spellsMenu.Menu();
							  break;
					case 2: featsMenu.Menu();
							  break;
					case 3: skillsMenu.Menu();
					  		  break;
                                        case 4: referenceMenu.Menu();
                                                          break;
					case 5: System.out.println("The Dungeons & Dragons Database is built for rule set 3.5 " +
							"only. Copyright Declan McGeachey 2013");
							System.out.println("");
							  break;
					case 6: System.exit(0);
					  break;
				}
			}while(option!=0);
                
                }
        
        
        public static void menu()
		throws IOException
		{
			spellsMenu spellsMenu = new spellsMenu();
			featsMenu featsMenu = new featsMenu();
			skillsMenu skillsMenu = new skillsMenu();
                        referenceMenu referenceMenu = new referenceMenu();
			int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
				System.out.println("Welcome To The Dungeons & Dragons V3.5 Database App.");
				System.out.println("What Would You Like To View?");
				System.out.println("");
				System.out.println("1:Spells, 2:Feats, 3:Skills, 4 Reference; 5:About, 6:Quit");
				System.out.println("");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: spellsMenu.Menu();
							  break;
					case 2: featsMenu.Menu();
							  break;
					case 3: skillsMenu.Menu();
					  		  break;
                                        case 4: referenceMenu.Menu();
                                                          break;
					case 5: System.out.println("The Dungeons & Dragons Database is built for rule set 3.5 " +
							"only. Copyright Declan McGeachey 2013");
							System.out.println("");
							  break;
					case 6: System.exit(0);
					  break;
				}
			}while(option!=0);
                }

}


