package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class fl extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView f132111d;

    public fl(com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView finderSpeedIndicatorView) {
        this.f132111d = finderSpeedIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f132111d.f131482u = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f132111d.f131482u = null;
    }
}
