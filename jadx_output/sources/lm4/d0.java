package lm4;

/* loaded from: classes14.dex */
public final class d0 extends mm4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f319556a;

    public d0(lm4.i0 i0Var) {
        this.f319556a = i0Var;
    }

    @Override // mm4.g
    public void b(lm4.b0 layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        lm4.i0 i0Var = this.f319556a;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = i0Var.f319568d;
        java.util.Iterator it = i0Var.f319576o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(false, false, 0);
        }
    }

    @Override // mm4.g
    public void c(lm4.b0 layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        lm4.i0 i0Var = this.f319556a;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = i0Var.f319568d;
        java.util.Iterator it = i0Var.f319576o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
        }
    }

    @Override // mm4.g
    public void e(lm4.b0 layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.e(layout, f17, source);
        lm4.i0 i0Var = this.f319556a;
        for (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar : i0Var.f319576o) {
            float f18 = 1.0f;
            float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / (layout.getBorderClose() - layout.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f18 = borderExpand;
            }
            com.tencent.mars.xlog.Log.i(i0Var.f319575n, "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
