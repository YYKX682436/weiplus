package zk3;

/* loaded from: classes8.dex */
public final class o implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473485d;

    public o(zk3.g0 g0Var) {
        this.f473485d = g0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        android.view.View findViewById;
        androidx.recyclerview.widget.k3 p07;
        android.view.View view2;
        r45.er4 er4Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        zk3.g0 g0Var = this.f473485d;
        g0Var.getClass();
        boolean z17 = java.lang.System.currentTimeMillis() - g0Var.f473450e < g0Var.f473449d;
        g0Var.f473450e = java.lang.System.currentTimeMillis();
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onItemClick: double click check");
            return;
        }
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            java.util.ArrayList arrayList = g0Var.f473452g;
            if (a07 < arrayList.size()) {
                java.lang.Object obj = arrayList.get(a07);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                uk3.a aVar = (uk3.a) obj;
                if (arrayList.size() > 2) {
                    findViewById = g0Var.getRootView().findViewById(com.tencent.mm.R.id.jv9);
                } else {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
                    findViewById = (wxRecyclerView == null || (p07 = wxRecyclerView.p0(1)) == null || (view2 = p07.itemView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.jvd);
                }
                android.view.View view3 = findViewById;
                zk3.h hVar = g0Var.f473459q;
                if (hVar != null) {
                    ((yk3.i) hVar).h(view3, view, a07, aVar.f428524d, true);
                }
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                if (kr4Var == null || (er4Var = (r45.er4) kr4Var.getCustom(6)) == null) {
                    return;
                }
                java.lang.String str = aVar.f428524d.field_id;
                java.lang.String string = er4Var.getString(2);
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = aVar.f428524d;
                int i18 = multiTaskInfo.field_type;
                if (i18 == 2 || i18 == 26) {
                    r45.k97 k97Var = new r45.k97();
                    try {
                        k97Var.parseFrom(multiTaskInfo.field_data);
                    } catch (java.lang.Exception unused) {
                    }
                    string = k97Var.getString(1);
                }
                nk3.f.f338041a.c(aVar.f428524d, a07, 2L, string, kr4Var);
            }
        }
    }
}
