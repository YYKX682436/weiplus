package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ga extends l93.k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super((androidx.appcompat.app.AppCompatActivity) context, baseFinderFeed);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
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
