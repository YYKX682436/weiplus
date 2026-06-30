package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class g3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView f116320d;

    public g3(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
        this.f116320d = finderLiveCameraOptBeautyPowerfulSuitView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f116320d;
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView.d(finderLiveCameraOptBeautyPowerfulSuitView, finderLiveCameraOptBeautyPowerfulSuitView.suitMode ? 1.0f : 0.0f);
    }
}
