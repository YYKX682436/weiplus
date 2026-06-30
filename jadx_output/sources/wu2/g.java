package wu2;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment f449680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader f449681b;

    public g(com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment, com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader) {
        this.f449680a = finderFavFeedFragment;
        this.f449681b = finderFavFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = this.f449680a;
        try {
            com.tencent.mm.plugin.finder.feed.l7 l7Var = finderFavFeedFragment.f129256v;
            if (l7Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View t17 = l7Var.t();
            if (t17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.finder.feed.l7 l7Var2 = finderFavFeedFragment.f129256v;
                if (l7Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = l7Var2.getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                new com.tencent.mm.autogen.events.FeedUpdateEvent().e();
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f449681b.getF123427d(), e17, "view illegal stat", new java.lang.Object[0]);
        }
    }
}
