package ee3;

/* loaded from: classes7.dex */
public class d extends android.os.AsyncTask implements jc3.w {

    /* renamed from: d, reason: collision with root package name */
    public final ee3.e f251588d;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f251591g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f251592h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f251593i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f251594m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f251595n;

    /* renamed from: o, reason: collision with root package name */
    public final int f251596o;

    /* renamed from: r, reason: collision with root package name */
    public long f251599r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f251600s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f251602u;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f251589e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f251590f = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f251597p = "unknow";

    /* renamed from: q, reason: collision with root package name */
    public int f251598q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: t, reason: collision with root package name */
    public final long f251601t = java.lang.System.currentTimeMillis();

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, ee3.e eVar) {
        this.f251591g = str;
        this.f251592h = str2;
        this.f251594m = str4;
        this.f251593i = str3;
        this.f251595n = str4 + str3;
        this.f251596o = i17;
        this.f251588d = eVar;
    }

    @Override // jc3.w
    public void a() {
        this.f251589e = false;
        cancel(true);
    }

    public final boolean b(java.lang.String str) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, file not exists");
            return true;
        }
        if (com.tencent.mm.vfs.w6.h(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, succ");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, failed");
        return false;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        if (!android.webkit.URLUtil.isHttpsUrl(this.f251592h) && !android.webkit.URLUtil.isHttpUrl(this.f251592h)) {
            this.f251588d.d(this.f251595n, this.f251592h, "downloadFile protocol must be http or https", 300005);
        } else if (this.f251589e) {
            this.f251599r = java.lang.System.currentTimeMillis();
            this.f251588d.c(this.f251595n, this.f251592h);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskCount.name(), 1, null, 0.01f);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, filePath is %s, uri is %s", this.f251600s, this.f251595n, this.f251592h);
            ee3.a aVar = new ee3.a(this);
            ee3.c cVar = new ee3.c(this, aVar);
            ((ku5.t0) ku5.t0.f312615d).k(aVar, this.f251598q);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "startCDNDownload taskId:%s", this.f251600s);
            try {
                fe0.j3 j3Var = (fe0.j3) i95.n0.c(fe0.j3.class);
                java.lang.String str = this.f251594m;
                java.lang.String str2 = this.f251593i;
                java.lang.String str3 = this.f251592h;
                int i17 = this.f251596o;
                ((ee0.a) j3Var).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().downloadLandingPagesCDNFile(str, str2, str3, i17, cVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushCDNDownloadWorker", e17, "doInBackground Exception uri:%s", this.f251592h);
                b(this.f251595n);
                if (!this.f251590f) {
                    this.f251590f = true;
                    this.f251588d.d(this.f251595n, this.f251592h, "call cdndownload error", 300004);
                }
            }
        } else {
            this.f251588d.d(this.f251595n, this.f251592h, "force stop", 300004);
            je3.p.a(this.f251591g, this.f251602u, "GET", this.f251592h, 0L, 0L, 0, 2, (int) (java.lang.System.currentTimeMillis() - this.f251601t), this.f251595n, this.f251597p);
        }
        return null;
    }

    @Override // jc3.w
    public java.lang.String getTaskId() {
        return this.f251600s;
    }
}
