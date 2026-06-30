package r35;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final r35.z f369329a = new r35.z();

    public final q11.b a(java.lang.String url, boolean z17, r35.b0 b0Var) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        kotlin.jvm.internal.o.g(url, "url");
        r35.a0 a0Var = new r35.a0(url, z17, b0Var);
        try {
            a0Var.c();
            int b17 = a0Var.b();
            java.net.HttpURLConnection httpURLConnection = a0Var.f369031a;
            java.io.InputStream inputStream3 = httpURLConnection != null ? httpURLConnection.getInputStream() : null;
            if (b17 >= 300) {
                if (b0Var != null) {
                    java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream3);
                if (b0Var != null) {
                    java.lang.System.currentTimeMillis();
                }
                try {
                    java.net.HttpURLConnection httpURLConnection2 = a0Var.f369031a;
                    if (httpURLConnection2 != null && (inputStream2 = httpURLConnection2.getInputStream()) != null) {
                        inputStream2.close();
                    }
                    java.net.HttpURLConnection httpURLConnection3 = a0Var.f369031a;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.BizImageHttpClientFactory", "httpURLConnectionGet responseCode: %d", java.lang.Integer.valueOf(b17));
                a0Var.d(b17);
                return null;
            }
            q11.b a17 = a0Var.a(inputStream3);
            if (b0Var != null) {
                java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream3);
            if (b0Var != null) {
                java.lang.System.currentTimeMillis();
            }
            try {
                java.net.HttpURLConnection httpURLConnection4 = a0Var.f369031a;
                if (httpURLConnection4 != null && (inputStream = httpURLConnection4.getInputStream()) != null) {
                    inputStream.close();
                }
                java.net.HttpURLConnection httpURLConnection5 = a0Var.f369031a;
                if (httpURLConnection5 != null) {
                    httpURLConnection5.disconnect();
                }
            } catch (java.lang.Exception unused2) {
            }
            a0Var.e(a17);
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizImageHttpClientFactory", e17, "httpURLConnectionGet exception: ", new java.lang.Object[0]);
            a0Var.d(-1);
            return null;
        }
    }
}
