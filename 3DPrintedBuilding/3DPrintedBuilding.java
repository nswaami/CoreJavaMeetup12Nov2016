public class 3DPrintedBuilding{

        Dimension height;
        Dimension width;
        HouseType houseType;
        Area builtup;
        Area plinth;


        public 3DPrintedBuilding(){

        }

        //Full-On Constructor
        public 3DPrintedBuilding(Dimension h, Dimension w, HoustType type, Area built, plinth){
            Height = h;
            Width = w;
            houseType = type;
            builtup = builtup;
            plinth = plinth

        }

        //creation method for Standard Design
        public createStandard3DPrintedBuilding(){
            height = new Height("30",DimensionUnits.METRE);
            width = new Width("20",DimensionUnits.METRE);
            builtup = new Area("1900",AreaUnits.SQFT);
            plinth = new Area("2400",AreaUnits.SQFT)

        }


        //creationMethod
        public create3DPrinted1FloorBuildingStandardArea(HouseType type){
            createStandard3DPrintedBuilding();
            HouseType = type;
        }

 }
