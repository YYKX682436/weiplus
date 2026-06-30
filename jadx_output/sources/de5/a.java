package de5;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f229397b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f229398c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f229399d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f229400e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f229401f = "";

    /* renamed from: g, reason: collision with root package name */
    public static int f229402g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static long f229403h;

    /* renamed from: i, reason: collision with root package name */
    public static long f229404i;

    /* renamed from: k, reason: collision with root package name */
    public static long f229406k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f229407l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f229408m;

    /* renamed from: n, reason: collision with root package name */
    public static int f229409n;

    /* renamed from: a, reason: collision with root package name */
    public static final de5.a f229396a = new de5.a();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f229405j = new java.util.HashSet();

    public static /* synthetic */ void e(de5.a aVar, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i18 = 0;
        }
        if ((i27 & 4) != 0) {
            i19 = 0;
        }
        aVar.d(i17, i18, i19);
    }

    public static void f(de5.a aVar, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 4) != 0) {
            i19 = 0;
        }
        if ((i28 & 8) != 0) {
            i27 = 0;
        }
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportItemLongClick >> " + i17 + ", " + i18 + ", " + f229400e + ", " + f229402g);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = aVar.a();
        a17.f60286f = (long) i17;
        a17.f60288h = (long) i18;
        a17.p(f229401f);
        int i29 = f229400e;
        if (i29 == 1) {
            a17.f60291k = f229402g;
        }
        if (i29 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportItemLongClick currentTab is 0 to report position>> " + i19 + ", " + i27);
            a17.f60299s = (long) i19;
            a17.f60300t = (long) i27;
        }
        a17.k();
    }

    public final com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a() {
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f60284d = sessionMsgSearchActionLogStruct.b("sessionid", f229397b, true);
        sessionMsgSearchActionLogStruct.f60285e = sessionMsgSearchActionLogStruct.b("searchsessionid", f229398c, true);
        sessionMsgSearchActionLogStruct.f60287g = f229400e;
        return sessionMsgSearchActionLogStruct;
    }

    public final void b(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportEmojiSearch " + i17 + ", " + z17);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f60286f = (long) i17;
        sessionMsgSearchActionLogStruct.f60284d = sessionMsgSearchActionLogStruct.b("sessionid", f229397b, true);
        if (z17) {
            sessionMsgSearchActionLogStruct.f60301u = 7L;
        } else {
            sessionMsgSearchActionLogStruct.f60287g = 8L;
        }
        sessionMsgSearchActionLogStruct.f60288h = 8L;
        sessionMsgSearchActionLogStruct.p(f229401f);
        sessionMsgSearchActionLogStruct.k();
    }

    public final void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportFTSLongClickAction >> " + i17 + ", " + f229400e + ", " + f229397b + ", msgType: " + i18);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = a();
        a17.f60286f = (long) i17;
        a17.f60288h = (long) i18;
        a17.p(f229401f);
        a17.k();
    }

    public final void d(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportItemClick >> " + i17 + ", " + f229400e + ", " + f229402g);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = a();
        a17.f60286f = 5L;
        a17.f60288h = (long) i17;
        a17.p(f229401f);
        int i27 = f229400e;
        if (i27 == 1) {
            a17.f60291k = f229402g;
        }
        if (i27 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportItemClick currentTab is 0 to report position>> " + i18 + ", " + i19);
            a17.f60299s = (long) i18;
            a17.f60300t = (long) i19;
        }
        a17.k();
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportNormalAction >> action: " + i17);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = a();
        a17.f60286f = (long) i17;
        if (i17 == 1) {
            a17.f60295o = a17.b(dm.i4.COL_USERNAME, f229399d, true);
        } else if (i17 == 6) {
            a17.f60291k = f229402g;
        }
        a17.k();
    }

    public final void h(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportResultExpose >> " + i17 + ", " + i18 + ", " + f229407l + ", " + f229400e + ", " + f229398c + ", " + f229403h + ", " + f229404i + ", " + i19);
        java.util.HashSet hashSet = f229405j;
        if (hashSet.contains(java.lang.Integer.valueOf(f229400e))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", f229400e + " is report in " + f229398c);
            return;
        }
        if (f229404i == 0 && f229403h != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "firstShowSearchCost is 0");
            f229404i = java.lang.System.currentTimeMillis() - f229403h;
        }
        hashSet.add(java.lang.Integer.valueOf(f229400e));
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = a();
        a17.f60286f = 7L;
        boolean z17 = f229407l;
        a17.f60292l = (z17 || f229408m) ? 1L : 2L;
        a17.f60293m = (z17 || f229408m) ? 1L : 2L;
        a17.f60294n = i17;
        a17.f60297q = i18;
        a17.f60290j = f229404i;
        a17.p(f229401f);
        a17.f60298r = i19;
        a17.k();
    }

    public final void i(int i17) {
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportSearchResult >> " + f229398c + ", " + f229403h + ", " + f229406k + ", " + i17 + ", " + f229409n);
        if (f229398c.length() > 0) {
            if (f229406k == 0 && !f229407l && f229409n == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportSearchResult >> imageQueryDoneTimeStamp is 0");
                f229406k = java.lang.System.currentTimeMillis();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "need to report result " + f229406k);
            com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = a();
            a17.f60286f = 8L;
            if (!f229407l) {
                long j18 = f229403h;
                if (j18 != 0) {
                    long j19 = f229406k;
                    if (j19 >= j18 && f229409n == 1) {
                        j17 = j19 - j18;
                        a17.f60296p = j17;
                        a17.f60297q = i17;
                        a17.k();
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f229398c + ", " + f229403h);
                        f229398c = "";
                        f229401f = "";
                        f229402g = 1;
                        f229403h = 0L;
                        f229404i = 0L;
                        f229405j.clear();
                        f229406k = 0L;
                        f229409n = 0;
                    }
                }
            }
            j17 = 0;
            a17.f60296p = j17;
            a17.f60297q = i17;
            a17.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f229398c + ", " + f229403h);
            f229398c = "";
            f229401f = "";
            f229402g = 1;
            f229403h = 0L;
            f229404i = 0L;
            f229405j.clear();
            f229406k = 0L;
            f229409n = 0;
        }
    }

    public final void j(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalSearch " + i17 + ", " + i18);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f60286f = (long) i17;
        sessionMsgSearchActionLogStruct.f60284d = sessionMsgSearchActionLogStruct.b("sessionid", f229397b, true);
        sessionMsgSearchActionLogStruct.f60301u = (long) i18;
        sessionMsgSearchActionLogStruct.p(f229401f);
        sessionMsgSearchActionLogStruct.k();
    }

    public final void k(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalSearch " + i17 + ", " + i18 + ", " + i19);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct sessionMsgSearchActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct();
        sessionMsgSearchActionLogStruct.f60286f = (long) i17;
        sessionMsgSearchActionLogStruct.f60284d = sessionMsgSearchActionLogStruct.b("sessionid", f229397b, true);
        sessionMsgSearchActionLogStruct.f60301u = (long) i18;
        sessionMsgSearchActionLogStruct.f60288h = (long) i19;
        sessionMsgSearchActionLogStruct.p(f229401f);
        sessionMsgSearchActionLogStruct.k();
    }

    public final void l(java.lang.String currentQuery) {
        kotlin.jvm.internal.o.g(currentQuery, "currentQuery");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setCurrentQuery >> ".concat(currentQuery));
        f229401f = currentQuery;
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setFirstToShowCost >> " + f229398c + ", " + f229403h);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = f229403h;
        long j18 = 0;
        if (j17 != 0 && currentTimeMillis > j17) {
            j18 = currentTimeMillis - j17;
        }
        f229404i = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setFirstToShowCost after >> " + f229404i);
    }
}
