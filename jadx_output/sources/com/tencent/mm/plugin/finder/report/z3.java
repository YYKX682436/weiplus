package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z3 extends fc2.u {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f125487r;

    /* renamed from: s, reason: collision with root package name */
    public long f125488s;

    public z3(fc2.c cVar) {
        super(cVar);
        this.f125487r = "Finder.FinderSingleFeedFlowEventSubscriber";
        this.f125488s = -1L;
    }

    @Override // fc2.o
    public fc2.a c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fc2.t tVar = (fc2.t) h(i17);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            tVar.f260986e = linearLayoutManager.t();
            tVar.f260988g = linearLayoutManager.x();
            tVar.f260987f = linearLayoutManager.w();
            tVar.f260989h = linearLayoutManager.y();
            tVar.f260990i = linearLayoutManager.getItemCount();
            tVar.f260991j = i17;
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            int i19 = tVar.f260987f;
            int i27 = tVar.f260989h;
            java.util.Set otherCareType = hc2.o0.f280337b;
            kotlin.jvm.internal.o.g(otherCareType, "otherCareType");
            com.tencent.mm.plugin.finder.assist.p0 g17 = hc2.f1.g(recyclerView, i19, i27, otherCareType);
            tVar.f260992k = g17.f102439b;
            tVar.f260993l = g17.f102440c;
            java.lang.String str = g17.f102441d;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            tVar.f260995n = str;
            tVar.f260996o = g17.f102442e;
            so2.j5 j5Var = g17.f102446i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null) {
                baseFinderFeed.n1(true);
            }
            tVar.f260994m = g17.f102444g;
        }
        fc2.w wVar = (fc2.w) tVar;
        wVar.f261000p = this.f125488s;
        wVar.f261001q = this.f260960e;
        wVar.f261002r = this.f260961f;
        android.graphics.Rect globalVisibleRect = this.f260959d;
        kotlin.jvm.internal.o.g(globalVisibleRect, "globalVisibleRect");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if ((adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) && (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager3).y();
            com.tencent.mars.xlog.Log.i(this.f125487r, "[getVisibleFeedListByAdapterPosRange] old=" + recyclerView.getChildCount() + " new=" + ((y17 - w17) + 1));
            if (w17 <= y17) {
                while (true) {
                    androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
                    if (p07 != null) {
                        android.view.View itemView = p07.itemView;
                        kotlin.jvm.internal.o.f(itemView, "itemView");
                        if (p07 instanceof in5.s0) {
                            in5.c cVar = (in5.c) ((in5.s0) p07).f293125i;
                            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
                            int a07 = w17 - wxRecyclerAdapter.a0();
                            if ((cVar instanceof so2.j5) && cVar.getItemId() != 0) {
                                fc2.r rVar = new fc2.r((so2.j5) cVar, a07, null, 4, null);
                                boolean z17 = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
                                android.util.LongSparseArray longSparseArray = wxRecyclerAdapter.f213721z;
                                if (z17) {
                                    in5.v0 v0Var = (in5.v0) longSparseArray.get(cVar.getItemId());
                                    if (v0Var != null) {
                                        if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar).getFeedObject().getFoldedLayout() != null) {
                                            recyclerView.getChildVisibleRect(itemView, new android.graphics.Rect(), null);
                                        }
                                        rVar.f260979c = v0Var;
                                    }
                                } else {
                                    in5.v0 v0Var2 = (in5.v0) longSparseArray.get(cVar.getItemId());
                                    if (v0Var2 != null) {
                                        rVar.f260979c = v0Var2;
                                    }
                                }
                                if (!(cVar instanceof so2.i1)) {
                                    linkedList.add(rVar);
                                }
                            }
                        }
                    }
                    if (w17 == y17) {
                        break;
                    }
                    w17++;
                }
            }
        }
        wVar.f261004t = linkedList;
        wVar.f261005u = linkedList2;
        int i28 = this.f260960e;
        int i29 = wVar.f260987f;
        if (i28 != i29 || this.f260961f != wVar.f260989h) {
            if (i28 == Integer.MAX_VALUE || (i18 = this.f260961f) == Integer.MAX_VALUE) {
                i18 = wVar.f260989h;
            } else {
                if (i29 < i28) {
                    i28 = i29;
                }
                int i37 = wVar.f260989h;
                if (i37 > i18) {
                    i18 = i37;
                }
                i29 = i28;
            }
            wVar.f261003s = hc2.f1.m(recyclerView, i29, i18);
        }
        this.f125488s = wVar.f260992k;
        this.f260960e = wVar.f260987f;
        this.f260961f = wVar.f260989h;
        return wVar;
    }

    @Override // fc2.o
    public void e() {
        super.e();
        this.f125488s = -1L;
    }

    public fc2.a h(int i17) {
        return new fc2.w(i17);
    }
}
