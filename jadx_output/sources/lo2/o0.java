package lo2;

/* loaded from: classes2.dex */
public final class o0 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI f320160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader f320161b;

    public o0(com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI finderMemberTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader) {
        this.f320160a = finderMemberTimelineUI;
        this.f320161b = finderMemberTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI activity = this.f320160a;
        com.tencent.mm.plugin.finder.feed.hm hmVar = activity.f121418y;
        if (hmVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = hmVar.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = this.f320161b.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$initOnCreate$1$3", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$initOnCreate$1$3", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mm.plugin.finder.feed.hm hmVar2 = activity.f121418y;
        if (hmVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ggVar.Q6(hmVar2.getRecyclerView());
        com.tencent.mm.plugin.finder.feed.hm hmVar3 = activity.f121418y;
        if (hmVar3 != null) {
            hmVar3.getRecyclerView().i(activity.L);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
