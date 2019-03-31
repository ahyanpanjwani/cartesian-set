package net.ruiqi.collection;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * cartesian
 *
 * @author ruiqi.zss
 * @date 2019/3/28
 */
public class CartesianSetTest {

    private char[] join(List<Character> characters) {
        char[] chars = new char[characters.size()];
        for (int i = 0; i < characters.size(); i++) {
            chars[i] = characters.get(i);
        }
        return chars;
    }

    @Test
    public void test3D() {
        Character[][] matrix = new Character[3][];
        matrix[0] = new Character[] {'a', 'b', 'c', 'd', 'e'};        // length = 5
        matrix[1] = new Character[] {'h', 'i', 'j', 'k'};             // length = 4
        matrix[2] = new Character[] {'u', 'v', 'w', 'x', 'y', 'z'};   // length = 6

        CartesianSet<Character> cs = new CartesianSet<Character>(matrix);
        long count = cs.getCount();
        Assert.assertEquals(5 * 4 * 6, count);

        for (int i = 0; i < count; i++) {
            List<Character> row = cs.get(i);
            System.out.println(join(row));
        }
    }

    @Test
    public void test4D() {
        Character[][] matrix = new Character[4][];
        matrix[0] = new Character[] {'a', 'b', 'c', 'd', 'e'};            // length = 5
        matrix[1] = new Character[] {'h', 'i', 'j', 'k'};                 // length = 4
        matrix[2] = new Character[] {'u', 'v', 'w', 'x', 'y', 'z'};       // length = 6
        matrix[3] = new Character[] {'0', '1', '2', '3', '4', '5', '6'};  // length = 7

        CartesianSet<Character> cs = new CartesianSet<Character>(matrix);
        long count = cs.getCount();
        Assert.assertEquals(5 * 4 * 6 * 7, count);

        for (int i = 0; i < count; i++) {
            List<Character> row = cs.get(i);
            System.out.println(join(row));
        }
    }
}
