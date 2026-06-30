package lo2;

/* loaded from: classes2.dex */
public final class q0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI f320165d;

    public q0(com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI finderMemberTimelineUI) {
        this.f320165d = finderMemberTimelineUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI finderMemberTimelineUI = this.f320165d;
        com.tencent.mm.plugin.finder.feed.hm hmVar = finderMemberTimelineUI.f121418y;
        if (hmVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (hmVar.f106928r != y17) {
            hmVar.f106928r = y17;
            if (finderMemberTimelineUI.E == 0) {
                if (finderMemberTimelineUI.f121419z == null) {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
                if (y17 == r2.getDataList().size() - 1) {
                    com.tencent.mm.plugin.finder.feed.hm hmVar2 = finderMemberTimelineUI.f121418y;
                    if (hmVar2 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    if (hmVar2.f106929s) {
                        android.view.View findViewById = finderMemberTimelineUI.findViewById(com.tencent.mm.R.id.g8o);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.view.View findViewById2 = finderMemberTimelineUI.findViewById(com.tencent.mm.R.id.g8o);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pm0.v.X(new lo2.r0(finderMemberTimelineUI));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
