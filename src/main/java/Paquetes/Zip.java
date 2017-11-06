package Paquetes;

import AGj.compressor.Data;
import Compressor.Compressor;

public class Zip implements Compressor{
  public Data compress (Data data) {
    return new Data("ZIP -"+ data.getData());
  }

}
