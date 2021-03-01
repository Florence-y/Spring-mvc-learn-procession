package connecttest;

import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

public class UserDaoTest {
    @Test
    public void testConnect(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        System.out.println(mapper.getAllUsers());
    }
}
