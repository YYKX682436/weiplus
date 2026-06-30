package wi5;

/* loaded from: classes.dex */
public final class n0 extends j75.a {
    public boolean A;
    public boolean G;
    public boolean R;

    /* renamed from: g, reason: collision with root package name */
    public int f446314g;

    /* renamed from: h, reason: collision with root package name */
    public int f446315h;

    /* renamed from: i, reason: collision with root package name */
    public int f446316i;

    /* renamed from: m, reason: collision with root package name */
    public int f446317m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f446321q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f446322r;

    /* renamed from: s, reason: collision with root package name */
    public int f446323s;

    /* renamed from: t, reason: collision with root package name */
    public co.a f446324t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f446325u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f446326v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.HashMap f446327w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f446328x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f446329y;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f446312e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f446313f = "";

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f446318n = new java.util.HashSet();
    public final java.util.HashSet Q = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f446319o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f446320p = new java.util.HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f446330z = new java.util.HashMap();
    public java.lang.String B = "";
    public java.lang.String C = "";
    public final java.util.List D = new java.util.ArrayList();
    public final java.util.HashMap E = new java.util.HashMap();
    public final java.util.Map F = new java.util.LinkedHashMap();
    public int H = 3;

    @Override // j75.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public final boolean d(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return this.f446318n.contains(username);
    }

    public final boolean e() {
        return (this.f446314g & 64) > 0;
    }

    public final boolean f(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return this.f446319o.contains(username);
    }

    public final java.lang.String g(java.lang.String preShowHeadDisplay, boolean z17) {
        kotlin.jvm.internal.o.g(preShowHeadDisplay, "preShowHeadDisplay");
        return !this.A ? preShowHeadDisplay : z17 ? this.B : this.C;
    }

    public final boolean e(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return this.Q.contains(username);
    }
}
