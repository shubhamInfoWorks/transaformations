package io.infoworks.examples;

import java.io.Serializable;
import java.util.function.Function;

public class SSNMask implements Function<String, String>, Serializable {

  public String apply(String unTransformed) {
    if (unTransformed == null) {
      return null;
    }
    return "****" + unTransformed.substring(4);
  }

  public static void main(String[] args) {
    SSNMask ssnMask  = new SSNMask();
    System.out.println(ssnMask.apply("12345657890"));
  }
}
