package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.tencent.mars.xlog.Log.i("AdLandingPagePagFileHelper", "downloadPagFile, url=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return;
        }
        dn.j jVar = new dn.j();
        jVar.f241785d = "task_SnsAdFileDownloader";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        java.lang.String m17 = za4.t0.m("adId", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.tencent.mm.vfs.w6.h(m17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        boolean z17 = false;
        try {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
            com.tencent.mars.xlog.Log.i("AdLandingPagePagFileHelper", "attachTaskInfo, mediaId=" + b17 + ", fileUrl=" + str);
            java.lang.String host = new java.net.URL(str).getHost();
            int f17 = com.tencent.mm.network.n.f(host, false, new java.util.ArrayList());
            int f18 = com.tencent.mm.network.n.f(host, true, new java.util.ArrayList());
            jVar.field_mediaId = b17;
            jVar.D1 = str;
            jVar.E1 = host;
            jVar.G1 = m17;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + com.tencent.mm.sdk.platformtools.v0.f193027a.c();
            jVar.N1 = "";
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingPagePagFileHelper", "attachTaskInfo, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        }
        if (z17) {
            jVar.f241787f = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.k0();
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
                com.tencent.mars.xlog.Log.i("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask suc");
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask failed");
            }
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPagePagFileHelper", "downloadPagFile, attachTaskInfo failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, url empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                return "";
            }
            java.lang.String m17 = za4.t0.m("adId", str);
            if (com.tencent.mm.vfs.w6.j(m17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                boolean z17 = false;
                if (com.tencent.mm.vfs.w6.j(m17)) {
                    if (android.text.TextUtils.isEmpty(str2)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else if (str2.equals(com.tencent.mm.vfs.w6.p(m17))) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    }
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("AdLandingPagePagFileHelper", "findLocalPagFile, succ, url=" + str + ", path=" + m17 + ", md5=" + str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    return m17;
                }
                com.tencent.mm.vfs.w6.h(m17);
                com.tencent.mars.xlog.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, check md5 failed, url=" + str + ", path=" + m17);
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingPagePagFileHelper", "findLocalPagFile, not exists, url=".concat(str));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagePagFileHelper", "findLocalPagFile, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        }
    }

    public static org.libpag.PAGFile c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.tencent.mars.xlog.Log.i(str, "getValidPAGFile, pagUrl is " + str2 + ", pagMd5 is " + str3);
        if (com.tencent.mm.sdk.platformtools.t8.N0(str2, str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return null;
        }
        java.lang.String b17 = b(str2, str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            org.libpag.PAGFile Load = org.libpag.PAGFile.Load(e(b17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return Load;
        }
        com.tencent.mars.xlog.Log.e(str, "getValidPAGFile, pagFilePath is isNullOrEmpty, so we download this pag");
        a(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return null;
    }

    public static com.tencent.mm.rfx.RfxPagFile d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        com.tencent.mars.xlog.Log.i(str, "getValidPAGFile, pagUrl is " + str2 + ", pagMd5 is " + str3);
        if (com.tencent.mm.sdk.platformtools.t8.N0(str2, str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return null;
        }
        java.lang.String b17 = b(str2, str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(e(b17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return Load;
        }
        com.tencent.mars.xlog.Log.e(str, "getValidPAGFile, pagFilePath is isNullOrEmpty, so we download this pag");
        a(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return null;
    }

    public static byte[] e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return N;
    }
}
