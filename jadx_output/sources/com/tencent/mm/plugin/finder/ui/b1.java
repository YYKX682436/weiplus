package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class b1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment f128925d;

    public b1(com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment) {
        this.f128925d = finderBaseConversationFragment;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        qb2.t tVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment.B;
            com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment = this.f128925d;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderBaseConversationFragment.K0().f434606b.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = finderBaseConversationFragment.K0().f434606b.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
            com.tencent.mars.xlog.Log.i("Finder.FinderConversationParentUI", "reportChatExpose:" + w17 + "--" + y17);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (w17 >= 0 && y17 >= w17) {
                if (w17 <= y17) {
                    while (true) {
                        if (finderBaseConversationFragment.w0() instanceof qb2.i0) {
                            wn.a w07 = finderBaseConversationFragment.w0();
                            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
                            qb2.i0 i0Var = (qb2.i0) w07;
                            tVar = (w17 < 0 || w17 >= i0Var.K()) ? (qb2.t) i0Var.f361172n.get(w17 - i0Var.K()) : i0Var.L(w17);
                        } else {
                            java.util.List x17 = finderBaseConversationFragment.w0().x();
                            tVar = x17 != null ? (qb2.t) x17.get(w17) : null;
                        }
                        java.lang.String str = tVar != null ? tVar.field_sessionId : null;
                        if (str == null) {
                            str = "";
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            linkedHashSet.add(str);
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderConversationParentUI", "pageSet" + linkedHashSet + " size:" + linkedHashSet.size());
                com.tencent.mm.plugin.finder.report.a6 a6Var = com.tencent.mm.plugin.finder.report.p.f125224c;
                if (a6Var.f124949a) {
                    a6Var.e(linkedHashSet);
                } else {
                    com.tencent.mm.plugin.finder.report.p.f125223b.e(linkedHashSet);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
