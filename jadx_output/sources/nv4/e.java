package nv4;

/* loaded from: classes12.dex */
public final class e extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f340721d;

    /* renamed from: e, reason: collision with root package name */
    public final nv4.f f340722e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f340723f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f340724g;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, nv4.f ctx) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        this.f340721d = recyclerView;
        this.f340722e = ctx;
        this.f340723f = true;
        this.f340724g = new java.util.LinkedHashMap();
        recyclerView.i(this);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new nv4.c(this));
        }
        recyclerView.post(new nv4.b(this));
    }

    public final void a() {
        int i17;
        int i18;
        java.lang.String str;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        int i19;
        java.util.Map map;
        java.lang.String str2;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Boolean bool;
        java.lang.String v17;
        nv4.e eVar = this;
        if (!eVar.f340723f) {
            com.tencent.mars.xlog.Log.i("FTSExposeChecker", "doTrace: not visible");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = eVar.f340721d.getLayoutManager();
        if (layoutManager2 == null) {
            return;
        }
        boolean z17 = false;
        if (layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2;
            i17 = linearLayoutManager.w();
            i18 = linearLayoutManager.y();
        } else if (layoutManager2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager2;
            int i27 = staggeredGridLayoutManager.f11920d;
            int[] iArr = new int[i27];
            int[] iArr2 = new int[i27];
            staggeredGridLayoutManager.u(iArr);
            staggeredGridLayoutManager.v(iArr2);
            int i28 = iArr[0];
            int i29 = iArr2[0];
            for (int i37 = 1; i37 < i27; i37++) {
                int i38 = iArr[i37];
                if (i28 > i38) {
                    i28 = i38;
                }
            }
            for (int i39 = 1; i39 < i27; i39++) {
                int i47 = iArr2[i39];
                if (i29 < i47) {
                    i29 = i47;
                }
            }
            i17 = i28;
            i18 = i29;
        } else {
            i17 = -1;
            i18 = -1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (intValue > intValue2) {
            return;
        }
        while (true) {
            java.util.Map map2 = eVar.f340724g;
            nv4.f fVar = eVar.f340722e;
            jv4.n nVar = (jv4.n) kz5.n0.a0(((nv4.a) fVar).f340717a.a(), intValue);
            if (nVar == null || (str = nVar.v()) == null) {
                str = "";
            }
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
            java.lang.Object obj = linkedHashMap2.get(str);
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(obj, bool2)) {
                layoutManager = layoutManager2;
            } else {
                android.view.View findViewByPosition = layoutManager2.findViewByPosition(intValue);
                fVar.getClass();
                if (findViewByPosition == null) {
                    layoutManager = layoutManager2;
                    i19 = intValue;
                    map = map2;
                    str2 = "";
                    linkedHashMap = linkedHashMap2;
                    bool = bool2;
                } else {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    if (findViewByPosition.getLocalVisibleRect(rect)) {
                        double height = findViewByPosition.getHeight();
                        double width = findViewByPosition.getWidth();
                        layoutManager = layoutManager2;
                        double d17 = rect.left;
                        str2 = "";
                        double d18 = rect.top;
                        linkedHashMap = linkedHashMap2;
                        bool = bool2;
                        double d19 = rect.right;
                        i19 = intValue;
                        map = map2;
                        double d27 = rect.bottom;
                        if ((d17 == 0.0d ? d19 == width ? d18 == 0.0d ? !((d27 > height ? 1 : (d27 == height ? 0 : -1)) == 0) ? d27 / height : 1.0d : (height - d18) / height : d19 / width : (width - d17) / width) * 100 >= 50) {
                            z17 = true;
                        }
                    } else {
                        layoutManager = layoutManager2;
                        i19 = intValue;
                        map = map2;
                        str2 = "";
                        linkedHashMap = linkedHashMap2;
                        bool = bool2;
                    }
                    z17 = false;
                }
                if (z17) {
                    nv4.a aVar = (nv4.a) fVar;
                    intValue = i19;
                    jv4.n nVar2 = (jv4.n) kz5.n0.a0(aVar.f340717a.a(), intValue);
                    java.lang.String str3 = (nVar2 == null || (v17 = nVar2.v()) == null) ? str2 : v17;
                    java.lang.Boolean bool3 = bool;
                    if (!kotlin.jvm.internal.o.b(linkedHashMap.get(str3), bool3)) {
                        map.put(str3, bool3);
                        jv4.n nVar3 = (jv4.n) kz5.n0.a0(aVar.f340717a.a(), intValue);
                        if (nVar3 != null) {
                            nVar3.w();
                        }
                    }
                } else {
                    intValue = i19;
                }
            }
            if (intValue == intValue2) {
                return;
            }
            intValue++;
            eVar = this;
            layoutManager2 = layoutManager;
            z17 = false;
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        a();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
