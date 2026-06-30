package rs3;

@j95.b
/* loaded from: classes5.dex */
public class h extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f399338d = new rs3.g(this);

    public static void Ai(boolean z17) {
        int o17 = c01.z1.o();
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? o17 & (-1025) : o17 | 1024));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.o(26, z17 ? 2 : 1));
    }

    public static void wi(rs3.h hVar) {
        hVar.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15416, "newsapp", java.lang.Integer.valueOf((c01.z1.n() & 524288) == 0 ? 1 : 0), java.lang.Integer.valueOf((c01.z1.o() & 1024) != 0 ? 0 : 1));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_READERAPP_REPORT_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        s75.d.b(new rs3.e(this), "ReaderAppReport");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        gm0.j1.d().q(138, this.f399338d);
    }
}
