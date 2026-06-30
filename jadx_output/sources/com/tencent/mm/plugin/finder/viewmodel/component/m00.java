package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o00 f135105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f135108g;

    public m00(com.tencent.mm.plugin.finder.viewmodel.component.o00 o00Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout) {
        this.f135105d = o00Var;
        this.f135106e = baseFinderFeed;
        this.f135107f = z17;
        this.f135108g = trackTipsFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        com.tencent.mm.plugin.finder.viewmodel.component.o00 o00Var = this.f135105d;
        com.tencent.mars.xlog.Log.i(o00Var.f135406d, "hideTips, feedId: " + this.f135106e.getItemId() + ", fromPayLoad: " + this.f135107f);
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = this.f135108g;
        o00Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(trackTipsFrameLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animHideTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        trackTipsFrameLayout.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(trackTipsFrameLayout, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animHideTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        trackTipsFrameLayout.setScaleX(1.0f);
        trackTipsFrameLayout.setScaleY(1.0f);
        android.view.ViewPropertyAnimator animate = trackTipsFrameLayout.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (scaleX = alpha.scaleX(0.5f)) == null || (scaleY = scaleX.scaleY(0.5f)) == null || (duration = scaleY.setDuration(500L)) == null || (listener = duration.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.j00(trackTipsFrameLayout))) == null) {
            return;
        }
        listener.start();
    }
}
