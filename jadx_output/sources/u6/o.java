package u6;

/* loaded from: classes13.dex */
public class o implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final a7.c0 f424854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f424855e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f424856f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.InputStream f424857g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f424858h;

    static {
        new u6.n();
    }

    public o(a7.c0 c0Var, int i17) {
        this.f424854d = c0Var;
        this.f424855e = i17;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.REMOTE;
    }

    public final java.io.InputStream c(java.net.URL url, int i17, java.net.URL url2, java.util.Map map) {
        if (i17 >= 5) {
            throw new t6.e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new t6.e("In re-direct loop");
                }
            } catch (java.net.URISyntaxException unused) {
            }
        }
        this.f424856f = (java.net.HttpURLConnection) url.openConnection();
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f424856f.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        this.f424856f.setConnectTimeout(this.f424855e);
        this.f424856f.setReadTimeout(this.f424855e);
        this.f424856f.setUseCaches(false);
        this.f424856f.setDoInput(true);
        this.f424856f.setInstanceFollowRedirects(false);
        this.f424856f.connect();
        this.f424857g = this.f424856f.getInputStream();
        if (this.f424858h) {
            return null;
        }
        int responseCode = this.f424856f.getResponseCode();
        int i18 = responseCode / 100;
        if (i18 == 2) {
            java.net.HttpURLConnection httpURLConnection = this.f424856f;
            if (android.text.TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f424857g = new q7.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (android.util.Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f424857g = httpURLConnection.getInputStream();
            }
            return this.f424857g;
        }
        if (!(i18 == 3)) {
            if (responseCode == -1) {
                throw new t6.e(responseCode);
            }
            throw new t6.e(this.f424856f.getResponseMessage(), responseCode);
        }
        java.lang.String headerField = this.f424856f.getHeaderField("Location");
        if (android.text.TextUtils.isEmpty(headerField)) {
            throw new t6.e("Received empty or null redirect url");
        }
        java.net.URL url3 = new java.net.URL(url, headerField);
        h();
        return c(url3, i17 + 1, url, map);
    }

    @Override // u6.e
    public void cancel() {
        this.f424858h = true;
    }

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        a7.c0 c0Var = this.f424854d;
        int i17 = q7.j.f360301b;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.c(c(c0Var.d(), 0, null, c0Var.f1807b.a()));
                if (!android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (java.io.IOException e17) {
                android.util.Log.isLoggable("HttpUrlFetcher", 3);
                dVar.d(e17);
                if (!android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            q7.j.a(elapsedRealtimeNanos);
        } catch (java.lang.Throwable th6) {
            if (android.util.Log.isLoggable("HttpUrlFetcher", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
            throw th6;
        }
    }

    @Override // u6.e
    public void h() {
        java.io.InputStream inputStream = this.f424857g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        java.net.HttpURLConnection httpURLConnection = this.f424856f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f424856f = null;
    }
}
