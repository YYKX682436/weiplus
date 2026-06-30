package xc2;

/* loaded from: classes2.dex */
public final class p0 {
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.Integer I;

    /* renamed from: J, reason: collision with root package name */
    public sc2.q8 f453233J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public com.tencent.mm.plugin.lite.s R;
    public java.lang.String S;
    public xc2.c1 T;
    public final java.util.ArrayList U;
    public final java.util.HashMap V;
    public final java.util.HashMap W;
    public final java.util.HashMap X;
    public final java.util.HashMap Y;
    public final java.util.ArrayList Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f453234a;

    /* renamed from: a0, reason: collision with root package name */
    public java.util.Map f453235a0;

    /* renamed from: b, reason: collision with root package name */
    public long f453236b;

    /* renamed from: b0, reason: collision with root package name */
    public final java.util.ArrayList f453237b0;

    /* renamed from: c, reason: collision with root package name */
    public r45.l34 f453238c;

    /* renamed from: c0, reason: collision with root package name */
    public final java.util.ArrayList f453239c0;

    /* renamed from: d, reason: collision with root package name */
    public ad2.h f453240d;

    /* renamed from: d0, reason: collision with root package name */
    public xc2.l f453241d0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f453242e;

    /* renamed from: e0, reason: collision with root package name */
    public java.util.Map f453243e0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f453244f;

    /* renamed from: g, reason: collision with root package name */
    public long f453245g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.o0 f453246h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453247i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f453248j;

    /* renamed from: k, reason: collision with root package name */
    public ya2.b2 f453249k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f453250l;

    /* renamed from: m, reason: collision with root package name */
    public l81.b1 f453251m;

    /* renamed from: n, reason: collision with root package name */
    public int f453252n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453253o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453254p;

    /* renamed from: q, reason: collision with root package name */
    public int f453255q;

    /* renamed from: r, reason: collision with root package name */
    public int f453256r;

    /* renamed from: s, reason: collision with root package name */
    public int f453257s;

    /* renamed from: t, reason: collision with root package name */
    public long f453258t;

    /* renamed from: u, reason: collision with root package name */
    public int f453259u;

    /* renamed from: v, reason: collision with root package name */
    public int f453260v;

    /* renamed from: w, reason: collision with root package name */
    public int f453261w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f453262x;

    /* renamed from: y, reason: collision with root package name */
    public int f453263y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f453264z;

    public p0(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f453234a = jumpInfo;
        this.f453236b = android.os.SystemClock.elapsedRealtime();
        this.f453242e = new java.lang.Object();
        this.f453254p = "";
        this.f453257s = -1;
        this.C = true;
        this.U = new java.util.ArrayList();
        this.V = new java.util.HashMap();
        this.W = new java.util.HashMap();
        this.X = new java.util.HashMap();
        this.Y = new java.util.HashMap();
        this.Z = new java.util.ArrayList();
        this.f453237b0 = new java.util.ArrayList();
        this.f453239c0 = new java.util.ArrayList();
    }

    public final java.util.ArrayList a() {
        return this.f453237b0;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo b() {
        return this.f453234a;
    }

    public final sc2.q8 c() {
        return this.f453233J;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc2.p0) && kotlin.jvm.internal.o.b(this.f453234a, ((xc2.p0) obj).f453234a);
    }

    public int hashCode() {
        return this.f453234a.hashCode();
    }

    public java.lang.String toString() {
        return "FinderJumpInfoEx(jumpInfo=" + this.f453234a + ')';
    }
}
