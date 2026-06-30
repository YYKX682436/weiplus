package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.s0 f186507d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("operationType");
        if (!kotlin.jvm.internal.o.b(obj instanceof java.lang.String ? (java.lang.String) obj : null, "listenLater")) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = msg.f340790a.get("item");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        int O = com.tencent.mm.sdk.platformtools.t8.O(msg.f340790a.get("sourceType"), 0);
        nw4.g gVar = env.f340863d;
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    com.tencent.mm.plugin.webview.ui.tools.media.h1 b17 = com.tencent.mm.plugin.webview.ui.tools.media.k1.f185794c.b(new org.json.JSONObject(str), "", "", 1.0f, O, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r0(hashMap, env, msg));
                    if (b17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDoOperateTingAudio", "add listenLater fail, parse item fail");
                    } else {
                        bw5.v70 d17 = b17.f185780a.d();
                        android.content.Context context = env.f340860a;
                        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                        if (d17 != null && activity != null) {
                            pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q0(b17, env, activity, d17));
                            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDoOperateTingAudio", "activity or listenItem is empty");
                        gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDoOperateTingAudio", "add listenLater fail, parse item exception:" + e17.getLocalizedMessage());
                }
                return true;
            }
        }
        gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.audio.u1.NAME;
    }

    @Override // qw4.a
    public boolean d() {
        return true;
    }
}
