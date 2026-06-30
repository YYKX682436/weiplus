package ee3;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable, jc3.w {
    public final boolean A;
    public final boolean B;

    /* renamed from: e, reason: collision with root package name */
    public final lc3.h0 f251612e;

    /* renamed from: f, reason: collision with root package name */
    public final ee3.e f251613f;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f251616i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f251617m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f251618n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f251619o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f251620p;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f251622r;

    /* renamed from: s, reason: collision with root package name */
    public long f251623s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f251624t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f251625u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f251627w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f251628x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f251629y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f251630z;

    /* renamed from: d, reason: collision with root package name */
    public int f251611d = 15;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f251614g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f251615h = false;

    /* renamed from: q, reason: collision with root package name */
    public int f251621q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: v, reason: collision with root package name */
    public final long f251626v = java.lang.System.currentTimeMillis();

    public j(lc3.h0 h0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, ee3.e eVar) {
        this.f251629y = false;
        this.f251630z = false;
        this.A = false;
        this.B = true;
        this.f251612e = h0Var;
        this.f251616i = str;
        this.f251617m = str2;
        this.f251618n = str3;
        this.f251619o = str4;
        this.f251613f = eVar;
        this.f251628x = str5;
        this.f251629y = z17;
        this.f251630z = z18;
        this.A = z19;
        this.B = z27;
    }

    @Override // jc3.w
    public void a() {
        this.f251614g = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f251625u)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f251625u);
    }

    @Override // jc3.w
    public java.lang.String getTaskId() {
        return this.f251624t;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!android.webkit.URLUtil.isHttpsUrl(this.f251617m) && !android.webkit.URLUtil.isHttpUrl(this.f251617m)) {
            this.f251613f.d(this.f251618n, this.f251617m, "downloadFile protocol must be http or https", 300005);
            return;
        }
        ee3.i iVar = new ee3.i(this);
        if (!this.f251614g) {
            this.f251613f.d(this.f251618n, this.f251617m, "force stop", 300004);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f251619o)) {
                je3.p.a(this.f251616i, this.f251627w, "GET", this.f251617m, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f251626v), this.f251618n, "unknow");
                return;
            } else {
                je3.p.a(this.f251616i, this.f251627w, "GET", this.f251617m, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f251626v), this.f251619o, "unknow");
                return;
            }
        }
        this.f251623s = java.lang.System.currentTimeMillis();
        this.f251613f.c(this.f251618n, this.f251617m);
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskCount.name(), 1, null, 0.01f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, usehttp2 is %b, usequic is %b, usecache is %b, url is %s, filename is %s", this.f251624t, java.lang.Boolean.valueOf(this.f251629y), java.lang.Boolean.valueOf(this.f251630z), java.lang.Boolean.valueOf(this.A), this.f251617m, this.f251618n);
        ee3.f fVar = new ee3.f(this);
        ee3.h hVar = new ee3.h(this, fVar, iVar);
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.url = this.f251617m;
        cronetRequestParams.taskId = this.f251624t;
        cronetRequestParams.followRedirect = false;
        cronetRequestParams.savePath = this.f251618n;
        cronetRequestParams.method = "GET";
        cronetRequestParams.needWriteLocal = true;
        cronetRequestParams.useHttp2 = this.f251629y;
        cronetRequestParams.useQuic = this.f251630z;
        cronetRequestParams.useMemoryCache = this.A;
        cronetRequestParams.maxRetryCount = 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.f251620p;
        if (map.containsKey("Accept-Encoding")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("User-Agent", this.f251628x);
        cronetRequestParams.makeRequestHeader(map);
        cronetRequestParams.taskType = 2;
        ((ku5.t0) ku5.t0.f312615d).k(fVar, this.f251621q);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest taskId:%s", cronetRequestParams.taskId);
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDownloadTask = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(cronetRequestParams, hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest createRet is %d, taskId %s,CronetRequestId:%s", java.lang.Integer.valueOf(startCronetDownloadTask.createRet), this.f251624t, startCronetDownloadTask.taskId);
        if (startCronetDownloadTask.createRet == 0) {
            this.f251625u = startCronetDownloadTask.taskId;
            return;
        }
        if (this.f251615h) {
            return;
        }
        this.f251615h = true;
        this.f251613f.d(this.f251618n, this.f251617m, "call request error:" + startCronetDownloadTask.createRet, 300004);
    }
}
