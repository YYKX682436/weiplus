package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 f147397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        super(false);
        this.f147397d = luckyMoneyBusiReceiveUIV2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click close btn");
        java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2.H;
        this.f147397d.W6(0, "click close btn");
    }
}
