package on2;

/* loaded from: classes3.dex */
public final class k1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f346955d;

    public k1(on2.a2 a2Var) {
        this.f346955d = a2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.dt1 dt1Var = (r45.dt1) obj;
        on2.a2 a2Var = this.f346955d;
        if (!a2Var.f346837t.isShown()) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelWidget", "updateLotteryList but invisible!");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = a2Var.f346837t;
        kotlin.jvm.internal.o.f(recyclerView, "access$getLotteryList$p(...)");
        kotlin.jvm.internal.o.d(dt1Var);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = a2Var.getBasePlugin();
        boolean z17 = basePlugin != null && ((mm2.c1) basePlugin.P0(mm2.c1.class)).S;
        on2.j1 j1Var = a2Var.f346840w;
        j1Var.getClass();
        java.util.LinkedList list = dt1Var.getList(1);
        java.util.ArrayList arrayList = j1Var.f346945d;
        arrayList.clear();
        if (!zl2.r4.f473950a.m()) {
            kotlin.jvm.internal.o.d(list);
            pm0.v.d0(list, on2.i1.f346936d);
        }
        if (!(list == null || list.isEmpty())) {
            arrayList.addAll(list);
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((r45.dz1) it.next()).getInteger(0) == dt1Var.getInteger(2)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0 && i17 < j1Var.getItemCount()) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new zl2.f3(recyclerView, i17, 0));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelListAdapter", "updateLotteryList haveJoinLive:" + z17 + ", locationPos:" + i17 + ",location_id:" + dt1Var.getInteger(2) + ", itemCount:" + j1Var.getItemCount() + ',');
        }
        j1Var.f346946e = z17;
        j1Var.notifyDataSetChanged();
    }
}
