import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dtvikey
 * @Date: 18-11-5 下午4:16
 * @Version 1.0
 */
public class Test {

    private JdbcTemplate jdbcTemplate;
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }


    public void testExecute(){

        jdbcTemplate.execute("create table user1(id int,name varchar (20))");

    }

    @org.junit.Test
    public void testUpdate(){
        String sql = "insert into student(name,sex) values(?,?)";
        jdbcTemplate.update(sql,new Object[]{"张飞","男"});
    }

    @org.junit.Test
    public void testUpdate2(){
        String sql = "update student set sex=? where id=?";
        jdbcTemplate.update(sql,"女",1);
    }

    @org.junit.Test
    public void testBatchUpdate(){
        String[] sqls = {
                "insert into student(name,sex) values('关羽','女')",
                "insert into student(name,sex) values('刘备','男')",
                "update student set sex='男' where id=2"
        };

        jdbcTemplate.batchUpdate(sqls);
    }

    @org.junit.Test
    public void testBatchUpdate2(){

        String sql = "insert into selection(student,course) values(?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{2,1001});
        list.add(new Object[]{2,1003});
        jdbcTemplate.batchUpdate(sql,list);

    }

}
