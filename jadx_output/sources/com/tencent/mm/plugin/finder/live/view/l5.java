package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes8.dex */
public final class l5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView f116458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView f116459b;

    public l5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView) {
        this.f116458a = finderLiveGameWelfareTaskProgressView;
        this.f116459b = finderLiveGameWelfareTaskProgressItemView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#render animatorOut onAnimationEnd");
        this.f116458a.f115925g.removeView(this.f116459b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
