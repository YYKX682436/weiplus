package x44;

/* loaded from: classes4.dex */
public final class d2 extends w44.d {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451814e = "";

    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("hbCoverId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.HBState", "the hb cover id is empty!!");
            g("the hb cover id is empty!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
            return;
        }
        kotlin.jvm.internal.o.d(optString);
        this.f451814e = optString;
        if (f()) {
            p(optString, new x44.a2(this, optString));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("hbCoverId", optString);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, -1);
        int f18 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "state", -1);
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "hbCoverId");
        if (k17 == null) {
            k17 = this.f451814e;
        }
        q(f17, k17, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "hbCoverId");
        if (k17 == null) {
            k17 = "";
        }
        p(k17, new x44.b2(bVar, k17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        return null;
    }

    public final void p(java.lang.String str, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryHbCoverState", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        gm0.j1.d().g(new ib4.d(str));
        gm0.j1.d().a(2944, new x44.c2(pVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryHbCoverState", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }

    public final void q(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        if (i17 != 0 || i18 == -1) {
            b(w44.d.k(this, 600011, "query hb cover failed!", null, 4, null));
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hbCoverId", str);
            jSONObject.put("state", i18);
            m(jSONObject);
            b(jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
    }
}
