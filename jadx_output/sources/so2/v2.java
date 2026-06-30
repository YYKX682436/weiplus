package so2;

/* loaded from: classes3.dex */
public final class v2 {

    /* renamed from: b, reason: collision with root package name */
    public int f410647b;

    /* renamed from: c, reason: collision with root package name */
    public long f410648c;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f410651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f410652g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f410653h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f410654i;

    /* renamed from: m, reason: collision with root package name */
    public long f410658m;

    /* renamed from: n, reason: collision with root package name */
    public r45.nw1 f410659n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f410660o;

    /* renamed from: p, reason: collision with root package name */
    public int f410661p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f410662q;

    /* renamed from: r, reason: collision with root package name */
    public r45.v74 f410663r;

    /* renamed from: s, reason: collision with root package name */
    public r45.qt2 f410664s;

    /* renamed from: t, reason: collision with root package name */
    public km2.n f410665t;

    /* renamed from: u, reason: collision with root package name */
    public r45.o72 f410666u;

    /* renamed from: v, reason: collision with root package name */
    public r45.la2 f410667v;

    /* renamed from: w, reason: collision with root package name */
    public r45.rk0 f410668w;

    /* renamed from: x, reason: collision with root package name */
    public r45.ow1 f410669x;

    /* renamed from: y, reason: collision with root package name */
    public r45.a84 f410670y;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f410646a = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f410649d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f410650e = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f410655j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f410656k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f410657l = "";

    public v2() {
        r45.nw1 nw1Var = new r45.nw1();
        nw1Var.set(2, 2);
        this.f410659n = nw1Var;
    }

    public final void a(gk2.e buContext, km2.n nVar, r45.qt2 qt2Var, r45.o72 o72Var) {
        r45.a84 a84Var;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f410646a = ((mm2.c1) buContext.a(mm2.c1.class)).f328852o;
        this.f410647b = ((mm2.c1) buContext.a(mm2.c1.class)).U1;
        this.f410648c = ((mm2.e1) buContext.a(mm2.e1.class)).f328983m;
        this.f410649d = ((mm2.e1) buContext.a(mm2.e1.class)).f328992v;
        this.f410650e = ((mm2.c1) buContext.a(mm2.c1.class)).t7();
        this.f410651f = ((mm2.c1) buContext.a(mm2.c1.class)).f328846n;
        this.f410652g = ((mm2.t2) buContext.a(mm2.t2.class)).f329431m;
        this.f410653h = ((mm2.t2) buContext.a(mm2.t2.class)).f329432n;
        this.f410654i = ((mm2.d) buContext.a(mm2.d.class)).f328942f;
        this.f410655j = ((mm2.d) buContext.a(mm2.d.class)).f328943g;
        this.f410656k = ((mm2.d) buContext.a(mm2.d.class)).f328944h;
        this.f410657l = ((mm2.d) buContext.a(mm2.d.class)).f328945i;
        this.f410658m = ((mm2.c1) buContext.a(mm2.c1.class)).f328861p2;
        this.f410659n = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r;
        this.f410660o = ((mm2.c1) buContext.a(mm2.c1.class)).f328779a6;
        this.f410661p = ((mm2.c1) buContext.a(mm2.c1.class)).f328813h2;
        this.f410662q = ((mm2.e1) buContext.a(mm2.e1.class)).f328985o;
        this.f410663r = ((mm2.e1) buContext.a(mm2.e1.class)).f328980g;
        this.f410665t = dk2.ef.H;
        kotlinx.coroutines.flow.f3 f3Var = ((mm2.n0) buContext.a(mm2.n0.class)).f329271p;
        if (f3Var == null || (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) == null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f410651f;
            if (finderObject == null || (a84Var = qe2.a.g(finderObject)) == null) {
                a84Var = null;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("coAuthorInfo fallback from feed: contactCount=");
                java.util.LinkedList list = a84Var.getList(1);
                sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorEndDataProvider", sb6.toString());
            }
        }
        this.f410670y = a84Var;
        this.f410665t = nVar;
        this.f410664s = qt2Var;
        this.f410666u = o72Var;
    }
}
