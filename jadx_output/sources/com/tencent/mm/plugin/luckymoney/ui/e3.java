package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146860d;

    public e3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f146860d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f146860d;
        int h17 = com.tencent.mm.ui.bl.h(luckyMoneyDetailUI.getContext());
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) luckyMoneyDetailUI.f146101v2.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        luckyMoneyDetailUI.f146101v2.setLayoutParams(marginLayoutParams);
    }
}
