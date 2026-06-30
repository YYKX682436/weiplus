package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146735d;

    public b2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f146735d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f146735d;
        luckyMoneyDetailUI.N = (android.view.ViewGroup) luckyMoneyDetailUI.findViewById(com.tencent.mm.R.id.j1l);
        e51.a.b(luckyMoneyDetailUI.N, luckyMoneyDetailUI.N2).d(100, 400L);
        e51.a.c(luckyMoneyDetailUI.N, luckyMoneyDetailUI.N2).d(100, 400L);
    }
}
