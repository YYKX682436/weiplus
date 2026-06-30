package nk1;

/* loaded from: classes7.dex */
public final class d extends java.io.FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f337949e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nk1.a f337950d;

    public d(nk1.a aVar, java.io.InputStream inputStream, kotlin.jvm.internal.i iVar) {
        super(inputStream);
        this.f337950d = aVar;
    }

    public final java.lang.String a() {
        java.net.HttpURLConnection httpURLConnection = this.f337950d.f337946a.f393426i;
        java.lang.String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Content-Type") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getContentType, contentType: " + headerField);
        return headerField;
    }

    public final java.lang.String b() {
        java.net.URL url;
        java.net.HttpURLConnection httpURLConnection = this.f337950d.f337946a.f393426i;
        java.lang.String url2 = (httpURLConnection == null || (url = httpURLConnection.getURL()) == null) ? null : url.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getFinalUrl, finalUrl: " + url2);
        return url2;
    }

    public final java.lang.Long c() {
        java.net.HttpURLConnection httpURLConnection = this.f337950d.f337946a.f393426i;
        java.lang.String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Content-Range") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTotalContentLength, contentRange: " + headerField);
        if (headerField != null) {
            java.util.regex.Matcher matcher = af1.c.f4462a.matcher(headerField);
            if (matcher.matches() && 3 == matcher.groupCount()) {
                java.lang.String group = matcher.group(3);
                r1 = group != null ? r26.h0.j(group) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTotalContentLength, totalContentLength: " + r1);
            }
        }
        return r1;
    }

    public final java.lang.String f() {
        java.net.HttpURLConnection httpURLConnection = this.f337950d.f337946a.f393426i;
        java.lang.String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Transfer-Encoding") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTransferEncoding, transferEncoding: " + headerField);
        return headerField;
    }
}
