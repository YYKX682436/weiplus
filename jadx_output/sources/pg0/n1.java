package pg0;

/* loaded from: classes4.dex */
public final class n1 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        java.lang.String g17 = x51.j1.g(addMsgInfo.f70726a.f377561h);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "got a pay msg, type = " + P);
        if (P != 16) {
            if (P != 17) {
                if (P != 37) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "receive c2c content update msg: %s", g17);
                gm0.j1.e().j(new pg0.m1(d17));
                return;
            }
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.WalletType"), -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + P2);
            if (P2 >= 0) {
                gm0.j1.u().c().w(339975, java.lang.Integer.valueOf(P2));
                return;
            }
            return;
        }
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.Flag"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + P3);
        if (P3 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "open wallet");
            c01.z1.M();
        } else {
            if (P3 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PayMsgListener", "close wallet");
            int o17 = c01.z1.o() & (-32769);
            gm0.j1.i();
            gm0.j1.u().c().w(40, java.lang.Integer.valueOf(o17));
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
    }
}
