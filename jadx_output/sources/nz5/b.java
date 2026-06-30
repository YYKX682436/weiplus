package nz5;

/* loaded from: classes12.dex */
public abstract class b {
    public static java.lang.Thread a(boolean z17, boolean z18, java.lang.ClassLoader classLoader, java.lang.String str, int i17, yz5.a block, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = true;
        }
        if ((i18 & 2) != 0) {
            z18 = false;
        }
        if ((i18 & 4) != 0) {
            classLoader = null;
        }
        if ((i18 & 8) != 0) {
            str = null;
        }
        if ((i18 & 16) != 0) {
            i17 = -1;
        }
        kotlin.jvm.internal.o.g(block, "block");
        nz5.a aVar = new nz5.a(block);
        if (z18) {
            aVar.setDaemon(true);
        }
        if (i17 > 0) {
            aVar.setPriority(i17);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z17) {
            aVar.start();
        }
        return aVar;
    }
}
