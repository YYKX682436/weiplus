package ix3;

/* loaded from: classes.dex */
public final class l3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final ex3.e f295488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f295489e;

    public l3(ix3.o3 o3Var, ex3.e dataItem, int i17) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        this.f295489e = o3Var;
        this.f295488d = dataItem;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        j75.f stateCenter;
        hx3.b bVar;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2;
        j75.f stateCenter2;
        hx3.b bVar2;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            ex3.e eVar = this.f295488d;
            ix3.o3 o3Var = this.f295489e;
            if (itemId == 0) {
                bm5.o1 o1Var = bm5.o1.f22719a;
                bm5.h0 h0Var = bm5.h0.RepairerConfig_Inner_TopKey_String;
                java.lang.String k17 = o1Var.k(h0Var, "");
                com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: ".concat(k17));
                java.util.List f07 = r26.n0.f0(k17, new java.lang.String[]{","}, false, 0, 6, null);
                if (kz5.n0.O(f07, eVar.f257209f.getString(0))) {
                    return;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList(f07);
                linkedList.add(0, eVar.f257209f.getString(0));
                o1Var.o(h0Var, kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null));
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = o3Var.P6();
                if (!((P6 == null || (stateCenter = P6.getStateCenter()) == null || (bVar = (hx3.b) stateCenter.getState()) == null || !bVar.f285658e) ? false : true) || (mvvmList = o3Var.f295516d) == null) {
                    return;
                }
                mvvmList.o(new ex3.e(0, 0, eVar.f257209f, eVar.f257210g), false);
                return;
            }
            if (itemId != 1) {
                return;
            }
            bm5.o1 o1Var2 = bm5.o1.f22719a;
            bm5.h0 h0Var2 = bm5.h0.RepairerConfig_Inner_TopKey_String;
            java.lang.String k18 = o1Var2.k(h0Var2, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: ".concat(k18));
            java.util.List f08 = r26.n0.f0(k18, new java.lang.String[]{","}, false, 0, 6, null);
            if (kz5.n0.O(f08, eVar.f257209f.getString(0))) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList(f08);
                linkedList2.remove(eVar.f257209f.getString(0));
                o1Var2.o(h0Var2, kz5.n0.g0(linkedList2, ",", null, null, 0, null, null, 62, null));
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = o3Var.P6();
                if (!((P62 == null || (stateCenter2 = P62.getStateCenter()) == null || (bVar2 = (hx3.b) stateCenter2.getState()) == null || !bVar2.f285658e) ? false : true) || (mvvmList2 = o3Var.f295516d) == null) {
                    return;
                }
                mvvmList2.u(new ex3.e(0, 0, eVar.f257209f, eVar.f257210g));
            }
        }
    }
}
