import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {
  @Test

  public void testReversal() {
    assertEquals("cba", StringUtils.reverse("abc"));
    assertEquals("beyohs", StringUtils.reverse("shoyeb"));
    assertEquals("esrever", StringUtils.reverse("reverse"));
    assertEquals("gnirts siht esrever", StringUtils.reverse("reverse this string"));
  }
}
