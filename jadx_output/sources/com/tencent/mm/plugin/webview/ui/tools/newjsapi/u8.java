package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class u8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.u8 f186559d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.u8();

    public static final void e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.u8 u8Var, org.json.JSONObject jSONObject, com.tencent.mm.ipcinvoker.r rVar) {
        u8Var.getClass();
        int optInt = jSONObject.optInt("type", 0);
        bw5.ar0 i17 = bw5.ar0.i(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1));
        bw5.ar0 i18 = bw5.ar0.i(i17 != null ? i17.f25422d : 2000);
        kotlin.jvm.internal.o.f(i18, "forNumber(...)");
        java.lang.Integer valueOf = jSONObject.has("highlighted_line_type") ? java.lang.Integer.valueOf(jSONObject.optInt("highlighted_line_type", 0)) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenTingView", "openProfile type " + optInt + ", scene " + i18.f25422d);
        il4.e eVar = new il4.e(null, 0, i18.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        eVar.f292126w = true;
        rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
        qk.f9.e(z8Var.aj(), z8Var.bj(), i18, eVar, optInt, valueOf, null, 32, null);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        }
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenTingView", "OpenTingView");
        java.lang.String jSONObject = msg.f341014d.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject), com.tencent.mm.plugin.webview.ui.tools.newjsapi.r8.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 489;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openTingView";
    }
}
