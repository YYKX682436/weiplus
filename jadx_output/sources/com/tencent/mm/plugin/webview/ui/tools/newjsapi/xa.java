package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class xa extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.xa f186662d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.xa();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRecordOperateUserData", "msg:" + msg);
        try {
            java.lang.Object obj = msg.f340790a.get("datalist");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                cf.f.b(new cl0.e(str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.wa.f186609d);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiRecordOperateUserData", e17, null, new java.lang.Object[0]);
        }
        env.f340863d.e(msg.f341013c, "recordOperateUserData:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 445;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "recordOperateUserData";
    }
}
