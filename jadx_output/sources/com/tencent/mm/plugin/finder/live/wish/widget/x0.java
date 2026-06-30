package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class x0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.a1 f120811d;

    public x0(com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var) {
        this.f120811d = a1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("WishKeyBoardInputWidget", "KeyboardHeightObserver " + i17 + ' ' + z17);
        com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var = this.f120811d;
        if (i17 > 0) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = a1Var.f118384g.f444836c;
            if (y1Var.f()) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
                ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.live.wish.widget.v0(a1Var, y1Var));
                ofInt.setDuration(200L);
                ofInt.start();
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = a1Var.f118384g.f444836c;
        if (y1Var2.f()) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(y1Var2.f212027f.getPaddingBottom(), 0);
            ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofInt2.addUpdateListener(new com.tencent.mm.plugin.finder.live.wish.widget.u0(y1Var2));
            ofInt2.setDuration(200L);
            ofInt2.start();
        }
    }
}
