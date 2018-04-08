import ljs.autocode.AutoCode;
import org.junit.Test;

public class AutoCodeTest {
    AutoCode autoCode = new AutoCode();

    @Test
    public void autoCodePLM() throws Exception {
        autoCode.run("plm");
    }

    @Test
    public void autoCodeBaoCheHui() throws Exception {
        autoCode.run("baochehui");
    }

    @Test
    public void autoCodeTraining() throws Exception {
        autoCode.run("training");
    }

    @Test
    public void autoSpringSecurity() throws Exception {
        autoCode.run("spring_security");
    }
}
