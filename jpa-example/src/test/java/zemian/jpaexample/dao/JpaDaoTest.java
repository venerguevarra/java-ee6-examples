/*
 *  Zemian Deng 2014
 */

package zemian.jpaexample.dao;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import zemian.jpaexample.data.User;

/**
 *
 * @author zedeng
 */
public class JpaDaoTest {
    @Test
    public void testOnDemandEntityDao() {
        // TODO: we need EM injection!
        JpaDao<User> userDao = new JpaDao<>();
        userDao.setEntityClass(User.class); // Depend on how you use EM, you may or may not need this.
        User user = userDao.getEntityManager().find(User.class, "zemian");
        Assert.assertThat(user, CoreMatchers.notNullValue());
    }
}
