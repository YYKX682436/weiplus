package o25;

/* loaded from: classes9.dex */
public class i0 extends o25.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.l0 f342536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, o25.l0 l0Var) {
        super(context);
        this.f342536a = l0Var;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onAppBrandProcessDied#buildWeAppStartCallback");
        this.f342536a.c();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onAppBrandPreconditionError#buildWeAppStartCallback");
        this.f342536a.c();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onTriggerHalfScreenShare#buildWeAppStartCallback, token: " + str);
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onAppBrandUIEnter#buildWeAppStartCallback");
        this.f342536a.c();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onAppBrandUIExit#buildWeAppStartCallback, isFinish: " + z17);
    }

    @Override // l81.e1
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onStartAppBrandUI#buildWeAppStartCallback");
        ku5.u0 u0Var = ku5.t0.f312615d;
        final o25.l0 l0Var = this.f342536a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o25.i0$$a
            @Override // java.lang.Runnable
            public final void run() {
                o25.l0.this.c();
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 5000L, false);
    }
}
