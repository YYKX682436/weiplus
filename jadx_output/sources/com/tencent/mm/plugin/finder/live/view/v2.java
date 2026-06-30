package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class v2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116729d;

    public v2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
        this.f116729d = finderLiveCameraOptBeautyPowerfulDetailsView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116729d;
        finderLiveCameraOptBeautyPowerfulDetailsView.setAlpha(1.0f);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
        finderLiveCameraOptBeautyPowerfulDetailsView.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116729d;
        finderLiveCameraOptBeautyPowerfulDetailsView.setAlpha(0.0f);
        finderLiveCameraOptBeautyPowerfulDetailsView.setVisibility(0);
    }
}
