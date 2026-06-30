package mi5;

/* loaded from: classes9.dex */
public final class b implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326796a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326797b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.g f326798c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326796a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326796a = a17;
        c(null, this.f326798c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.g gVar = (fc5.g) pVar;
        fc5.g gVar2 = this.f326798c;
        this.f326798c = gVar;
        c(gVar2, gVar);
    }

    public final void c(fc5.g gVar, fc5.g gVar2) {
        x05.c cVar;
        em.v0 v0Var = this.f326796a;
        java.lang.String j17 = gVar2 != null ? gVar2.j() : null;
        if (gVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(j17);
        v05.b k17 = cVar2.k();
        if (k17 == null || (cVar = (x05.c) k17.getCustom(k17.f432315e + 57)) == null) {
            return;
        }
        z01.d dVar = new z01.d();
        dVar.f468978d = com.tencent.mm.R.drawable.d4q;
        dVar.f468985n = new mi5.a(this, context, cVar, gVar2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String nickname = cVar.getNickname();
        ((ke0.e) xVar).getClass();
        dVar.f468980f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname);
        dVar.f468979e = cVar.l();
        dVar.f468981g = cVar.k();
        ze5.n2 n2Var = ze5.o2.f472124a;
        kotlin.jvm.internal.o.d(context);
        n2Var.b(dVar, context, cVar.j(), cVar.getAuthIconUrl());
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326797b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(dVar);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f326797b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).f(context);
        v0Var.b().addView(this.f326797b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326797b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(dVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326798c;
    }
}
