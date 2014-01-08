import java.io.*;
public class spellsMenu {
    
    public void Menu()
            throws IOException
{
                        Skills Skills = new Skills();
                        int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
                            	System.out.println("");
				System.out.println("Skills.");
				System.out.println("What Would You Like To View?");
				System.out.println("");
				System.out.println("1:Spells, 2:Feats, 3:Skills, 4:About, 5:Quit");
				System.out.println("");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1:
							  break;
					case 2:
							  break;
					case 3:
					  		  break;
                                        case 4:
                                                          break;
					case 5: 
							  break;
					case 6: Menu.menu();
					  break;
				}
			}while(option!=0);
                }
	}
    
