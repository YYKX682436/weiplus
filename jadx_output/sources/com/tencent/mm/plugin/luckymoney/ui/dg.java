package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class dg implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f146842d;

    public dg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f146842d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f146842d;
        com.tencent.mm.view.MMPAGView mMPAGView2 = luckyMoneyNewYearReceiveUIV2.S;
        if (mMPAGView2 != null) {
            mMPAGView2.post(new com.tencent.mm.plugin.luckymoney.ui.fg(luckyMoneyNewYearReceiveUIV2, "loop"));
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
