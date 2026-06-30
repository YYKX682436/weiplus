package x44;

/* loaded from: classes4.dex */
public final class d3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String optString;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("phoneNumList");
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        if (length <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.PhoneMenu", "the phone count is 0");
            b(g(": there is no phone number!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
            return;
        }
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.PhoneMenu", "the activity is null");
            b(g("the activity is null!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < length; i17++) {
            if (optJSONArray != null && (optString = optJSONArray.optString(i17)) != null) {
                arrayList.add(optString);
            }
        }
        if (arrayList.size() > 1) {
            com.tencent.mm.pluginsdk.ui.span.q qVar = com.tencent.mm.pluginsdk.ui.span.p.f191273a;
            if ((qVar != null ? ((ku5.t0) ku5.t0.f312615d).B(new x44.c3(qVar, env, arrayList)) : null) == null) {
                b(w44.d.k(this, 600002, "fail: show phone menu failed!", null, 4, null));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
                return;
            }
            b(l());
        } else if (arrayList.size() > 0) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().confirmDialPhoneNum(env.a(), (java.lang.String) arrayList.get(0));
            b(l());
        } else {
            b(g("there is no phone number!!"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
    }
}
