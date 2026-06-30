package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class co implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView f118015d;

    public co(com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView) {
        this.f118015d = finderLiveLoopBannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.RecyclerHorizontalViewPager pagerView = this.f118015d.getPagerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        pagerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f118015d.f117664i = 0;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView.b(this.f118015d);
    }
}
