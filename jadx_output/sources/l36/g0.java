package l36;

/* loaded from: classes16.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.e1 f315494a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.r f315495b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f315496c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f315497d;

    public g0(l36.e1 e1Var, l36.r rVar, java.util.List list, java.util.List list2) {
        this.f315494a = e1Var;
        this.f315495b = rVar;
        this.f315496c = list;
        this.f315497d = list2;
    }

    public static l36.g0 a(javax.net.ssl.SSLSession sSLSession) {
        java.security.cert.Certificate[] certificateArr;
        java.lang.String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new java.lang.IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new java.io.IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        l36.r a17 = l36.r.a(cipherSuite);
        java.lang.String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new java.lang.IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new java.io.IOException("tlsVersion == NONE");
        }
        l36.e1 a18 = l36.e1.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        java.util.List m17 = certificateArr != null ? m36.e.m(certificateArr) : java.util.Collections.emptyList();
        java.security.cert.Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new l36.g0(a18, a17, m17, localCertificates != null ? m36.e.m(localCertificates) : java.util.Collections.emptyList());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof l36.g0)) {
            return false;
        }
        l36.g0 g0Var = (l36.g0) obj;
        return this.f315494a.equals(g0Var.f315494a) && this.f315495b.equals(g0Var.f315495b) && this.f315496c.equals(g0Var.f315496c) && this.f315497d.equals(g0Var.f315497d);
    }

    public int hashCode() {
        return ((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f315494a.hashCode()) * 31) + this.f315495b.hashCode()) * 31) + this.f315496c.hashCode()) * 31) + this.f315497d.hashCode();
    }
}
