package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b1 f120397d;

    public y0(com.tencent.mm.plugin.finder.live.widget.b1 b1Var) {
        this.f120397d = b1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.tencent.mm.plugin.finder.live.widget.b1 b1Var = this.f120397d;
        if (i17 > 0) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = b1Var.f118384g.f444836c;
            android.view.ViewGroup.LayoutParams layoutParams = y1Var.f212027f.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, 0, i17);
            }
            y1Var.f212027f.requestLayout();
            return;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = b1Var.f118384g.f444836c;
        android.view.ViewGroup.LayoutParams layoutParams2 = y1Var2.f212027f.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        y1Var2.f212027f.requestLayout();
    }
}
