package ljs.shell;

import ljs.exception.KnowException;
import ljs.task.ThreadUtil;
import org.junit.Test;

public class ShellListenerTest {
    @Test
    public void test() throws KnowException {
        Shell.newShell(new ShellListener() {
            @Override
            public void onCreated(String msg) {
                System.out.println("created:" + msg);
            }

            @Override
            public void onCreateFail(String error) {
                System.out.println("create fail:" + error);
            }
        });
        ThreadUtil.wait(this);
    }

    @Test
    public void winTest() throws KnowException {
        Shell.newShell("GBK", new ShellListener() {
            @Override
            public void onCreated(String msg) {
                System.out.println("created:" + msg);
            }

            @Override
            public void onCreateFail(String error) {
                System.out.println("create fail:" + error);
            }
        });
        ThreadUtil.wait(this);
    }
}
