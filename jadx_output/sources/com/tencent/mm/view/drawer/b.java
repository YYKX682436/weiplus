package com.tencent.mm.view.drawer;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f213581d;

    public b(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        this.f213581d = recyclerViewDrawerSquares;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f213581d;
        recyclerViewDrawerSquares.getHeight();
        recyclerViewDrawerSquares.getTranslationY();
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener = recyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((recyclerViewDrawerSquares.getTranslationY() * 1.0f) / recyclerViewDrawerSquares.getHeight());
        }
    }
}
