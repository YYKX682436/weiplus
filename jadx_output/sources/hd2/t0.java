package hd2;

/* loaded from: classes2.dex */
public final class t0 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment f280536a;

    public t0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment) {
        this.f280536a = finderRecommendReasonFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment = this.f280536a;
        com.tencent.mm.plugin.finder.feed.bs bsVar = finderRecommendReasonFragment.f110059v;
        if (bsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = bsVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.feed.bs bsVar2 = finderRecommendReasonFragment.f110059v;
            if (bsVar2 != null) {
                bsVar2.getRecyclerView().setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
    }
}
