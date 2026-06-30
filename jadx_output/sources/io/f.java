package io;

/* loaded from: classes9.dex */
public final class f implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f293178a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f293179b;

    /* renamed from: c, reason: collision with root package name */
    public nb5.b f293180c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f293178a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f293178a = a17;
        c(null, this.f293180c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.b bVar = (nb5.b) pVar;
        nb5.b bVar2 = this.f293180c;
        this.f293180c = bVar;
        c(bVar2, bVar);
    }

    public final void c(nb5.b bVar, nb5.b bVar2) {
        em.v0 v0Var = this.f293178a;
        v05.b j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.c cVar = new z01.c();
        cVar.f468971t = 1295;
        v05.b j18 = bVar2.j();
        cVar.f468961g = j18 != null ? (s05.d) j18.getCustom(j18.f432315e + 39) : null;
        v05.b j19 = bVar2.j();
        cVar.f468962h = j19 != null ? (v05.a) j19.getCustom(j19.f432315e + 8) : null;
        v05.b j27 = bVar2.j();
        cVar.f468958d = j27 != null ? j27.getString(j27.f368365d + 2) : null;
        cVar.f468959e = bVar2.k();
        cVar.f468964m = com.tencent.mm.R.drawable.d4q;
        v05.b j28 = bVar2.j();
        cVar.f468960f = j28 != null ? j28.getString(j28.f432315e + 12) : null;
        if (bVar2.getBoolean(bVar2.f43702d + 6)) {
            cVar.f468965n = io.e.f293177d;
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f293179b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(cVar);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f293179b = ((bf5.a) Ai).b(context);
        v0Var.b().addView(this.f293179b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f293179b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(cVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293180c;
    }
}
