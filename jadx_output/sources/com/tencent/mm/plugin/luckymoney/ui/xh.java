package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class xh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147693d;

    public xh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147693d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147693d;
        db5.t7.i(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.f492449m63), com.tencent.mm.R.raw.icons_outlined_volume_off);
    }
}
