package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class qh implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147351d;

    public qh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147351d = luckyMoneyNewYearSendUIV2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147351d;
        if (luckyMoneyNewYearSendUIV2.f146412l2) {
            g4Var.f(3, luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.m5z));
        } else {
            g4Var.f(1, luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.f492433gn0));
        }
        g4Var.d(2, -65536, luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.gjs));
    }
}
