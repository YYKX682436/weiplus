package com.tencent.mm.plugin.finder.live.widget;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.do, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cdo implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView f118134d;

    public Cdo(com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView) {
        this.f118134d = finderLiveLoopBannerView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            int i17 = it.arg1;
            this.f118134d.f117664i = i17;
            com.tencent.mm.view.RecyclerHorizontalViewPager pagerView = this.f118134d.getPagerView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            pagerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            if (this.f118134d.f117665m) {
                java.util.LinkedList dataList = this.f118134d.getDataList();
                com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView = this.f118134d;
                if (i17 == dataList.size() - 1) {
                    finderLiveLoopBannerView.getPagerView().postDelayed(new com.tencent.mm.plugin.finder.live.widget.co(finderLiveLoopBannerView), 200L);
                } else {
                    com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView.b(finderLiveLoopBannerView);
                }
            }
        }
        return true;
    }
}
