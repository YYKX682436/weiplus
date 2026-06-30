package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sw implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f119848d;

    public sw(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView) {
        this.f119848d = finderLiveTaskBannerView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView2 = this.f119848d;
        if (i17 == finderLiveTaskBannerView2.f117679m && finderLiveTaskBannerView2.f117683q) {
            int i18 = it.arg1;
            this.f119848d.f117685s = i18;
            com.tencent.mm.view.RecyclerHorizontalViewPager pagerView = this.f119848d.getPagerView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            pagerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView3 = this.f119848d;
            java.util.LinkedList linkedList2 = finderLiveTaskBannerView3.f117676g;
            com.tencent.mm.plugin.finder.live.widget.pw pwVar = linkedList2 != null ? (com.tencent.mm.plugin.finder.live.widget.pw) linkedList2.get(i18) : null;
            if (pwVar != null) {
                com.tencent.mm.plugin.finder.assist.x2.f102672a.e(11, ((com.tencent.mm.plugin.finder.live.widget.ow) pwVar).f119330a.getString(2), finderLiveTaskBannerView3.gameAppId);
            }
            if (this.f119848d.f117682p && (linkedList = (finderLiveTaskBannerView = this.f119848d).f117676g) != null) {
                if (i18 == linkedList.size() - 1) {
                    finderLiveTaskBannerView.getPagerView().postDelayed(new com.tencent.mm.plugin.finder.live.widget.rw(finderLiveTaskBannerView), 200L);
                } else {
                    finderLiveTaskBannerView.c();
                }
            }
        }
        return true;
    }
}
