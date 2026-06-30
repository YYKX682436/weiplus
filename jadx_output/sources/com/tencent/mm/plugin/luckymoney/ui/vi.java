package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vi implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147552d;

    public vi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147552d = luckyMoneyNewYearSendUIV2;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147552d;
        int i17 = luckyMoneyNewYearSendUIV2.f146416n2 - 1;
        luckyMoneyNewYearSendUIV2.f146416n2 = i17;
        if (i17 > 0) {
            luckyMoneyNewYearSendUIV2.K.setText(luckyMoneyNewYearSendUIV2.getContext().getString(com.tencent.mm.R.string.goa, java.lang.Integer.valueOf(luckyMoneyNewYearSendUIV2.f146416n2)));
            return true;
        }
        luckyMoneyNewYearSendUIV2.F2.d();
        luckyMoneyNewYearSendUIV2.K.setVisibility(8);
        luckyMoneyNewYearSendUIV2.M.c();
        return true;
    }
}
