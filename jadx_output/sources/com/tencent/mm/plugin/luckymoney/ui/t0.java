package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t0 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 f147439a;

    public t0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        this.f147439a = luckyMoneyBusiReceiveUIV2;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click intercept button");
        java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2.H;
        this.f147439a.W6(-1, "");
    }
}
