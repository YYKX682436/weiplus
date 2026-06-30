package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class l0 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f147120a;

    public l0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        this.f147120a = luckyMoneyBusiReceiveUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "click intercept button");
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.f146005J;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f147120a;
        luckyMoneyBusiReceiveUI.W6(-1, "");
        luckyMoneyBusiReceiveUI.finish();
    }
}
