package l44;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f316078a = new java.util.HashMap();

    public static void a(long j17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doNotifyMsgClickReport", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", "");
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("appointmentId", j17);
            jSONObject2.put("type", i17);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("general_msg_ad_general_service_msg_click", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "doCancelReport, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNotifyMsgClickReport", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "doSnsAdNotifyMsgClick, param=" + str);
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("type");
            long optLong = jSONObject.optLong("appointmentId");
            java.lang.String optString = jSONObject.optString("uxInfo");
            if (optInt == 0) {
                ca4.m0.m0(jSONObject.optLong("canvasId"), ca4.m0.B(optString), "", 32);
                a(optLong, optString, 0);
            } else if (optInt == 1) {
                g(context, jSONObject.optString("h5Url"), optString);
                a(optLong, optString, 1);
            } else if (optInt == 2) {
                java.lang.String optString2 = jSONObject.optString("weappUserName");
                java.lang.String optString3 = jSONObject.optString("weappPath");
                java.lang.String optString4 = jSONObject.optString("weappVersion");
                jSONObject.optString("miniProgramType");
                f(optString2, optString3, optString4, optString, str2);
                a(optLong, optString, 2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "doSnsAdNotifyMsgClick, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    public static boolean c(java.lang.String str, java.lang.String str2, long j17, l44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        java.util.HashMap hashMap = f316078a;
        long longValue = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() : 0L;
        if (longValue != 0 && java.lang.System.currentTimeMillis() - longValue <= 30000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
            return false;
        }
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "getAppointmentStatus, id=" + j17 + ", snsId=" + str + ", lastReqTime=" + longValue + ", uxInfo=" + str2);
        k64.o oVar = new k64.o(str2, j17, 2);
        gm0.j1.d().a(5159, new l44.c(str, j17, 2, aVar));
        gm0.j1.d().g(oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        return true;
    }

    public static java.lang.String d(java.lang.String str, s34.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        java.lang.String str2 = "0";
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
            return "0";
        }
        long e17 = c01.id.e();
        long j17 = aVar.f402559n;
        if (j17 == 0 || j17 >= e17) {
            java.lang.String e18 = e(aVar.f402546a);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.x2.n() ? p34.o.d(str, e18) : com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdValue(str, e18);
            if (!android.text.TextUtils.isEmpty(d17)) {
                str2 = d17;
            }
        } else {
            com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "getLocalCacheState, expireTime=" + aVar.f402559n + ", serverTime=" + e17);
            str2 = "1000";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        return str2;
    }

    public static java.lang.String e(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusKey", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        java.lang.String str = "appointment_status_" + j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusKey", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        return str;
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            java.lang.String D = ca4.m0.D(str4);
            java.lang.String P = ca4.m0.P(str4);
            java.lang.String str6 = ca4.z0.t0(0L) + ":" + str4 + ":" + com.tencent.mm.plugin.sns.model.l4.sj() + ":" + java.lang.System.currentTimeMillis() + ":" + str5;
            java.lang.String d17 = ca4.m0.d(str2, true);
            ca4.z0.r0(str, d17, str3, D, P, str6, str4, 1215);
            com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "jumpWeApp userName=" + str + ", path=" + d17 + ", ver=" + str3 + ", scene=1215, uxinfo=" + str4 + ", sceneNote=" + str6);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "jumpWeApp, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            android.content.Intent intent = new android.content.Intent();
            if (android.text.TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = ca4.z0.b(str, str2);
                ca4.z0.c(intent, str2);
            }
            intent.putExtra("KRightBtn", false);
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(0, 9, 0L, 3, 0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KSnsAdTag", snsAdClick);
            if (!android.text.TextUtils.isEmpty(str2)) {
                bundle.putString("KAnsUxInfo", str2);
            }
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", str3);
            intent.putExtra("useJs", true);
            intent.putExtra("stastic_scene", 15);
            ca4.z0.a(intent, 87);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "jumpWebUI, url=" + str3);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "jumpWebUI, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }
}
