package x44;

/* loaded from: classes4.dex */
public final class p0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        m54.l b17 = env.b();
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(b17 != null ? b17.c() : null);
        m54.l b18 = env.b();
        java.lang.String m17 = b18 != null ? b18.m() : null;
        java.lang.String str = m17 == null ? "" : m17;
        m54.l b19 = env.b();
        java.lang.String a17 = b19 != null ? a54.h.a(b19) : "";
        m54.l b27 = env.b();
        java.lang.String i17 = b27 != null ? b27.i() : null;
        java.lang.String str2 = i17 == null ? "" : i17;
        int optInt = data.optInt("compid");
        int optInt2 = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID);
        android.app.Activity a18 = env.a();
        if (a18 == null) {
            b(g("activity is null!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
            return;
        }
        if (f()) {
            p(E1, optInt, str, a17, optInt2, str2, new x44.m0(this, a18));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("aid", E1);
            bundle.putString("traceId", str);
            bundle.putString("uxInfo", a17);
            bundle.putString("pageId", str2);
            bundle.putInt("compId", optInt);
            bundle.putInt("sId", optInt2);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "error", -1);
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "phone");
        if (k17 == null) {
            k17 = "";
        }
        android.app.Activity a17 = d().a();
        if (f17 == 0) {
            if (k17.length() > 0) {
                b(l());
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().confirmDialPhoneNum(a17, k17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
            }
        }
        b(w44.d.k(this, 600008, "fail:obtain smart phone number failed!", null, 4, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        long h17 = com.tencent.mm.sdk.platformtools.c2.h(bundle, "aid", 0L);
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "traceId");
        java.lang.String str = k17 == null ? "" : k17;
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "uxInfo");
        java.lang.String str2 = k18 == null ? "" : k18;
        java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "pageId");
        p(h17, com.tencent.mm.sdk.platformtools.c2.f(bundle, "compId", 0), str, str2, com.tencent.mm.sdk.platformtools.c2.f(bundle, "sId", 0), k19 == null ? "" : k19, new x44.o0(bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        return null;
    }

    public final void p(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d17.a(2605, new x44.n0(pVar));
        d17.g(new ib4.e(j17, i17, str, str2, i18, str3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
    }
}
