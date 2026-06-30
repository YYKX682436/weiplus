package ws2;

/* loaded from: classes3.dex */
public final class r1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449130a;

    public r1(com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
        this.f449130a = finderLiveReplayViewCallback;
    }

    @Override // ym5.q3
    public void b(int i17) {
        r45.mt2 mt2Var;
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449130a;
        android.view.View d17 = finderLiveReplayViewCallback.f124881g.d(com.tencent.mm.R.id.f7r);
        android.view.View findViewById = d17 != null ? d17.findViewById(com.tencent.mm.R.id.imc) : null;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = findViewById instanceof com.tencent.mm.ui.widget.MMProcessBar ? (com.tencent.mm.ui.widget.MMProcessBar) findViewById : null;
        android.view.View d18 = finderLiveReplayViewCallback.f124881g.d(com.tencent.mm.R.id.f7r);
        android.view.View findViewById2 = d18 != null ? d18.findViewById(com.tencent.mm.R.id.ile) : null;
        zs2.c cVar = ws2.k1.f449066r.a().f449070b;
        if ((cVar == null || (mt2Var = cVar.f475246a) == null || mt2Var.getInteger(3) != 0) ? false : true) {
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(8);
            }
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            finderLiveReplayViewCallback.f124881g.N(0);
            com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "live list load finish is show");
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = ((ws2.s0) finderLiveReplayViewCallback.f124879e).f449135f;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
        if (mMProcessBar != null) {
            mMProcessBar.c(com.tencent.mm.R.raw.finder_live_icon_location_loading, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(0);
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "load more progress bar is show");
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "onLoadMoreEnd");
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "onRefreshBegin");
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449130a;
        finderLiveReplayViewCallback.f124881g.post(new ws2.q1(finderLiveReplayViewCallback));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "onRefreshEnd");
    }
}
