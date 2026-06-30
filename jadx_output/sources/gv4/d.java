package gv4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final gv4.d f276119a = new gv4.d();

    public final java.lang.String a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.String c17 = com.tencent.mm.plugin.websearch.l2.g(6).c();
        b(params);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(params));
        return stringBuffer.toString();
    }

    public final void b(java.util.Map map) {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(f17, "getCurrentLanguage(...)");
        map.put("lang", f17);
        map.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        map.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.a(6)));
        map.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        map.put("wechatVersion", CLIENT_VERSION);
    }

    public final hv4.l c(android.content.Context context, java.lang.String talker, int i17, hv4.a listener, java.lang.String query, java.lang.String sessionId, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new r45.ck6();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(72));
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId);
        hashMap.put("subSessionId", sessionId);
        hashMap.put("isHomePage", "1");
        if (!android.text.TextUtils.isEmpty(query)) {
            java.lang.String b17 = tg0.r2.a(72) ? query : fp.s0.b(query, "utf8");
            kotlin.jvm.internal.o.d(b17);
            hashMap.put("query", b17);
            hashMap.put("cursorIndex", java.lang.String.valueOf(i18));
        }
        hashMap.put("isOverseaApp", com.tencent.mm.sdk.platformtools.t8.P0(context) ? "1" : "0");
        b(hashMap);
        ((r45.ck6) h0Var.f310123d).f371625g = a(hashMap);
        r45.ck6 ck6Var = (r45.ck6) h0Var.f310123d;
        ck6Var.f371630o = talker;
        ck6Var.f371623e = sessionId;
        ck6Var.f371624f = 72;
        ck6Var.f371627i = "";
        ck6Var.f371622d = "";
        ck6Var.f371631p = i17;
        hv4.l lVar = new hv4.l(context, (r45.ck6) h0Var.f310123d, new gv4.c(listener, h0Var, i17, talker, sessionId));
        lVar.show();
        android.view.Window window = lVar.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct wCTopicSearchVCActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct();
        wCTopicSearchVCActionReportStruct.f62186d = 1L;
        wCTopicSearchVCActionReportStruct.f62187e = 0L;
        wCTopicSearchVCActionReportStruct.f62188f = i17;
        wCTopicSearchVCActionReportStruct.f62189g = c01.id.e();
        wCTopicSearchVCActionReportStruct.f62190h = com.tencent.mm.storage.z3.R4(talker) ? 2L : 1L;
        wCTopicSearchVCActionReportStruct.f62191i = wCTopicSearchVCActionReportStruct.b("EnterSceneId", talker, true);
        wCTopicSearchVCActionReportStruct.f62192j = wCTopicSearchVCActionReportStruct.b("SessionId", sessionId, true);
        wCTopicSearchVCActionReportStruct.f62193k = wCTopicSearchVCActionReportStruct.b("QueryKey", query, true);
        wCTopicSearchVCActionReportStruct.k();
        su4.k3.m(wCTopicSearchVCActionReportStruct);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.TagSearchUILogic", "startTagSearchDialog url:" + ((r45.ck6) h0Var.f310123d).f371625g);
        return lVar;
    }
}
