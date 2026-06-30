package x44;

/* loaded from: classes4.dex */
public final class t1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String optString2 = data.optString("finderLiveNoticeId");
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (f()) {
                    d44.h.c(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), optString, optString2, new x44.r1(this));
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("userName", optString);
                    bundle.putString("noticeId", optString2);
                    i(bundle);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("SnsAdJs.FinderLivingNotice", "finder user name or notice id are empty!!!");
        b(g("finder user name or notice id are empty!!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FinderLivingNotice", "the result is null, are you sure??");
            b(g(": the result is null, are you sure??"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
            return;
        }
        boolean b17 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "noticed", false);
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "error", 0);
        if (f17 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticed", b17);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, 600001, "fail: query finder living notice failed: " + f17, null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
        java.lang.String string = bundle != null ? bundle.getString("userName") : null;
        java.lang.String string2 = bundle != null ? bundle.getString("noticeId") : null;
        if (!(string == null || r26.n0.N(string))) {
            if (!(string2 == null || r26.n0.N(string2))) {
                d44.h.c(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), string, string2, new x44.s1(bVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
                return null;
            }
        }
        if (bVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("error", -1);
            ((r64.b) bVar).e(bundle2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
        return null;
    }
}
