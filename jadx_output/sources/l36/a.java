package l36;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l36.k0 f315444a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.b0 f315445b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.net.SocketFactory f315446c;

    /* renamed from: d, reason: collision with root package name */
    public final l36.c f315447d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f315448e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315449f;

    /* renamed from: g, reason: collision with root package name */
    public final java.net.ProxySelector f315450g;

    /* renamed from: h, reason: collision with root package name */
    public final java.net.Proxy f315451h;

    /* renamed from: i, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f315452i;

    /* renamed from: j, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f315453j;

    /* renamed from: k, reason: collision with root package name */
    public final l36.p f315454k;

    public a(java.lang.String str, int i17, l36.b0 b0Var, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, l36.p pVar, l36.c cVar, java.net.Proxy proxy, java.util.List list, java.util.List list2, java.net.ProxySelector proxySelector) {
        l36.j0 j0Var = new l36.j0();
        java.lang.String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            j0Var.f315518a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            j0Var.f315518a = "https";
        }
        if (str == null) {
            throw new java.lang.NullPointerException("host == null");
        }
        java.lang.String b17 = m36.e.b(l36.k0.j(str, 0, str.length(), false));
        if (b17 == null) {
            throw new java.lang.IllegalArgumentException("unexpected host: ".concat(str));
        }
        j0Var.f315521d = b17;
        if (i17 <= 0 || i17 > 65535) {
            throw new java.lang.IllegalArgumentException("unexpected port: " + i17);
        }
        j0Var.f315522e = i17;
        this.f315444a = j0Var.a();
        if (b0Var == null) {
            throw new java.lang.NullPointerException("dns == null");
        }
        this.f315445b = b0Var;
        if (socketFactory == null) {
            throw new java.lang.NullPointerException("socketFactory == null");
        }
        this.f315446c = socketFactory;
        if (cVar == null) {
            throw new java.lang.NullPointerException("proxyAuthenticator == null");
        }
        this.f315447d = cVar;
        if (list == null) {
            throw new java.lang.NullPointerException("protocols == null");
        }
        this.f315448e = m36.e.l(list);
        if (list2 == null) {
            throw new java.lang.NullPointerException("connectionSpecs == null");
        }
        this.f315449f = m36.e.l(list2);
        if (proxySelector == null) {
            throw new java.lang.NullPointerException("proxySelector == null");
        }
        this.f315450g = proxySelector;
        this.f315451h = proxy;
        this.f315452i = sSLSocketFactory;
        this.f315453j = hostnameVerifier;
        this.f315454k = pVar;
    }

    public boolean a(l36.a aVar) {
        return this.f315445b.equals(aVar.f315445b) && this.f315447d.equals(aVar.f315447d) && this.f315448e.equals(aVar.f315448e) && this.f315449f.equals(aVar.f315449f) && this.f315450g.equals(aVar.f315450g) && m36.e.i(this.f315451h, aVar.f315451h) && m36.e.i(this.f315452i, aVar.f315452i) && m36.e.i(this.f315453j, aVar.f315453j) && m36.e.i(this.f315454k, aVar.f315454k) && this.f315444a.f315535e == aVar.f315444a.f315535e;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l36.a) {
            l36.a aVar = (l36.a) obj;
            if (this.f315444a.equals(aVar.f315444a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f315444a.hashCode()) * 31) + this.f315445b.hashCode()) * 31) + this.f315447d.hashCode()) * 31) + this.f315448e.hashCode()) * 31) + this.f315449f.hashCode()) * 31) + this.f315450g.hashCode()) * 31;
        java.net.Proxy proxy = this.f315451h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f315452i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        javax.net.ssl.HostnameVerifier hostnameVerifier = this.f315453j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        l36.p pVar = this.f315454k;
        return hashCode4 + (pVar != null ? pVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Address{");
        l36.k0 k0Var = this.f315444a;
        sb6.append(k0Var.f315534d);
        sb6.append(":");
        sb6.append(k0Var.f315535e);
        java.net.Proxy proxy = this.f315451h;
        if (proxy != null) {
            sb6.append(", proxy=");
            sb6.append(proxy);
        } else {
            sb6.append(", proxySelector=");
            sb6.append(this.f315450g);
        }
        sb6.append("}");
        return sb6.toString();
    }
}
