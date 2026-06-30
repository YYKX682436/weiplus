package ks2;

/* loaded from: classes8.dex */
public final class j extends com.tencent.mm.plugin.finder.view.e3 {
    public final android.content.Context E;
    public final ks2.b F;
    public androidx.recyclerview.widget.RecyclerView G;
    public android.view.View H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f311611J;
    public final ks2.m K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(android.content.Context context, java.lang.String username) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        this.E = context;
        ks2.b bVar = new ks2.b(this);
        this.F = bVar;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dh7, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, (int) ((i65.a.k(context) + com.tencent.mm.ui.bk.p(context)) * kx2.a.f313278a.a(context))));
        this.f131975y.addView(inflate, 0);
        if (inflate instanceof android.view.ViewGroup) {
            this.G = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.qd6);
            this.H = inflate.findViewById(com.tencent.mm.R.id.ilp);
            this.I = inflate.findViewById(com.tencent.mm.R.id.jsw);
            this.f311611J = inflate.findViewById(com.tencent.mm.R.id.m2h);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.G;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.G;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(bVar);
            }
            a();
            this.f131965o = true;
            k();
            android.view.View view = this.f311611J;
            if (view != null) {
                view.setOnClickListener(new ks2.i(this));
            }
        }
        ks2.m mVar = new ks2.m(username);
        this.K = mVar;
        androidx.lifecycle.j0 j0Var = mVar.f311615b;
        if (j0Var != null) {
            j0Var.observe((androidx.lifecycle.y) context, new ks2.a(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.e3
    public void i() {
        j();
        super.i();
    }

    public final void j() {
        ks2.m mVar = this.K;
        if (mVar == null || mVar.f311617d || mVar.f311616c) {
            return;
        }
        mVar.f311617d = true;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ks2.k kVar = new ks2.k(mVar);
        ks2.l lVar = new ks2.l(mVar);
        java.lang.String finderUsername = mVar.f311614a;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        pm0.v.T(new bq.y0(finderUsername, 2).l(), new cq.a1(kVar, lVar));
    }

    public final void k() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.G;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.view.View view = this.H;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.I;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f311611J;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
