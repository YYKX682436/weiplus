package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147482d;

    public u2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147482d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147482d;
        int h17 = com.tencent.mm.ui.bl.h(luckyMoneyDetailUI.getContext());
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) luckyMoneyDetailUI.f146103w2.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        luckyMoneyDetailUI.f146103w2.setLayoutParams(marginLayoutParams);
    }
}
