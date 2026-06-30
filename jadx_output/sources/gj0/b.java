package gj0;

/* loaded from: classes5.dex */
public abstract class b {
    public final int a(com.tencent.tinker.entry.ApplicationLike applicationLike) {
        int b17 = b();
        if (b17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: normal.", c());
        } else if (b17 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: skip startup.", c());
        } else {
            if (b17 != 2) {
                throw new java.lang.IllegalStateException("Fuse '" + c() + "' return unknown action: " + b17);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: suicide.", c());
        }
        return b17;
    }

    public abstract int b();

    public abstract java.lang.String c();
}
