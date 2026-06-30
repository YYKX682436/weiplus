package fb4;

/* loaded from: classes11.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb4.b f260877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb4.k f260878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f260880d;

    public d(kb4.b bVar, eb4.k kVar, java.lang.String str, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f260877a = bVar;
        this.f260878b = kVar;
        this.f260879c = str;
        this.f260880d = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", 0);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.ArrayList) ((lb4.c) this.f260877a).a()).iterator();
            while (it.hasNext()) {
                kb4.d dVar = (kb4.d) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                dVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                jSONObject.put("k", dVar.f306244a);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                jSONObject.put(org.chromium.base.BaseSwitches.V, dVar.f306245b);
                jSONArray.put(jSONObject);
            }
            hashMap.put("jsapi_callback_json_special_key", "result");
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            hashMap.put("result", jSONArray2);
        } catch (java.lang.Exception unused) {
        }
        this.f260878b.e(this.f260879c, "ok", hashMap);
        this.f260880d.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
    }
}
