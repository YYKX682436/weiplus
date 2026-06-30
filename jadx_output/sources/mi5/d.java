package mi5;

/* loaded from: classes9.dex */
public final class d implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326810a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326811b;

    /* renamed from: c, reason: collision with root package name */
    public pb5.a f326812c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326810a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326810a = a17;
        c(null, this.f326812c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        pb5.a aVar = (pb5.a) pVar;
        pb5.a aVar2 = this.f326812c;
        this.f326812c = aVar;
        c(aVar2, aVar);
    }

    public final void c(pb5.a aVar, pb5.a aVar2) {
        em.v0 v0Var = this.f326810a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.j jVar = new z01.j();
        jVar.f469059d = aVar2.j();
        jVar.f469060e = com.tencent.mm.R.drawable.d4q;
        jVar.f469062g = new mi5.c(aVar2);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326811b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(jVar);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326811b = ((bf5.a) Ai).i(context);
        v0Var.b().addView(this.f326811b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326811b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(jVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326812c;
    }
}
