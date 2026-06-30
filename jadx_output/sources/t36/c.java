package t36;

/* loaded from: classes13.dex */
public final class c implements v36.e {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f415438a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f415439b;

    public c(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
        this.f415439b = method;
        this.f415438a = x509TrustManager;
    }

    @Override // v36.e
    public java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.security.cert.TrustAnchor trustAnchor = (java.security.cert.TrustAnchor) this.f415439b.invoke(this.f415438a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            throw m36.e.a("unable to get issues and signature", e17);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t36.c)) {
            return false;
        }
        t36.c cVar = (t36.c) obj;
        return this.f415438a.equals(cVar.f415438a) && this.f415439b.equals(cVar.f415439b);
    }

    public int hashCode() {
        return this.f415438a.hashCode() + (this.f415439b.hashCode() * 31);
    }
}
