package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lq {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f135077a;

    public lq(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        this.f135077a = aVar;
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderNpsContainerState", "onHalfScreenClose... isAnimationBegin=" + z17);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f135077a;
        if (aVar != null) {
            aVar.c(false, z17, 0);
        }
        if (z17) {
            return;
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar2 = this.f135077a;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f135077a = null;
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderNpsContainerState", "onHalfScreenOpen... isAnimationBegin=" + z17);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f135077a;
        if (aVar != null) {
            aVar.c(true, z17, 0);
        }
    }

    public final void c(float f17) {
        if (f17 > 1.0f || f17 < 0.0f) {
            return;
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f135077a;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.tencent.mars.xlog.Log.i("FinderNpsContainerState", "onHeightChanged percent：" + f17);
    }
}
