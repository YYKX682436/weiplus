package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147094d;

    public k2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147094d = luckyMoneyDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.f146047p3;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147094d;
        luckyMoneyDetailUI.getClass();
        new android.util.DisplayMetrics();
        android.util.DisplayMetrics displayMetrics = luckyMoneyDetailUI.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i18 = displayMetrics.widthPixels;
            double d17 = i18 / 750.0d;
            int i19 = (int) (240.0d * d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "hy: screen  width: %d, scale : %f, fixedHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            luckyMoneyDetailUI.H.setLayoutParams(new android.widget.LinearLayout.LayoutParams(luckyMoneyDetailUI.H.getLayoutParams().width, i19));
        }
        luckyMoneyDetailUI.H.setVisibility(0);
    }
}
