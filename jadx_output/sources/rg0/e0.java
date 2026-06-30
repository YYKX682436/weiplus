package rg0;

/* loaded from: classes9.dex */
public class e0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (at4.p1.f13925a == null) {
            at4.p1.f13925a = new at4.p1();
        }
        at4.p1 p1Var = at4.p1.f13925a;
        p1Var.getClass();
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (P < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletPushNotifyManager", "hy: paymsgtype error. maybe not found in xml");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPushNotifyManager", "handle paymsg type: %s", java.lang.Integer.valueOf(P));
            if (P == 12) {
                int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.avail_balance"), -1);
                long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.paymsg.balance_version"), -1L);
                at4.o1 o1Var = new at4.o1(p1Var, com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.paymsg.time_out"), 7200L), V, P2, P, d17);
                java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, o1Var), null));
            } else {
                z17 = false;
                if (P == 43) {
                    at4.a1 b17 = at4.a1.b(d17);
                    if (b17 != null) {
                        objArr[0] = b17;
                    }
                    at4.a1.c(g17);
                }
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new at4.n1(P, d17, objArr));
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
