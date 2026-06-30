package vr4;

/* loaded from: classes.dex */
public class q0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f439793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WCPayWalletBufferEvent f439794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr4.r0 f439795f;

    public q0(vr4.r0 r0Var, int i17, com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent) {
        this.f439795f = r0Var;
        this.f439793d = i17;
        this.f439794e = wCPayWalletBufferEvent;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1767, this);
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = this.f439794e;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", java.lang.Integer.valueOf(i18), str);
            am.f10 f10Var = wCPayWalletBufferEvent.f54952h;
            f10Var.f6626a = -1;
            f10Var.f6628c.run();
            return;
        }
        java.lang.String str2 = wCPayWalletBufferEvent.f54951g.f6534j;
        this.f439795f.getClass();
        int i19 = this.f439793d;
        if (i19 == 1) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC, str2);
        } else if (i19 == 2) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC, str2);
        } else if (i19 == 4) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC, str2);
        } else if (i19 == 8) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC, str2);
        }
        wCPayWalletBufferEvent.f54952h.f6628c.run();
    }
}
