package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes16.dex */
public final class op0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113778d;

    public op0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f113778d = nd0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113778d;
        android.view.View view2 = (android.view.View) ((jz5.n) nd0Var.V1).getValue();
        int width = view2 != null ? view2.getWidth() : 0;
        android.view.View view3 = (android.view.View) ((jz5.n) nd0Var.W1).getValue();
        int width2 = view3 != null ? view3.getWidth() : 0;
        android.view.View view4 = (android.view.View) ((jz5.n) nd0Var.X1).getValue();
        int width3 = view4 != null ? view4.getWidth() : 0;
        if (width <= 0 || width2 <= 0) {
            return;
        }
        jz5.g gVar = nd0Var.Z1;
        int intValue = ((width - width2) - width3) - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        android.widget.TextView textView = nd0Var.f113622w;
        int paddingLeft = (intValue - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        if (paddingLeft == nd0Var.Y1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "recomputeCoLiveMaxNameWidth: " + nd0Var.Y1 + " -> " + paddingLeft + " (rootW=" + width + ", headW=" + width2 + ", followW=" + width3 + ", safeMargin=" + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + ')');
        nd0Var.Y1 = paddingLeft;
        if (zl2.r4.F1(nd0Var.S0())) {
            kotlinx.coroutines.flow.f3 f3Var = ((mm2.n0) nd0Var.P0(mm2.n0.class)).f329271p;
            if ((f3Var != null ? (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue() : null) != null) {
                com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var, null, false, 1, null);
            }
        }
    }
}
