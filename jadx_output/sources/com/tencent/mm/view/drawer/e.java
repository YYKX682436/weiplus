package com.tencent.mm.view.drawer;

/* loaded from: classes8.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f213585d;

    public e(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        this.f213585d = recyclerViewDrawerSquares;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openDrawer] setUpdateListener height:");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f213585d;
        sb6.append(recyclerViewDrawerSquares.getHeight());
        sb6.append(", translationY:");
        sb6.append(recyclerViewDrawerSquares.getTranslationY());
        com.tencent.mars.xlog.Log.i("DrawerSquares", sb6.toString());
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener = recyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((recyclerViewDrawerSquares.getTranslationY() * 1.0f) / recyclerViewDrawerSquares.getHeight());
        }
    }
}
