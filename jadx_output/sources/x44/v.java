package x44;

/* loaded from: classes4.dex */
public final class v extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 102);
        if (f()) {
            kotlin.jvm.internal.o.d(optString);
            d44.j.a(optString, optInt, new x44.t(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_USERNAME, optString);
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, optInt);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FollowFinder", "the result is null");
            b(w44.d.h(this, null, 1, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.c2.f(bundle, "error", -1) == 0) {
            boolean b17 = com.tencent.mm.sdk.platformtools.c2.b(bundle, "followed", false);
            com.tencent.mars.xlog.Log.i("SnsAdJs.FollowFinder", "follow finder user result is " + b17);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("followed", b17);
            m(jSONObject);
            b(jSONObject);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FollowFinder", "follow finder user error");
            b(w44.d.k(this, 600006, "fail:follow finder user failed!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, dm.i4.COL_USERNAME);
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 102);
        if (!(k17 == null || r26.n0.N(k17))) {
            kotlin.jvm.internal.o.d(k17);
            d44.j.a(k17, f17, new x44.u(bVar));
        } else if (bVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("error", -1);
            ((r64.b) bVar).e(bundle2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowFinderUser");
        return null;
    }
}
