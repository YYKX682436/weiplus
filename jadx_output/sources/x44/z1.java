package x44;

/* loaded from: classes4.dex */
public final class z1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("finderUsername");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.FinderUser", "the user name is empty!");
            b(g("the user name is empty!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            return;
        }
        if (f()) {
            kotlin.jvm.internal.o.d(optString);
            p(optString, new x44.w1(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_USERNAME, optString);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "result");
        if (k17 == null) {
            k17 = "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(k17);
            if (jSONObject.optInt("errCode", 1) != 0) {
                b(w44.d.k(this, 600005, "fail: query finder user info failed!", null, 4, null));
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("followType", 1);
                jSONObject2.put("followFlag", jSONObject.optInt("followFlg"));
                jSONObject2.put("followerCount", jSONObject.optInt("followNum"));
                jSONObject2.put("feedCount", jSONObject.optInt("feedNum"));
                m(jSONObject2);
                b(jSONObject2);
            }
        } catch (java.lang.Throwable unused) {
            b(w44.d.k(this, 600005, "fail: query finder user info failed!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, dm.i4.COL_USERNAME);
        if (k17 == null) {
            k17 = "";
        }
        p(k17, new x44.x1(bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        return null;
    }

    public final void p(java.lang.String str, yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryFinderContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", 1);
        if (e6Var != null) {
            ((com.tencent.mm.plugin.finder.service.s1) e6Var).Ui(str, new x44.y1(jSONObject, lVar), 4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryFinderContact", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
    }
}
