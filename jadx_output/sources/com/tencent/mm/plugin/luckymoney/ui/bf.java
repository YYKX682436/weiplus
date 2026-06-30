package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class bf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146753d;

    public bf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146753d = luckyMoneyNewReceiveUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146753d;
        android.widget.ImageView imageView = luckyMoneyNewReceiveUI.A;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        float width = (luckyMoneyNewReceiveUI.f146312v != null ? r3.getWidth() : 0) * 1.0993f;
        if (layoutParams2 != null) {
            layoutParams2.width = java.lang.Math.round(width);
        }
        if (layoutParams2 != null) {
            layoutParams2.height = java.lang.Math.round(width * 1.72f);
        }
        android.widget.ImageView imageView2 = luckyMoneyNewReceiveUI.A;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams2);
        }
        android.view.View view = luckyMoneyNewReceiveUI.f146312v;
        android.view.ViewGroup.LayoutParams layoutParams3 = view != null ? view.getLayoutParams() : null;
        if (layoutParams3 != null) {
            float f17 = 1;
            layoutParams3.width += (int) (i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) * f17);
            layoutParams3.height -= (int) (f17 * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
            android.view.View view2 = luckyMoneyNewReceiveUI.f146312v;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams3);
            }
        }
        android.view.View view3 = luckyMoneyNewReceiveUI.E;
        android.view.ViewGroup.LayoutParams layoutParams4 = view3 != null ? view3.getLayoutParams() : null;
        float round = (float) java.lang.Math.round(width * 0.98d);
        if (layoutParams4 != null) {
            layoutParams4.width = java.lang.Math.round(round);
        }
        if (layoutParams4 != null) {
            layoutParams4.height = java.lang.Math.round(round * 1.72f);
        }
        android.view.View view4 = luckyMoneyNewReceiveUI.E;
        if (view4 == null) {
            return;
        }
        view4.setLayoutParams(layoutParams4);
    }
}
