package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout f144413d;

    public h(com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout) {
        this.f144413d = scrollableFrameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = this.f144413d;
        com.tencent.mm.plugin.lite.ui.c uiEventListener = scrollableFrameLayout.getUiEventListener();
        if (uiEventListener != null) {
            uiEventListener.b(scrollableFrameLayout.getHorizontalScroll() ? scrollableFrameLayout.getTranslationX() : scrollableFrameLayout.getTranslationY());
        }
    }
}
