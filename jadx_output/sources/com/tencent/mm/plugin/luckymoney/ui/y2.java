package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147712d;

    public y2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147712d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147712d;
        int h17 = com.tencent.mm.ui.bl.h(luckyMoneyDetailUI.getContext()) + ((com.tencent.mm.ui.bl.a(luckyMoneyDetailUI.getContext()) - luckyMoneyDetailUI.X.getHeight()) / 2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) luckyMoneyDetailUI.X.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        luckyMoneyDetailUI.X.setLayoutParams(marginLayoutParams);
        if (luckyMoneyDetailUI.X.getHeight() != 0) {
            android.widget.LinearLayout linearLayout = luckyMoneyDetailUI.X;
            float height = linearLayout.getHeight() / 2;
            if (linearLayout != null) {
                linearLayout.setOutlineProvider(new zl5.a(true, true, height));
            }
            if (linearLayout == null) {
                return;
            }
            linearLayout.setClipToOutline(true);
            return;
        }
        android.widget.LinearLayout linearLayout2 = luckyMoneyDetailUI.X;
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
        if (linearLayout2 != null) {
            linearLayout2.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setClipToOutline(true);
    }
}
