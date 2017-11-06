package Paquetes;

import AGj.compressor.Data;
import Compressor.Compressor;

public class Rar implements Compressor{
  public Data compress (Data data) {
    return new Data("RAR -"+ data.getData());
  }

}
