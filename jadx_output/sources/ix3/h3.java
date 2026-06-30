package ix3;

/* loaded from: classes.dex */
public final class h3 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f295431d;

    public h3(ix3.j3 j3Var) {
        this.f295431d = j3Var;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        ex3.e item = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        event.getRawX();
        this.f295431d.getClass();
        event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e dataItem = (ex3.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        ix3.j3 j3Var = this.f295431d;
        r45.dp5 dp5Var = dataItem.f257209f;
        int i18 = dataItem.f257208e;
        if (i18 != 3) {
            if (i18 == 2) {
                j3Var.getClass();
                q55.e eVar = (q55.e) ix3.y0.f295612e.get(dp5Var.getString(0));
                if (eVar != null) {
                    int m17 = bm5.o1.f22719a.m(eVar);
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) j3Var.getActivity(), 2, false);
                    k0Var.f211872n = new ix3.c3(k0Var, m17);
                    k0Var.f211881s = new ix3.d3(eVar, dataItem, j3Var);
                    k0Var.v();
                    return;
                }
                return;
            }
            return;
        }
        j3Var.getClass();
        java.lang.String string = dp5Var.getString(0);
        java.util.List f07 = string != null ? r26.n0.f0(string, new java.lang.String[]{"_"}, false, 0, 6, null) : null;
        java.util.LinkedList list = dp5Var.getList(3);
        if (!(list.size() > 0)) {
            list = null;
        }
        if (list != null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) j3Var.getActivity(), 2, false);
            k0Var2.f211872n = new ix3.e3(list, dp5Var, j3Var, dataItem, k0Var2);
            k0Var2.f211881s = new ix3.f3(dp5Var, f07, dataItem, j3Var);
            k0Var2.v();
            return;
        }
        vw3.q5 q5Var = new vw3.q5(j3Var.getActivity(), dp5Var.getString(1), dataItem.f257210g, new ix3.g3(f07, dataItem, j3Var, dp5Var));
        q5Var.show();
        android.view.Window window = q5Var.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
