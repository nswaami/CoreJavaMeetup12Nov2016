package com.meetup.3DPrinter.Raw;



public class 3DPrintedBuilding extends Building{

        Dimension height;
        Dimension width;
        HouseType houseType;
        Area builtup;
        Area plinth;
        Integer numFloors;


        public 3DPrintedBuilding(){
          super();
        }

        //Catch-all  Constructor
        public 3DPrintedBuilding(Dimension h, Dimension w, HoustType type, Area built, Area plinth, Integer numFloors){
            Height = h;
            Width = w;
            houseType = type;
            builtup = builtup;
            plinth = plinth;
            numFloors = numFloors;

        }

        public 3DPrintedBuilding(Dimension h, Dimension w)
        {
            height = h;
            width = w;

        }

        public 3DPrintedBuilding(Dimension h, Dimension w,Area built, Area plinth)
        {
            height = h;
            width = w;
            built = built;
            plinth = plinth;
        }

        //creation method for standard design
        public 3DPrintedBuilding createstandard3DPrintedbuilding(){
            height = new height("30",dimensionunits.metre);
            width = new width("20",dimensionunits.metre);
            type = 3DPrintedTypes.STANDARD;
            builtup = new area("1900",areaunits.sqft);
            plinth = new area("2400",areaunits.sqft);
            numFloors = 1;
            return this(height, width, type, builtup, plinth, numFloors);

        }

        //creation method for multiple floors
        public 3DPrintedBuilding createMultiStoreyed(int floors){
           3DPrintedBuilding building = createstandard3DPrintedbuilding();
           building.numFloors = floors;
           //add other details

        }


        //creation method
        public create3dprinted1floorbuildingstandardarea(housetype type){
            createstandard3dprintedbuilding();
            housetype = type;
        }


        public 3dprintedhouse print3dhouse() {
            if (houseType.equals(HouseType.SINGLE_FLOOR)){
             floors = Floors.SINGLE;
             numfloors = 1;
             foundationdigfactor = FoundationDigger.FACTOR_ONE;;
             pillarStrength = PillarStrength.FACTOR_TWO;
        }

        if (housetype.equals(Housetype.MULTIPLE_FLOOR)){
        floors = Floors.MULTIPLE;
        numFloors = 2;
        foundationDigFactor = getFoundationDig(numFloors);
        pillarStrength = PillarStrength.FACTOR_TWO;
        }
    }
}
