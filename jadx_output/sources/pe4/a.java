package pe4;

/* loaded from: classes15.dex */
public enum a {
    IML;

    public pe4.o a(android.app.Activity activity, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        if (c0Var == null || d0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFactory", "hy: reqmodel or resp model is null");
            return null;
        }
        if ((c0Var.f394519a & 1) != 0 && wt5.a.n(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return new pe4.m(new java.lang.ref.WeakReference(activity), c0Var, d0Var, handler);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", java.lang.Byte.valueOf(c0Var.f394519a));
        return null;
    }
}
