package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class i3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        super(false);
        this.f147014d = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.f146047p3;
        this.f147014d.k7(true);
    }
}
