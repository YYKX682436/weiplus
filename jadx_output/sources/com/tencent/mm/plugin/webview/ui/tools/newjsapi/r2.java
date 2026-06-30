package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class r2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.r2 f186476d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWxPayTestInfo", "handleMsg() MMApplicationContext.getContext() get a null context!");
            return false;
        }
        int i17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("pay_uat_test_environment_id", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWxPayTestInfo", "getWxPayTestInfo envId=" + i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("envId", java.lang.String.valueOf(i17));
        env.f340863d.e(msg.f341013c, "getWxPayTestInfo:ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 28;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getWxPayTestInfo";
    }
}
