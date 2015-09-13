package sql;

import junit.framework.TestCase;

/**
 * Created by Ray on 2015/9/13.
 * test sqlutils
 */
public class SqlUtilsTest extends TestCase {

    public void testGet() throws Exception {
        String sql = SqlUtils.get("select * from coreusercard where userno = '?' and znkh = '?'", "12138", "3333333333333");
        System.out.println(sql);
    }
}