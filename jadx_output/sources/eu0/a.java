package eu0;

/* loaded from: classes5.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final eu0.b a(org.json.JSONObject jSONObject) {
        eu0.o oVar = null;
        if (jSONObject == null) {
            return null;
        }
        eu0.b bVar = new eu0.b();
        bVar.f256695a = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "");
        bVar.f256696b = jSONObject.optString("transitionID", "");
        bVar.f256697c = jSONObject.optString("prompt", "");
        bVar.f256698d = jSONObject.optString("aigcTaskID", "");
        bVar.f256705k = jSONObject.optString("aigcServiceID", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("assetInfos");
        if (optJSONArray != null) {
            e06.k m17 = e06.p.m(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String optString = optJSONArray.optString(((kz5.x0) it).b());
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
            bVar.f256699e = arrayList;
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("effectsInfos");
        if (optJSONArray2 != null) {
            e06.k m18 = e06.p.m(0, optJSONArray2.length());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = m18.iterator();
            while (it6.hasNext()) {
                java.lang.String optString2 = optJSONArray2.optString(((kz5.x0) it6).b());
                if (optString2 != null) {
                    arrayList2.add(optString2);
                }
            }
            bVar.f256700f = arrayList2;
        }
        bVar.f256702h = eu0.n.f256719h.a(jSONObject.optJSONObject("musicInfo"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("templateVersionInfo");
        bVar.f256704j = optJSONObject == null ? null : new eu0.r(optJSONObject.optInt("ios_sdk_version_min", 0), optJSONObject.optInt("ios_sdk_version_max", 0), optJSONObject.optInt("android_sdk_version_min", 0), optJSONObject.optInt("android_sdk_version_max", 0), optJSONObject.optInt("harmony_sdk_version_min", 0), optJSONObject.optInt("harmony_sdk_version_max", 0));
        bVar.f256701g = jSONObject.optString("templateJsonFilePath", "");
        bVar.f256706l = jSONObject.optString("templateURL", "");
        bVar.f256707m = jSONObject.optString("templateID", "");
        bVar.f256703i = jSONObject.optInt("templateType", 0);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("rawInfos");
        if (optJSONObject2 != null) {
            java.lang.String optString3 = optJSONObject2.optString("finder_tab_context_id", "");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject2.optString("finder_context_id", "");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            oVar = new eu0.o(optString3, optString4);
        }
        bVar.f256708n = oVar;
        com.tencent.mars.xlog.Log.i("MJCC", "MJCCParamTrace Build CamParams，json=" + jSONObject);
        return bVar;
    }
}
