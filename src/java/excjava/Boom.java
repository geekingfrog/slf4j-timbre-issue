import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class Boom {

  private static final Log LOG = LogFactory.getLog(Boom.class);

  public static String yo(String in) throws Exception {
    try {
      LOG.info("yo with input " + in);
      return sup(in);
    } catch (Exception e) {
      LOG.error("Got an exception: ", e);
      throw e;
    }
  }

  private static String sup(String in) throws Exception {
    throw new Exception("SupBoom" + in);
  }
}
