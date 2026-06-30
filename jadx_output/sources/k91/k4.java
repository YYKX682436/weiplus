package k91;

/* loaded from: classes7.dex */
public final class k4 extends k91.c3 {

    /* renamed from: e, reason: collision with root package name */
    public static final bm5.i1 f305663e = new bm5.i1(new k91.k4$$a(), null);

    /* JADX WARN: Can't wrap try/catch for region: R(24:9|(1:11)(1:93)|12|(3:16|17|(3:19|(4:22|(2:24|25)(2:27|(2:29|30)(2:31|32))|26|20)|33))|36|(1:38)(1:92)|39|(1:41)(1:91)|42|(1:44)(1:90)|45|(1:47)(1:89)|48|(1:50)(3:81|82|(2:84|85))|(9:(2:78|(1:80))|53|(3:58|(1:60)(1:62)|61)|63|(1:67)|68|69|70|71)|52|53|(4:56|58|(0)(0)|61)|63|(2:65|67)|68|69|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c7, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorageHelper", "assembleProfileAttrs, NULL appInfo, usernameOrAppId = %s", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes a(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.k4.a(java.lang.String, boolean):com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo b(java.lang.String r24, java.lang.String r25, int r26, long r27, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.k4.b(java.lang.String, java.lang.String, int, long, boolean, java.lang.String):com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
    }

    public static com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC c(k91.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = null;
        if (v5Var != null) {
            try {
                appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) com.tencent.mm.plugin.appbrand.hg.a(new k91.l4(), v5Var);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorageHelper", "assembleSysConfig, <init> e = %s", e17);
                return null;
            }
        }
        if (appBrandSysConfigWC != null) {
            appBrandSysConfigWC.W = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1);
            appBrandSysConfigWC.f47297x = "1".equals(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(appBrandSysConfigWC.f305842e + "_PerformancePanelEnabled", "0"));
            appBrandSysConfigWC.f77343z1 = v5Var.u0() != null ? v5Var.u0().f305642q : 0;
            appBrandSysConfigWC.A1 = v5Var.u0() != null ? v5Var.u0().f305643r : 0;
            appBrandSysConfigWC.C1 = v5Var.u0() != null ? v5Var.u0().f305644s : 0;
            appBrandSysConfigWC.D1 = v5Var.u0() != null ? v5Var.u0().f305646u : 0;
            appBrandSysConfigWC.E1 = v5Var.u0() != null ? v5Var.u0().f305647v : 0;
            appBrandSysConfigWC.B1 = v5Var.v0().f305706a.H;
            appBrandSysConfigWC.F1 = v5Var.field_passThroughInfo;
            appBrandSysConfigWC.G1 = v5Var.field_stablePassThroughInfo;
        }
        return appBrandSysConfigWC;
    }

    public static void d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        k91.v5 v5Var = new k91.v5();
        v5Var.field_username = str;
        com.tencent.mm.plugin.appbrand.app.r9.ij().delete(v5Var, dm.i4.COL_USERNAME);
        ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class)).delete(v5Var, dm.i4.COL_USERNAME);
    }

    public static java.lang.String e(java.lang.String str) {
        k91.v5 n17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "appId")) == null) {
            return null;
        }
        return n17.field_appId;
    }

    public static java.lang.String f(java.lang.String str) {
        k91.v5 k17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(str, dm.i4.COL_USERNAME)) == null) {
            return null;
        }
        return k17.field_username;
    }

    public static k91.k4 g() {
        if (com.tencent.mm.plugin.appbrand.app.r9.ij() != null) {
            return (k91.k4) f305663e.b();
        }
        throw new c01.c();
    }

    public static boolean h(java.lang.String str) {
        k91.v5 n17;
        return (com.tencent.mm.plugin.appbrand.app.r9.ij() == null || (n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "appInfo")) == null || n17.u0() == null || !n17.u0().c()) ? false : true;
    }

    public static void i(java.lang.String str) {
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        ij6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("syncVersion", "");
        contentValues.put("syncTimeSecond", (java.lang.Long) 0L);
        ij6.f305625d.p(ij6.getTableName(), contentValues, java.lang.String.format(java.util.Locale.US, "%s=?", dm.i4.COL_USERNAME), new java.lang.String[]{str});
    }
}
