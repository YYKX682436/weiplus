package eu0;

/* loaded from: classes5.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final eu0.q a(org.json.JSONObject jSONObject) {
        eu0.o oVar = null;
        if (jSONObject == null) {
            return null;
        }
        eu0.q qVar = new eu0.q();
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "reedit");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        qVar.f256730a = optString;
        qVar.f256731b = jSONObject.optString("template_id", "");
        qVar.f256732c = jSONObject.optString("aigc_task_id", "");
        qVar.f256733d = jSONObject.optString("aigc_service_id", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("refer_url");
        if (optJSONArray != null) {
            e06.k m17 = e06.p.m(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String optString2 = optJSONArray.optString(((kz5.x0) it).b());
                if (optString2 != null) {
                    arrayList.add(optString2);
                }
            }
            qVar.f256734e = arrayList;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("rawInfos");
        if (optJSONObject != null) {
            java.lang.String optString3 = optJSONObject.optString("finder_tab_context_id", "");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject.optString("finder_context_id", "");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            oVar = new eu0.o(optString3, optString4);
        }
        qVar.f256735f = oVar;
        return qVar;
    }
}
