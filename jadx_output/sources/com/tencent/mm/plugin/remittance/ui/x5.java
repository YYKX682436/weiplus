package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class x5 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.a6 f158033a;

    public x5(com.tencent.mm.plugin.remittance.ui.a6 a6Var) {
        this.f158033a = a6Var;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "onAppBrandProcessDied");
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "onAppBrandPreconditionError");
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "onAppBrandUIExit：%s", java.lang.Boolean.valueOf(z17));
        this.f158033a.f157635c.d7(0);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }
}
