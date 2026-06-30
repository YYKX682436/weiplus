package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class m9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147172d;

    public m9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147172d = luckyMoneyNewDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147172d;
        int h17 = com.tencent.mm.ui.bl.h(luckyMoneyNewDetailUI.getContext());
        int a17 = com.tencent.mm.ui.bl.a(luckyMoneyNewDetailUI.getContext());
        android.widget.LinearLayout linearLayout = luckyMoneyNewDetailUI.f146211p0;
        int height = h17 + ((a17 - (linearLayout != null ? linearLayout.getHeight() : 0)) / 2);
        android.widget.LinearLayout linearLayout2 = luckyMoneyNewDetailUI.f146211p0;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout2 != null ? linearLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = height;
        }
        android.widget.LinearLayout linearLayout3 = luckyMoneyNewDetailUI.f146211p0;
        if (linearLayout3 != null) {
            linearLayout3.setLayoutParams(marginLayoutParams);
        }
        android.widget.LinearLayout linearLayout4 = luckyMoneyNewDetailUI.f146211p0;
        if (linearLayout4 != null && linearLayout4.getHeight() == 0) {
            android.widget.LinearLayout linearLayout5 = luckyMoneyNewDetailUI.f146211p0;
            float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
            if (linearLayout5 != null) {
                linearLayout5.setOutlineProvider(new zl5.a(true, true, b17));
            }
            if (linearLayout5 == null) {
                return;
            }
            linearLayout5.setClipToOutline(true);
            return;
        }
        android.widget.LinearLayout linearLayout6 = luckyMoneyNewDetailUI.f146211p0;
        float height2 = (linearLayout6 != null ? linearLayout6.getHeight() : 0) / 2;
        if (linearLayout6 != null) {
            linearLayout6.setOutlineProvider(new zl5.a(true, true, height2));
        }
        if (linearLayout6 == null) {
            return;
        }
        linearLayout6.setClipToOutline(true);
    }
}
