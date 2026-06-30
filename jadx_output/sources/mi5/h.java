package mi5;

/* loaded from: classes9.dex */
public final class h implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326846a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326847b;

    /* renamed from: c, reason: collision with root package name */
    public ec5.a f326848c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326846a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view == null) {
            em.v0 a17 = em.v0.a(context);
            this.f326846a = a17;
            c(null, this.f326848c);
            view = a17.f254859a;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ec5.a aVar = (ec5.a) pVar;
        ec5.a aVar2 = this.f326848c;
        this.f326848c = aVar;
        c(aVar2, aVar);
    }

    public final void c(ec5.a aVar, ec5.a aVar2) {
        v05.b bVar;
        java.lang.String r17;
        em.v0 v0Var = this.f326846a;
        l15.c j17 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = aVar2.f43702d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(aVar2.getString(i17 + 1), aVar2.getLong(i17 + 0));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new v05.b();
        if (n17.getMsgId() > 0) {
            v05.b bVar2 = (v05.b) h0Var.f310123d;
            java.lang.String j18 = n17.j();
            kotlin.jvm.internal.o.f(j18, "getContent(...)");
            bVar2.fromXml(j18);
        } else {
            l15.c j19 = aVar2.j();
            if (j19 == null || (bVar = j19.k()) == null) {
                bVar = new v05.b();
            }
            h0Var.f310123d = bVar;
        }
        z01.m mVar = new z01.m();
        java.lang.String g17 = ez.v0.f257777a.g((v05.b) h0Var.f310123d);
        if (g17 == null) {
            g17 = "";
        }
        mVar.f469098i = g17;
        v05.b bVar3 = (v05.b) h0Var.f310123d;
        v05.a aVar3 = (v05.a) bVar3.getCustom(bVar3.f432315e + 8);
        java.lang.String f07 = com.tencent.mm.sdk.platformtools.t8.f0(aVar3 != null ? aVar3.getLong(aVar3.f368364d + 0) : 0L);
        if (f07 == null) {
            f07 = "";
        }
        mVar.f469099m = f07;
        mVar.f469100n = com.tencent.mm.R.drawable.d4q;
        v05.b bVar4 = (v05.b) h0Var.f310123d;
        v05.a aVar4 = (v05.a) bVar4.getCustom(bVar4.f432315e + 8);
        java.lang.String str = (aVar4 == null || (r17 = aVar4.r()) == null) ? "" : r17;
        mVar.f469103q = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).fj(false, str, false, false);
        if (!aVar2.getBoolean(i17 + 6)) {
            mVar.D = new mi5.g(aVar2, context, n17, str, this, h0Var);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326847b;
        if (mvvmView != null) {
            if (mvvmView == null) {
                return;
            }
            mvvmView.setViewModel(mVar);
            return;
        }
        int i18 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326847b = ((bf5.a) Ai).s(context);
        v0Var.b().addView(this.f326847b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326847b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(mVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326848c;
    }
}
