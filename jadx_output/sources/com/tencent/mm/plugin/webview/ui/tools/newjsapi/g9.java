package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class g9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.g9 f186117d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.g9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "handleMsg!");
        java.lang.String str = (java.lang.String) msg.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("url");
        java.lang.String str3 = str2 != null ? str2 : "";
        boolean z17 = str3.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail. url is nil or empty!", null);
            return true;
        }
        if (!((d73.i) i95.n0.c(d73.i.class)).Qg()) {
            gVar.e(msg.f341013c, msg.f341019i + "fail. canSendOpenCommand return fail!", null);
            return true;
        }
        if (e()) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail. call too frequently!", null);
            return true;
        }
        if (str.length() == 0) {
            str = str3;
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = new com.tencent.mm.plugin.handoff.model.HandOffURL(str, str3, "", 0, null, null, null, null, 248, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "openUrlOnPc Success(send success) url:" + str3 + ", title:" + str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(handOffURL);
        gVar.e(msg.f341013c, msg.f341019i + ":success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return md1.e1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWebOnPC";
    }

    public final boolean e() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_liteapp_open_web_on_pc_total_per_day, 10);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "limit count:" + Ni);
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault()).format(new java.util.Date());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "currentDateString:" + format);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEBVIEW_JSAPI_OPENWEBONPC_LAST_TIME_STRING;
        java.lang.String v17 = c17.v(u3Var, "1970-01-01");
        kotlin.jvm.internal.o.e(v17, "null cannot be cast to non-null type kotlin.String");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "lastCalledTime:".concat(v17));
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WEBVIEW_JSAPI_OPENWEBONPC_CALLED_COUNT_INT;
        java.lang.Object m17 = c18.m(u3Var2, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "calledCount:" + intValue);
        if (!kotlin.jvm.internal.o.b(format, v17)) {
            intValue = 0;
        }
        if (intValue < Ni) {
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(intValue + 1));
            gm0.j1.u().c().x(u3Var, format);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebOnPC", "calledcount:" + intValue + " >= limit:" + Ni);
        return true;
    }
}
