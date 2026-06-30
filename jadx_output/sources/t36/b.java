package t36;

/* loaded from: classes13.dex */
public final class b extends v36.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f415436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f415437b;

    public b(java.lang.Object obj, java.lang.reflect.Method method) {
        this.f415436a = obj;
        this.f415437b = method;
    }

    @Override // v36.c
    public java.util.List a(java.util.List list, java.lang.String str) {
        try {
            return (java.util.List) this.f415437b.invoke(this.f415436a, (java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[list.size()]), "RSA", str);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.AssertionError(e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e18.getMessage());
            sSLPeerUnverifiedException.initCause(e18);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof t36.b;
    }

    public int hashCode() {
        return 0;
    }
}
