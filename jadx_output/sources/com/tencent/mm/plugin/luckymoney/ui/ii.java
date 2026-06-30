package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ii implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147031d;

    public ii(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147031d = luckyMoneyNewYearSendUIV2;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147031d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onAnimationEnd] needClosePageView：%s，needClosePagviewSwitch：%s", java.lang.Boolean.valueOf(luckyMoneyNewYearSendUIV2.f146447z2), java.lang.Boolean.valueOf(luckyMoneyNewYearSendUIV2.A2));
        if (luckyMoneyNewYearSendUIV2.f146447z2 && !luckyMoneyNewYearSendUIV2.A2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onAnimationEnd] isCloseAnimatorDurationScaleSetting，return");
        } else if (luckyMoneyNewYearSendUIV2.I2 == 5) {
            luckyMoneyNewYearSendUIV2.C1 = "loop";
            luckyMoneyNewYearSendUIV2.d7(5);
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
