package l36;

/* loaded from: classes16.dex */
public final class p0 {
    public final int A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final l36.z f315560a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f315561b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f315562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f315563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f315564e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315565f;

    /* renamed from: g, reason: collision with root package name */
    public l36.e0 f315566g;

    /* renamed from: h, reason: collision with root package name */
    public final java.net.ProxySelector f315567h;

    /* renamed from: i, reason: collision with root package name */
    public final l36.y f315568i;

    /* renamed from: j, reason: collision with root package name */
    public l36.j f315569j;

    /* renamed from: k, reason: collision with root package name */
    public n36.m f315570k;

    /* renamed from: l, reason: collision with root package name */
    public final javax.net.SocketFactory f315571l;

    /* renamed from: m, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f315572m;

    /* renamed from: n, reason: collision with root package name */
    public final v36.c f315573n;

    /* renamed from: o, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f315574o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.p f315575p;

    /* renamed from: q, reason: collision with root package name */
    public final l36.c f315576q;

    /* renamed from: r, reason: collision with root package name */
    public final l36.c f315577r;

    /* renamed from: s, reason: collision with root package name */
    public final l36.t f315578s;

    /* renamed from: t, reason: collision with root package name */
    public final l36.b0 f315579t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f315580u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f315581v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f315582w;

    /* renamed from: x, reason: collision with root package name */
    public final int f315583x;

    /* renamed from: y, reason: collision with root package name */
    public final int f315584y;

    /* renamed from: z, reason: collision with root package name */
    public final int f315585z;

    public p0() {
        this.f315564e = new java.util.ArrayList();
        this.f315565f = new java.util.ArrayList();
        this.f315560a = new l36.z();
        this.f315562c = l36.q0.I;
        this.f315563d = l36.q0.f315586J;
        this.f315566g = new l36.d0(l36.f0.f315492a);
        java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
        this.f315567h = proxySelector;
        if (proxySelector == null) {
            this.f315567h = new u36.a();
        }
        this.f315568i = l36.y.f315686a;
        this.f315571l = javax.net.SocketFactory.getDefault();
        this.f315574o = v36.d.f433175a;
        this.f315575p = l36.p.f315557c;
        l36.c cVar = l36.c.f315472a;
        this.f315576q = cVar;
        this.f315577r = cVar;
        this.f315578s = new l36.t();
        this.f315579t = l36.b0.f315468a;
        this.f315580u = true;
        this.f315581v = true;
        this.f315582w = true;
        this.f315583x = 0;
        this.f315584y = 10000;
        this.f315585z = 10000;
        this.A = 10000;
        this.B = 0;
    }

    public p0(l36.q0 q0Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315564e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f315565f = arrayList2;
        this.f315560a = q0Var.f315587d;
        this.f315561b = q0Var.f315588e;
        this.f315562c = q0Var.f315589f;
        this.f315563d = q0Var.f315590g;
        arrayList.addAll(q0Var.f315591h);
        arrayList2.addAll(q0Var.f315592i);
        this.f315566g = q0Var.f315593m;
        this.f315567h = q0Var.f315594n;
        this.f315568i = q0Var.f315595o;
        this.f315570k = q0Var.f315597q;
        this.f315569j = q0Var.f315596p;
        this.f315571l = q0Var.f315598r;
        this.f315572m = q0Var.f315599s;
        this.f315573n = q0Var.f315600t;
        this.f315574o = q0Var.f315601u;
        this.f315575p = q0Var.f315602v;
        this.f315576q = q0Var.f315603w;
        this.f315577r = q0Var.f315604x;
        this.f315578s = q0Var.f315605y;
        this.f315579t = q0Var.f315606z;
        this.f315580u = q0Var.A;
        this.f315581v = q0Var.B;
        this.f315582w = q0Var.C;
        this.f315583x = q0Var.D;
        this.f315584y = q0Var.E;
        this.f315585z = q0Var.F;
        this.A = q0Var.G;
        this.B = q0Var.H;
    }
}
