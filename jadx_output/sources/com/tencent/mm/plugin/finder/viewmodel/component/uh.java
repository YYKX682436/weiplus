package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class uh extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f136139b;

    public uh(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        this.f136139b = aiVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        java.util.Iterator it = this.f136139b.f133779f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void c(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        java.util.Iterator it = this.f136139b.f133779f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).f();
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        java.util.Iterator it = this.f136139b.f133779f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
        }
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        java.util.Iterator it = this.f136139b.f133779f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).d();
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar : this.f136139b.f133779f) {
            float f18 = 1.0f;
            float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / (layout.getBorderClose() - layout.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f18 = borderExpand;
            }
            com.tencent.mars.xlog.Log.i("Finder.HalfScreenDrawerUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
