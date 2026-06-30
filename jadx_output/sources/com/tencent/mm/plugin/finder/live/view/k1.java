package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView f116429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116430f;

    public k1(int i17, com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView, int i18) {
        this.f116428d = i17;
        this.f116429e = finderLiveAnchorDataPanelView;
        this.f116430f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        int animatedFraction = (int) (it.getAnimatedFraction() * this.f116428d);
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView = this.f116429e;
        finderLiveAnchorDataPanelView.getLayoutParams().height = this.f116430f + animatedFraction;
        finderLiveAnchorDataPanelView.requestLayout();
    }
}
