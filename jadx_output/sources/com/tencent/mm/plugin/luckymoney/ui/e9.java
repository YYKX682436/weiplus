package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146867d;

    public e9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146867d = luckyMoneyNewDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.f146171r3;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146867d;
        luckyMoneyNewDetailUI.getClass();
        new android.util.DisplayMetrics();
        android.util.DisplayMetrics displayMetrics = luckyMoneyNewDetailUI.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i18 = displayMetrics.widthPixels;
            double d17 = i18 / luckyMoneyNewDetailUI.f146214p3;
            int i19 = (int) (luckyMoneyNewDetailUI.f146217q3 * d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fixBgAreaHeight] screen  width: %d, scale : %f, fixedHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            android.widget.RelativeLayout relativeLayout = luckyMoneyNewDetailUI.H;
            if (relativeLayout != null) {
                android.widget.RelativeLayout relativeLayout2 = luckyMoneyNewDetailUI.H;
                relativeLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams((relativeLayout2 == null || (layoutParams = relativeLayout2.getLayoutParams()) == null) ? 0 : layoutParams.width, i19));
            }
        }
        android.widget.RelativeLayout relativeLayout3 = luckyMoneyNewDetailUI.H;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }
}
