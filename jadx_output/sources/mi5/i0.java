package mi5;

/* loaded from: classes9.dex */
public final class i0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326857a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326858b;

    /* renamed from: c, reason: collision with root package name */
    public jd5.b f326859c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326857a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326857a = a17;
        c(null, this.f326859c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.b bVar = (jd5.b) pVar;
        jd5.b bVar2 = this.f326859c;
        this.f326859c = bVar;
        c(bVar2, bVar);
    }

    public final void c(jd5.b bVar, jd5.b bVar2) {
        java.util.ArrayList arrayList;
        em.v0 v0Var = this.f326857a;
        if (bVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.v vVar = new z01.v();
        java.util.LinkedList<oi3.g> j17 = bVar2.j();
        if (j17 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
            for (oi3.g gVar : j17) {
                kotlin.jvm.internal.o.d(context);
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(gVar.getString(gVar.f345617d + 3), gVar.getLong(gVar.f345617d + 0));
                if (k17 == null) {
                    return;
                }
                b11.f fVar = new b11.f();
                fVar.q(k17.getMsgId());
                fVar.s(k17.Q0());
                fVar.p(java.lang.String.valueOf(k17.getCreateTime()));
                fVar.n(k17.getCreateTime());
                arrayList.add(new b11.e(jz5.h.b(new mi5.h0(k17, this, context, fVar)), fVar));
            }
        } else {
            arrayList = null;
        }
        vVar.f469167e = arrayList;
        if (this.f326858b == null) {
            int i17 = q31.r.f359919c1;
            i95.m c17 = i95.n0.c(q31.r.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
            kotlin.jvm.internal.o.d(context);
            this.f326858b = ((bf5.a) Ai).m(context);
            v0Var.b().addView(this.f326858b, -1, -1);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326858b;
        if (mvvmView == null) {
            return;
        }
        mvvmView.setViewModel(vVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326859c;
    }
}
