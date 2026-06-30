package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146707d;

    public ad(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146707d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146707d;
        android.widget.TextView textView = (android.widget.TextView) luckyMoneyNewPrepareUI.findViewById(com.tencent.mm.R.id.j1h);
        android.widget.ImageView imageView = (android.widget.ImageView) luckyMoneyNewPrepareUI.findViewById(com.tencent.mm.R.id.j1e);
        if (textView == null || imageView == null) {
            return;
        }
        int left = (imageView.getLeft() - i65.a.b(luckyMoneyNewPrepareUI.getContext(), 8)) - (textView.getRight() + i65.a.b(luckyMoneyNewPrepareUI.getContext(), 52));
        if (left > 0) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            android.widget.TextView textView2 = luckyMoneyNewPrepareUI.M;
            if (textView2 == null) {
                return;
            }
            textView2.setMaxWidth(left);
        }
    }
}
