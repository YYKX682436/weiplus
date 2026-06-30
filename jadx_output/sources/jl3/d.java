package jl3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final b21.r f300212e;

    /* renamed from: f, reason: collision with root package name */
    public final jl3.a f300213f;

    /* renamed from: g, reason: collision with root package name */
    public float f300214g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f300216i;

    /* renamed from: q, reason: collision with root package name */
    public jl3.c f300221q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300211d = null;

    /* renamed from: h, reason: collision with root package name */
    public long f300215h = 307200;

    /* renamed from: m, reason: collision with root package name */
    public boolean f300217m = true;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f300218n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f300219o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f300220p = 0;

    public d(b21.r rVar, jl3.a aVar) {
        this.f300212e = rVar;
        this.f300213f = aVar;
        if (((aVar.f300202a > 0L ? 1 : (aVar.f300202a == 0L ? 0 : -1)) == 0 && (aVar.f300203b > 0L ? 1 : (aVar.f300203b == 0L ? 0 : -1)) == 0 && aVar.f300204c == 0) && ((aVar.f300205d > 0L ? 1 : (aVar.f300205d == 0L ? 0 : -1)) == 0 && (aVar.f300207f > 0L ? 1 : (aVar.f300207f == 0L ? 0 : -1)) == 0 && aVar.f300206e == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDownloadTask", "downloadInfo is invalid");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "downloadInfo is valid");
        }
        this.f300216i = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public final long[] a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            java.lang.String[] split = str.replace("bytes", "").trim().split("-");
            long longValue = java.lang.Long.valueOf(split[0]).longValue();
            java.lang.String[] split2 = split[1].split("/");
            return new long[]{longValue, java.lang.Long.valueOf(split2[0]).longValue(), java.lang.Long.valueOf(split2[1]).longValue()};
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.net.HttpURLConnection b(java.lang.String str, java.util.Map map) {
        boolean z17;
        if (!android.text.TextUtils.isEmpty(this.f300211d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "use previous temp redirect URL to download , avoid to request source url and than redirect to 302 resp code");
            str = this.f300211d;
        }
        int i17 = 0;
        java.net.HttpURLConnection httpURLConnection = null;
        while (true) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDownloadTask", e17.getMessage());
                }
                httpURLConnection.disconnect();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect, downloadUrl:%s", str);
            kl3.e l17 = kl3.t.l();
            java.net.URL url = new java.net.URL(str);
            java.lang.String host = url.getHost();
            if (l17 == null || (url = l17.v(str)) == null || str.equalsIgnoreCase(url.toString())) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "getRedirectURL, srcUrl:%s", url.toString());
                z17 = true;
            }
            httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(25000);
            httpURLConnection.setInstanceFollowRedirects(false);
            for (java.util.Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            if (z17 && !android.text.TextUtils.isEmpty(host)) {
                httpURLConnection.setRequestProperty("Host", host);
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "use host :%s", host);
            }
            int responseCode = httpURLConnection.getResponseCode();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect response:%d, redirectCount:%d", java.lang.Integer.valueOf(responseCode), java.lang.Integer.valueOf(i17));
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307) {
                if (responseCode != 200 && responseCode != 206) {
                    this.f300211d = null;
                }
                return httpURLConnection;
            }
            f(responseCode);
            java.lang.String requestMethod = httpURLConnection.getRequestMethod();
            if (responseCode == 307 && !requestMethod.equals("GET") && !requestMethod.equals("HEAD")) {
                return httpURLConnection;
            }
            java.lang.String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDownloadTask", "Invalid redirect,  response:%d", java.lang.Integer.valueOf(responseCode));
                return httpURLConnection;
            }
            java.net.URL url2 = new java.net.URL(httpURLConnection.getURL(), headerField);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "location:%s", headerField);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDownloadTask", "tempUrl:%s", url2.toString());
            if (!url2.getProtocol().equals("https") && !url2.getProtocol().equals("http")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDownloadTask", "Unsupported protocol redirect,  response:%d", java.lang.Integer.valueOf(responseCode));
                return httpURLConnection;
            }
            i17++;
            if (i17 > 5) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDownloadTask", "Too many redirects: " + i17);
                return httpURLConnection;
            }
            str = url2.toString();
            this.f300211d = str;
        }
    }

    public final void c(long j17) {
        boolean z17 = this.f300216i;
        b21.r rVar = this.f300212e;
        jl3.a aVar = this.f300213f;
        if (z17) {
            aVar.f300205d = j17;
            aVar.f300206e = 1;
            aVar.f300207f = j17;
            gl3.e.e(rVar.f17346e, aVar);
        } else {
            aVar.f300202a = j17;
            aVar.f300204c = 1;
            aVar.f300203b = j17;
            gl3.e.e(rVar.f17346e, aVar);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new jl3.b(this, 2));
    }

    public final void d(int i17) {
        this.f300211d = null;
        com.tencent.mm.sdk.platformtools.u3.h(new jl3.b(this, i17));
    }

    public final void e(long j17, long j18) {
        boolean z17 = this.f300216i;
        b21.r rVar = this.f300212e;
        jl3.a aVar = this.f300213f;
        if (z17) {
            aVar.f300205d = j17;
            aVar.f300206e = 0;
            aVar.f300207f = j18;
            gl3.e.e(rVar.f17346e, aVar);
        } else {
            aVar.f300202a = j17;
            aVar.f300204c = 0;
            aVar.f300203b = j18;
            gl3.e.e(rVar.f17346e, aVar);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new jl3.b(this, 3));
    }

    public final void f(int i17) {
        kl3.h hVar = (kl3.h) sl3.b.b(kl3.h.class);
        if (hVar != null) {
            ((pl3.e) hVar).f356705c.getClass();
            if (i17 == 300 || i17 == 301 || i17 == 302 || i17 == 303) {
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                iDKey.SetKey(15);
                iDKey.SetValue(1L);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(iDKey);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            }
        }
    }

    public final void g(long j17, long j18) {
        boolean z17 = this.f300216i;
        jl3.a aVar = this.f300213f;
        if (z17) {
            aVar.f300205d = j17;
            aVar.f300207f = j18;
        } else {
            aVar.f300202a = j17;
            aVar.f300203b = j18;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 10 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 13 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 14 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 16 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 5638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl3.d.run():void");
    }
}
