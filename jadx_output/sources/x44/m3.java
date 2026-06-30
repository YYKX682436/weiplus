package x44;

/* loaded from: classes4.dex */
public final class m3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        java.lang.String optString2 = data.optString("finderLiveNoticeId");
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString2 == null || r26.n0.N(optString2))) {
                if (f()) {
                    kotlin.jvm.internal.o.d(optString);
                    kotlin.jvm.internal.o.d(optString2);
                    x44.j3 j3Var = new x44.j3(this);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                    d44.h.f(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), optString, optString2, new x44.l3(j3Var));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(dm.i4.COL_USERNAME, optString);
                    bundle.putString("noticeId", optString2);
                    i(bundle);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("SnsAdJs.FinderNotice", "finder user name or notice id are empty!!!");
        b(g("finder user name or notice id are empty!!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        p(com.tencent.mm.sdk.platformtools.c2.f(bundle, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, dm.i4.COL_USERNAME);
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "noticeId");
        kotlin.jvm.internal.o.d(k17);
        kotlin.jvm.internal.o.d(k18);
        x44.k3 k3Var = new x44.k3(bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        d44.h.f(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), k17, k18, new x44.l3(k3Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        return null;
    }

    public final void p(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
        if (i17 == -1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticeResult", i17);
            b(j(600004, "fail: jump finder profile ui: errorCode is " + i17, jSONObject));
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("noticeResult", i17);
            m(jSONObject2);
            b(jSONObject2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SubscribeFinderLivingNotice");
    }
}
