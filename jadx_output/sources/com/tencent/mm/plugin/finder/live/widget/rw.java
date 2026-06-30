package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f119691d;

    public rw(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView) {
        this.f119691d = finderLiveTaskBannerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.RecyclerHorizontalViewPager pagerView = this.f119691d.getPagerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        pagerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f119691d.f117685s = 0;
        this.f119691d.c();
    }
}
