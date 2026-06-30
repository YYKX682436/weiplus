package zs5;

/* loaded from: classes15.dex */
public class g0 {
    public static final zs5.g0 F = new zs5.g0();
    public static final zs5.g0 G = new zs5.g0();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f475374g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f475375h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f475376i;

    /* renamed from: j, reason: collision with root package name */
    public int f475377j;

    /* renamed from: k, reason: collision with root package name */
    public int f475378k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f475379l;

    /* renamed from: n, reason: collision with root package name */
    public int f475381n;

    /* renamed from: o, reason: collision with root package name */
    public int f475382o;

    /* renamed from: u, reason: collision with root package name */
    public boolean f475388u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f475389v;

    /* renamed from: w, reason: collision with root package name */
    public float f475390w;

    /* renamed from: x, reason: collision with root package name */
    public int f475391x;

    /* renamed from: y, reason: collision with root package name */
    public int f475392y;

    /* renamed from: a, reason: collision with root package name */
    public long f475368a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f475369b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f475370c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f475371d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f475372e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f475373f = null;

    /* renamed from: m, reason: collision with root package name */
    public int f475380m = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f475383p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f475384q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f475385r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public long f475386s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f475387t = false;

    /* renamed from: z, reason: collision with root package name */
    public int f475393z = 0;
    public int A = 0;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";
    public final java.lang.Object E = new java.lang.Object();

