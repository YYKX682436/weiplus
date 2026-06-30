package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class r6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        super(false);
        this.f147370d = luckyMoneyMyRecordUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147370d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyMyRecordUI.G)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyMyRecordUI", "hy: no avatar jump h5");
        } else {
            com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyMyRecordUI, luckyMoneyMyRecordUI.G, true);
        }
    }
}
