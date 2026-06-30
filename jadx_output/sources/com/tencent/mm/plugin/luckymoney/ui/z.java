package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class z implements al5.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f147752a;

    public z(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        this.f147752a = luckyMoneyBusiDetailUI;
    }

    @Override // al5.n1
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f147752a;
        if (luckyMoneyBusiDetailUI.f145994p.getVisibility() == 0) {
            luckyMoneyBusiDetailUI.f145994p.setVisibility(8);
        } else {
            luckyMoneyBusiDetailUI.getContext().finish();
        }
    }
}
