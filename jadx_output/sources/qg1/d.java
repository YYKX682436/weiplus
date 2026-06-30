package qg1;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f362748z = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f362749o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f362750p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.k9 f362751q;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f362753s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.b7 f362754t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f362755u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Runnable f362757w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct f362758x;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f362752r = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f362756v = false;

    /* renamed from: y, reason: collision with root package name */
    public int f362759y = -1;

    public d(java.lang.String str, boolean z17, r45.ac7 ac7Var, r45.ag7 ag7Var, r45.de7 de7Var, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, java.lang.String str3, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, java.lang.String str4, r45.y50 y50Var, int i18, boolean z18, java.lang.String str5, boolean z19, boolean z27) {
        java.lang.String str6 = str;
        java.lang.String str7 = str3;
        this.f362755u = z19;
        this.f362750p = str2;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct b17 = com.tencent.mm.plugin.appbrand.report.quality.u.b(qualitySession);
        this.f362758x = b17;
        b17.f62774n = z17 ? cm.o0.sync : cm.o0.async;
        b17.f62775o = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        b17.f62779s = b17.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        java.lang.String str8 = qualitySession.f88134d;
        this.f362753s = str8;
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        r45.u54 u54Var = new r45.u54();
        u54Var.f387055d = str6;
        u54Var.f387056e = ac7Var;
        u54Var.f387057f = z17 ? 1 : 2;
        u54Var.f387060i = ag7Var;
        u54Var.f387061m = de7Var;
        u54Var.f387065q = str7;
        u54Var.f387064p = str8;
        u54Var.f387073y = i18;
        u54Var.f387074z = str5;
        u54Var.B = z27;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            u54Var.C = com.tencent.mm.plugin.appbrand.launching.x.a(str3);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            u54Var.C = com.tencent.mm.plugin.appbrand.launching.x.a(k91.k4.f(str));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "appId:%s, userName:%s,is_first_launch:%b", str6, str7, java.lang.Boolean.valueOf(u54Var.C));
        r45.fd7 fd7Var = new r45.fd7();
        fd7Var.f374246d = i17;
        u54Var.f387059h = fd7Var;
        if (u54Var.f387056e.f369928f == 1162 && appBrandLaunchFromNotifyReferrer != null) {
            r45.qe7 qe7Var = new r45.qe7();
            qe7Var.f383921d = appBrandLaunchFromNotifyReferrer.f77317g;
            u54Var.f387068t = qe7Var;
        }
        if (1173 == u54Var.f387056e.f369928f) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init>, openMaterialMimeType is empty");
            } else {
                r45.he7 he7Var = new r45.he7();
                he7Var.f376101d = str4;
                u54Var.f387072x = he7Var;
            }
        }
        java.util.Objects.requireNonNull(y50Var);
        u54Var.f387071w = y50Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1122;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f70664a = u54Var;
        lVar.f70665b = new r45.v54();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f362749o = a17;
        p(a17);
        iz5.a.c(null, z27 && z27 == H());
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = str7 == null ? "" : str7;
        objArr[2] = str6 == null ? "" : str6;
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = str2;
        objArr[5] = str8;
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = wz0.a.a(y50Var);
        objArr[8] = java.lang.Integer.valueOf(i18);
        objArr[9] = java.lang.Boolean.valueOf(z18);
        objArr[10] = java.lang.Boolean.valueOf(z27);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b", objArr);
    }

    public static void J(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "saveMigrateAppId2SourceAppIdMapping, %s -> %s", str, str2);
        f362748z.put(str, str2);
    }

    public static void K(r45.u54 u54Var) {
        r45.fd7 fd7Var = u54Var.f387059h;
        int i17 = fd7Var.f374246d;
        if (i17 <= 0) {
            fd7Var.f374246d = 0;
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.e6 e6Var = (com.tencent.mm.plugin.appbrand.appcache.e6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.e6.class);
        if (e6Var != null) {
            com.tencent.mm.plugin.appbrand.appcache.d6 d6Var = new com.tencent.mm.plugin.appbrand.appcache.d6();
            d6Var.field_key = "@LibraryAppId";
            d6Var.field_version = i17;
            if (e6Var.get(d6Var, "key", "version")) {
                r45.fd7 fd7Var2 = u54Var.f387059h;
                fd7Var2.f374247e = (int) d6Var.field_updateTime;
                fd7Var2.f374248f = d6Var.field_scene;
            }
        }
    }

    public static void L(r45.u54 u54Var) {
        try {
            if (wo.v1.f447831k.f447586a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "SrvDeviceInfo isLimit benchmarkLevel");
                u54Var.f387063o = -1;
            } else {
                int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1);
                u54Var.f387063o = b17;
                if (b17 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "DynamicConfig performanceLevel 0 illegal");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", e17, "read performanceLevel", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public r45.y50 A() {
        return E().f387071w;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        java.lang.String str = E().f387064p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String C() {
        java.lang.String str = E().f387065q;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public final java.lang.String D() {
        return ((r45.u54) this.f362749o.f70710a.f70684a).f387055d;
    }

    public r45.u54 E() {
        return (r45.u54) this.f362749o.f70710a.f70684a;
    }

    public final r45.v54 F() {
        return (r45.v54) this.f362749o.f70711b.f70700a;
    }

    public final int G() {
        return ((r45.u54) this.f362749o.f70710a.f70684a).f387056e.f369926d;
    }

    public final boolean H() {
        return ((r45.u54) this.f362749o.f70710a.f70684a).f387056e.f369930h > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    @Override // com.tencent.mm.plugin.appbrand.networking.d
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r33, int r34, java.lang.String r35, r45.v54 r36, com.tencent.mm.modelbase.m1 r37) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg1.d.x(int, int, java.lang.String, r45.v54, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    public final synchronized pq5.g l() {
        pq5.g a17 = new qg1.c().a((r45.u54) this.f362749o.f70710a.f70684a, this.f362752r, this);
        if (a17 != null) {
            return a17;
        }
        af.c b17 = af.d.f4444a.b(this.f362753s, false);
        if (b17 != null) {
            af.b bVar = (af.b) b17.f4442a.get(0);
            ug1.h hVar = null;
            if (bVar == null) {
                bVar = null;
            }
            if (bVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "getLaunchTask: ret == null!");
            } else {
                hVar = (ug1.h) bVar;
            }
            if (hVar != null) {
                com.tencent.mm.modelbase.f a18 = hVar.a(100);
                if (a18 != null && a18.f70618d != null && a18.f70615a == 0 && a18.f70616b == 0) {
                    hVar.f4440d = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "run() intercepted by preFetchLaunchTask, instanceId:%s", this.f362753s);
                    return pq5.h.d(new qg1.f(this, a18));
                }
                hVar.f4440d = false;
            }
        }
        K(E());
        L(E());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f362759y = sj1.l.f(D(), "public:prepare", "小程序相关信息准备");
        this.f362758x.f62771k = currentTimeMillis;
        return super.l();
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public final com.tencent.mm.modelbase.f t() {
        this.f362752r = true;
        return super.t();
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public pq5.g u() {
        if (com.tencent.mm.plugin.appbrand.networking.a.a(D(), ((r45.u54) this.f362749o.f70710a.f70684a).f387065q)) {
            return null;
        }
        return pq5.h.d(new qg1.i(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        java.lang.String str = E().f387055d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }
}
