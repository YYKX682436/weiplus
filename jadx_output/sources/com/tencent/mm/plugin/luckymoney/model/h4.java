package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.c1 f145311a;

    public h4() {
        a();
    }

    public final void a() {
        this.f145311a = new com.tencent.mm.plugin.luckymoney.model.c1();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.f145311a;
            c1Var.f145183e = 2000.0d;
            c1Var.f145182d = 100;
            c1Var.f145187i = 200.0d;
            c1Var.f145188m = 0.01d;
            c1Var.f145186h = 200.0d;
        } else {
            try {
                this.f145311a.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "parseConfig exp, " + e17.getLocalizedMessage());
                com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = this.f145311a;
                c1Var2.f145183e = 2000.0d;
                c1Var2.f145182d = 100;
                c1Var2.f145187i = 200.0d;
                c1Var2.f145188m = 0.01d;
                c1Var2.f145186h = 200.0d;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.f145311a.f145183e + " maxTotalNum:" + this.f145311a.f145182d + " perGroupMaxValue:" + this.f145311a.f145187i + " perMinValue:" + this.f145311a.f145188m + " perPersonMaxValue:" + this.f145311a.f145186h);
    }
}
