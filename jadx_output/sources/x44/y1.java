package x44;

/* loaded from: classes4.dex */
public final class y1 implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f451934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f451935b;

    public y1(org.json.JSONObject jSONObject, yz5.l lVar) {
        this.f451934a = jSONObject;
        this.f451935b = lVar;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$queryFinderContact$1");
        org.json.JSONObject jSONObject = this.f451934a;
        if (dcVar != null) {
            try {
                jSONObject.put("followType", 1);
                jSONObject.put("followFlag", ((ya2.b2) dcVar).field_follow_Flag);
                jSONObject.put("friendFollowCount", ((ya2.b2) dcVar).field_friendFollowCount);
                jSONObject.put("feedCount", ((ya2.b2) dcVar).field_feedCount);
                jSONObject.put("errCode", ((ya2.b2) dcVar).G2 ? 0 : 1);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.FinderUser", "queryFinderContact, exp is " + th6);
            }
        }
        this.f451935b.invoke(jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$queryFinderContact$1");
    }
}
