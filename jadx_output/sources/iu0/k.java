package iu0;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final iu0.k f294830a = new iu0.k();

    public static final java.lang.String a(iu0.k kVar, java.lang.String str, java.lang.String str2) {
        java.net.HttpURLConnection httpURLConnection;
        int responseCode;
        kVar.getClass();
        try {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            kotlin.jvm.internal.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(120000);
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "downloadFile: exception, url=" + str + ", error=" + e17.getMessage());
            str2 = null;
        }
        if (!(200 <= responseCode && responseCode < 300)) {
            com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "downloadFile: HTTP " + responseCode + ", url=" + str);
            return null;
        }
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.h(str2);
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getInputStream());
        try {
            com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)));
            try {
                vz5.a.b(bufferedInputStream, y6Var, 0, 2, null);
                vz5.b.a(y6Var, null);
                vz5.b.a(bufferedInputStream, null);
                httpURLConnection.disconnect();
                com.tencent.mars.xlog.Log.i("MJCC.ResMgr", "downloadFile: success, path=".concat(str2));
                return str2;
            } finally {
            }
        } finally {
        }
    }

    public static final boolean b(iu0.k kVar, java.lang.String str, java.lang.String str2) {
        kVar.getClass();
        try {
            if (com.tencent.mm.vfs.w6.j(str2)) {
                com.tencent.mm.vfs.w6.h(str2);
            }
            return com.tencent.mm.vfs.w6.T(str, str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "zipFolder failed: " + e17.getMessage());
            return false;
        }
    }
}
