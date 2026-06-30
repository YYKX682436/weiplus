package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f116600d;

    public q4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer) {
        this.f116600d = finderLiveFloatContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116600d;
        int i17 = finderLiveFloatContainer.f115864r;
        finderLiveFloatContainer.getClass();
        if (i17 == 0) {
            finderLiveFloatContainer.setTranslationX(finderLiveFloatContainer.f115859m);
            android.graphics.drawable.Drawable drawable = finderLiveFloatContainer.B;
        } else {
            finderLiveFloatContainer.setTranslationX(finderLiveFloatContainer.f115858i);
            android.graphics.drawable.Drawable drawable2 = finderLiveFloatContainer.B;
        }
        yz5.a onAnimCallback = finderLiveFloatContainer.getOnAnimCallback();
        if (onAnimCallback != null) {
            onAnimCallback.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116600d;
        int i17 = finderLiveFloatContainer.f115864r;
        finderLiveFloatContainer.getClass();
        finderLiveFloatContainer.setBackground(i17 == 0 ? finderLiveFloatContainer.B : finderLiveFloatContainer.A);
        yz5.a onAnimCallback = finderLiveFloatContainer.getOnAnimCallback();
        if (onAnimCallback != null) {
            onAnimCallback.invoke();
        }
    }
}
