package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes5.dex */
public class m0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.n0 f188047d;

    public m0(com.tencent.mm.plugin.webwx.ui.n0 n0Var) {
        this.f188047d = n0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        en.k kVar = (en.k) i95.n0.c(en.k.class);
        com.tencent.mm.plugin.webwx.ui.n0 n0Var = this.f188047d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebWxPopUnlockUI", "onSceneEnd() called with handleErrMsg:%s errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], scene = [" + m1Var + "]", java.lang.Boolean.valueOf(((en.a) kVar).Zi(n0Var.f188052g, i17, i18, str)));
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        w11.w1.wi().h(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebWxPopUnlockUI", "trigger netSceneSync notify");
        n0Var.f188052g.finish();
        new com.tencent.mm.autogen.events.UpdateExtDeviceEvent().e();
    }
}
