package service.impl;

import org.example.service.StringList;
import org.example.service.impl.StringListImpl;
import org.junit.Assert;
import org.junit.Test;



public class StringListImplTest {
    private final StringList stringList = new StringListImpl(3);
    @Test
    public void shouldAddItem() {
        //given
        String[] stringList2 = {"один", "два", "три"};
        //when
        stringList.add("один");
        stringList.add("два");
        stringList.add("три");
        //then
        Assert.assertEquals(stringList2, stringList);
    }
    @Test
    public void ShouldGetItem() {
        //given
        String string = "три";
        stringList.add("один");
        stringList.add("два");
        stringList.add("три");
        //when
        //then
        Assert.assertEquals(string, stringList.get(2));
    }
    @Test
    public void shouldAddItemByIndex() {
        //given
        String string0 = "один";
        String string1 = "два";
        String string2 = "три";
        //when
        stringList.add(0,"один");
        stringList.add(1, "два");
        stringList.add(2, "три");
        //then
        Assert.assertEquals(string0, stringList.get(0));
        Assert.assertEquals(string1, stringList.get(1));
        Assert.assertEquals(string2, stringList.get(2));
    }
    @Test
    public void shouldSetItemByIndex() {
        //given
        String string0 = "один";
        String string1 = "четыре";
        String string2 = "три";

        stringList.add(0,"один");
        stringList.add(1, "два");
        stringList.add(2, "три");
        //when
        stringList.set(1,"четыре");
        //then
        Assert.assertEquals(string0, stringList.get(0));
        Assert.assertEquals(string1, stringList.get(1));
        Assert.assertEquals(string2, stringList.get(2));
    }

}
