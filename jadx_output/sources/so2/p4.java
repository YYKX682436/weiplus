package so2;

/* loaded from: classes2.dex */
public final class p4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f410536d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f410537e;

    public p4(int i17, java.lang.ref.WeakReference rPopupUIC) {
        kotlin.jvm.internal.o.g(rPopupUIC, "rPopupUIC");
        this.f410536d = i17;
        this.f410537e = rPopupUIC;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar;
        r45.f03 f03Var;
        so2.a2 a2Var;
        so2.s4 s4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            int x17 = linearLayoutManager != null ? linearLayoutManager.x() : -1;
            if (x17 != -1 && (nuVar = (com.tencent.mm.plugin.finder.viewmodel.component.nu) this.f410537e.get()) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollIdle updateFinderPopupScroll tabType:");
                int i18 = this.f410536d;
                sb6.append(i18);
                sb6.append(" scroll update, ");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
                android.util.SparseArray sparseArray = nuVar.f135353d;
                so2.o4 o4Var = sparseArray != null ? (so2.o4) sparseArray.get(i18) : null;
                if (((o4Var == null || (a2Var = o4Var.f410524a) == null || (s4Var = a2Var.f410251h) == null) ? null : s4Var.f410592a) == so2.r4.f410574d) {
                    sb7.append("finder popup tips is show!");
                    com.tencent.mars.xlog.Log.w("Finder.FinderPopupUIC", sb7.toString());
                } else {
                    if (o4Var != null) {
                        if (o4Var.f410528e != x17) {
                            nuVar.f135354e++;
                            o4Var.f410529f = android.os.SystemClock.elapsedRealtime();
                            o4Var.f410528e = x17;
                        }
                        sb7.append("swipeCnt=" + nuVar.f135354e);
                    } else {
                        sb7.append("tabPopupCache is empty;");
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb7.toString());
                    com.tencent.mm.plugin.finder.extension.reddot.a aVar = nuVar.f135355f;
                    if (aVar != null && (f03Var = aVar.f105328b) != null) {
                        r45.hp2 hp2Var = f03Var.E;
                        r45.fp2 fp2Var = hp2Var != null ? hp2Var.f376377g : null;
                        int i19 = fp2Var != null ? fp2Var.f374503d : 0;
                        if (1 <= i19 && i19 <= nuVar.f135354e) {
                            nuVar.P6("onScrollIdle", i18);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
