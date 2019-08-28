public class StringUtils {
  /*
   * Program to reverse string using recursion
   */
  public static String reverse(String string) {
    if (string.isEmpty())
      return string;
    return reverse(string.substring(1)) + string.charAt(0);
  }
}
