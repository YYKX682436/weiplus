package dv2;

/* loaded from: classes2.dex */
public final class w0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.a1 f243967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager f243968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f243969f;

    public w0(dv2.a1 a1Var, com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager finderRedPacketScaleLayoutManager, android.widget.Button button) {
        this.f243967d = a1Var;
        this.f243968e = finderRedPacketScaleLayoutManager;
        this.f243969f = button;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager finderRedPacketScaleLayoutManager = this.f243968e;
            dv2.a1 a1Var = this.f243967d;
            int O6 = dv2.a1.O6(a1Var, finderRedPacketScaleLayoutManager);
            if (O6 >= 0 && O6 < a1Var.f243807e.size()) {
                java.lang.Object obj = a1Var.f243807e.get(O6);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                this.f243969f.setEnabled(((r45.m66) obj).getInteger(2) > 0);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = a1Var.f243811i;
            if (wxRecyclerAdapter != null) {
                int i18 = 0;
                for (java.lang.Object obj2 : wxRecyclerAdapter.getData()) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ((vs2.a) obj2).f439872e = O6 == i18;
                    i18 = i19;
                }
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
