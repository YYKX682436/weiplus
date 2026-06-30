package mi5;

/* loaded from: classes9.dex */
public final class f0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326831a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326832b;

    /* renamed from: c, reason: collision with root package name */
    public id5.a f326833c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326831a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326831a = a17;
        c(null, this.f326833c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        id5.a aVar = (id5.a) pVar;
        id5.a aVar2 = this.f326833c;
        this.f326833c = aVar;
        c(aVar2, aVar);
    }

    public final void c(id5.a aVar, id5.a aVar2) {
        em.v0 v0Var = this.f326831a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.s sVar = new z01.s();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = aVar2.f43702d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(aVar2.getString(i17 + 1), aVar2.getLong(i17 + 0));
        if (n17.getMsgId() > 0) {
            o15.b bVar = new o15.b();
            java.lang.String j17 = n17.j();
            if (j17 == null) {
                j17 = "";
            }
            bVar.fromXml(j17);
            sVar.f469158f = bVar.j();
            sVar.f469156d = java.lang.Long.valueOf(n17.getMsgId());
            sVar.f469157e = n17.Q0();
        } else {
            o15.b j18 = aVar2.j();
            sVar.f469158f = j18 != null ? j18.j() : null;
        }
        sVar.f469159g = com.tencent.mm.R.drawable.d4q;
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326832b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(sVar);
            return;
        }
        int i18 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326832b = ((bf5.a) Ai).l(context);
        v0Var.b().addView(this.f326832b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326832b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(sVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326833c;
    }
}
