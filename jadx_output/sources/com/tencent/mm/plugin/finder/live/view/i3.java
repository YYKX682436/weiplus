package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView f116370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f116373g;

    public i3(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i17, int i18, int i19) {
        this.f116370d = finderLiveCameraOptBeautyPowerfulSuitView;
        this.f116371e = i17;
        this.f116372f = i18;
        this.f116373g = i19;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView.a(this.f116370d, this.f116371e, this.f116372f, this.f116373g, 1.0f);
    }
}
