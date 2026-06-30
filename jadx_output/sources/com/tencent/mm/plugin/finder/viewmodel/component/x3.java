package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x3 extends l93.k0 {
    public x3(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity, baseFinderFeed);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView nullListener onDrawerTranslation percent:" + f17);
    }

    @Override // l93.k0, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        super.b();
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView nullListener onDrawerDetach");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView nullListener onDrawerOpen isOpen:" + z17 + " isBegin:" + z18);
    }
}
