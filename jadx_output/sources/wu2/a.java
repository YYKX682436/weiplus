package wu2;

/* loaded from: classes2.dex */
public final class a implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment f449672a;

    public a(com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment) {
        this.f449672a = finderAllFeedGridFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment = this.f449672a;
        com.tencent.mm.plugin.finder.feed.d dVar = finderAllFeedGridFragment.f129250x;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = dVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.feed.d dVar2 = finderAllFeedGridFragment.f129250x;
            if (dVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = dVar2.getRecyclerView();
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(0);
        }
    }
}
