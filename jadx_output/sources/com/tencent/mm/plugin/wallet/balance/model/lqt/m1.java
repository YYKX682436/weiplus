package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.wallet.balance.model.lqt.m1 f177691b;

    /* renamed from: a, reason: collision with root package name */
    public r45.ry4 f177692a;

    public static com.tencent.mm.plugin.wallet.balance.model.lqt.m1 b() {
        if (f177691b == null) {
            f177691b = new com.tencent.mm.plugin.wallet.balance.model.lqt.m1();
        }
        return f177691b;
    }

    public r45.ry4 a() {
        if (this.f177692a == null) {
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    this.f177692a = (r45.ry4) new r45.ry4().parseFrom(str.getBytes(r26.c.f368867c));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LqtOnClickRedeemCache", e17, "", new java.lang.Object[0]);
                }
            }
        }
        return this.f177692a;
    }

    public void c(r45.ry4 ry4Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtOnClickRedeemCache", "setCache OnClickRedeemRes balance %s, bank_balance %s, lq_balance %s", java.lang.Integer.valueOf(ry4Var.f385286f), java.lang.Integer.valueOf(ry4Var.f385288h), java.lang.Integer.valueOf(ry4Var.f385287g));
        this.f177692a = ry4Var;
        try {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, new java.lang.String(ry4Var.toByteArray(), r26.c.f368867c));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LqtOnClickRedeemCache", e17, "", new java.lang.Object[0]);
        }
        if (x51.o1.T) {
            r45.ry4 ry4Var2 = this.f177692a;
            ry4Var2.f385286f = 100000000;
            ry4Var2.f385288h = 50000000;
            ry4Var2.f385287g = 50000000;
        }
    }
}
