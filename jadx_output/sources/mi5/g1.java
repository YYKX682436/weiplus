package mi5;

/* loaded from: classes9.dex */
public final class g1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326843a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326844b;

    /* renamed from: c, reason: collision with root package name */
    public oe5.d f326845c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326843a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326843a = a17;
        c(null, this.f326845c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.d dVar = (oe5.d) pVar;
        oe5.d dVar2 = this.f326845c;
        this.f326845c = dVar;
        c(dVar2, dVar);
    }

    public final void c(oe5.d dVar, oe5.d dVar2) {
        l15.c j17;
        java.lang.String d17;
        bw5.mc0 b17;
        bw5.g60 e17;
        em.v0 v0Var = this.f326843a;
        if (dVar2 == null || v0Var == null || (j17 = dVar2.j()) == null || j17.k() == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        l15.c j18 = dVar2.j();
        java.lang.String xml = j18 != null ? j18.toXml() : null;
        ot0.q v17 = !(xml == null || xml.length() == 0) ? ot0.q.v(xml) : null;
        il4.a aVar = v17 != null ? (il4.a) v17.y(il4.a.class) : null;
        bw5.o50 o50Var = aVar != null ? aVar.f292095e : null;
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f27701e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            if (!(d17.length() > 0)) {
                d17 = null;
            }
            if (d17 != null) {
                ((lz5.e) b18).add(d17);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        z01.f0 f0Var = new z01.f0();
        f0Var.f469008d = context.getResources().getString(com.tencent.mm.R.string.piq);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String nickname = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        objArr[0] = nickname;
        java.lang.String name = o50Var != null ? o50Var.getName() : null;
        objArr[1] = name != null ? name : "";
        f0Var.f469009e = resources.getString(com.tencent.mm.R.string.pir, objArr);
        kotlin.jvm.internal.o.g(a17, "<set-?>");
        f0Var.f469011g = a17;
        f0Var.f469010f = com.tencent.mm.R.drawable.d4q;
        f0Var.f469012h = new mi5.f1(dVar2);
        if (this.f326844b == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            this.f326844b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).o(context);
            v0Var.b().addView(this.f326844b, -1, -1);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326844b;
        if (mvvmView == null) {
            return;
        }
        mvvmView.setViewModel(f0Var);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326845c;
    }
}
