package za4;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static void a(java.lang.String str, boolean z17, int i17, int i18, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPagesDownloadResourceHelper", "start download img for " + str + " for adid:adId");
        za4.d0.b(str, l("adId", str), z17, i17, i18, e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e0Var.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        } else {
            d(str, str2, e0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        }
    }

    public static void c(java.lang.String str, boolean z17, int i17, int i18, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        b("adId", str, z17, i17, i18, e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    public static void d(java.lang.String str, java.lang.String str2, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e0Var.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPagesDownloadResourceHelper", "start download new img for " + str2 + " for adid:" + str);
        za4.d0.a(str2, g(), j(str, str2), 0, e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    public static void e(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadSightForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPagesDownloadResourceHelper", "downloadSightForAdLandingPages, url=" + str2 + ", adId=" + str);
        za4.d0.b(str2, n(str, str2), z17, i17, i18, e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    public static void f(java.lang.String str, java.lang.String str2, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e0Var.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPagesDownloadResourceHelper", "downloadSightForAdLandingPagesByCdn, url=" + str2 + ", adId=" + str);
        java.lang.String g17 = g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFileNameForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str3 = str + "_sight_" + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileNameForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        za4.d0.a(str2, g17, str3, 1, e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    public static java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdlandingResDir", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdlandingResDir", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return Bi;
    }

    public static android.graphics.Bitmap h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        android.graphics.Bitmap i17 = i("adId", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return i17;
    }

    public static android.graphics.Bitmap i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return null;
        }
        try {
            java.lang.String l17 = l(str, str2);
            if (!android.text.TextUtils.isEmpty(l17) && com.tencent.mm.vfs.w6.j(l17)) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(l17, options);
                m44.a.c(str2, J2, options);
                boolean z17 = true;
                m44.d.b(J2 != null);
                if (J2 == null) {
                    z17 = false;
                }
                m44.d.c(z17, str2, "downloadResHelperCache");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
                return J2;
            }
        } catch (java.lang.Exception e17) {
            m44.d.b(false);
            m44.d.c(false, str2, "downloadResHelperCacheExp");
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPagesDownloadResourceHelper", "%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return null;
    }

    public static java.lang.String j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFileNameForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str3 = str + "_img_" + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileNameForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    public static java.lang.String k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        java.lang.String str2 = g() + j("adId", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str2;
    }

    public static java.lang.String l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        java.lang.String str3 = g() + j(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    public static java.lang.String m(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathForPagFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        java.lang.String g17 = g();
        com.tencent.mm.vfs.w6.u(g17);
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str3 = g17 + str + "_pag_" + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathForPagFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    public static java.lang.String n(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        com.tencent.mm.vfs.w6.u(g());
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str3 = g() + str + "_sight_" + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }
}