    public void a() {
        synchronized (this.E) {
            if (this.f475387t) {
                com.tencent.mars.xlog.Log.i("MicroMsg.QBarEngineReporter", "doReport, already report");
                return;
            }
            int e17 = e04.f2.e();
            boolean z17 = pt5.a.f358279n;
            boolean z18 = pt5.a.f358278m;
            java.lang.Object[] objArr = new java.lang.Object[27];
            objArr[0] = java.lang.Integer.valueOf(this.f475370c);
            objArr[1] = java.lang.Long.valueOf(this.f475368a);
            objArr[2] = java.lang.Long.valueOf(this.f475371d);
            objArr[3] = java.lang.Integer.valueOf(this.f475372e);
            objArr[4] = this.f475373f;
            objArr[5] = 0;
            objArr[6] = java.lang.Boolean.valueOf(this.f475369b);
            objArr[7] = this.f475374g;
            objArr[8] = this.f475375h;
            objArr[9] = this.f475376i;
            objArr[10] = java.lang.Integer.valueOf(this.f475377j);
            objArr[11] = java.lang.Integer.valueOf(this.f475378k);
            objArr[12] = this.f475379l;
            objArr[13] = java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(this.f475375h) ? this.f475375h.length() : 0);
            objArr[14] = "0";
            objArr[15] = java.lang.Integer.valueOf(this.f475382o);
            objArr[16] = java.lang.Integer.valueOf(this.f475383p);
            objArr[17] = java.lang.Integer.valueOf(this.f475384q);
            objArr[18] = java.lang.Long.valueOf(this.f475386s);
            objArr[19] = java.lang.Float.valueOf(this.f475385r);
            objArr[20] = 0;
            objArr[21] = java.lang.Integer.valueOf(e17);
            objArr[22] = this.B;
            objArr[23] = this.C;
            objArr[24] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr[25] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr[26] = this.D;
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d, tabType: %d,zoomCount: %s, zoomLastCostTime: %s, totalZoomFactor: %s, waitingFrame: %s, qbarBackend:%d, tabSession:%s, scanSession:%s, qBarOptDet:%s, qBarOptSr:%s, callSnapShot:%s", objArr);
            java.lang.String str = "";
            if (this.f475373f != null) {
                str = this.f475373f.x + "x" + this.f475373f.y;
            }
            boolean z19 = this.f475369b;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[42];
            objArr2[0] = java.lang.Integer.valueOf(this.f475370c);
            objArr2[1] = java.lang.Long.valueOf(this.f475368a);
            objArr2[2] = java.lang.Long.valueOf(this.f475371d);
            objArr2[3] = java.lang.Integer.valueOf(this.f475372e);
            objArr2[4] = str;
            objArr2[5] = 0;
            objArr2[6] = java.lang.Integer.valueOf(this.f475369b ? 0 : 1);
            objArr2[7] = this.f475374g;
            objArr2[8] = "";
            objArr2[9] = this.f475376i;
            objArr2[10] = java.lang.Integer.valueOf(this.f475377j);
            objArr2[11] = java.lang.Integer.valueOf(this.f475378k);
            objArr2[12] = this.f475379l;
            objArr2[13] = java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(this.f475375h) ? this.f475375h.length() : 0);
            objArr2[14] = "0";
            objArr2[15] = java.lang.Integer.valueOf(this.f475382o);
            objArr2[16] = java.lang.Integer.valueOf(this.f475388u ? 1 : 0);
            objArr2[17] = 0;
            objArr2[18] = "";
            objArr2[19] = java.lang.Integer.valueOf(this.f475380m);
            objArr2[20] = java.lang.Integer.valueOf(this.f475381n);
            objArr2[21] = 0;
            objArr2[22] = "";
            objArr2[23] = this.f475389v;
            objArr2[24] = java.lang.Integer.valueOf((int) (this.f475390w * 10.0f));
            objArr2[25] = java.lang.Integer.valueOf(this.f475391x);
            objArr2[26] = java.lang.Integer.valueOf(this.f475392y);
            objArr2[27] = java.lang.Integer.valueOf(this.f475393z);
            objArr2[28] = java.lang.Integer.valueOf(this.A);
            objArr2[29] = java.lang.Integer.valueOf(this.f475383p);
            objArr2[30] = java.lang.Integer.valueOf(this.f475380m);
            objArr2[31] = java.lang.Integer.valueOf(this.f475384q);
            objArr2[32] = java.lang.Long.valueOf(this.f475386s);
            objArr2[33] = java.lang.Integer.valueOf((int) (this.f475385r * 100.0f));
            objArr2[34] = 0;
            objArr2[35] = java.lang.Integer.valueOf(e17);
            objArr2[36] = this.B;
            objArr2[37] = this.C;
            objArr2[38] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr2[39] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr2[40] = this.D;
            objArr2[41] = 0L;
            g0Var.d(13233, objArr2);
            this.f475387t = true;
        }
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.qbar.WxQbarNative$QBarReportMsg wxQbarNative$QBarReportMsg, int i17, int i18, java.util.List list) {
        this.f475374g = str;
        this.f475375h = str2;
        this.f475376i = str3;
        this.f475380m = i17;
        this.f475381n = i18;
        if (wxQbarNative$QBarReportMsg != null) {
            this.f475377j = wxQbarNative$QBarReportMsg.qrcodeVersion;
            this.f475378k = wxQbarNative$QBarReportMsg.pyramidLv;
            this.f475379l = wxQbarNative$QBarReportMsg.binaryMethod;
            this.f475389v = wxQbarNative$QBarReportMsg.scaleList;
            this.f475390w = wxQbarNative$QBarReportMsg.decodeScale;
            this.f475391x = wxQbarNative$QBarReportMsg.detectTime;
            this.f475392y = wxQbarNative$QBarReportMsg.srTime;
        }
        this.f475393z = 0;
        this.A = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.qbar.WxQbarNative$QBarReportMsg wxQbarNative$QBarReportMsg2 = (com.tencent.qbar.WxQbarNative$QBarReportMsg) it.next();
                if (wxQbarNative$QBarReportMsg2.inWhiteList) {
                    this.f475393z++;
                } else if (wxQbarNative$QBarReportMsg2.inBlackList) {
                    this.A++;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s, resultSize %d, isFilterResult %d,scaleList %s,decodeScale %f,detectTime %d,srTime %d, whiteListHit %d, blackListHit %d", str, str2, str3, java.lang.Integer.valueOf(this.f475377j), java.lang.Integer.valueOf(this.f475378k), this.f475379l, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f475389v, java.lang.Float.valueOf(this.f475390w), java.lang.Integer.valueOf(this.f475391x), java.lang.Integer.valueOf(this.f475392y), java.lang.Integer.valueOf(this.f475393z), java.lang.Integer.valueOf(this.A));
    }
}
