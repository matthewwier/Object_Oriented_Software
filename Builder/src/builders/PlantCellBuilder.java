package builders;

import organelles.CellWall;
import organelles.Chloroplasts;
import organelles.PlantVacuoles;

public class PlantCellBuilder extends CellBuilder{

    PlantCellBuilder(){
        super();
    }

    public PlantCellBuilder setCellWall(boolean cellWall) {
        if (cellWall) {
            organelleList.add(new CellWall());
        }
        return this;
    }

    public PlantCellBuilder setChloroplasts(boolean chloroplasts){
        if(chloroplasts){
            organelleList.add(new Chloroplasts());
        }
        return this;
    }

    public PlantCellBuilder setPlantVacuoles(boolean plantVacuoles){
        if(plantVacuoles){
            organelleList.add(new PlantVacuoles());
        }
        return this;
    }
}
