package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes15.dex */
public class m implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qrcode.model.o f154965a;

    public m(com.tencent.mm.plugin.qrcode.model.o oVar) {
        this.f154965a = oVar;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.scanner.GetA8KeyRedirect", "onAppBrandPreconditionError");
        ((e04.p) ((com.tencent.mm.plugin.qrcode.model.h) this.f154965a).f154961a).D(false);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "onAppBrandUIEnter");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.qrcode.model.GetA8KeyRedirect$9$1
            {
                this.__eventId = 551436157;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "AppBrandUIEnterAnimationCompleteEvent callback");
                ((e04.p) ((com.tencent.mm.plugin.qrcode.model.h) com.tencent.mm.plugin.qrcode.model.m.this.f154965a).f154961a).D(false);
                com.tencent.mm.sdk.event.IListener iListener2 = com.tencent.mm.plugin.qrcode.model.p.f154967b;
                if (iListener2 == null) {
                    return true;
                }
                iListener2.dead();
                com.tencent.mm.plugin.qrcode.model.p.f154967b = null;
                return true;
            }
        };
        com.tencent.mm.plugin.qrcode.model.p.f154967b = iListener;
        iListener.alive();
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
