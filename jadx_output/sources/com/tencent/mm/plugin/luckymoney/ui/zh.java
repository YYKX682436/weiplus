package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class zh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147780d;

    public zh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147780d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147780d;
        com.tencent.mm.plugin.luckymoney.model.e5.j(luckyMoneyNewYearSendUIV2.f146445z, 0);
        luckyMoneyNewYearSendUIV2.D.setVisibility(4);
        if (!luckyMoneyNewYearSendUIV2.f146409j2) {
            luckyMoneyNewYearSendUIV2.H.setVisibility(4);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = luckyMoneyNewYearSendUIV2.F;
        luckyMoneyAutoScrollView.f145971x = new com.tencent.mm.plugin.luckymoney.ui.ci(luckyMoneyNewYearSendUIV2);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.j(luckyMoneyAutoScrollView));
    }
}
