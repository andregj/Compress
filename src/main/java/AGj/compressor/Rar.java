package AGj.compressor;

public class Rar implements Compressor{
  public Data compress (Data data) {
    return new Data("RAR -"+ data.getData());
  }

}
