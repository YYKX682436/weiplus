package t36;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final t36.k f415461a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.logging.Logger f415462b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    static {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t36.k.<clinit>():void");
    }

    public static java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            l36.r0 r0Var = (l36.r0) list.get(i17);
            if (r0Var != l36.r0.HTTP_1_0) {
                arrayList.add(r0Var.f315635d);
            }
        }
        return arrayList;
    }

    public void a(javax.net.ssl.SSLSocket sSLSocket) {
    }

    public v36.c c(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new v36.a(d(x509TrustManager));
    }

    public v36.e d(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new v36.b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
    }

    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
    }

    public void g(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i17) {
        socket.connect(inetSocketAddress, i17);
    }

    public javax.net.ssl.SSLContext h() {
        if ("1.7".equals(java.lang.System.getProperty("java.specification.version"))) {
            try {
                return javax.net.ssl.SSLContext.getInstance("TLSv1.2");
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        try {
            return javax.net.ssl.SSLContext.getInstance("TLS");
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.IllegalStateException("No TLS provider", e17);
        }
    }

    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public java.lang.Object j(java.lang.String str) {
        if (f415462b.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(str);
        }
        return null;
    }

    public boolean k(java.lang.String str) {
        return true;
    }

    public void l(int i17, java.lang.String str, java.lang.Throwable th6) {
        f415462b.log(i17 == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, str, th6);
    }

    public void m(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        l(5, str, (java.lang.Throwable) obj);
    }

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }
}
