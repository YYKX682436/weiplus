package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147099d;

    public k8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147099d = luckyMoneyNewDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147099d;
        int h17 = com.tencent.mm.ui.bl.h(luckyMoneyNewDetailUI.getContext());
        android.widget.ImageView imageView = luckyMoneyNewDetailUI.f146227v2;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = h17;
        }
        android.widget.ImageView imageView2 = luckyMoneyNewDetailUI.f146227v2;
        if (imageView2 == null) {
            return;
        }
        imageView2.setLayoutParams(marginLayoutParams);
    }
}
