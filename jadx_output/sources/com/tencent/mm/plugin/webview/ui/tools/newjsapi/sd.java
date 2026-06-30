package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class sd extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.sd f186531d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.sd();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        int intValue;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("dataUrl");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get("dismissSelf");
        boolean parseBoolean = java.lang.Boolean.parseBoolean(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
        zg0.q2 a17 = env.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
        byte[] a07 = r0Var != null ? r0Var.a0() : null;
        java.lang.Object obj3 = ((java.util.HashMap) msg.f340790a).get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (obj3 instanceof java.lang.String) {
            java.lang.Integer h17 = r26.h0.h((java.lang.String) obj3);
            if (h17 != null) {
                intValue = h17.intValue();
            }
            intValue = 2;
        } else {
            if (obj3 instanceof java.lang.Integer) {
                intValue = ((java.lang.Number) obj3).intValue();
            }
            intValue = 2;
        }
        int i17 = intValue;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("bizInfo");
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        boolean b17 = kotlin.jvm.internal.o.b(((java.util.HashMap) msg.f340790a).get("halfScreen"), "true");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowOpenIMContactProfile", "showOpenIMContactProfile scene: " + i17 + ", bizInfo: " + str3 + ", isHalfScreen: " + b17);
        java.util.Objects.toString(msg.f340790a);
        if (!(str == null || r26.n0.N(str))) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData(str, a07, i17, str3, b17), com.tencent.mm.plugin.webview.ui.tools.newjsapi.od.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.rd(env, msg, parseBoolean));
            return true;
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail_invalid_arguments", null);
        android.content.Context context = env.f340860a;
        if (parseBoolean && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.u.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showOpenIMContactProfile";
    }
}
