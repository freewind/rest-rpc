package first.haxe

class FirstHaxeTest extends haxe.unit.TestCase {


    public function testBasic(){
        FirstHaxe firstHaxe = new FirstHaxe();
        assertEquals(firstHaxe.add(2,3), 5);
        assertEquals( "A", "A" );
    }
}