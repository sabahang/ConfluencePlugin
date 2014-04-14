package ut.com.sabahang.webitemz;

import org.junit.Test;
import com.sabahang.webitemz.MyPluginComponent;
import com.sabahang.webitemz.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}