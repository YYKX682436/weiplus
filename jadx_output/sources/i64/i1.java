package i64;

/* loaded from: classes4.dex */
public class i1 implements com.tencent.mm.modelbase.j1 {

    /* renamed from: n, reason: collision with root package name */
    public static int f289188n = 20480;

    /* renamed from: o, reason: collision with root package name */
    public static int f289189o = 30720;

    /* renamed from: p, reason: collision with root package name */
    public static int f289190p = 51200;

    /* renamed from: q, reason: collision with root package name */
    public static int f289191q = 60;

    /* renamed from: r, reason: collision with root package name */
    public static int f289192r = 1800;

    /* renamed from: s, reason: collision with root package name */
    public static volatile boolean f289193s = false;

    /* renamed from: t, reason: collision with root package name */
    public static int f289194t = 43200;

    /* renamed from: d, reason: collision with root package name */
    public int f289195d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f289196e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Random f289197f = new java.util.Random(java.lang.System.currentTimeMillis());

    /* renamed from: g, reason: collision with root package name */
    public final r45.e96 f289198g = new r45.e96();

    /* renamed from: h, reason: collision with root package name */
    public boolean f289199h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f289200i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f289201m = 0;

    public static /* synthetic */ r45.e96 b(i64.i1 i1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        r45.e96 e96Var = i1Var.f289198g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return e96Var;
    }

    public java.lang.String c(java.lang.Object... objArr) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (objArr == null || objArr.length <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length = objArr.length - 1;
            for (int i17 = 0; i17 < length; i17++) {
                sb6.append(java.lang.String.valueOf(objArr[i17]));
                sb6.append(',');
            }
            sb6.append(java.lang.String.valueOf(objArr[length]));
            str = sb6.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return str;
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (f289193s) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLogMgr", "Account not ready");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        f289188n = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLog2GSendSize", 20480);
        f289189o = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLog3GSendSize", 30720);
        f289190p = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogWifiSendSize", 51200);
        f289191q = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMinRandTime", 60);
        f289192r = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMaxRandTime", 1800);
        f289194t = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMaxExceptionTime", 43200);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLogMgr", "init " + f289188n + ";" + f289189o + ";" + f289190p + ";" + f289191q + ";" + f289192r + ";" + f289194t);
        int i17 = f289192r;
        int i18 = f289191q;
        if (i17 - i18 < 0) {
            f289192r = i18;
        }
        f289193s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    public void h(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.d1(this, i17, objArr));
        if (this.f289199h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        this.f289199h = true;
        ((ku5.t0) ku5.t0.f312615d).k(new i64.f1(this), 2000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        f();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_SNS_ADLOG_CNTTIME_INT, 0)).intValue();
        gm0.j1.i();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_SNS_ADLOG_FREQUENCY_INT, -1)).intValue();
        boolean z17 = true;
        if (intValue2 > f289194t || intValue2 < 0) {
            intValue2 = this.f289197f.nextInt((f289192r - f289191q) + 1) + f289191q;
        }
        if ((java.lang.System.currentTimeMillis() / 1000) - intValue > intValue2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.g1(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        com.tencent.mm.plugin.sns.storage.k2 Ij = com.tencent.mm.plugin.sns.model.l4.Ij();
        Ij.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKvReportStg", " getLast select rowid from SnsReportKv order by rowid desc  limit 1");
        android.database.Cursor f17 = Ij.f166038d.f("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
        int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        this.f289195d = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.h1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.g1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (m1Var.getType() == 1802 && (m1Var instanceof i64.n0)) {
            i64.n0 n0Var = (i64.n0) m1Var;
            if (i17 == 0 && i18 == 0) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_SNS_ADLOG_CNTTIME_INT, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.tencent.mm.plugin.sns.model.l4.Sj().execute(new i64.h1(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                com.tencent.mm.plugin.sns.storage.k2 Ij = com.tencent.mm.plugin.sns.model.l4.Ij();
                Ij.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
                r45.e96 e96Var = new r45.e96();
                java.util.Iterator it = n0Var.f289247f.iterator();
                while (it.hasNext()) {
                    e96Var.f373180d.add((r45.e44) it.next());
                }
                Ij.y0(e96Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }
}
