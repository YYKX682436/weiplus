package st2;

/* loaded from: classes3.dex */
public final class u1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f412463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st2.v1 f412464b;

    public u1(boolean z17, st2.v1 v1Var) {
        this.f412463a = z17;
        this.f412464b = v1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        boolean z18 = this.f412463a;
        st2.v1 v1Var = this.f412464b;
        if (!z17 || fVar.f70616b != 0) {
            if (!z18 && (wxRefreshLayout = v1Var.f412484d) != null) {
                wxRefreshLayout.e(false);
            }
            java.lang.String str = v1Var.f412482b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get pairingTab failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
            return jz5.f0.f302826a;
        }
        r45.xt1 xt1Var = (r45.xt1) ke2.o0.f306976v.a(fVar, new r45.xt1());
        if (xt1Var == null) {
            return null;
        }
        v1Var.f412485e = xt1Var.getBoolean(0);
        v1Var.f412486f = xt1Var.getString(1);
        tt2.i1 i1Var = v1Var.f412487g;
        if (z18) {
            java.util.LinkedList list = xt1Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getPairings(...)");
            i1Var.getClass();
            java.util.ArrayList arrayList = (java.util.ArrayList) i1Var.f421939h;
            arrayList.clear();
            arrayList.addAll(list);
            i1Var.notifyDataSetChanged();
        } else {
            java.util.LinkedList list2 = xt1Var.getList(2);
            kotlin.jvm.internal.o.f(list2, "getPairings(...)");
            i1Var.getClass();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) i1Var.f421939h;
            int size = arrayList2.size();
            arrayList2.addAll(list2);
            i1Var.notifyItemRangeInserted(size, list2.size());
        }
        boolean z19 = v1Var.f412485e;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = v1Var.f412484d;
        if (z19) {
            if (wxRefreshLayout2 == null) {
                return null;
            }
            wxRefreshLayout2.e(true);
        } else {
            if (wxRefreshLayout2 == null) {
                return null;
            }
            wxRefreshLayout2.f();
        }
        return wxRefreshLayout2;
    }
}
