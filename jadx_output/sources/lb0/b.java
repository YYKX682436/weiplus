package lb0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final lb0.b f317667d = new lb0.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        lb0.d dVar = lb0.d.f317669a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String uj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).uj(new com.tencent.mm.repairer.config.openway.RepairerConfigQQBrowserAdOpenWayEnhance());
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdUtil", "Loading QQ browser config: " + uj6);
            kotlin.jvm.internal.o.d(uj6);
            m521constructorimpl = kotlin.Result.m521constructorimpl(lb0.d.a(dVar, uj6));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicAdUtil", "Failed to load QQ browser config", m524exceptionOrNullimpl);
            m521constructorimpl = kz5.q0.f314001d;
        }
        return (java.util.Map) m521constructorimpl;
    }
}
