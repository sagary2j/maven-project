package com.example;

/**
 * This is a class.
 */
@SuppressWarnings("JavaDoc")
class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *
   * @param someone at
   * @return
   */

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
