package r34;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final r34.g f369003a = new r34.g(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f369004b = kz5.c0.i(10, 12, 16, 19, 20, 21, 24, 32, 33, 35, 45);

    public static final void a(org.json.JSONObject jSONObject, int i17, long j17, boolean z17, boolean z18) {
        java.lang.String str;
        long elapsedRealtime;
        boolean O6;
        java.lang.String str2;
        boolean z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        try {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            str = "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager";
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager";
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
            O6 = r44.f.O6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
        } catch (java.lang.Throwable th7) {
            th = th7;
            ca4.q.c("SnsAdSession_fillPullSessionInfo", th);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", str);
        }
        if (O6) {
            java.lang.String t07 = ca4.z0.t0(j17);
            if (jSONObject == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            } else {
                com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "----fillPullSessionInfo, pullType=" + i17 + ", fp=" + z17 + ", maxId=" + t07 + ", isPreReq=" + z18);
                r34.g gVar = f369003a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                if (z18) {
                    gVar.g(5);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    str2 = "isFp=false, [topFeedSnsId=";
                    z19 = true;
                } else {
                    if (i17 != 0) {
                        str2 = "isFp=false, [topFeedSnsId=";
                        if (i17 == 1) {
                            gVar.g(2);
                        } else if (i17 == 2) {
                            gVar.g(3);
                        }
                        z19 = true;
                    } else {
                        str2 = "isFp=false, [topFeedSnsId=";
                        z19 = true;
                        gVar.g(1);
                        if (z17) {
                            gVar.g(4);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                }
                if (!gVar.i(i17)) {
                    com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "invalid pullType type=" + i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                } else if (z18) {
                    com.tencent.mars.xlog.Log.w("SnsAdSession.SnsAdPullSessionManager", "preTimelineReq, return");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineContext", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSContextRef$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                    java.lang.ref.WeakReference weakReference = r44.f.f369558i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSContextRef$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                    android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineContext", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
                    if (context == null) {
                        com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "fillPullSessionInfo, context==null");
                        gVar.g(10);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    } else {
                        if (ca4.n0.c(context)) {
                            gVar.g(33);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableSessionWhenFinish", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                            boolean z28 = ca4.m0.u0(e42.c0.clicfg_ad_enable_session_record_when_finish, 0) > 0 ? z19 : false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableSessionWhenFinish", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                            if (z28) {
                                com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "fillPullSessionInfo, activity finishing");
                            } else {
                                com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "fillPullSessionInfo, activity finishing, return");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                            }
                        }
                        java.lang.String O = ca4.m0.O();
                        jSONObject.put("timelineSessionId", O);
                        com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "[sessionId]=" + O);
                        java.util.List f17 = gVar.f(context);
                        if (((java.util.ArrayList) f17).isEmpty()) {
                            gVar.g(32);
                            if (!z17) {
                                gVar.g(35);
                            }
                        }
                        gVar.k(f17);
                        if (z17) {
                            jSONObject.put("topFeedSnsId", 0);
                            jSONObject.put("topFeedPos", -1);
                            com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "isFp=true, [topFeedSnsId=0, topFeedPos=-1], maxId=" + t07);
                        } else {
                            jz5.l e17 = gVar.e(f17, j17);
                            java.lang.String str3 = (java.lang.String) e17.f302833d;
                            int intValue = ((java.lang.Number) e17.f302834e).intValue();
                            jSONObject.put("topFeedSnsId", str3);
                            jSONObject.put("topFeedPos", intValue);
                            com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", str2 + str3 + ", topFeedPos=" + intValue + "], maxId=" + t07);
                        }
                        org.json.JSONArray d17 = gVar.d(f17, gVar.j());
                        if (d17 != null) {
                            jSONObject.putOpt("sessionRecords", d17);
                        }
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (java.lang.System.currentTimeMillis() % 1000 == 0) {
                            ca4.e0.a("ad_pull_session", "fillSessionTimeCost", (int) elapsedRealtime2, 0, "");
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--fillPullSessionInfo, sessionRecords.count=");
                        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.length()) : null);
                        sb6.append(", timeCost=");
                        sb6.append(elapsedRealtime2);
                        com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", sb6.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("SnsAdSession.SnsAdPullSessionManager", "fillPullSessionInfo, isEnableSession=false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillPullSessionInfo", str);
    }
}
