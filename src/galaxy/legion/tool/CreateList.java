package galaxy.legion.tool;

import java.util.ArrayList;
/**
 * Write a description of class CreateList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateList
{

    /**
     * Array of shipmodules the original unsorted list.
     */
    public ArrayList<ShipModule> modules;

    /**
     * Array of shipmodules the sorted list.
     */
    public ArrayList<ShipModule> sorted;

    /**
     * Add all the shipmodules to the original list so to say create it.
     */
    public void CreateList()
    {
        modules = new ArrayList<>();
        modules.add(new ShipModule("GOD", 20, 0, 0, 0, 0, 0, 10, 1 , false));
        modules.add(new ShipModule("GOD1", 100, 0, 0, 0, 0, 0, 10, 1 , false));
        modules.add(new ShipModule("GOD2", 70, 0, 0, 0, 0, 0, 10, 1 , false));
        modules.add(new ShipModule("GOD3", 90, 0, 0, 0, 0, 0, 10, 1 , false));
        
        
    }

    /**
     * Methode to sort the list after highest modulescore and adds it to the arralist sorted.
     */
    public void sortList() // throws null pointer if called without CreateList() first.
    {
        sorted = new ArrayList<>();
            for (int i = 0; i < modules.size(); i++)
                {
                    int highest = -1;
                    //int k;
                 
                    for (int j = 0; j < modules.size(); j++)
                    {
                     
                        int k = 0;
                        while(modules.get(i).get_Modulescore() > modules.get(j).get_Modulescore() && k < modules.size())
                        {
                            highest = i;
                            //sorted.size()+1
                            k++;
                        }
                     
                    }
                    if (highest >= i)
                    {
                        System.out.println( "size:  " + sorted.size());
                        System.out.println( "highest:  " + highest);
                        sorted.add((modules.get(highest)));//treemap ? muligvis en nemmere løsning. 
                        //skal have en måde at sætte dem ind på plads startende med 0
                        //System.out.println(modules.get(i).get_Modulescore());
                    }
                }

                System.out.println(sorted.size()+1);
                //modules.get(0).get_Modulescore();
                //ShipModule.attSizeAvg();
            }

}