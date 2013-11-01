package galaxy.legion.tool;

/**
 * The Object of shipmodule.
 * @author Mads Ljungberg
 */
public class ShipModule {

	private final String moduleName;
	private final int attack;
	private final int defence;
	private final int scan;
	private final int cloak;
	private final int hull;
	private final int shield;
	private final int size;
	private final int upgradeTier;
	private final Boolean isUpgradeable;
	private double moduleScore;

    /**
     * The constructor for creation of object ShipModules.
     * @param moduleName
     * @param attack
     * @param defence
     * @param scan
     * @param cloak
     * @param hull
     * @param shield
     * @param size
     * @param upgradeTier
     * @param isUpgradeable
     */
    public ShipModule(String moduleName, int attack, int defence, int scan, int cloak, int hull
					, int shield, int size, int upgradeTier
					, Boolean isUpgradeable ) /**will only take it for one of them need array and assignment.*/
	{
		
		this.moduleName = moduleName;
	 	this.attack = attack;
	 	this.defence = defence;
	 	this.scan = scan;
	 	this.cloak = cloak;
	 	this.hull = hull;
	 	this.shield = shield;
	 	this.size = size;
	 	this.upgradeTier = upgradeTier;
	 	this.isUpgradeable = isUpgradeable;
	 	//get_Modulescore();
		
	}

//	public void createShipModule(String tModuleName, int tAttack, int tDefence							, int tScan, int tCloak, int tHull
//								  , int tShield, int tSize, int tUpgradeTier
//								  , Boolean tIsUpgradeable )
//	{
//		moduleName = tModuleName;
//	 	attack = tAttack;
//	 	defence	= tDefence;
//	 	scan = tScan;
//	 	cloak = tCloak;
//	 	hull = tHull;
//	 	shield = tShield;
//	 	size = tSize;
//	 	upgradeTier	= tUpgradeTier;
//	 	isUpgradeable = tIsUpgradeable;
//	}

//	public void createModuleList() //useless
//	{
//		createShipModule("GOD", 20, 0, 0, 0, 0, 0, 10, 1 , false);
//		createShipModule("GOD1", 40, 0, 0, 0, 0, 0, 10, 1 , false);
//	}
	
        /**
         * Returns the attack size ratio/avg.
         * @return double number.
         */
	public double attSizeAvg()
	{
            return attack / size;
	}
        
        /**
         * Returns the defence size ratio/avg.
         * @return double number.
         */
	public double defSizeAvg()
	{
            return defence / size;
	}
        
        /**
         * Returns the scan size ratio/avg.
         * @return double number.
         */
	public double scaSizeAvg()
	{
            return scan / size;
	}

        /**
         * Returns the cloak size ratio/avg.
         * @return double number.
         */
	public double cloSizeAvg()
	{
            return cloak / size;
	}

        /**
         * Returns the hull size ratio/avg.
         * @return double number.
         */
	public double hullSizeAvg()
	{
            return hull / size;
	}

        /**
         * Returns the shield size ratio/avg.
         * @return double number.
         */
	public double shieldSizeAvg()
	{
            return shield / size;
	}

        /**
         * Returns the ratio/avg of all the modules averages.
         * @return double modulescore. 
         */
	public double get_Modulescore()
	{
		
            return moduleScore = (attSizeAvg() + defSizeAvg() + scaSizeAvg() + cloSizeAvg() + hullSizeAvg() + shieldSizeAvg());  
		//if (isUpgradeable == true)
		//{moduleScore = moduleScore + 20})
	}
}