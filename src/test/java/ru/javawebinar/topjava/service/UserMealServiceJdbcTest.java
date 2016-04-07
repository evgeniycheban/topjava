package ru.javawebinar.topjava.service;

import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;

@ActiveProfiles({Profiles.POSTGRES, Profiles.JDBC})
public class UserMealServiceJdbcTest extends AbstractUserMealServiceTest {
    @Override
    @Test(expected = UnsupportedOperationException.class)
    public void testFindWithOwner() throws Exception {
        super.testFindWithOwner();
    }
}
