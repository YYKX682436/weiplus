package u94;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425845b;

    public e(u94.f fVar, int i17, u94.a aVar) {
        this.f425844a = new java.lang.ref.WeakReference(fVar);
        this.f425845b = i17;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        if (!(obj instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject((java.lang.String) obj);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfScreenAddBrandController", th6.toString());
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new u94.d(this, i18, jSONObject.optString("errMsg"), i17, jSONObject.optString("respUsername")));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        }
    }
}
