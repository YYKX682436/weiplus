package hd2;

/* loaded from: classes2.dex */
public final class w implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment f280542a;

    public w(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment finderPostPlayFragment) {
        this.f280542a = finderPostPlayFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment finderPostPlayFragment = this.f280542a;
        com.tencent.mm.plugin.finder.feed.ko koVar = finderPostPlayFragment.f110044v;
        if (koVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = koVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.feed.ko koVar2 = finderPostPlayFragment.f110044v;
            if (koVar2 != null) {
                koVar2.getRecyclerView().setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
    }
}
