package i33;

/* loaded from: classes10.dex */
public final class w0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.y0 f288283d;

    public w0(i33.y0 y0Var) {
        this.f288283d = y0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.lang.String str = this.f288283d.f288290f;
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.Set set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i18 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        i33.y0 y0Var = this.f288283d;
        i33.t0 t0Var = (i33.t0) ((jz5.n) y0Var.f288292h).getValue();
        if (t0Var != null && t0Var.f288248g) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        j33.x xVar = y0Var.f288291g;
        if ((xVar != null && xVar.f297472i) && xVar != null && !xVar.f297471h) {
            if (xVar.f297473m == null || xVar.f297474n == null) {
                xVar.f297472i = false;
            } else {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = xVar.f297467d;
                int w17 = linearLayoutManager.w();
                int y17 = linearLayoutManager.y();
                e06.k kVar = xVar.f297473m;
                e06.k kVar2 = null;
                java.lang.String str = xVar.f297470g;
                if (kVar != null && w17 < kVar.f246209d) {
                    com.tencent.mars.xlog.Log.i(str, "checkInvalidRecheckUnBindRange: up range null, vis:[" + w17 + ',' + y17 + ']');
                    xVar.f297473m = null;
                }
                e06.k kVar3 = xVar.f297474n;
                if (kVar3 != null && y17 > kVar3.f246210e) {
                    com.tencent.mars.xlog.Log.i(str, "checkInvalidRecheckUnBindRange: down range null, vis:[" + w17 + ',' + y17 + ']');
                    xVar.f297474n = null;
                }
                e06.k kVar4 = xVar.f297474n;
                if (kVar4 != null || xVar.f297473m != null) {
                    e06.k kVar5 = xVar.f297473m;
                    if (kVar5 != null && w17 >= kVar5.f246209d && w17 <= kVar5.f246210e) {
                        kVar2 = kVar5;
                    } else if (kVar4 != null && y17 >= kVar4.f246209d && y17 <= kVar4.f246210e) {
                        kVar2 = kVar4;
                    }
                }
                if (kVar2 != null) {
                    e06.k kVar6 = new e06.k(w17, y17);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    kz5.x0 it = kVar6.iterator();
                    while (true) {
                        boolean z17 = ((e06.j) it).f246214f;
                        set = xVar.f297475o;
                        if (!z17) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int intValue = ((java.lang.Number) next).intValue();
                        if (!set.contains(java.lang.Integer.valueOf(intValue)) && kVar2.m(intValue)) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ((java.lang.Number) kz5.n0.X(arrayList2)).intValue();
                        ((java.lang.Number) kz5.n0.i0(arrayList2)).intValue();
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            int intValue2 = ((java.lang.Number) it6.next()).intValue();
                            androidx.recyclerview.widget.RecyclerView recyclerView2 = xVar.f297468e;
                            androidx.recyclerview.widget.k3 p07 = recyclerView2.p0(intValue2);
                            if (p07 != null) {
                                androidx.recyclerview.widget.f2 adapter = recyclerView2.getAdapter();
                                if (adapter != null) {
                                    adapter.onBindViewHolder(p07, intValue2);
                                }
                                set.add(java.lang.Integer.valueOf(intValue2));
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollPerformanceUIC$improveScrollGallery$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
