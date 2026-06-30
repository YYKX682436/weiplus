package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseCardIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str3 = b(str) + "_" + str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseCardIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str3;
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBasePageIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                str = gm0.j1.b().j() + "_" + str;
            } else {
                str = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin() + "_" + str;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "getBasePageIdKey exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBasePageIdKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggBulletCommentCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str4 = a(str, str2) + "_" + str3 + "_comment";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggBulletCommentCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str4;
    }

    public static java.lang.String d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId, pageId empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return "";
        }
        if (g()) {
            com.tencent.mars.xlog.Log.w("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId debug switch open");
            j(str, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return "";
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("finder_cny_ad");
        java.lang.String e17 = e(str);
        java.lang.String string = M.getString(e17, "");
        com.tencent.mars.xlog.Log.i("AdLandingPageHalfEggCardUtils", "getHalfEggCardExposedId, cacheKey=" + e17 + ", cardId=" + string);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return string;
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggCardIdCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str2 = b(str) + "_lastCardId";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggCardIdCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str2;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfEggHbCoverUrlCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        java.lang.String str3 = a(str, str2) + "_hbUrl";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfEggHbCoverUrlCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigFinderHalfEggCard()) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            java.lang.String r0 = "isDebugHalfEggCardSwitchOpen"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = ca4.m0.c0()
            if (r2 == 0) goto L1d
            bm5.o1 r2 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.ad.RepairerConfigFinderHalfEggCard r3 = new com.tencent.mm.repairer.config.ad.RepairerConfigFinderHalfEggCard
            r3.<init>()
            int r2 = r2.h(r3)
            r3 = 1
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.g():boolean");
    }

    public static void h(ab4.n0 n0Var, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult, landingPageData==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            java.lang.String e17 = n0Var.e();
            if (e17 == null) {
                e17 = "";
            }
            jSONObject2.put("canvasId", e17);
            java.lang.String i18 = n0Var.i();
            if (i18 == null) {
                i18 = "";
            }
            jSONObject2.put("pageId", i18);
            if (str == null) {
                str = "";
            }
            jSONObject2.put("cardId", str);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("finder_cny_get_cardId_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "reportGetHalfEggCardIdResult exp:" + e18.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState pageId empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, cardId empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, comment empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("finder_cny_ad");
        java.lang.String c17 = c(str, str2, str3);
        if (z17) {
            M.getClass();
            M.putBoolean(c17, true).commit();
        } else {
            M.getClass();
            M.remove(c17);
        }
        com.tencent.mars.xlog.Log.i("AdLandingPageHalfEggCardUtils", "setHalfEggCardBulletCommentState, cacheKey=" + c17 + ", clicked=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardBulletCommentState", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageHalfEggCardUtils", "setHalfEggCardExposedId, pageId empty, pageId=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("finder_cny_ad");
        java.lang.String e17 = e(str);
        M.getClass();
        M.putString(e17, str2 == null ? "" : str2).commit();
        com.tencent.mars.xlog.Log.i("AdLandingPageHalfEggCardUtils", "setHalfEggCardExposedId, cacheKey=" + e17 + ", cardId=" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageHalfEggCardUtils");
    }
}
