package x44;

/* loaded from: classes4.dex */
public final class z extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString("pkg");
        java.lang.String optString3 = data.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        boolean optBoolean = data.optBoolean("useGameDownloadWidget", false);
        if (f()) {
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            kotlin.jvm.internal.o.d(optString3);
            p(optString, optString2, optString3, optBoolean, new x44.w(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", optString);
            bundle.putString("pkg", optString2);
            bundle.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, optString3);
            bundle.putBoolean("useGameDownloadWidget", optBoolean);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        int i17 = -1;
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "error", -1);
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "pkgInfo");
        if (k17 == null) {
            k17 = "{}";
        }
        try {
            jSONObject = new org.json.JSONObject(k17);
            i17 = f17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.GetAdChannelApp", "the parse json failed");
            jSONObject = new org.json.JSONObject();
        }
        q(i17, jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "appId");
        java.lang.String str = k17 == null ? "" : k17;
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "pkg");
        java.lang.String str2 = k18 == null ? "" : k18;
        java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
        p(str, str2, k19 == null ? "" : k19, com.tencent.mm.sdk.platformtools.c2.b(bundle, "useGameDownloadWidget", false), new x44.x(bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        return null;
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        gm0.j1.d().g(new ib4.b(str, str2, str3, z17));
        gm0.j1.d().a(1210, new x44.y(pVar, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }

    public final void q(int i17, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
        if (i17 != 0 || jSONObject.length() <= 0) {
            b(w44.d.k(this, -1, "get ad channel app info failed!", null, 4, null));
        } else {
            m(jSONObject);
            b(jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetAdChannelAppInfo");
    }
}
