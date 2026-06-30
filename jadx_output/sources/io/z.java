package io;

/* loaded from: classes9.dex */
public final class z implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f293443a;

    /* renamed from: b, reason: collision with root package name */
    public jd5.c f293444b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f293445c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f293443a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f293443a = a17;
        c(null, this.f293444b);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.c cVar = (jd5.c) pVar;
        jd5.c cVar2 = this.f293444b;
        this.f293444b = cVar;
        c(cVar2, cVar);
    }

    public final void c(jd5.c cVar, jd5.c cVar2) {
        em.v0 v0Var = this.f293443a;
        if (cVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.j0 j0Var = new z01.j0();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        j0Var.f469063d = m11.b1.Di().b3(cVar2.getThumbPath(), i65.a.g(context), context, com.tencent.mm.R.drawable.bzt);
        j0Var.f469069m = cVar2.getVideoDuration();
        j0Var.f469081y = new io.y(cVar2, context);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f293445c;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(j0Var);
            return;
        }
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f293445c = ((bf5.a) Ai).z(context);
        v0Var.b().addView(this.f293445c, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f293445c;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(j0Var);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293444b;
    }
}
