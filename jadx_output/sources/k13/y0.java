package k13;

/* loaded from: classes10.dex */
public final class y0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f303286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303287e;

    public y0(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, k13.l1 l1Var) {
        this.f303286d = wxRecyclerAdapter;
        this.f303287e = l1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        i13.c cVar;
        in5.s0 holder = (in5.s0) k3Var;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f303286d;
        k13.l1 l1Var = this.f303287e;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        try {
            int u07 = wxRecyclerAdapter.b0().u0(view);
            if (u07 >= 0 && (cVar = (i13.c) kz5.n0.a0(l1Var.f303239q, u07)) != null) {
                java.util.ArrayList arrayList = l1Var.f303239q;
                if (u07 != 0 || arrayList.size() <= 1) {
                    arrayList.remove(u07);
                    cVar.o();
                    if (l1Var.j()) {
                        ((ku5.t0) ku5.t0.f312615d).B(new k13.c(l1Var));
                    } else {
                        androidx.recyclerview.widget.f2 adapter2 = wxRecyclerAdapter.b0().getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyItemRemoved(u07);
                        }
                        androidx.recyclerview.widget.f2 adapter3 = wxRecyclerAdapter.b0().getAdapter();
                        if (adapter3 != null) {
                            adapter3.notifyItemRangeChanged(u07, arrayList.size() - u07);
                        }
                    }
                } else {
                    l1Var.p(u07 + 1);
                }
                cVar.n(holder, view, i17);
            }
        } catch (java.lang.Throwable th6) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th6.printStackTrace(new java.io.PrintWriter(stringWriter));
            pm0.z.b(xy2.b.f458155b, "finderForceNotifyCrash", false, null, null, false, false, new k13.x0(stringWriter), 60, null);
        }
    }
}
