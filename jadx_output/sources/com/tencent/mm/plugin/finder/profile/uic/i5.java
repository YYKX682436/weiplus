package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(1);
        this.f123783d = finderProfileFeedUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout2;
        android.view.View view;
        float tabLayoutHeight;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader2;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout3;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader3;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout4;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader4;
        kotlin.jvm.internal.o.g((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchEndCallback] totalSize=");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123783d;
        feedLoader = finderProfileFeedUIC.getFeedLoader();
        sb6.append(feedLoader.getSize());
        com.tencent.mars.xlog.Log.i("Finder.ProfileFeedUIC", sb6.toString());
        rlLayout = finderProfileFeedUIC.getRlLayout();
        rlLayout.E(true);
        rlLayout2 = finderProfileFeedUIC.getRlLayout();
        on5.c loadMoreFooter = rlLayout2.getLoadMoreFooter();
        if (loadMoreFooter != null && (view = loadMoreFooter.getView()) != null) {
            android.content.Context context = view.getContext();
            tabLayoutHeight = finderProfileFeedUIC.tabLayoutHeight();
            int a17 = ym5.x.a(context, tabLayoutHeight);
            if (finderProfileFeedUIC.isSelfFlag()) {
                feedLoader3 = finderProfileFeedUIC.getFeedLoader();
                if (feedLoader3.getSize() > 0) {
                    rlLayout4 = finderProfileFeedUIC.getRlLayout();
                    rlLayout4.C(ym5.x.a(view.getContext(), 120.0f) + a17);
                    android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hpy);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.oas);
                        if (findViewById2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (!((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125217p) {
                                feedLoader4 = finderProfileFeedUIC.getFeedLoader();
                                if (feedLoader4.getSize() > 0) {
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125218q = true;
                                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125217p = true;
                                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                    android.content.Context context2 = findViewById2.getContext();
                                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                    o3Var.Lk(context2, false, true);
                                }
                            }
                            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.h5(finderProfileFeedUIC));
                        }
                    }
                }
            }
            feedLoader2 = finderProfileFeedUIC.getFeedLoader();
            if (feedLoader2.getSize() <= 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                rlLayout3 = finderProfileFeedUIC.getRlLayout();
                rlLayout3.C(ym5.x.a(view.getContext(), 120.0f) + a17);
            }
        }
        return jz5.f0.f302826a;
    }
}
