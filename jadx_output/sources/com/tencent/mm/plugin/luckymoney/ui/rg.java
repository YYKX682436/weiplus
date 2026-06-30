package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class rg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147384d;

    public rg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147384d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147384d;
        db5.t7.i(luckyMoneyNewYearReceiveUIV2.getContext(), luckyMoneyNewYearReceiveUIV2.getContext().getResources().getString(com.tencent.mm.R.string.f492449m63), com.tencent.mm.R.raw.icons_outlined_volume_off);
    }
}
