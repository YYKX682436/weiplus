package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class qb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.qb f186460d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.qb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        nw4.g gVar = env.f340863d;
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSaveWaid", "h5 JsApiSaveWaid");
            kotlin.jvm.internal.o.f(msg.f341014d.toString(), "toString(...)");
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            hashMap.put("result", java.lang.String.valueOf(0));
            gVar.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveWaid", "h5 JsApiSaveWaid exp=" + e17);
            hashMap.put("result", "0");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", hashMap);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 363;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.vc.NAME;
    }
}
