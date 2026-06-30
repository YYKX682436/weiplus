package hd2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment f280538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment) {
        super(1);
        this.f280538d = finderRecommendReasonFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.h7 it = (com.tencent.mm.plugin.finder.feed.model.h7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment = this.f280538d;
        com.tencent.mm.plugin.finder.feed.bs bsVar = finderRecommendReasonFragment.f110059v;
        if (bsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View view = bsVar.f106186s;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.bs bsVar2 = finderRecommendReasonFragment.f110059v;
        if (bsVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View view2 = bsVar2.f106186s;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.bs bsVar3 = finderRecommendReasonFragment.f110059v;
        if (bsVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View view3 = bsVar3.f106186s;
        android.view.View findViewById2 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.ilh) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            android.view.View view4 = findViewById2;
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderRecommendReasonFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader$FinderRecommendReasonResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
