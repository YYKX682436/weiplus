package qe;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.f f361940e;

    public e(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, qe.f fVar) {
        this.f361939d = tVar;
        this.f361940e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.u h07 = this.f361939d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        kotlin.jvm.internal.o.f(h07, "getAddon(...)");
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) h07;
        qe.f fVar = this.f361940e;
        qe.f.a(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "tempInitHttpBinding: isolatePtr=%d contextPtr=%d", java.lang.Long.valueOf(l0Var.L()), java.lang.Long.valueOf(l0Var.G()));
        ((qe.c) ((jz5.n) fVar.f361944c).getValue()).tempInit(l0Var.L(), l0Var.G());
    }
}
