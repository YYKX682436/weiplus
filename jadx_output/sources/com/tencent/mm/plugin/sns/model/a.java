package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class a implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f164058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164059b;

    public a(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, long j17) {
        this.f164059b = adLandingPagesProxy;
        this.f164058a = j17;
    }

    @Override // zy2.c6
    public void a(zy2.dc dcVar) {
        java.lang.String jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
        if (dcVar != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("followType", 1);
                jSONObject2.put("followFlg", ((ya2.b2) dcVar).field_follow_Flag);
                jSONObject2.put("followNum", ((ya2.b2) dcVar).field_friendFollowCount);
                jSONObject2.put("feedNum", ((ya2.b2) dcVar).field_feedCount);
                jSONObject2.put("errCode", ((ya2.b2) dcVar).G2 ? 0 : 1);
                jSONObject = jSONObject2.toString();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getAdFinderContactMM, exp is " + th6.toString());
            }
            this.f164059b.CLIENT_CALL("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f164058a), jSONObject);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
        }
        jSONObject = "";
        this.f164059b.CLIENT_CALL("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f164058a), jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
    }
}
