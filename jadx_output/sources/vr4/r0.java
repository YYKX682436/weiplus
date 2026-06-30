package vr4;

/* loaded from: classes.dex */
public class r0 extends com.tencent.mm.sdk.event.n {
    public r0() {
        super(0);
    }

    public final void b(com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1767, u0Var);
        am.e10 e10Var = wCPayWalletBufferEvent.f54951g;
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", e10Var.f6525a, e10Var.f6530f, e10Var.f6526b, e10Var.f6527c, e10Var.f6528d, e10Var.f6529e, e10Var.f6531g);
        ts4.a aVar = new ts4.a(e10Var.f6525a, e10Var.f6530f, e10Var.f6526b, e10Var.f6527c, e10Var.f6528d, e10Var.f6529e, e10Var.f6531g);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(aVar);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = (com.tencent.mm.autogen.events.WCPayWalletBufferEvent) iEvent;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        int m17 = c01.z1.m();
        am.f10 f10Var = wCPayWalletBufferEvent.f54952h;
        f10Var.f6626a = 0;
        if (m17 == 4) {
            am.e10 e10Var = wCPayWalletBufferEvent.f54951g;
            if (intValue == e10Var.f6533i) {
                if ("fetch".equals(e10Var.f6532h)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do fetch");
                    java.lang.String str = "";
                    if (intValue == 1) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC, "");
                    } else if (intValue == 2) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC, "");
                    } else if (intValue == 4) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC, "");
                    } else if (intValue == 8) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC, "");
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "fetch empty buffer");
                        f10Var.f6626a = -2;
                    } else {
                        b(wCPayWalletBufferEvent, new vr4.p0(this, wCPayWalletBufferEvent, str));
                    }
                } else if ("save".equals(e10Var.f6532h)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do save");
                    b(wCPayWalletBufferEvent, new vr4.q0(this, intValue, wCPayWalletBufferEvent));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong action: %s", e10Var.f6532h);
                    f10Var.f6626a = -1;
                }
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong region, client: %s, req: %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(e10Var.f6533i));
            f10Var.f6626a = -1;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong type: %s", java.lang.Integer.valueOf(m17));
            f10Var.f6626a = -1;
        }
        f10Var.f6628c.run();
        return false;
    }
}
