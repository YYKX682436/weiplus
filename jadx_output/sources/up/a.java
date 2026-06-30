package up;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final up.a f429755d = new up.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "try preloading");
        if (com.tencent.mm.sdk.platformtools.z.f193123s) {
            jz5.g gVar = up.g.f429760a;
            jz5.g gVar2 = up.g.f429760a;
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar2).getValue()).t("preloaded"), up.g.f429761b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "skip preload because token \"" + up.g.f429761b + "\" is not updated");
            } else {
                try {
                    ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar2).getValue()).D("preloaded", up.g.f429761b);
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    sc.e eVar = sc.e.f405623d;
                    if (com.tencent.cso.CsoLoader.f45935b) {
                        eVar.invoke();
                    } else {
                        synchronized (com.tencent.cso.CsoLoader.f45936c) {
                            if (com.tencent.cso.CsoLoader.f45935b) {
                                eVar.invoke();
                            } else {
                                com.tencent.cso.CsoLoader.f45939f = eVar;
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "preload all cost " + (android.os.SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis) + " ms");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CsoStartup", th6, "Preload all failed.", new java.lang.Object[0]);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "skip preload because cso is not enabled");
        }
        return jz5.f0.f302826a;
    }
}
