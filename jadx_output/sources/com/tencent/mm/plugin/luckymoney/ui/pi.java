package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147320d;

    public pi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147320d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147320d;
        if (luckyMoneyNewYearSendUIV2.g7()) {
            luckyMoneyNewYearSendUIV2.Y.setChecked(false);
            luckyMoneyNewYearSendUIV2.Z.setText(luckyMoneyNewYearSendUIV2.getResources().getString(com.tencent.mm.R.string.f492443m62));
            luckyMoneyNewYearSendUIV2.f146420p0.setVisibility(0);
            luckyMoneyNewYearSendUIV2.R.setVisibility(8);
            return;
        }
        luckyMoneyNewYearSendUIV2.Y.setChecked(true);
        luckyMoneyNewYearSendUIV2.Z.setText(luckyMoneyNewYearSendUIV2.getResources().getString(com.tencent.mm.R.string.f492441m60));
        luckyMoneyNewYearSendUIV2.f146420p0.setVisibility(8);
        luckyMoneyNewYearSendUIV2.R.setVisibility(0);
    }
}
