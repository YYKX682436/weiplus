package vh1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final com.tencent.mars.cdn.CronetLogic.HostIPHint F;

    /* renamed from: d, reason: collision with root package name */
    public int f437018d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f437019e;

    /* renamed from: f, reason: collision with root package name */
    public final vh1.a f437020f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f437021g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f437022h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f437023i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f437024m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f437025n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f437026o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f437027p;

    /* renamed from: q, reason: collision with root package name */
    public int f437028q;

    /* renamed from: r, reason: collision with root package name */
    public javax.net.ssl.SSLContext f437029r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f437030s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f437031t;

    /* renamed from: u, reason: collision with root package name */
    public long f437032u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f437033v;

    /* renamed from: w, reason: collision with root package name */
    public java.net.HttpURLConnection f437034w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f437035x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f437036y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f437037z;

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, vh1.a aVar) {
        this.f437018d = 15;
        this.f437021g = false;
        this.f437022h = false;
        this.f437026o = "unknow";
        this.f437028q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = null;
        this.f437019e = lVar;
        this.f437023i = str;
        this.f437024m = str2;
        this.f437025n = str3;
        this.f437020f = aVar;
        this.f437037z = str4;
        this.A = z17;
        this.B = z18;
        this.C = z19;
        this.D = z27;
        this.E = z28;
    }

    public void a() {
        this.f437021g = false;
        java.net.HttpURLConnection httpURLConnection = this.f437034w;
        if (httpURLConnection != null) {
            try {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", e17.getMessage());
                }
                this.f437034w.disconnect();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDownloadWorker", e18, "abortTask Exception", new java.lang.Object[0]);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f437035x)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f437035x);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void b() {
        /*
            Method dump skipped, instructions count: 8645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh1.f.b():void");
    }

    public int c() {
        return (int) (java.lang.System.currentTimeMillis() - this.f437032u);
    }

    public java.lang.String d() {
        return this.f437036y;
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2) {
        q75.e a17 = q75.e.a(str);
        if (a17 == null) {
            return q75.g.c(str2);
        }
        boolean contains = a17.f360607a.contains("application/octet-stream");
        java.lang.String str3 = a17.f360607a;
        if (!contains) {
            return str3;
        }
        java.lang.String c17 = q75.g.c(str2);
        return com.tencent.mm.sdk.platformtools.t8.K0(c17) ? str3 : c17;
    }

    public java.lang.String f() {
        return this.f437033v;
    }

    public java.lang.String g() {
        return this.f437023i;
    }

    public final void h(long j17, long j18) {
        if (j17 <= 0 || j18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "reportSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } else {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(437L, com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 30 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 31 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 32 : com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 33 : 34, (long) ((j17 / j18) * 0.9765625d), false);
        }
    }

    public final void i(int i17) {
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(437L, (i17 < 100 || i17 >= 200) ? 200 == i17 ? 21 : (i17 <= 200 || i17 >= 300) ? 302 == i17 ? 23 : (i17 < 300 || i17 >= 400) ? 404 == i17 ? 25 : (i17 < 400 || i17 >= 500) ? i17 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (!android.webkit.URLUtil.isHttpsUrl(this.f437023i) && !android.webkit.URLUtil.isHttpUrl(this.f437023i)) {
            this.f437020f.d(this.f437024m, this.f437023i, "downloadFile protocol must be http or https", 600005);
            return;
        }
        java.util.ArrayList arrayList = this.f437030s;
        if (arrayList != null && !uh1.j0.A(arrayList, this.f437023i, false)) {
            try {
                str = new java.net.URL(this.f437023i).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDownloadWorker", e17, "get redirect url host fail Exception", new java.lang.Object[0]);
                str = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f437020f.d(this.f437024m, this.f437023i, "redirect url not in domain list", 600002);
            } else {
                this.f437020f.d(this.f437024m, this.f437023i, "redirect url not in domain list:" + str, 600002);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "not in domain url %s", this.f437023i);
            return;
        }
        if (!this.A) {
            b();
            return;
        }
        this.f437032u = java.lang.System.currentTimeMillis();
        vh1.e eVar = new vh1.e(this);
        if (!this.f437021g) {
            this.f437020f.d(this.f437024m, this.f437023i, "force stop", 600004);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f437025n)) {
                ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(this.f437019e.getAppId(), this.f437036y, "GET", this.f437023i, 0L, 0L, 0, 2, c(), java.lang.System.currentTimeMillis(), this.f437024m, this.f437026o);
                return;
            } else {
                ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(this.f437019e.getAppId(), this.f437036y, "GET", this.f437023i, 0L, 0L, 0, 2, c(), java.lang.System.currentTimeMillis(), this.f437025n, this.f437026o);
                return;
            }
        }
        this.f437020f.c(this.f437024m, this.f437023i);
        uh1.j0.E(1197L, 0L, 1L);
        vh1.b bVar = new vh1.b(this);
        vh1.d dVar = new vh1.d(this, bVar, eVar);
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.url = this.f437023i;
        cronetRequestParams.taskId = this.f437033v;
        cronetRequestParams.followRedirect = false;
        cronetRequestParams.savePath = this.f437024m;
        cronetRequestParams.method = "GET";
        cronetRequestParams.needWriteLocal = true;
        cronetRequestParams.useHttp2 = this.B;
        cronetRequestParams.useQuic = this.C;
        cronetRequestParams.useMemoryCache = this.D;
        java.util.Map<java.lang.String, java.lang.String> map = this.f437027p;
        cronetRequestParams.miniPrograms = true;
        cronetRequestParams.maxRetryCount = 0;
        cronetRequestParams.hostIPHint = this.F;
        if (map.containsKey("Accept-Encoding")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("User-Agent", this.f437037z);
        cronetRequestParams.makeRequestHeader(map);
        this.f437020f.a(uh1.j0.e(uh1.j0.H(map), 1));
        cronetRequestParams.taskType = 2;
        ((ku5.t0) ku5.t0.f312615d).k(bVar, this.f437028q);
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDownloadTask = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(cronetRequestParams, dVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDownloadWorker", "startCronetHttpsRequest createRet is %d, taskId %s,CronetRequestId:%s,url:%s,filename:%s", java.lang.Integer.valueOf(startCronetDownloadTask.createRet), this.f437033v, startCronetDownloadTask.taskId, this.f437023i, this.f437024m);
        if (startCronetDownloadTask.createRet == 0) {
            this.f437035x = startCronetDownloadTask.taskId;
            return;
        }
        if (this.f437022h) {
            return;
        }
        this.f437022h = true;
        this.f437020f.d(this.f437024m, this.f437023i, "call request error:" + startCronetDownloadTask.createRet, 600004);
    }

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, com.tencent.mars.cdn.CronetLogic.HostIPHint hostIPHint, vh1.a aVar) {
        this(lVar, str, str2, str3, str4, z17, z18, z19, z27, z28, aVar);
        this.F = hostIPHint;
    }
}
