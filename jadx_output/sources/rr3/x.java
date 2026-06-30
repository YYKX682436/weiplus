package rr3;

/* loaded from: classes3.dex */
public final class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr3.z f399217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.tc5 f399218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f399219c;

    public x(rr3.z zVar, r45.tc5 tc5Var, int i17) {
        this.f399217a = zVar;
        this.f399218b = tc5Var;
        this.f399219c = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        rr3.z zVar = this.f399217a;
        if (zVar.getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.i("NewBizInfoAuthScopeUIC", "activity.isFinishing");
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = zVar.f399224g;
            if (u3Var != null) {
                u3Var.dismiss();
                zVar.f399224g = null;
            }
            com.tencent.mars.xlog.Log.i("NewBizInfoAuthScopeUIC", "mode: cgi result: " + fVar.f70615a + ", " + fVar.f70616b);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                db5.t7.h(zVar.getActivity(), zVar.getActivity().getResources().getString(com.tencent.mm.R.string.f490946bc0));
                r45.n14 n14Var = qr3.o.f366102m;
                if (n14Var != null) {
                    java.util.LinkedList<r45.tc5> privacy_scope_item_list = n14Var.f380992f;
                    kotlin.jvm.internal.o.f(privacy_scope_item_list, "privacy_scope_item_list");
                    for (r45.tc5 tc5Var : privacy_scope_item_list) {
                        if (kotlin.jvm.internal.o.b(tc5Var.f386310d, this.f399218b.f386310d)) {
                            tc5Var.f386312f = this.f399219c;
                        }
                    }
                    androidx.recyclerview.widget.RecyclerView O6 = zVar.O6();
                    if (O6 != null && (adapter = O6.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            } else {
                db5.t7.g(zVar.getContext(), zVar.getContext().getResources().getString(com.tencent.mm.R.string.bc_));
            }
        }
        return jz5.f0.f302826a;
    }
}
