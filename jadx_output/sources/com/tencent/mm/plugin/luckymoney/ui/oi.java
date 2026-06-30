package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class oi extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, boolean z17, long j17) {
        super(z17, j17);
        this.f147281d = luckyMoneyNewYearSendUIV2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147281d;
        boolean isChecked = luckyMoneyNewYearSendUIV2.Y.isChecked();
        fc3.f fVar = fc3.f.f261040a;
        if (isChecked) {
            luckyMoneyNewYearSendUIV2.Y.setChecked(false);
            com.tencent.mm.plugin.luckymoney.model.e5.l(luckyMoneyNewYearSendUIV2.R, 8, 300);
            fVar.b(luckyMoneyNewYearSendUIV2.f146418o2, luckyMoneyNewYearSendUIV2.f146422p2, 1, luckyMoneyNewYearSendUIV2.f146434v2, 0);
        } else {
            luckyMoneyNewYearSendUIV2.Y.setChecked(true);
            com.tencent.mm.plugin.luckymoney.model.e5.l(luckyMoneyNewYearSendUIV2.R, 0, 300);
            fVar.b(luckyMoneyNewYearSendUIV2.f146418o2, luckyMoneyNewYearSendUIV2.f146422p2, 1, luckyMoneyNewYearSendUIV2.f146434v2, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "click checkBoxLayout, and after check is %s", java.lang.Boolean.valueOf(luckyMoneyNewYearSendUIV2.Y.isChecked()));
    }
}
