package com.tencent.mm.plugin.listener;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/listener/FinderLiteAppHalfDrawListener;", "Lcom/tencent/mm/plugin/lite/api/LiteAppHalfScreenStatusChangeListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiteAppHalfDrawListener extends com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f143403f;

    public FinderLiteAppHalfDrawListener(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        super(java.lang.Boolean.TRUE);
        this.f143403f = aVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onCloseAnimEnd");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
        eq.a.f255777a = false;
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onCloseAnimStart");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        if (aVar != null) {
            aVar.c(false, true, 0);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void e() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onFullScreenAnimEnd");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.j();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onHeightChanged currentHeight: " + i17 + ", baseHeight: " + i18);
        if (i17 > i18 || i17 <= 0) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void g() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onOpenAnimEnd");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        if (aVar != null) {
            aVar.c(true, false, 0);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void h() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onOpenAnimStart");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        if (aVar != null) {
            aVar.c(true, true, 0);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void i() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.m();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void m() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.e();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void n() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiteAppHalfDrawListener", "onResumeHalfScreenAnimStart");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f143403f;
        com.tencent.mm.plugin.finder.view.mp mpVar = aVar instanceof com.tencent.mm.plugin.finder.view.mp ? (com.tencent.mm.plugin.finder.view.mp) aVar : null;
        if (mpVar != null) {
            mpVar.i();
        }
    }
}
