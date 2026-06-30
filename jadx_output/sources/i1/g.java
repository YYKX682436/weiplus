package i1;

/* loaded from: classes13.dex */
public final class g extends i1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public e1.r f286894b;

    /* renamed from: c, reason: collision with root package name */
    public float f286895c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f286896d;

    /* renamed from: e, reason: collision with root package name */
    public float f286897e;

    /* renamed from: f, reason: collision with root package name */
    public float f286898f;

    /* renamed from: g, reason: collision with root package name */
    public e1.r f286899g;

    /* renamed from: h, reason: collision with root package name */
    public int f286900h;

    /* renamed from: i, reason: collision with root package name */
    public int f286901i;

    /* renamed from: j, reason: collision with root package name */
    public float f286902j;

    /* renamed from: k, reason: collision with root package name */
    public float f286903k;

    /* renamed from: l, reason: collision with root package name */
    public float f286904l;

    /* renamed from: m, reason: collision with root package name */
    public float f286905m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f286906n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f286907o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f286908p;

    /* renamed from: q, reason: collision with root package name */
    public g1.n f286909q;

    /* renamed from: r, reason: collision with root package name */
    public final e1.p0 f286910r;

    /* renamed from: s, reason: collision with root package name */
    public final e1.p0 f286911s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f286912t;

    /* renamed from: u, reason: collision with root package name */
    public final i1.c0 f286913u;

    public g() {
        super(null);
        this.f286895c = 1.0f;
        int i17 = i1.p1.f287001a;
        this.f286896d = kz5.p0.f313996d;
        this.f286897e = 1.0f;
        this.f286900h = 0;
        this.f286901i = 0;
        this.f286902j = 4.0f;
        this.f286904l = 1.0f;
        this.f286906n = true;
        this.f286907o = true;
        this.f286908p = true;
        this.f286910r = e1.k.a();
        this.f286911s = e1.k.a();
        this.f286912t = jz5.h.a(jz5.i.f302831f, i1.f.f286890d);
        this.f286913u = new i1.c0();
    }

    @Override // i1.d0
    public void a(g1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        if (this.f286906n) {
            i1.c0 c0Var = this.f286913u;
            ((java.util.ArrayList) c0Var.f286846a).clear();
            e1.p0 p0Var = this.f286910r;
            ((e1.i) p0Var).c();
            java.util.List nodes = this.f286896d;
            kotlin.jvm.internal.o.g(nodes, "nodes");
            ((java.util.ArrayList) c0Var.f286846a).addAll(nodes);
            c0Var.c(p0Var);
            e();
        } else if (this.f286908p) {
            e();
        }
        this.f286906n = false;
        this.f286908p = false;
        e1.r rVar = this.f286894b;
        e1.p0 p0Var2 = this.f286911s;
        if (rVar != null) {
            g1.h.f(iVar, p0Var2, rVar, this.f286895c, null, null, 0, 56, null);
        }
        e1.r rVar2 = this.f286899g;
        if (rVar2 != null) {
            g1.n nVar = this.f286909q;
            if (this.f286907o || nVar == null) {
                nVar = new g1.n(this.f286898f, this.f286902j, this.f286900h, this.f286901i, null, 16, null);
                this.f286909q = nVar;
                this.f286907o = false;
            }
            g1.h.f(iVar, p0Var2, rVar2, this.f286897e, nVar, null, 0, 48, null);
        }
    }

    public final void e() {
        android.graphics.Path path;
        e1.p0 p0Var = this.f286911s;
        ((e1.i) p0Var).c();
        boolean z17 = this.f286903k == 0.0f;
        e1.p0 p0Var2 = this.f286910r;
        if (z17) {
            if (this.f286904l == 1.0f) {
                e1.o0.a(p0Var, p0Var2, 0L, 2, null);
                return;
            }
        }
        jz5.g gVar = this.f286912t;
        e1.j jVar = (e1.j) ((e1.s0) gVar.getValue());
        if (p0Var2 != null) {
            jVar.getClass();
            if (!(p0Var2 instanceof e1.i)) {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((e1.i) p0Var2).f246263a;
        } else {
            path = null;
        }
        jVar.f246275a.setPath(path, false);
        float length = ((e1.j) ((e1.s0) gVar.getValue())).f246275a.getLength();
        float f17 = this.f286903k;
        float f18 = this.f286905m;
        float f19 = ((f17 + f18) % 1.0f) * length;
        float f27 = ((this.f286904l + f18) % 1.0f) * length;
        if (f19 <= f27) {
            ((e1.j) ((e1.s0) gVar.getValue())).a(f19, f27, p0Var, true);
        } else {
            ((e1.j) ((e1.s0) gVar.getValue())).a(f19, length, p0Var, true);
            ((e1.j) ((e1.s0) gVar.getValue())).a(0.0f, f27, p0Var, true);
        }
    }

    public java.lang.String toString() {
        return this.f286910r.toString();
    }
}
