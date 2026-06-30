package mz2;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.CloseFingerPrintEvent f333088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f333089e;

    public b() {
        super(0);
        this.f333089e = false;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = (com.tencent.mm.autogen.events.CloseFingerPrintEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
            return false;
        }
        this.f333089e = false;
        if (!(closeFingerPrintEvent instanceof com.tencent.mm.autogen.events.CloseFingerPrintEvent)) {
            return false;
        }
        this.f333088d = closeFingerPrintEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        oz2.d dVar = new oz2.d(closeFingerPrintEvent.f54065g.f6432a);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(dVar);
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof oz2.d) {
            am.e3 e3Var = new am.e3();
            com.tencent.mars.xlog.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
                e3Var.f6535a = 0;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
                e3Var.f6535a = i18;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.q(385, this);
            com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = this.f333088d;
            closeFingerPrintEvent.f54066h = e3Var;
            this.f333089e = true;
            java.lang.Runnable runnable = closeFingerPrintEvent.f192364d;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f333089e) {
                this.f333088d = null;
            }
        }
    }
}
