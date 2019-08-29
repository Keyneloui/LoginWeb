package day;

import java.sql.Connection;

import org.junit.Test;

import com.revature.day.util.ConnectionUtil;

import junit.framework.TestCase;

public class ConnectionUtilTest extends TestCase {
	  @Test
	    public void testConnection() {
	        Connection connection = ConnectionUtil.getConnection();
	        assertNotNull(connection);
	    }
}
