package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f135239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f135240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o00 f135241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135242g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f135243h;

    public n00(com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout, com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout2, com.tencent.mm.plugin.finder.viewmodel.component.o00 o00Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        this.f135239d = trackTipsFrameLayout;
        this.f135240e = trackTipsFrameLayout2;
        this.f135241f = o00Var;
        this.f135242g = baseFinderFeed;
        this.f135243h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = this.f135239d;
        if (trackTipsFrameLayout.visibilityManager.O6(trackTipsFrameLayout.f109065e)) {
            com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout2 = this.f135240e;
            trackTipsFrameLayout2.setVisibility(0);
            com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout3 = this.f135239d;
            com.tencent.mm.plugin.finder.viewmodel.component.o00 o00Var = this.f135241f;
            o00Var.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(trackTipsFrameLayout3, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animShowTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            trackTipsFrameLayout3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(trackTipsFrameLayout3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animShowTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            trackTipsFrameLayout3.setScaleX(0.5f);
            trackTipsFrameLayout3.setScaleY(0.5f);
            android.view.ViewPropertyAnimator animate = trackTipsFrameLayout3.animate();
            if (animate != null && (alpha = animate.alpha(1.0f)) != null && (scaleX = alpha.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(500L)) != null) {
                duration.start();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realShowTips, feedId: ");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135242g;
            sb6.append(baseFinderFeed.getItemId());
            sb6.append(", fromPayLoad: ");
            boolean z17 = this.f135243h;
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i(o00Var.f135406d, sb6.toString());
            trackTipsFrameLayout2.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.m00(o00Var, baseFinderFeed, z17, trackTipsFrameLayout), 5000L);
        }
    }
}
