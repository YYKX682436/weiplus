package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class s4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f116670e;

    public s4(yz5.a aVar, com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer) {
        this.f116669d = aVar;
        this.f116670e = finderLiveFloatContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f116669d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116670e;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.getDefaultTranslationY();
        finderLiveFloatContainer.getClass();
        finderLiveFloatContainer.f115864r = 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f116669d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116670e;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.getDefaultTranslationY();
        finderLiveFloatContainer.getClass();
        finderLiveFloatContainer.f115864r = 0;
    }
}
