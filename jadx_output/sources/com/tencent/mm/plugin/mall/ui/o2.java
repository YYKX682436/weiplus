package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes2.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView f148457d;

    public o2(com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView) {
        this.f148457d = mallWalletSectionCellView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView = this.f148457d;
        mallWalletSectionCellView.f148301f.getX();
        mallWalletSectionCellView.f148301f.getLeft();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = mallWalletSectionCellView.f148301f.getLeft();
        mallWalletSectionCellView.f148309q.setLayoutParams(layoutParams);
        android.view.View view = mallWalletSectionCellView.f148309q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
