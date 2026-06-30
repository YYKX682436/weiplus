package fn2;

/* loaded from: classes10.dex */
public final class s1 extends com.tencent.mm.plugin.finder.live.widget.x0 {
    public final sf2.d3 F;
    public final fn2.t1 G;
    public final java.lang.String[] H;
    public final java.util.Map I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.content.Context context, sf2.d3 controller, fn2.t1 config) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(config, "config");
        this.F = controller;
        this.G = config;
        this.H = new java.lang.String[]{context.getString(com.tencent.mm.R.string.mnb), context.getString(com.tencent.mm.R.string.mnk)};
        this.I = new java.util.LinkedHashMap();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.x0
    public void v() {
        java.util.LinkedList<com.tencent.mm.ui.widget.dialog.g2> linkedList;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.A;
        if (y1Var != null && (linkedList = y1Var.D) != null) {
            for (com.tencent.mm.ui.widget.dialog.g2 g2Var : linkedList) {
                com.tencent.mm.plugin.finder.live.widget.x0 x0Var = g2Var instanceof com.tencent.mm.plugin.finder.live.widget.x0 ? (com.tencent.mm.plugin.finder.live.widget.x0) g2Var : null;
                if (x0Var != null) {
                    x0Var.v();
                }
            }
        }
        kotlinx.coroutines.y0 y0Var = this.C;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "onDismiss", null, 2, null);
        }
        sf2.j0.l(this.F.f7(), "", false, false, 4, null);
        x();
    }

    public final void x() {
        java.util.Map map = this.I;
        for (fn2.x1 x1Var : ((java.util.LinkedHashMap) map).values()) {
            com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongTabView", "Cleaning up tab: " + x1Var.f264442g);
            int childCount = x1Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = x1Var.getChildAt(i17);
                if (childAt instanceof fn2.y1) {
                    ((fn2.y1) childAt).h();
                }
            }
            x1Var.removeAllViews();
            x1Var.f264445m = false;
        }
        ((java.util.LinkedHashMap) map).clear();
    }
}
