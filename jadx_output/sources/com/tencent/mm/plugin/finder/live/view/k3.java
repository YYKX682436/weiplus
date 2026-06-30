package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView f116437f;

    public k3(int i17, int i18, com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
        this.f116435d = i17;
        this.f116436e = i18;
        this.f116437f = finderLiveCameraOptBeautyPowerfulSuitView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView.c(this.f116437f, this.f116435d, this.f116436e, 1.0f);
    }
}
