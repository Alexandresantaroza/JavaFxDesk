package testeJUnit;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import loginiti.ValidaSenha;

class ValidaSenhaTest extends TestCase {

	ValidaSenha vs = new ValidaSenha();
	
	@Test
	public void testValida() { 
        assertEquals(true, vs.valida("As3@!&oiuytgh")); 
        assertEquals(false, vs.valida("Asd@!&oiuytgh"));
        assertEquals(false, vs.valida("AAs3@!&oiuytgh"));
        assertEquals(false, vs.valida("ws3@!&oiuytgh"));
        assertEquals(false, vs.valida("us3@!&oiuLytgh"));
        assertEquals(true, vs.valida("qwertyU7#")); 
        assertEquals(false, vs.valida(""));
        assertEquals(false, vs.valida("fuifui"));
        assertEquals(false, vs.valida("ASDf578mnbv"));
        assertEquals(false, vs.valida("...."));
    }
	

}
