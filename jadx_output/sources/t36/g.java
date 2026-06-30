package t36;

/* loaded from: classes13.dex */
public final class g extends t36.k {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f415448c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f415449d;

    public g(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        this.f415448c = method;
        this.f415449d = method2;
    }

    @Override // t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        try {
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            java.util.ArrayList arrayList = (java.util.ArrayList) t36.k.b(list);
            this.f415448c.invoke(sSLParameters, arrayList.toArray(new java.lang.String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to set ssl parameters", e17);
        }
    }

    @Override // t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            java.lang.String str = (java.lang.String) this.f415449d.invoke(sSLSocket, new java.lang.Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            throw m36.e.a("failed to get ALPN selected protocol", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            if (e18.getCause() instanceof java.lang.UnsupportedOperationException) {
                return null;
            }
            throw m36.e.a("failed to get ALPN selected protocol", e18);
        }
    }
}
