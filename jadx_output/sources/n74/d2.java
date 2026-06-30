package n74;

/* loaded from: classes4.dex */
public abstract class d2 {
    public static java.lang.String a(java.lang.String str, int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("UxInfoHelper", "checkDecodeUxInfoInAdInfoXml, exp=" + e17 + ", src=" + i17 + ", xml=" + str);
        }
        if (!c()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "ADInfo", null);
        if (d17 != null && d17.size() != 0) {
            java.lang.String str2 = (java.lang.String) d17.get(".ADInfo.uxInfo");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return str;
            }
            java.lang.String e18 = e(str2);
            if (str2.equals(e18)) {
                z17 = false;
            } else {
                str = str.replaceAll("(?s)<uxInfo[^>]*>.*?</uxInfo>", "").replace("<ADInfo>", "<ADInfo><uxInfo>" + e18 + "</uxInfo>");
                com.tencent.mars.xlog.Log.i("UxInfoHelper", "srcUxInfo=".concat(str2));
                com.tencent.mars.xlog.Log.i("UxInfoHelper", "decodedUxInfo=" + e18);
                com.tencent.mars.xlog.Log.i("UxInfoHelper", "adInfoXml=" + str);
                z17 = true;
            }
            d(z17, i17);
            if (e18 != null && e18.contains("%")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 137);
            }
            if (z17) {
                ca4.e0.b("ad_uxinfo_encode", e18, i17, 0, str2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return str;
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(str) || i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return "";
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split != null && split.length > i17) {
                java.lang.String str2 = split[i17];
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str3 = str2 != null ? str2 : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return str3;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("UxInfoHelper", e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParamAtIdx", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return "";
    }

    public static boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_url_decode_uxinfo, 1) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("UxInfoHelper", "isExptFullCardAdEnableH265, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpDecodeUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return true;
        }
    }

    public static void d(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportUxInfoDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (i17 == 13) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 130 : 129);
        } else if (i17 == 24) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 126 : 125);
        } else if (i17 == 30) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 128 : 127);
        } else if (i17 == 27) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 132 : 131);
        } else if (i17 != 28) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 136 : 135);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, z17 ? 134 : 133);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportUxInfoDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
            return str;
        }
        try {
            if (!str.contains("|") && !str.contains("+") && str.contains("%")) {
                java.lang.String decode = java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
                return decode;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("UxInfoHelper", "safeUrlDecode, exp=" + e17 + ", src=" + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeUrlDecode", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        return str;
    }
}
