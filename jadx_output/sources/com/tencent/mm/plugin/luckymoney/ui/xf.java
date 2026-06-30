package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class xf implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147691b;

    public xf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f147691b = luckyMoneyNewYearReceiveUIV2;
        this.f147690a = f6Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147691b;
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click right button");
            luckyMoneyNewYearReceiveUIV2.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click left button");
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = luckyMoneyNewYearReceiveUIV2.R1;
        int i18 = l6Var.f145418h;
        int i19 = l6Var.f145419i;
        java.lang.String str = l6Var.f145420m;
        java.lang.String str2 = l6Var.f145421n;
        java.lang.String str3 = l6Var.P;
        java.lang.String str4 = this.f147690a.f145292w;
        luckyMoneyNewYearReceiveUIV2.P1 = true;
        luckyMoneyNewYearReceiveUIV2.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.f6(i18, i19, str, str2, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), luckyMoneyNewYearReceiveUIV2.getIntent().getStringExtra("key_username"), "v1.0", str3, str4), true);
    }
}
