package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class oe implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f147277b;

    public oe(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f147276a = luckyMoneyNewReceiveUI;
        this.f147277b = m1Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public final void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147276a;
        if (i17 != 2) {
            luckyMoneyNewReceiveUI.finish();
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.zd zdVar = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1;
        luckyMoneyNewReceiveUI.showLoading();
        luckyMoneyNewReceiveUI.W6(((com.tencent.mm.plugin.luckymoney.model.f6) this.f147277b).f145292w);
    }
}
