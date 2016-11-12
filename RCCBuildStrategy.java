package com.meetup.3DPrinter.Refactored

public class RCCBuildStrategy implements 3DPrintStrategy{

  public Building build(){

       3DPrintedBuilding rccBuilding = 3DPrintedBuilding.createstandard3DPrintedbuilding();
       3DPrinter printer = new 3DPrinter();
       rccBuilding = printer.setUpPrint(rccBuilding);
       printer.buildExecute();
       return rccBuilding;
  }

   public Building setUpPrint(3DPrintedBuilding rccBuilding){

       rccBuilding.setBuilder(BuilderType.RCC);
       rccBuilding.setBuilderSpec(BuilderSpecs.SPEC_RCC_DEFAULT);
       rccBuilding.setBuilderSpeed(BuilderSpeed.STANDARD);
       rccBuilding.setBuildingMaterial(
       addBuilderMaterials(new List<BuildingMaterial>(Material.BRICKS,Material.CEMENT,Material.SAND_STANDARD));
       rccBuilding.setFloorMaterial(FloorMaterials.MARBLE);
       rccBuilding.setPaintingType(Paints.STANDARD);

   }
}
