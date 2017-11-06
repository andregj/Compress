package AGj.compressor;

public class Zip implements Compressor{
  public Data compress (Data data) {
    return new Data("ZIP -"+ data.getData());
  }

}
