package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class u9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.u9 f186560d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.u9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        ((ly4.f) ((wc0.e) i95.n0.c(wc0.e.class))).getClass();
        ly4.e eVar = new ly4.e();
        eVar.f322290m = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s9(env, msg);
        eVar.f322291n = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t9(env, msg);
        java.util.Map map = msg.f340790a;
        if (map == null) {
            return true;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(linkedHashMap);
        xc0.a aVar = new xc0.a();
        aVar.fromJson(jSONObject);
        eVar.k(env.f340860a, aVar);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 545;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sendPcRemindMsg";
    }
}
