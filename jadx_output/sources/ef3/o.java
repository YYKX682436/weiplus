package ef3;

/* loaded from: classes9.dex */
public class o implements gm5.a {
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.wh5 wh5Var = (r45.wh5) fVar.f70618d;
            r45.yj6 yj6Var = wh5Var.f389165d;
            if (yj6Var != null) {
                java.util.Iterator it = yj6Var.f391160e.iterator();
                while (it.hasNext()) {
                    java.util.Iterator it6 = ((r45.e14) it.next()).f372904e.iterator();
                    while (it6.hasNext()) {
                        r45.xj6 xj6Var = (r45.xj6) it6.next();
                        boolean equals = xj6Var.f390171i.equals("balance_cell");
                        java.util.LinkedList linkedList = xj6Var.f390168f;
                        if (equals) {
                            if (linkedList != null && linkedList.size() > 0) {
                                java.lang.String charSequence = com.tencent.mm.plugin.wallet_core.utils.z1.e(com.tencent.mm.sdk.platformtools.x2.f193071a, (r45.rl6) linkedList.get(0), null).toString();
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence) && charSequence.length() > 1) {
                                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(com.tencent.mm.wallet_core.ui.r1.j0(charSequence.substring(1), "100")));
                                }
                            }
                        } else if (xj6Var.f390171i.equals("lqt_cell") && linkedList != null && linkedList.size() > 0) {
                            java.lang.String charSequence2 = com.tencent.mm.plugin.wallet_core.utils.z1.e(com.tencent.mm.sdk.platformtools.x2.f193071a, (r45.rl6) linkedList.get(0), null).toString();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence2) && charSequence2.length() > 1) {
                                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(com.tencent.mm.wallet_core.ui.r1.j0(charSequence2.substring(1), "100")));
                            }
                        }
                    }
                }
            }
            try {
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, new java.lang.String(wh5Var.toByteArray(), s46.a.f403001a));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QueryWeChatWalletManager", e17, "", new java.lang.Object[0]);
            }
            r45.s77 s77Var = wh5Var.f389167f;
            if (s77Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "wallet balance: %s", java.lang.Long.valueOf(s77Var.f385539d));
                at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
                r17.field_wallet_balance = wh5Var.f389167f.f385539d;
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(r17.field_wallet_balance));
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().H(r17);
            }
        }
        return (r45.wh5) fVar.f70618d;
    }
}
