import java.io.*;
public class Spells {

	public void Menu()
        throws IOException
{
                        int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
				System.out.println("Welcome To The Dungeons & Dragons V3.5 Database App.");
				System.out.println("What Would You Like To View?");
				System.out.println("");
				System.out.println("1:Spells, 2:Feats, 3:Skills, 4:About, 5:Quit");
				System.out.println("");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: System.out.println("Spells Selection 1");
							  break;
                                            
					case 2: System.out.println("Spells Selection 2");
							  break;
                                            
					case 3: System.out.println("Spells Selection 3");
					  		  break;
                                            
                                        case 4: System.out.println("Spells Selection 4");
                                                          break;
                                            
					case 5: System.out.println("Spells Selection 5");
							  break;
                                            
					case 6: System.exit(0);
					  break;
				}
			}while(option!=0);
                }
	}