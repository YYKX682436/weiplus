package o72;

/* loaded from: classes12.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f343319a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f343320b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_quality_report_open, true);

    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.aa.d(str, "favitem", null) != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavApiUtil", "[checkXmlIllegal] maps = null, xml parse error");
        return false;
    }

    public static void b() {
        if (!f343320b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] needToReport = false, break flow");
            return;
        }
        o72.w2 w2Var = o72.w2.f343509a;
        long d17 = w2Var.d(1);
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b17 = w2Var.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d17 + ", struct un find and return");
            return;
        }
        b17.k();
        w2Var.g(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d17 + ", finish report");
    }

    public static void c() {
        if (!f343320b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] needToReport == false, return");
            return;
        }
        o72.w2 w2Var = o72.w2.f343509a;
        long d17 = w2Var.d(2);
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = w2Var.e();
        if (e17 == null || d17 == -4369) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] struct == null, session = " + d17 + ", return");
        }
        if (e17 == null) {
            return;
        }
        int i17 = e17.f56311d;
        w2Var.g(2);
        e17.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] scene = " + i17 + ", session = " + d17 + ", finish report");
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static void e(long j17, int i17, int i18, boolean z17, int i19) {
        o72.w2 w2Var = o72.w2.f343509a;
        java.lang.Long l17 = (java.lang.Long) o72.w2.f343514f.get(java.lang.Long.valueOf(j17));
        long longValue = l17 == null ? -4369L : l17.longValue();
        if (longValue == -4369) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavApiUtil", "[reportFavAddQuality] session un find, localId = " + j17);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct a17 = w2Var.a(longValue);
        a17.f56235t = i19;
        if (z17) {
            a17.f56236u = 0;
            return;
        }
        a17.f56236u = -1;
        a17.f56237v = i17;
        a17.f56238w = i18;
    }

    public static void f(int i17, int i18, java.lang.String str) {
        if (f343319a.add(i17 + "_" + i18 + "_" + str)) {
            com.tencent.mm.autogen.mmdata.rpt.FavUploadFailReportStruct favUploadFailReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavUploadFailReportStruct();
            if (i18 < 0) {
                favUploadFailReportStruct.f56339d = -i18;
            } else {
                favUploadFailReportStruct.f56339d = i18;
            }
            if (str == null) {
                str = "";
            }
            favUploadFailReportStruct.f56340e = favUploadFailReportStruct.b("ErrorMsg", str, true);
            favUploadFailReportStruct.f56343h = 2L;
            favUploadFailReportStruct.f56342g = i17;
            favUploadFailReportStruct.k();
            favUploadFailReportStruct.o();
        }
    }

    public static void g(java.lang.String str, int i17, int i18, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] syncKey = " + str + ", errorType = " + i17 + ", errorCode = " + i18 + ", cost = " + j17 + ", success = " + z17);
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        if (z17) {
            e17.f56313f = 0;
        } else {
            e17.f56313f = -1;
            e17.f56314g = i17;
            e17.f56315h = i18;
        }
        e17.f56317j = j17;
        if (j17 >= 30000) {
            e17.f56316i = -1;
        } else {
            e17.f56316i = 0;
        }
    }

    public static void h(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] retrySuccessflully = " + z17 + ", totalRetryCnt = " + i17);
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        e17.A = z17 ? 1 : 0;
        e17.B = i17;
    }

    public static void i(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] writeDBFailed = " + z17 + ", rewriteCanFix = " + z18);
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        e17.f56332y = z17 ? 1 : 0;
        e17.f56333z = z18 ? 1 : 0;
    }

    public static void j(int i17, int i18, int i19, int i27, long j17, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        e17.f56325r = i17;
        e17.f56326s = i18;
        e17.f56318k = -1;
        e17.f56324q = j17;
        e17.f56320m = i27;
        e17.f56319l = i19;
        if (z17) {
            e17.f56329v = 1;
        } else {
            e17.f56329v = 0;
        }
        if (j17 >= 30000) {
            e17.f56323p = -1;
        } else {
            e17.f56323p = 0;
        }
    }

    public static void k(int i17, int i18, java.lang.String str, int i19, long j17, int i27, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        e17.f56325r = i17;
        e17.f56326s = i18;
        e17.f56327t = i19;
        if (i19 == 0) {
            e17.f56321n = 0;
        } else {
            e17.f56321n = -1;
            e17.f56322o = e17.b("BatchGetIllegalXmlContent", str, true);
        }
        if (z17) {
            e17.f56329v = 1;
        } else {
            e17.f56329v = 0;
        }
        e17.f56318k = 0;
        e17.f56328u = i27;
        e17.f56324q = j17;
        if (j17 >= 30000) {
            e17.f56323p = -1;
        } else {
            e17.f56323p = 0;
        }
    }

    public static void l(java.lang.String str, int i17, long j17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct e17 = o72.w2.f343509a.e();
        if (e17 == null) {
            return;
        }
        e17.f56325r = 0;
        e17.f56326s = 0;
        e17.f56327t = i17;
        if (i17 == 0) {
            e17.f56321n = 0;
        } else {
            e17.f56321n = -1;
            e17.f56322o = e17.b("BatchGetIllegalXmlContent", str, true);
        }
        e17.f56330w = i18;
        e17.f56331x = i19;
        e17.f56318k = 0;
        e17.f56324q = j17;
        if (j17 >= 30000) {
            e17.f56323p = -1;
        } else {
            e17.f56323p = 0;
        }
    }

    public static void m(int i17) {
        o72.w2 w2Var = o72.w2.f343509a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[createReportSession] create report session = " + currentTimeMillis);
        w2Var.f(2, currentTimeMillis);
        w2Var.e().f56311d = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[startSyncReportEnv] scene = " + i17 + ", session = " + currentTimeMillis);
    }
}
