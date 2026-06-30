package mi5;

/* loaded from: classes9.dex */
public final class o0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326888a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326889b;

    /* renamed from: c, reason: collision with root package name */
    public ob5.a f326890c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326888a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326888a = a17;
        c(null, this.f326890c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ob5.a aVar = (ob5.a) pVar;
        ob5.a aVar2 = this.f326890c;
        this.f326890c = aVar;
        c(aVar2, aVar);
    }

    public final void c(ob5.a aVar, ob5.a aVar2) {
        v05.b k17;
        em.v0 v0Var = this.f326888a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.z zVar = new z01.z();
        aVar2.j();
        l15.c j17 = aVar2.j();
        zVar.f469192d = (j17 == null || (k17 = j17.k()) == null) ? null : (u05.a) k17.getCustom(k17.f432315e + 60);
        zVar.f469193e = com.tencent.mm.R.drawable.d4q;
        zVar.f469195g = new mi5.n0(aVar2);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326889b;
        if (mvvmView != null) {
            mvvmView.setViewModel(zVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326889b = ((bf5.a) Ai).x(context);
        v0Var.b().addView(this.f326889b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326889b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(zVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326890c;
    }
}
