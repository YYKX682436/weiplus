package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147399d;

    public s2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147399d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147399d;
        if (luckyMoneyDetailUI.isFinishing() || luckyMoneyDetailUI.isDestroyed()) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) luckyMoneyDetailUI.f146102w.findViewById(com.tencent.mm.R.id.izt);
        if (luckyMoneyDetailUI.G.getVisibility() == 8 && luckyMoneyDetailUI.F.getVisibility() == 8 && luckyMoneyDetailUI.E.getVisibility() == 8 && textView.getVisibility() == 8) {
            return;
        }
        android.view.View findViewById = luckyMoneyDetailUI.findViewById(com.tencent.mm.R.id.iza);
        android.view.View view = luckyMoneyDetailUI.f146102w;
        if (view == null || findViewById == null) {
            return;
        }
        if (!luckyMoneyDetailUI.O2) {
            luckyMoneyDetailUI.O2 = true;
            luckyMoneyDetailUI.S2 = view.getHeight();
        }
        int height = findViewById.getHeight();
        luckyMoneyDetailUI.f146102w.getGlobalVisibleRect(new android.graphics.Rect());
        int top = height - luckyMoneyDetailUI.f146102w.getTop();
        int i17 = luckyMoneyDetailUI.S2;
        if (top > i17) {
            luckyMoneyDetailUI.f146102w.setMinimumHeight(top);
        } else {
            luckyMoneyDetailUI.f146102w.setMinimumHeight(i17);
        }
    }
}
