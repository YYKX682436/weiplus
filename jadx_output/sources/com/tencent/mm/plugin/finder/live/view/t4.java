package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class t4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f116691d;

    public t4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer) {
        this.f116691d = finderLiveFloatContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116691d;
        finderLiveFloatContainer.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.getDefaultTranslationY();
        android.view.ViewGroup.LayoutParams layoutParams2 = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
        finderLiveFloatContainer.setTranslationX(com.tencent.mm.ui.bl.b(finderLiveFloatContainer.getContext()).x / 2);
        finderLiveFloatContainer.setBackground(finderLiveFloatContainer.B);
        finderLiveFloatContainer.getClass();
        finderLiveFloatContainer.f115864r = 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116691d;
        finderLiveFloatContainer.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.getDefaultTranslationY();
        android.view.ViewGroup.LayoutParams layoutParams2 = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
        finderLiveFloatContainer.setTranslationX(com.tencent.mm.ui.bl.b(finderLiveFloatContainer.getContext()).x / 2);
        finderLiveFloatContainer.setBackground(finderLiveFloatContainer.B);
        finderLiveFloatContainer.getClass();
        finderLiveFloatContainer.f115864r = 0;
    }
}
