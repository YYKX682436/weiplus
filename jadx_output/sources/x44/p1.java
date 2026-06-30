package x44;

/* loaded from: classes4.dex */
public final class p1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        boolean isBrandAdded;
        com.tencent.mm.storage.z3 n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryContactState");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (f()) {
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            isBrandAdded = false;
            if (Bi != null && !com.tencent.mm.sdk.platformtools.t8.K0(optString) && (n17 = Bi.n(optString, true)) != null && n17.r2()) {
                isBrandAdded = true;
            }
        } else {
            isBrandAdded = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isBrandAdded(optString);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isContact", isBrandAdded);
        m(jSONObject);
        b(jSONObject);
        com.tencent.mars.xlog.Log.i("SnsAdJs.Contact", "the contact state is " + isBrandAdded);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryContactState");
    }
}
