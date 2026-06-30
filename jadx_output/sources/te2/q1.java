package te2;

/* loaded from: classes3.dex */
public final class q1 implements te2.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418345d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418346e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f418347f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.j0 f418348g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f418349h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.d7 f418350i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.h7 f418351m;

    public q1(android.view.View root, com.tencent.mm.ui.MMActivity activity, gk2.e liveData, te2.j0 j0Var) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f418345d = root;
        this.f418346e = activity;
        this.f418347f = liveData;
        this.f418348g = j0Var;
        this.f418349h = "FinderLiveAnchorMusicViewCallback";
    }

    public void a(java.util.List musicData) {
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(musicData, "musicData");
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f418350i;
        if (d7Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(d7Var, null, true, (int) (com.tencent.mm.ui.bl.b(d7Var.f118183e).y * 0.75f), 1, null);
            com.tencent.mars.xlog.Log.i(d7Var.K, "showMusicView size:" + musicData.size());
            android.view.View view = d7Var.P;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = d7Var.T;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = d7Var.U;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = d7Var.f118084y0;
            if (wxRecyclerView != null) {
                wxRecyclerView.setVisibility(0);
            }
            android.widget.ProgressBar progressBar = d7Var.f118083x0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            d7Var.e0(false);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = d7Var.f118084y0;
            if (wxRecyclerView2 == null || (viewTreeObserver = wxRecyclerView2.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.a7(d7Var));
        }
    }

    public void d(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f418350i;
        if (d7Var != null) {
            if (z17) {
                com.tencent.mm.plugin.finder.live.widget.e0.W(d7Var, null, true, (int) (com.tencent.mm.ui.bl.b(d7Var.f118183e).y * 0.75f), 1, null);
            }
            android.view.View view = d7Var.P;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = d7Var.T;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = d7Var.U;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ProgressBar progressBar = d7Var.f118083x0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            d7Var.e0(false);
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418346e;
    }
}
