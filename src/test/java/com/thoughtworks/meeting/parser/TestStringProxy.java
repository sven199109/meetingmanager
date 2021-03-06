package com.thoughtworks.meeting.parser;

import com.thoughtworks.meeting.parser.LightningParser;
import com.thoughtworks.meeting.parser.MinuteParser;
import com.thoughtworks.meeting.parser.StringParserException;
import com.thoughtworks.meeting.parser.StringProxy;
import com.thoughtworks.meeting.event.Event;
import junit.framework.TestCase;

/**
 * Created by sven on 14-12-25.
 */
public class TestStringProxy extends TestCase {
    public void testStringParser(){
        StringProxy sp = new StringProxy(new MinuteParser(),"first 11min");
        assertNotNull(sp.getEvent().getName());
        StringProxy sp2 = new StringProxy(new LightningParser(),"ads lightning");
        assertNotNull(sp2.getEvent().getName());
        StringProxy sp3;
        try{
            sp3 = new StringProxy(new MinuteParser(),"ads dfsa");
            assertNotNull(sp3.getEvent());
        }catch (Exception e){
            assertTrue(e instanceof NullPointerException);
            //assertTrue(e.getMessage().contains("invalid"));
        }
    }
}
