package io;

/* loaded from: classes9.dex */
public final class r implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f293425a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f293426b;

    /* renamed from: c, reason: collision with root package name */
    public jd5.a f293427c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f293425a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f293425a = a17;
        c(null, this.f293427c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.a aVar = (jd5.a) pVar;
        jd5.a aVar2 = this.f293427c;
        this.f293427c = aVar;
        c(aVar2, aVar);
    }

    public final void c(jd5.a aVar, jd5.a aVar2) {
        em.v0 v0Var = this.f293425a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        if (aVar2.n() <= 0 || aVar2.j() <= 0) {
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.sdk.platformtools.x.r0(aVar2.k(), pInt, pInt2);
            aVar2.r(pInt.value);
            aVar2.o(pInt2.value);
        }
        z01.q qVar = new z01.q();
        java.lang.String k17 = aVar2.k();
        int i17 = qVar.f469144i;
        qVar.set(i17 + 0, k17);
        qVar.set(i17 + 1, java.lang.Integer.valueOf(aVar2.j()));
        qVar.set(i17 + 2, java.lang.Integer.valueOf(aVar2.n()));
        qVar.f469141f = new io.q(aVar2, context);
        int i18 = aVar2.f43702d;
        if (aVar2.getLong(i18 + 0) > 0) {
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(aVar2.getString(i18 + 1), aVar2.getLong(i18 + 0));
            oi3.f fVar = new oi3.f();
            c01.gb.a(fVar, n17);
            qVar.set(i17 + 9, fVar);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f293426b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(qVar);
            return;
        }
        int i19 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f293426b = ((bf5.a) Ai).t(context);
        v0Var.b().addView(this.f293426b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f293426b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(qVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293427c;
    }
}
