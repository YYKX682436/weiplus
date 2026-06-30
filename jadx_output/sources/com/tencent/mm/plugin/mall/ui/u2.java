package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class u2 implements l81.e1 {
    public u2(com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI) {
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "onAppBrandProcessDied");
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "onAppBrandPreconditionError");
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "onAppBrandUIEnter");
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "onAppBrandUIExit：%s", java.lang.Boolean.valueOf(z17));
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }
}
