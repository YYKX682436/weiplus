package et5;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f256670a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f256671b;

    public static final void a(yz5.a aVar) {
        java.lang.Boolean bool = f256670a;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AffScanSoLoader", "loadQBarSo loaded success already");
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        try {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            fp.d0.n("XNet");
            fp.d0.n("opencv_world");
            fp.d0.n("QBar");
            if (aVar != null) {
                aVar.invoke();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AffScanSoLoader", th6, "loadQBarSo exception", new java.lang.Object[0]);
            bool2 = java.lang.Boolean.FALSE;
        }
        f256670a = bool2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanSoLoader", "loadQBarSo soLoaded: " + f256670a);
    }
}
