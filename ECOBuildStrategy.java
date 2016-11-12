package com.meetup.3DPrinter.Refactored;

public class ECOBuildStrategy implements 3DPrintStrategy{

  public Building build(){

       3DPrintedBuilding ecoBuilding = 3DPrintedBuilding.createstandard3DPrintedbuilding();
       3DPrinter printer = new 3DPrinter();
       ecoBuilding = printer.setUpPrint(rccBuilding);
       ecoBuilding.makeEcoFriendly();
       //Really?
       ecoBuilding.buildExecute();
       return ecoBuilding;
  }

   public Building setUpPrint(3DPrintedBuilding rccBuilding){

       ecoBuilding.setBuilder(BuilderType.ECO);
       ecoBuilding.setBuilderSpec(BuilderSpecs.ECO_DEFAULT);
       ecoBuilding.setBuilderSpeed(BuilderSpeed.STEADY);
       setBuildingMaterial(addBuilderMaterials(new List<BuildingMaterial>(Material.FLYASH,Material.WOOD,Material.SAND_ECO));
       setFloorMaterial(FloorMaterials.CEMENT_PAINT);

   }
}
