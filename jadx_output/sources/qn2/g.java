package qn2;

/* loaded from: classes3.dex */
public final class g extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365065d;

    public g(qn2.n nVar) {
        this.f365065d = nVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        r45.jz1 jz1Var;
        java.util.LinkedList list;
        r45.cz1 cz1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int x17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x();
        qn2.n nVar = this.f365065d;
        qn2.c0 c0Var = nVar.Y;
        if (c0Var != null) {
            r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
            if (!(ht1Var != null && ht1Var.getInteger(3) == 1) || x17 < 0 || x17 < c0Var.getItemCount() - nVar.E) {
                pm0.v.X(new qn2.m(nVar, 8));
            } else {
                km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
                java.lang.String string = (zVar == null || (cz1Var = zVar.f309232d) == null) ? null : cz1Var.getString(0);
                if (!nVar.Z && string != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load more product,product size:");
                    r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
                    sb6.append((ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.getCustom(4)) == null || (list = jz1Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list.size()));
                    com.tencent.mars.xlog.Log.i(nVar.B, sb6.toString());
                    nVar.Z = true;
                    pm0.v.X(new qn2.m(nVar, 0));
                    dk2.xf W0 = nVar.W0();
                    if (W0 != null) {
                        r45.ht1 ht1Var3 = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
                        ((dk2.r4) W0).N(string, ht1Var3 != null ? ht1Var3.getByteString(2) : null, new qn2.b(nVar));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
