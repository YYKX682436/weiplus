package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class jh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.nh f147061d;

    public jh(com.tencent.mm.plugin.luckymoney.ui.nh nhVar) {
        this.f147061d = nhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.nh nhVar = this.f147061d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = nhVar.f147242a;
        luckyMoneyNewYearSendUIV2.f146416n2 = 10;
        luckyMoneyNewYearSendUIV2.K.setText(luckyMoneyNewYearSendUIV2.getContext().getString(com.tencent.mm.R.string.goa, java.lang.Integer.valueOf(nhVar.f147242a.f146416n2)));
        nhVar.f147242a.K.setVisibility(0);
        nhVar.f147242a.F2.c(1000L, 1000L);
    }
}
