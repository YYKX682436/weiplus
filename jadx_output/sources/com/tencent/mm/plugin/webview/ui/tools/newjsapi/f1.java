package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186076d = kVar;
        this.f186077e = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.stub.v0 v0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        ((ee0.e) ((fe0.l3) i95.n0.c(fe0.l3.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        boolean b17 = w34.a.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        nw4.k kVar = this.f186076d;
        if (b17) {
            java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
            if (com.tencent.mm.sdk.platformtools.t8.K0(k96) && (v0Var = kVar.f340862c) != null) {
                try {
                    k96 = v0Var.i(112, new android.os.Bundle()).getString("oaid", "");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetAdIdInfo", "getOaid ex " + e17.getMessage());
                }
            }
            kotlin.jvm.internal.o.d(k96);
            hashMap.put("oaid", k96);
        }
        nw4.y2 y2Var = this.f186077e;
        if (((java.util.HashMap) y2Var.f340790a).containsKey("waidPkg")) {
            java.lang.Object obj = ((java.util.HashMap) y2Var.f340790a).get("waidPkg");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetAdIdInfo", "waidPkg=".concat(str));
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            java.lang.String d17 = me4.c.d(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            kotlin.jvm.internal.o.f(d17, "getAppWaid(...)");
            hashMap.put("waid", d17);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetAdIdInfo", "no waidPkg param");
        }
        hashMap.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1896, 21);
        return jz5.f0.f302826a;
    }
}
