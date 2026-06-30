package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147446d;

    public t7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147446d = luckyMoneyNewDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147446d;
        if (luckyMoneyNewDetailUI.isFinishing() || luckyMoneyNewDetailUI.isDestroyed()) {
            return;
        }
        android.view.View view = luckyMoneyNewDetailUI.f146228w;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.izt) : null;
        android.view.ViewGroup viewGroup = luckyMoneyNewDetailUI.G;
        if (viewGroup != null && viewGroup.getVisibility() == 8) {
            android.widget.TextView textView2 = luckyMoneyNewDetailUI.F;
            if (textView2 != null && textView2.getVisibility() == 8) {
                android.widget.TextView textView3 = luckyMoneyNewDetailUI.E;
                if (textView3 != null && textView3.getVisibility() == 8) {
                    if (textView != null && textView.getVisibility() == 8) {
                        return;
                    }
                }
            }
        }
        android.view.View findViewById = luckyMoneyNewDetailUI.findViewById(com.tencent.mm.R.id.iza);
        android.view.View view2 = luckyMoneyNewDetailUI.f146228w;
        if (view2 == null || findViewById == null) {
            return;
        }
        if (!luckyMoneyNewDetailUI.O2) {
            luckyMoneyNewDetailUI.O2 = true;
            luckyMoneyNewDetailUI.S2 = view2 != null ? view2.getHeight() : 0;
        }
        int height = findViewById.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view3 = luckyMoneyNewDetailUI.f146228w;
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        android.view.View view4 = luckyMoneyNewDetailUI.f146228w;
        int top = height - (view4 != null ? view4.getTop() : 0);
        int i17 = luckyMoneyNewDetailUI.S2;
        if (top > i17) {
            android.view.View view5 = luckyMoneyNewDetailUI.f146228w;
            if (view5 == null) {
                return;
            }
            view5.setMinimumHeight(top);
            return;
        }
        android.view.View view6 = luckyMoneyNewDetailUI.f146228w;
        if (view6 == null) {
            return;
        }
        view6.setMinimumHeight(i17);
    }
}
