package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class j3 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.j3 f186269d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.j3();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        org.json.JSONObject jSONObject = msg.f341014d;
        if (jSONObject != null) {
            jSONObject.put("url", msg.f340790a.get("url"));
            ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).Bi(2, env.f340860a, jSONObject, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.i3(env, msg), null);
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandleEcsAction", "handleMsg rawParams null");
        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail rawParams is empty", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return uc1.x1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.m.NAME;
    }

    public final java.util.Map e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return kz5.q0.f314001d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            kotlin.jvm.internal.o.d(next);
            if (obj instanceof org.json.JSONObject) {
                obj = e((org.json.JSONObject) obj);
            }
            kotlin.jvm.internal.o.d(obj);
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }
}
