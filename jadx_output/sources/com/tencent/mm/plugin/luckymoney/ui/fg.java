package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class fg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f146909e;

    public fg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, java.lang.String str) {
        this.f146909e = luckyMoneyNewYearReceiveUIV2;
        this.f146908d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f146909e;
        java.lang.String d17 = com.tencent.mm.plugin.luckymoney.model.e5.d(luckyMoneyNewYearReceiveUIV2.V.f145607g, this.f146908d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            luckyMoneyNewYearReceiveUIV2.a7(0);
        } else {
            com.tencent.mm.plugin.luckymoney.model.e5.m(this.f146908d, d17, luckyMoneyNewYearReceiveUIV2.S, null, luckyMoneyNewYearReceiveUIV2.T, luckyMoneyNewYearReceiveUIV2.U);
        }
    }
}
