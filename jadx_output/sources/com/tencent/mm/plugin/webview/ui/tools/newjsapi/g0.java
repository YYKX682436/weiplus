package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class g0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.g0 f186099d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.g0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.String str = (java.lang.String) msg.f340790a.get("itemShowTypes");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null) {
            cf.f.b(new org.json.JSONArray(str), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f0(arrayList));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(D1), arrayList);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(D1, arrayList);
        env.f340863d.e(msg.f341013c, "createWebViewForFastLoad:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 341;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "createWebViewForFastLoad";
    }
}
