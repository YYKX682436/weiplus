package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes10.dex */
public final class g extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.l f129016d;

    public g(com.tencent.mm.plugin.finder.ui.conv.l lVar) {
        this.f129016d = lVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment finderConvSearchFeedFragment;
        int i19;
        yz5.a aVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager : null;
        java.lang.String str2 = "onScrolled";
        if (finderStaggeredGridLayoutManager == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int[] iArr = new int[finderStaggeredGridLayoutManager.f11920d];
        finderStaggeredGridLayoutManager.u(iArr);
        java.lang.Integer j07 = kz5.z.j0(iArr);
        int intValue = j07 != null ? j07.intValue() : 0;
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.f129016d;
        java.util.Iterator it = lVar.f129024c.f129012d.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) next;
            com.tencent.mm.plugin.finder.ui.conv.n nVar = cVar instanceof com.tencent.mm.plugin.finder.ui.conv.n ? (com.tencent.mm.plugin.finder.ui.conv.n) cVar : null;
            if (nVar != null && intValue >= i27) {
                android.widget.TextView textView = lVar.f129036o;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("dateHeaderTv");
                    throw null;
                }
                str = str2;
                textView.setText(com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(nVar.f129039d), lVar.f129022a));
            } else {
                str = str2;
            }
            str2 = str;
            i27 = i28;
        }
        java.lang.String str3 = str2;
        if (i18 > 0 && (i19 = (finderConvSearchFeedFragment = lVar.f129023b).B) > 0) {
            int[] iArr2 = new int[finderStaggeredGridLayoutManager.f11920d];
            finderStaggeredGridLayoutManager.v(iArr2);
            java.lang.Integer h07 = kz5.z.h0(iArr2);
            if (lVar.f129024c.f129012d.size() - (h07 != null ? h07.intValue() : 0) <= i19 && (aVar = finderConvSearchFeedFragment.C) != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback$initCenter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", str3, "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
