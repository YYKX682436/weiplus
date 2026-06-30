package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hh implements com.tencent.mm.plugin.luckymoney.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146997a;

    public hh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146997a = luckyMoneyNewYearSendUI;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.l
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146997a;
        if (luckyMoneyNewYearSendUI.f146368J) {
            luckyMoneyNewYearSendUI.A.setVisibility(4);
            com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewYearSendUI.getContext(), luckyMoneyNewYearSendUI.A, luckyMoneyNewYearSendUI.H);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.ui.gh(this));
            luckyMoneyNewYearSendUI.A.startAnimation(alphaAnimation);
            luckyMoneyNewYearSendUI.f146368J = false;
        } else {
            com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewYearSendUI.getContext(), luckyMoneyNewYearSendUI.A, luckyMoneyNewYearSendUI.H);
            luckyMoneyNewYearSendUI.A.invalidate();
        }
        luckyMoneyNewYearSendUI.c7(true);
        luckyMoneyNewYearSendUI.f146392z.setFocusable(true);
        luckyMoneyNewYearSendUI.f146392z.setContentDescription("" + (luckyMoneyNewYearSendUI.I / 100.0d));
    }
}
