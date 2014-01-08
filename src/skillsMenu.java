import java.io.*;
public class skillsMenu {
    
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
				System.out.println("1:Appraise, 2:Balance, 3:Bluff, 4:Climb, 5:Concentration, 6:Craft");
				System.out.println("7:Decipher Script, 8:Diplomacy, 9:Disable Device, 10: Disguise");
                                System.out.println("11:Escape Artist, 12: Forgery, 13:Gather Information, 14: Handle Animal");
                                System.out.println("15:Heal, 16:Hide, 17:Intimidate, 18:Jump, 19:Knowledge, 20:Listen");
                                System.out.println("21:Move Silently, 22:Open Lock, 23:Perform, 24:Profession, 25:Ride");
                                System.out.println("26:Search, 27:Sense Motive, 28:Sleight Of Hand, 29:Speak Language");
                                System.out.println("30:Spellcraft, 31:Spot, 32:Survival, 33:Swim, 34:Tumble");
				System.out.println("35:Use Magic Device, 36:Use Rope");
                                System.out.println("37: Main Menu");
                                
                                
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: Skills.Appraise();
							  break;
					case 2: Skills.Balance();
							  break;
					case 3: Skills.Bluff();
					  		  break;
                                        case 4: Skills.Climb();
                                                          break;
					case 5: Skills.Concentration();
							  break;
					case 6: Skills.Craft();
                                                          break;
                                        case 7: Skills.DecipherScript();
							  break;
					case 8: Skills.Diplomacy();
							  break;
					case 9: Skills.DisableDevice();
					  		  break;
                                        case 10: Skills.Disguise();
                                                          break;
					case 11: Skills.EscapeArtist();
							  break;
					case 12: Skills.Forgery();
                                                          break;
                                        case 13: Skills.GatherInformation();
							  break;
					case 14: Skills.HandleAnimal();
							  break;
					case 15: Skills.Heal();
					  		  break;
                                        case 16: Skills.Hide();
                                                          break;
					case 17: Skills.Intimidate();
							  break;
					case 18: Skills.Jump();
                                                          break;
                                        case 19: KnowledgeMenu();
							  break;
					case 20: Skills.Listen();
							  break;
					case 21: Skills.MoveSilently();
					  		  break;
                                        case 22: Skills.OpenLock();
                                                          break;
					case 23: Skills.Perform();
							  break;
					case 24: Skills.Profession();
                                                          break;
                                        case 25: Skills.Ride();
							  break;
					case 26: Skills.Search();
							  break;
					case 27: Skills.SenseMotive();
					  		  break;
                                        case 28: Skills.SleightOfHand();
                                                          break;
					case 29: Skills.SpeakLanguage();
							  break;
					case 30: Skills.Spellcraft();
                                                          break;
                                        case 31: Skills.Spot();
							  break;
					case 32: Skills.Survival();
							  break;
					case 33: Skills.Swim();
					  		  break;
                                        case 34: Skills.Tumble();
                                                          break;
					case 35: Skills.UseMagicDevice();
							  break;
					case 36: Skills.UseRope();
                                                          break;
                                        case 37: Menu.menu();
							  break;
					
				}
			}while(option!=0);
                }
    
    public void KnowledgeMenu()
            throws IOException
{
                        Skills Skills = new Skills();
                        int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
                            	System.out.println("");
				System.out.println("Knowledge.");
				System.out.println("What Would You Like To View?");
				System.out.println("");
				System.out.println("1:Arcana, 2:Architechture & Engineering, 3:Dungeoneering");
                                System.out.println("4:Geography, 5:History, 6:Local, 7:Nature, 8:Nobility & Royal");
                                System.out.println("9:Religion, 10:The Planes, 11:Back To Skills Menu, 12:Back T oMain Menu");
				System.out.println("");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: Skills.ArcanaKnowledge();
							  break;
					case 2: Skills.ArchitectureEngineeringKnowledge();
							  break;
					case 3: Skills.DungeoneeringKnowlegde();
					  		  break;
                                        case 4: Skills.GeographyKnowledge();
                                                          break;
					case 5: Skills.HistoryKnowledge();
							  break;
					case 6: Skills.LocalKnowledge();
                                                          break;
                                            
                                        case 7: Skills.NatureKnowledge();
							  break;
					case 8: Skills.NobilityRoyalKnowledge();
							  break;
					case 9: Skills.ReligionKnowlegde();
					  		  break;
                                        case 10: Skills.PlanesKnowledge();
                                                          break;
					case 11: Menu();
							  break;
					case 12: Menu.menu();
					  break;
				}
			}while(option!=0);
                }
    
	}
    

