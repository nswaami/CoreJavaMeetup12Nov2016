package com.meetup.3DPrinter

public class 3DPrinter extends Printer{

  public Building build(){

     if (buildingType = BuildingTypes.RCC){
       setBuilder(BuilderType.RCC);
       setBuilderSpec(BuilderSpecs.SPEC_RCC_DEFAULT);
       setBuilderSpeed(BuilderSpeed.STANDARD);
       setBuildingMaterial(addBuilderMaterials(Material.BRICKS,Material.CEMENT,Material.SAND_STANDARD));
       setFloorMaterial(FloorMaterials.MARBLE);
       setPaintingType(Paints.STANDARD);
     }

     if (buildingType = BuildingTypes.ECO){
       setBuilder(BuilderType.ECO);
       setBuilderSpec(BuilderSpecs.SPEC_ECO_DEFAULT);
       setBuilderSpeed(BuilderSpeed.STEADY);
       setBuildingMaterial(addBuilderMaterials(Material.FLYASH,Material.WOOD,Material.SAND_ECO));
       setFloorMaterial(FloorMaterials.CEMENT_PAINT);
     }

  }

}
