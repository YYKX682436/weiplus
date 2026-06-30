package wu2;

/* loaded from: classes2.dex */
public final class t implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment f449702a;

    public t(com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment) {
        this.f449702a = finderLikeFeedGridFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f449702a;
        com.tencent.mm.plugin.finder.feed.kd kdVar = finderLikeFeedGridFragment.f129273v;
        if (kdVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = kdVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.feed.kd kdVar2 = finderLikeFeedGridFragment.f129273v;
            if (kdVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = kdVar2.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            new com.tencent.mm.autogen.events.FeedUpdateEvent().e();
        }
    }
}
