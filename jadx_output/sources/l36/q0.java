package l36;

/* loaded from: classes16.dex */
public class q0 implements java.lang.Cloneable, l36.m {
    public static final java.util.List I = m36.e.m(l36.r0.HTTP_2, l36.r0.HTTP_1_1);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.List f315586J = m36.e.m(l36.v.f315658e, l36.v.f315659f);
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;

    /* renamed from: d, reason: collision with root package name */
    public final l36.z f315587d;

    /* renamed from: e, reason: collision with root package name */
    public final java.net.Proxy f315588e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315589f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f315590g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f315591h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f315592i;

    /* renamed from: m, reason: collision with root package name */
    public final l36.e0 f315593m;

    /* renamed from: n, reason: collision with root package name */
    public final java.net.ProxySelector f315594n;

    /* renamed from: o, reason: collision with root package name */
    public final l36.y f315595o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.j f315596p;

    /* renamed from: q, reason: collision with root package name */
    public final n36.m f315597q;

    /* renamed from: r, reason: collision with root package name */
    public final javax.net.SocketFactory f315598r;

    /* renamed from: s, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f315599s;

    /* renamed from: t, reason: collision with root package name */
    public final v36.c f315600t;

    /* renamed from: u, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f315601u;

    /* renamed from: v, reason: collision with root package name */
    public final l36.p f315602v;

    /* renamed from: w, reason: collision with root package name */
    public final l36.c f315603w;

    /* renamed from: x, reason: collision with root package name */
    public final l36.c f315604x;

    /* renamed from: y, reason: collision with root package name */
    public final l36.t f315605y;

    /* renamed from: z, reason: collision with root package name */
    public final l36.b0 f315606z;

    static {
        m36.a.f323382a = new l36.o0();
    }

    public q0(l36.p0 p0Var) {
        boolean z17;
        this.f315587d = p0Var.f315560a;
        this.f315588e = p0Var.f315561b;
        this.f315589f = p0Var.f315562c;
        java.util.List list = p0Var.f315563d;
        this.f315590g = list;
        this.f315591h = m36.e.l(p0Var.f315564e);
        this.f315592i = m36.e.l(p0Var.f315565f);
        this.f315593m = p0Var.f315566g;
        this.f315594n = p0Var.f315567h;
        this.f315595o = p0Var.f315568i;
        this.f315596p = p0Var.f315569j;
        this.f315597q = p0Var.f315570k;
        this.f315598r = p0Var.f315571l;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (it.hasNext()) {
                z17 = (z17 || ((l36.v) it.next()).f315660a) ? true : z17;
            }
        }
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = p0Var.f315572m;
        if (sSLSocketFactory == null && z17) {
            try {
                javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((java.security.KeyStore) null);
                javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    javax.net.ssl.TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                        try {
                            t36.k kVar = t36.k.f415461a;
                            javax.net.ssl.SSLContext h17 = kVar.h();
                            h17.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
                            this.f315599s = h17.getSocketFactory();
                            this.f315600t = kVar.c(x509TrustManager);
                        } catch (java.security.GeneralSecurityException e17) {
                            throw m36.e.a("No System TLS", e17);
                        }
                    }
                }
                throw new java.lang.IllegalStateException("Unexpected default trust managers:" + java.util.Arrays.toString(trustManagers));
            } catch (java.security.GeneralSecurityException e18) {
                throw m36.e.a("No System TLS", e18);
            }
        }
        this.f315599s = sSLSocketFactory;
        this.f315600t = p0Var.f315573n;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = this.f315599s;
        if (sSLSocketFactory2 != null) {
            t36.k.f415461a.e(sSLSocketFactory2);
        }
        this.f315601u = p0Var.f315574o;
        v36.c cVar = this.f315600t;
        l36.p pVar = p0Var.f315575p;
        this.f315602v = m36.e.i(pVar.f315559b, cVar) ? pVar : new l36.p(pVar.f315558a, cVar);
        this.f315603w = p0Var.f315576q;
        this.f315604x = p0Var.f315577r;
        this.f315605y = p0Var.f315578s;
        this.f315606z = p0Var.f315579t;
        this.A = p0Var.f315580u;
        this.B = p0Var.f315581v;
        this.C = p0Var.f315582w;
        this.D = p0Var.f315583x;
        this.E = p0Var.f315584y;
        this.F = p0Var.f315585z;
        this.G = p0Var.A;
        this.H = p0Var.B;
        if (this.f315591h.contains(null)) {
            throw new java.lang.IllegalStateException("Null interceptor: " + this.f315591h);
        }
        if (this.f315592i.contains(null)) {
            throw new java.lang.IllegalStateException("Null network interceptor: " + this.f315592i);
        }
    }

    @Override // l36.m
    public l36.n a(l36.w0 w0Var) {
        l36.u0 u0Var = new l36.u0(this, w0Var, false);
        u0Var.f315654g = ((l36.d0) this.f315593m).f315474a;
        return u0Var;
    }
}
