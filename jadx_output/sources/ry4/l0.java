package ry4;

/* loaded from: classes.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401661e;

    public l0(ry4.d1 d1Var, java.util.List list) {
        this.f401660d = d1Var;
        this.f401661e = list;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.List list;
        if (menuItem.getItemId() == 1) {
            ry4.d1 d1Var = this.f401660d;
            d1Var.getClass();
            java.util.List list2 = this.f401661e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue() + 1));
            }
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                list = d1Var.f401610f;
                boolean z17 = false;
                if (!hasNext) {
                    break;
                }
                int intValue = ((java.lang.Number) it6.next()).intValue();
                if (intValue >= 0 && intValue < ((java.util.ArrayList) list).size()) {
                    z17 = true;
                }
                if (z17) {
                    ((java.util.ArrayList) list).remove(intValue);
                }
            }
            ry4.g gVar = d1Var.f401609e;
            if (gVar == null) {
                return;
            }
            gVar.f401630n.clear();
            gVar.f401626g.invoke(0);
            gVar.notifyDataSetChanged();
            d1Var.Z6();
            d1Var.W6(arrayList.size(), arrayList);
            d1Var.X6(kz5.n0.S0(list));
            d1Var.f401611g = kz5.n0.S0(list);
            if (((java.util.ArrayList) list).isEmpty()) {
                d1Var.T6();
            }
        }
    }
}
