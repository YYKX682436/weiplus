package wo;

/* loaded from: classes14.dex */
public class c {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f447588J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f447590a0;

    /* renamed from: b, reason: collision with root package name */
    public int f447591b;

    /* renamed from: b0, reason: collision with root package name */
    public int f447592b0;

    /* renamed from: c, reason: collision with root package name */
    public int f447593c;

    /* renamed from: c0, reason: collision with root package name */
    public int f447594c0;

    /* renamed from: d, reason: collision with root package name */
    public int f447595d;

    /* renamed from: d0, reason: collision with root package name */
    public int f447596d0;

    /* renamed from: e, reason: collision with root package name */
    public int f447597e;

    /* renamed from: e0, reason: collision with root package name */
    public int f447598e0;

    /* renamed from: f, reason: collision with root package name */
    public int f447599f;

    /* renamed from: f0, reason: collision with root package name */
    public int f447600f0;

    /* renamed from: g, reason: collision with root package name */
    public int f447601g;

    /* renamed from: g0, reason: collision with root package name */
    public int f447602g0;

    /* renamed from: h, reason: collision with root package name */
    public int f447603h;

    /* renamed from: h0, reason: collision with root package name */
    public int f447604h0;

    /* renamed from: i, reason: collision with root package name */
    public int f447605i;

    /* renamed from: i0, reason: collision with root package name */
    public int f447606i0;

    /* renamed from: j, reason: collision with root package name */
    public int f447607j;

    /* renamed from: j0, reason: collision with root package name */
    public int f447608j0;

    /* renamed from: k, reason: collision with root package name */
    public int f447609k;

    /* renamed from: k0, reason: collision with root package name */
    public int f447610k0;

    /* renamed from: l, reason: collision with root package name */
    public int f447611l;

    /* renamed from: l0, reason: collision with root package name */
    public int f447612l0;

    /* renamed from: m, reason: collision with root package name */
    public int f447613m;

    /* renamed from: m0, reason: collision with root package name */
    public int f447614m0;

    /* renamed from: n, reason: collision with root package name */
    public int f447615n;

    /* renamed from: n0, reason: collision with root package name */
    public int f447616n0;

    /* renamed from: o, reason: collision with root package name */
    public int f447617o;

    /* renamed from: p, reason: collision with root package name */
    public int f447619p;

    /* renamed from: q, reason: collision with root package name */
    public int f447621q;

    /* renamed from: q0, reason: collision with root package name */
    public int f447622q0;

    /* renamed from: s0, reason: collision with root package name */
    public int f447626s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f447628t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f447630u0;

    /* renamed from: v, reason: collision with root package name */
    public int f447631v;

    /* renamed from: v0, reason: collision with root package name */
    public int f447632v0;

    /* renamed from: w, reason: collision with root package name */
    public int f447633w;

    /* renamed from: w0, reason: collision with root package name */
    public int f447634w0;

    /* renamed from: x, reason: collision with root package name */
    public int f447635x;

    /* renamed from: x0, reason: collision with root package name */
    public int f447636x0;

    /* renamed from: y, reason: collision with root package name */
    public int f447637y;

    /* renamed from: y0, reason: collision with root package name */
    public int f447638y0;

    /* renamed from: z, reason: collision with root package name */
    public int f447639z;

    /* renamed from: z0, reason: collision with root package name */
    public int f447640z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f447589a = false;

    /* renamed from: r, reason: collision with root package name */
    public int f447623r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f447625s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f447627t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f447629u = -1;

    /* renamed from: o0, reason: collision with root package name */
    public final short[] f447618o0 = new short[15];

    /* renamed from: p0, reason: collision with root package name */
    public final short[] f447620p0 = new short[2];

    /* renamed from: r0, reason: collision with root package name */
    public boolean f447624r0 = false;

    public c() {
        f();
    }

    public boolean a() {
        return this.f447599f >= 0;
    }

    public boolean b() {
        int i17 = this.f447593c;
        if (i17 < 0 || this.f447595d >= 0) {
            return (i17 < 0 && this.f447595d >= 0) || this.f447597e > 0;
        }
        return true;
    }

    public void c() {
        short[] sArr = this.f447620p0;
        short s17 = sArr[0];
        short s18 = sArr[1];
    }

    public int d() {
        int i17;
        if (!a() || (i17 = (this.f447599f & 14) >> 1) == 7) {
            return -1;
        }
        return i17;
    }

    public int e() {
        int i17;
        if (!a() || (i17 = (this.f447599f & 224) >> 5) == 7) {
            return -1;
        }
        return i17;
    }

    public void f() {
        this.f447589a = false;
        this.f447591b = -1;
        this.f447593c = -1;
        this.f447595d = -1;
        this.f447597e = -1;
        this.f447599f = -1;
        this.f447601g = -1;
        this.f447603h = -1;
        this.f447607j = -1;
        this.f447605i = -1;
        this.O = -1;
        this.f447609k = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.f447588J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f447590a0 = -1;
        this.f447592b0 = -1;
        this.f447594c0 = -1;
        this.f447596d0 = -1;
        this.f447598e0 = -1;
        this.f447600f0 = -1;
        this.f447602g0 = -1;
        this.f447604h0 = -1;
        this.f447606i0 = -1;
        this.f447608j0 = -1;
        this.f447610k0 = -1;
        this.f447611l = -1;
        this.f447613m = -1;
        this.f447615n = -1;
        this.f447617o = -1;
        this.f447631v = -1;
        this.f447633w = -1;
        this.f447635x = -1;
        this.f447637y = -1;
        this.f447612l0 = 0;
        this.f447614m0 = 0;
        this.f447616n0 = -1;
        this.f447621q = -1;
        this.f447619p = -1;
        short[] sArr = this.f447620p0;
        sArr[0] = -1;
        sArr[1] = -1;
        this.f447622q0 = -1;
        this.f447638y0 = -1;
        this.f447640z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.f447639z = -1;
    }
}
