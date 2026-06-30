package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderWeAppHalfScreenScListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderWeAppHalfScreenScListener extends com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f131517f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f131518g;

    public FinderWeAppHalfScreenScListener(boolean z17, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        super(z17);
        this.f131517f = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void c() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.j();
        }
        this.f131518g = true;
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onEnterFullScreen...");
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void d() {
        if (this.f131518g) {
            this.f131518g = false;
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
            com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
            if (mpVar != null) {
                mpVar.i();
            }
        }
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onEnterHalfScreen...");
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenClose... isAnimationBegin=" + z17);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        if (aVar != null) {
            aVar.c(false, z17, 0);
        }
        if (z17) {
            return;
        }
        eq.a.f255778b = false;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar2 = this.f131517f;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f131517f = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenOpen... isAnimationBegin=" + z17);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        if (aVar != null) {
            aVar.c(true, z17, 0);
        }
        eq.a.f255778b = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void g() {
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenPause...");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.m();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void h() {
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenResume...");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.e();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void i(com.tencent.mm.plugin.appbrand.config.HeightInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        int i17 = info.f77392d;
        int i18 = info.f77393e;
        if (i17 > i18) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f131517f;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.tencent.mars.xlog.Log.i("FinderWeAppHalfScreenScListener", "onHeightChanged " + info + " percent：" + f17);
    }
}
