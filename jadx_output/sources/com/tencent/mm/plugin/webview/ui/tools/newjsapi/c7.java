package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class c7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.c7 f186011d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "karlfeng openFinderLiveGetTicket");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object obj = msg.f340790a.get("noticeId");
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "noticeId: " + obj);
            jSONObject.put("noticeId", obj);
        }
        java.lang.Object obj2 = msg.f340790a.get("appId");
        if (obj2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "appId: " + obj2);
            jSONObject.put("appId", obj2);
        }
        java.lang.Object obj3 = msg.f340790a.get("wxData");
        if (obj3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "wxData: " + obj3);
            jSONObject.put("wxData", obj3);
        }
        java.lang.Object obj4 = msg.f340790a.get("preferEnterLive");
        if (obj4 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "preferEnterLive: " + obj4);
            jSONObject.put("preferEnterLive", obj4);
        }
        java.lang.Object obj5 = msg.f340790a.get("noticeBusinessDic");
        if (obj5 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "noticeBusinessDic: " + obj5);
            jSONObject.put("noticeBusinessDic", obj5);
        }
        java.lang.Object obj6 = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (obj6 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "scene: " + obj6);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, obj6);
        }
        java.lang.String optString = jSONObject.optString("noticeId");
        if (optString == null || optString.length() == 0) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":noticeId is empty", kz5.b1.e(new jz5.l("err_msg", "noticeId is empty")));
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.z6.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 453;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reserveChannelsLive";
    }
}
