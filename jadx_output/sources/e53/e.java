package e53;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e53.e f249632a = new e53.e();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f249633b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f249634c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f249635d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f249636e;

    /* renamed from: f, reason: collision with root package name */
    public static long f249637f;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f249634c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$liteAppDestroyListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                java.lang.Long l17 = riVar.f7820d;
                long j17 = e53.e.f249637f;
                if (l17 == null || l17.longValue() != j17) {
                    return false;
                }
                com.tencent.mm.sdk.event.IListener iListener = e53.e.f249633b;
                if (iListener != null) {
                    iListener.dead();
                }
                ((java.util.LinkedList) e53.e.f249636e).clear();
                dead();
                return false;
            }
        };
        f249635d = new java.util.HashMap();
        f249636e = new java.util.LinkedList();
    }

    public static final void b(int i17, java.lang.String str, long j17) {
        java.lang.Long j18;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePageTimeReport", "gamelog.report, 27743 ,  error url isNullOrEmpty");
            return;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        long longValue = (queryParameter == null || (j18 = r26.h0.j(queryParameter)) == null) ? 0L : j18.longValue();
        java.lang.String str2 = (java.lang.String) f249635d.get(str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("a8keyScene", j17);
            if (!(str2 == null || str2.length() == 0)) {
                jSONObject.put("ext", str2);
            }
        } catch (org.json.JSONException unused) {
        }
        f249632a.a(i17, 0L, longValue, str, nj0.a.d(jSONObject.toString()));
    }

    public final void a(int i17, long j17, long j18, java.lang.String str, java.lang.String str2) {
        java.lang.String string = com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id", "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.GameWebPageTimeReportStruct gameWebPageTimeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GameWebPageTimeReportStruct();
        gameWebPageTimeReportStruct.f58355d = i17;
        gameWebPageTimeReportStruct.f58356e = j17;
        gameWebPageTimeReportStruct.f58357f = gameWebPageTimeReportStruct.b("session_id", string, true);
        gameWebPageTimeReportStruct.f58358g = j18;
        gameWebPageTimeReportStruct.f58360i = currentTimeMillis;
        gameWebPageTimeReportStruct.f58361j = gameWebPageTimeReportStruct.b("URL", str, true);
        gameWebPageTimeReportStruct.f58362k = gameWebPageTimeReportStruct.b("extern_info", str2, true);
        gameWebPageTimeReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, null, report, scene:%d, stayTimeSec:%d, sessionId:%s, ssid:%s, client_timestamp:%d, url:%s, extInfo:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), string, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), str, str2);
    }
}
