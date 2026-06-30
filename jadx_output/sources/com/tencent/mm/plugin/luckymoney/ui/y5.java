package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class y5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI f147720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI) {
        super(false);
        this.f147720d = luckyMoneyIndexUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 3, 0, 0, 0, 3);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.V6(this.f147720d, 0);
    }
}
