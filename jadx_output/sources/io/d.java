package io;

/* loaded from: classes9.dex */
public final class d implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f293172a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f293173b;

    /* renamed from: c, reason: collision with root package name */
    public nb5.b f293174c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f293172a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f293172a = a17;
        c(null, this.f293174c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.b bVar = (nb5.b) pVar;
        nb5.b bVar2 = this.f293174c;
        this.f293174c = bVar;
        c(bVar2, bVar);
    }

    public final void c(nb5.b bVar, nb5.b bVar2) {
        s05.d dVar;
        s05.d dVar2;
        em.v0 v0Var = this.f293172a;
        java.lang.String str = null;
        v05.b j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.b bVar3 = new z01.b();
        bVar3.f468951n = 1295;
        v05.b j18 = bVar2.j();
        bVar3.f468947g = j18 != null ? (s05.d) j18.getCustom(j18.f432315e + 39) : null;
        v05.b j19 = bVar2.j();
        bVar3.f468944d = j19 != null ? j19.getString(j19.f368365d + 2) : null;
        bVar3.f468945e = bVar2.k();
        bVar3.f468948h = com.tencent.mm.R.drawable.d4q;
        v05.b j27 = bVar2.j();
        if (j27 != null && (dVar2 = (s05.d) j27.getCustom(j27.f432315e + 39)) != null) {
            str = dVar2.r();
        }
        bVar3.f468946f = str;
        v05.b j28 = bVar2.j();
        bVar3.f468949i = (j28 == null || (dVar = (s05.d) j28.getCustom(j28.f432315e + 39)) == null) ? 0 : dVar.j();
        if (bVar2.getBoolean(bVar2.f43702d + 6)) {
            bVar3.f468950m = io.c.f293169d;
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f293173b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(bVar3);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f293173b = ((bf5.a) Ai).c(context);
        v0Var.b().addView(this.f293173b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f293173b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(bVar3);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293174c;
    }
}
