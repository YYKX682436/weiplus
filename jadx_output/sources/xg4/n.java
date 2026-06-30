package xg4;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg4.p f454451d;

    public n(xg4.p pVar) {
        this.f454451d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String b17 = rg4.b.f395246a.b();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        this.f454451d.getClass();
        g0Var.d(20781, "MagicLiveCard", 0, 0, 3, "", b17);
    }
}
