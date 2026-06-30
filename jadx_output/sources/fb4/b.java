package fb4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final fb4.b f260873a = new fb4.b();

    public final void a(org.json.JSONArray childsJson, java.util.List childsList, kb4.c node, int i17, int i18, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
        kotlin.jvm.internal.o.g(childsJson, "childsJson");
        kotlin.jvm.internal.o.g(childsList, "childsList");
        kotlin.jvm.internal.o.g(node, "node");
        int length = childsJson.length();
        for (int i19 = 0; i19 < length; i19++) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject optJSONObject = childsJson.optJSONObject(i19);
            java.lang.String optString = optJSONObject.optString("k");
            java.lang.String str = "";
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString2 = optJSONObject.optString(org.chromium.base.BaseSwitches.V);
            kotlin.jvm.internal.o.d(optString2);
            if (!r26.n0.N(optString2) || (map != null && (optString2 = (java.lang.String) map.get(optString)) != null)) {
                str = optString2;
            }
            kb4.c cVar = new kb4.c(optString, str, arrayList, node);
            childsList.add(cVar);
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("childs");
            if (optJSONArray != null && i17 < i18) {
                f260873a.a(optJSONArray, arrayList, cVar, i17 + 1, i18, map);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
    }
}
