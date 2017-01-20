import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class Boom {

  private static final Log LOG = LogFactory.getLog(Boom.class);

  public static void boom() throws Exception {
    try {
      throw new Exception("Boom");
    } catch (Exception e) {
      LOG.error("Got an exception: ", e);
    }
  }
}
