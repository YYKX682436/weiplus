package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class y2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.y2 f186673d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("action");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleAdAction action: %s", str);
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail action is empty", null);
            return true;
        }
        if (!kotlin.jvm.internal.o.b(str, "report")) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (str2 == null || str2.length() == 0) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail data is empty", null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString("logid"), 0);
            java.lang.String optString = jSONObject.optString("logstr");
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(D1, optString);
            }
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 367;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "handleAdAction";
    }
}
