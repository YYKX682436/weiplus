package l44;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static void a(ab4.z zVar, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (zVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_sight_video_h265, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdH265Helper", "isExptLandingPageSightVideoEnableH265, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            z18 = false;
        }
        zVar.F = j(zVar.F, z18 && !zVar.S);
        com.tencent.mars.xlog.Log.i("AdH265Helper", "checkAdLandingPageSightForH265, expt=" + z18 + ", forbidCdn=" + zVar.S + ", isPreload=" + z17 + ", ret url=" + zVar.F);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (snsInfo != null && snsInfo.isAd()) {
            c(i64.q.a(snsInfo), jj4Var, ca4.z0.t0(snsInfo.field_snsId));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void c(i64.q qVar, r45.jj4 jj4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (qVar == null || (aDXml = qVar.f289288b) == null || jj4Var == null || !jj4Var.N) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAdSupportH265, adDataModel==null?");
            sb6.append(qVar == null);
            sb6.append(", media==null?");
            sb6.append(jj4Var == null);
            sb6.append(", isAd=");
            sb6.append(jj4Var != null ? jj4Var.N : false);
            com.tencent.mars.xlog.Log.w("AdH265Helper", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        boolean b17 = a84.p.b(150519, qVar.f289287a);
        if (aDXml.isFullCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "fullcardAd enable h265";
        } else if (aDXml.isDynamicAD()) {
            str2 = "dynamicAd enable h265";
        } else if (aDXml.isCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "cardAd enable h265";
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "normalAd enable h265";
        }
        i(jj4Var, true, b17);
        com.tencent.mars.xlog.Log.i("AdH265Helper", "checkAdSupportH265, " + str2 + ", snsId=" + str + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String d(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            }
            if (!str.contains("svpuseh265flag")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            }
            if (!z17 && !ca4.m0.p()) {
                java.net.URI uri = new java.net.URI(str);
                java.lang.String query = uri.getQuery();
                if (!android.text.TextUtils.isEmpty(query)) {
                    if (query.contains("svpuseh265flag=0")) {
                        query = query.replace("&svpuseh265flag=0", "").replace("svpuseh265flag=0", "");
                    }
                    if (query.contains("svpuseh265flag=1")) {
                        query = query.replace("&svpuseh265flag=1", "").replace("svpuseh265flag=1", "");
                    }
                    if (query.startsWith("&")) {
                        query = query.replaceFirst("&", "");
                    }
                }
                if (android.text.TextUtils.isEmpty(query)) {
                    query = null;
                }
                java.lang.String uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return uri2;
            }
            a84.x0 x0Var = a84.x0.f2377a;
            java.lang.String a17 = x0Var.a(x0Var.a(str, "svpuseh265flag=1"), "svpuseh265flag=0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdH265Helper", e17, "", new java.lang.Object[0]);
            ca4.q.a("AdH265Helper", "deleteUrlH265Flag error", 7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str;
        }
    }

    public static boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return false;
    }

    public static void f(int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i18 = i17 == 1 ? (z17 && z18) ? 13 : !z17 ? 14 : 15 : 0;
        if (i18 > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, i18);
        }
        com.tencent.mars.xlog.Log.i("AdH265Helper", "report, videoPlayerType = " + i17 + ", urlHasFlag = " + z17 + ", cdnHasFlag = " + z18 + ", key = " + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static void g(boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i17 = z17 ? (z18 && z19) ? 1 : !z18 ? 2 : 3 : (z18 && z19) ? 4 : !z18 ? 5 : 6;
        if (i17 > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, i17);
        }
        com.tencent.mars.xlog.Log.i("AdH265Helper", "report, isOnline=" + z17 + ", urlHasFlag=" + z18 + ", cdnHasFlag=" + z19 + ", key=" + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String h(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaIdForH265, exp=" + th6.toString());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            if (z17) {
                if (!str.contains("_hvec")) {
                    str2 = str.concat("_hvec");
                }
            } else if (str.contains("_hvec")) {
                str2 = str.replace("_hvec", "");
            }
            com.tencent.mars.xlog.Log.i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str2;
        }
        com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaIdForH265, mediaId==null");
        str2 = str;
        com.tencent.mars.xlog.Log.i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return str2;
    }

    public static void i(r45.jj4 jj4Var, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaInfoForH265, media==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        if (!jj4Var.N) {
            com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaInfoForH265, !media.isAd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        jj4Var.f377858g = k(jj4Var.f377858g, z17, z18);
        jj4Var.f377855d = h(jj4Var.f377855d, z17);
        com.tencent.mars.xlog.Log.i("AdH265Helper", "setMediaInfoForH265, media.hash=" + jj4Var.hashCode() + ", enableH265=" + z17 + ", meida.enc=" + jj4Var.D + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    public static java.lang.String j(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        java.lang.String k17 = k(str, z17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return k17;
    }

    public static java.lang.String k(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaUrlForH265, media.Url==null");
            } else {
                str = z17 ? !str.contains("svpuseh265flag") ? com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.a(str, z18, "svpuseh265flag=1") : str.replace("svpuseh265flag=0", "svpuseh265flag=1") : d(str, z18);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdH265Helper", "setMediaUrlForH265, exp=" + th6.toString());
            ca4.q.a("AdH265Helper", "setMediaUrlForH265 error", 7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return str;
    }
}
