package vr4;

/* loaded from: classes.dex */
public class p0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WCPayWalletBufferEvent f439791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439792e;

    public p0(vr4.r0 r0Var, com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent, java.lang.String str) {
        this.f439791d = wCPayWalletBufferEvent;
        this.f439792e = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1767, this);
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = this.f439791d;
        if (i17 == 0 && i18 == 0) {
            am.f10 f10Var = wCPayWalletBufferEvent.f54952h;
            f10Var.f6627b = this.f439792e;
            f10Var.f6628c.run();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", java.lang.Integer.valueOf(i18), str);
            am.f10 f10Var2 = wCPayWalletBufferEvent.f54952h;
            f10Var2.f6626a = -1;
            f10Var2.f6628c.run();
        }
    }
}
