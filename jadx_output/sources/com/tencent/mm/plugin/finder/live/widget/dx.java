package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class dx extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118168d;

    public dx(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        this.f118168d = rxVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.lang.String str;
        r45.f62 f62Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f118168d;
        com.tencent.mars.xlog.Log.i(rxVar.I, "[onScrollStateChanged] newState:" + i17);
        rxVar.Y = true;
        if (i17 == 0 || i17 == 2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            com.tencent.mars.xlog.Log.i(rxVar.I, "[onCardSelected] pos = " + w17 + ", oldSelectedPos = " + rxVar.f0().f438132e);
            if (rxVar.f0().f438132e != w17) {
                vm2.y f07 = rxVar.f0();
                if (f07.f438132e != w17) {
                    f07.f438132e = w17;
                    f07.notifyDataSetChanged();
                }
                android.widget.TextView textView = rxVar.L;
                if (textView == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    throw null;
                }
                java.util.LinkedList linkedList = rxVar.S;
                if (linkedList == null || (f62Var = (r45.f62) kz5.n0.a0(linkedList, w17)) == null || (str = f62Var.getString(10)) == null) {
                    str = "";
                }
                textView.setText(str);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = rxVar.N;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("timeRv");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    int t17 = linearLayoutManager.t();
                    int t18 = linearLayoutManager.t();
                    if (w17 <= t17) {
                        androidx.recyclerview.widget.RecyclerView recyclerView3 = rxVar.N;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.o.o("timeRv");
                            throw null;
                        }
                        recyclerView3.postDelayed(new com.tencent.mm.plugin.finder.live.widget.jx(rxVar, w17), 100L);
                    }
                    if (w17 >= t18) {
                        androidx.recyclerview.widget.RecyclerView recyclerView4 = rxVar.N;
                        if (recyclerView4 == null) {
                            kotlin.jvm.internal.o.o("timeRv");
                            throw null;
                        }
                        recyclerView4.postDelayed(new com.tencent.mm.plugin.finder.live.widget.kx(rxVar, w17, t18, t17), 100L);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
