package s7;

/* loaded from: classes16.dex */
public class r1 implements java.lang.Cloneable {
    public s7.n1 A;
    public java.lang.Boolean B;
    public s7.g0 C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.Boolean G;
    public java.lang.Boolean H;
    public s7.b2 I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Float f403788J;
    public java.lang.String K;
    public s7.i1 L;
    public java.lang.String M;
    public s7.b2 N;
    public java.lang.Float P;
    public s7.b2 Q;
    public java.lang.Float R;
    public s7.q1 S;
    public s7.m1 T;

    /* renamed from: d, reason: collision with root package name */
    public long f403789d = 0;

    /* renamed from: e, reason: collision with root package name */
    public s7.b2 f403790e;

    /* renamed from: f, reason: collision with root package name */
    public s7.i1 f403791f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f403792g;

    /* renamed from: h, reason: collision with root package name */
    public s7.b2 f403793h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Float f403794i;

    /* renamed from: m, reason: collision with root package name */
    public s7.t0 f403795m;

    /* renamed from: n, reason: collision with root package name */
    public s7.k1 f403796n;

    /* renamed from: o, reason: collision with root package name */
    public s7.l1 f403797o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f403798p;

    /* renamed from: q, reason: collision with root package name */
    public s7.t0[] f403799q;

    /* renamed from: r, reason: collision with root package name */
    public s7.t0 f403800r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Float f403801s;

    /* renamed from: t, reason: collision with root package name */
    public s7.j0 f403802t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f403803u;

    /* renamed from: v, reason: collision with root package name */
    public s7.t0 f403804v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f403805w;

    /* renamed from: x, reason: collision with root package name */
    public s7.j1 f403806x;

    /* renamed from: y, reason: collision with root package name */
    public s7.o1 f403807y;

    /* renamed from: z, reason: collision with root package name */
    public s7.p1 f403808z;

    public static s7.r1 a() {
        s7.r1 r1Var = new s7.r1();
        r1Var.f403789d = -1L;
        s7.j0 j0Var = s7.j0.f403689e;
        r1Var.f403790e = j0Var;
        s7.i1 i1Var = s7.i1.NonZero;
        r1Var.f403791f = i1Var;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        r1Var.f403792g = valueOf;
        r1Var.f403793h = null;
        r1Var.f403794i = valueOf;
        r1Var.f403795m = new s7.t0(1.0f);
        r1Var.f403796n = s7.k1.Butt;
        r1Var.f403797o = s7.l1.Miter;
        r1Var.f403798p = java.lang.Float.valueOf(4.0f);
        r1Var.f403799q = null;
        r1Var.f403800r = new s7.t0(0.0f);
        r1Var.f403801s = valueOf;
        r1Var.f403802t = j0Var;
        r1Var.f403803u = null;
        r1Var.f403804v = new s7.t0(12.0f, s7.q2.pt);
        r1Var.f403805w = 400;
        r1Var.f403806x = s7.j1.Normal;
        r1Var.f403807y = s7.o1.None;
        r1Var.f403808z = s7.p1.LTR;
        r1Var.A = s7.n1.Start;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        r1Var.B = bool;
        r1Var.C = null;
        r1Var.D = null;
        r1Var.E = null;
        r1Var.F = null;
        r1Var.G = bool;
        r1Var.H = bool;
        r1Var.I = j0Var;
        r1Var.f403788J = valueOf;
        r1Var.K = null;
        r1Var.L = i1Var;
        r1Var.M = null;
        r1Var.N = null;
        r1Var.P = valueOf;
        r1Var.Q = null;
        r1Var.R = valueOf;
        r1Var.S = s7.q1.None;
        r1Var.T = s7.m1.auto;
        return r1Var;
    }

    public java.lang.Object clone() {
        s7.r1 r1Var = (s7.r1) super.clone();
        s7.t0[] t0VarArr = this.f403799q;
        if (t0VarArr != null) {
            r1Var.f403799q = (s7.t0[]) t0VarArr.clone();
        }
        return r1Var;
    }
}
