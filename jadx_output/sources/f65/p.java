package f65;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.p f259934a = new f65.p();

    /* renamed from: b, reason: collision with root package name */
    public static long f259935b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f259936c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f259937d = "";

    /* renamed from: e, reason: collision with root package name */
    public static long f259938e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static long f259939f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static long f259940g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static long f259941h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f259942i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static long f259943j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static long f259944k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f259945l = "";

    /* renamed from: m, reason: collision with root package name */
    public static long f259946m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f259947n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f259948o = "";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f259949p = "";

    /* renamed from: q, reason: collision with root package name */
    public static long f259950q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f259951r = "";

    /* renamed from: s, reason: collision with root package name */
    public static long f259952s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static long f259953t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static long f259954u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static long f259955v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f259956w = "";

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.String f259957x = "";

    public final void a(int i17, int i18, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "doReportIdentifyFinish >> " + f259956w);
        com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct imageQueryTecLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f58468d = (long) i17;
        imageQueryTecLogStruct.G = imageQueryTecLogStruct.b("SessionId", f259956w, true);
        imageQueryTecLogStruct.f58490z = f259950q;
        imageQueryTecLogStruct.f58470f = f259935b;
        imageQueryTecLogStruct.f58471g = imageQueryTecLogStruct.b("LatestIdenImage", f259936c, true);
        imageQueryTecLogStruct.f58472h = imageQueryTecLogStruct.b("LatestHistoryIdenedImage", f259937d, true);
        imageQueryTecLogStruct.A = imageQueryTecLogStruct.b("LatestClsHistoryIdenedImage", f259951r, true);
        imageQueryTecLogStruct.f58473i = 0L;
        imageQueryTecLogStruct.f58474j = f259938e;
        imageQueryTecLogStruct.f58481q = f259942i;
        imageQueryTecLogStruct.f58482r = f259943j;
        if (i17 != 6) {
            imageQueryTecLogStruct.f58475k = f259939f;
            imageQueryTecLogStruct.f58476l = f259940g;
            long j18 = i18;
            imageQueryTecLogStruct.f58478n = j18;
            imageQueryTecLogStruct.f58479o = j17;
            imageQueryTecLogStruct.f58477m = f259941h;
            if (i18 != 0) {
                long j19 = f259935b;
                if (j19 != 0) {
                    imageQueryTecLogStruct.f58480p = (j17 - j19) / j18;
                }
            }
        }
        imageQueryTecLogStruct.k();
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> ready report action: " + i17 + ", " + f259956w);
        com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct imageQueryTecLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct();
        if (f259946m == 2) {
            if (f259957x.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "do report text is empty");
                f259944k = 0L;
                f259945l = "";
                f259946m = 0L;
                f259947n = 0L;
                f259948o = "";
                f259949p = "";
                f259952s = 0L;
                f259957x = "";
                return;
            }
        }
        if (f259945l.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> to report action: " + i17 + ", " + f259956w);
            imageQueryTecLogStruct.f58468d = (long) i17;
            imageQueryTecLogStruct.f58483s = f259944k;
            imageQueryTecLogStruct.G = imageQueryTecLogStruct.b("SessionId", f259956w, true);
            imageQueryTecLogStruct.f58484t = imageQueryTecLogStruct.b("SearchSessionId", f259945l, true);
            imageQueryTecLogStruct.f58485u = f259946m;
            imageQueryTecLogStruct.f58486v = f259947n;
            imageQueryTecLogStruct.f58487w = imageQueryTecLogStruct.b("SugText", f259948o, true);
            imageQueryTecLogStruct.f58488x = imageQueryTecLogStruct.b("SearchConnectText", f259949p, true);
            imageQueryTecLogStruct.f58489y = f259952s;
            imageQueryTecLogStruct.H = imageQueryTecLogStruct.b("SearchQueryText", f259957x, true);
            imageQueryTecLogStruct.k();
            f259944k = 0L;
            f259945l = "";
            f259946m = 0L;
            f259947n = 0L;
            f259948o = "";
            f259949p = "";
            f259952s = 0L;
            f259957x = "";
        }
    }

    public final void c(long j17, long j18, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryTecReporter", "reportPerIdentify >> perNum: " + j17 + ", averPerTime: " + j18 + ", model: " + i17 + ", action: " + i18 + ", sessionId: " + f259956w);
        com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct imageQueryTecLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f58468d = (long) i18;
        imageQueryTecLogStruct.G = imageQueryTecLogStruct.b("SessionId", f259956w, true);
        imageQueryTecLogStruct.D = j17;
        imageQueryTecLogStruct.E = j18;
        imageQueryTecLogStruct.F = (long) i17;
        imageQueryTecLogStruct.k();
    }
}
