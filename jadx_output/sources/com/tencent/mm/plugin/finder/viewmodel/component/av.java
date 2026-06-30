package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class av extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f133805b;

    public av(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        this.f133805b = finderProfileDrawerUIC;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this.f133805b;
        finderProfileDrawerUIC.f133626n = false;
        finderProfileDrawerUIC.R6(true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(finderProfileDrawerUIC.f133619d);
        java.util.Iterator it = finderProfileDrawerUIC.f133629q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this.f133805b;
        finderProfileDrawerUIC.f133626n = true;
        finderProfileDrawerUIC.R6(false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(finderProfileDrawerUIC.f133619d);
        java.util.Iterator it = finderProfileDrawerUIC.f133629q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar : this.f133805b.f133629q) {
            float f18 = 1.0f;
            float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / (layout.getBorderClose() - layout.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f18 = borderExpand;
            }
            com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
