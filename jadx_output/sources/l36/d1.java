package l36;

/* loaded from: classes16.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f315475a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f315476b;

    /* renamed from: c, reason: collision with root package name */
    public final java.net.InetSocketAddress f315477c;

    public d1(l36.a aVar, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new java.lang.NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new java.lang.NullPointerException("inetSocketAddress == null");
        }
        this.f315475a = aVar;
        this.f315476b = proxy;
        this.f315477c = inetSocketAddress;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l36.d1) {
            l36.d1 d1Var = (l36.d1) obj;
            if (d1Var.f315475a.equals(this.f315475a) && d1Var.f315476b.equals(this.f315476b) && d1Var.f315477c.equals(this.f315477c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f315475a.hashCode()) * 31) + this.f315476b.hashCode()) * 31) + this.f315477c.hashCode();
    }

    public java.lang.String toString() {
        return "Route{" + this.f315477c + "}";
    }
}
