# cartesian-set

A faster and simple cartesian product takes less member space.

## example

```java
class test {

    @Test
    public void test4D() {
        Character[][] matrix = new Character[4][];
        matrix[0] = new Character[] {'a', 'b', 'c', 'd', 'e'};            // length = 5
        matrix[1] = new Character[] {'h', 'i', 'j', 'k'};                 // length = 4
        matrix[2] = new Character[] {'u', 'v', 'w', 'x', 'y', 'z'};       // length = 6
        matrix[3] = new Character[] {'0', '1', '2', '3', '4', '5', '6'};  // length = 7

        CartesianSet<Character> cs = new CartesianSet<>(matrix);
        long count = cs.getCount();
        Assert.assertEquals(5 * 4 * 6 * 7, count);

        for (int i = 0; i < count; i++) {
            List<Character> row = cs.get(i);
            System.out.println(join(row));
        }
    }

}
```