package pb;

/* loaded from: classes7.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final com.luggage.trace.ProfileInfo a(java.lang.String json) {
        kotlin.jvm.internal.o.g(json, "json");
        org.json.JSONObject jSONObject = new org.json.JSONObject(json);
        double d17 = jSONObject.getDouble("startTime");
        java.lang.String str = "endTime";
        double d18 = jSONObject.getDouble("endTime");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("frameList");
        int length = jSONArray.length();
        int i17 = 0;
        while (i17 < length) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            java.lang.String name = jSONObject2.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            org.json.JSONArray jSONArray2 = jSONArray;
            java.lang.String category = jSONObject2.getString("category");
            double d19 = jSONObject2.getDouble("startTime");
            double d27 = jSONObject2.getDouble(str);
            java.lang.String thread = jSONObject2.getString("thread");
            kotlin.jvm.internal.o.f(name, "name");
            kotlin.jvm.internal.o.f(category, "category");
            kotlin.jvm.internal.o.f(thread, "thread");
            arrayList.add(new com.luggage.trace.Frame(name, category, d19, d27, thread));
            i17++;
            jSONArray = jSONArray2;
            str = str;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("eventList");
        int i18 = 0;
        for (int length2 = jSONArray3.length(); i18 < length2; length2 = length2) {
            org.json.JSONObject jSONObject3 = jSONArray3.getJSONObject(i18);
            java.lang.String name2 = jSONObject3.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            org.json.JSONArray jSONArray4 = jSONArray3;
            java.lang.String category2 = jSONObject3.getString("category");
            double d28 = jSONObject3.getDouble("startTime");
            java.lang.String thread2 = jSONObject3.getString("thread");
            kotlin.jvm.internal.o.f(name2, "name");
            kotlin.jvm.internal.o.f(category2, "category");
            kotlin.jvm.internal.o.f(thread2, "thread");
            arrayList2.add(new com.luggage.trace.Event(name2, category2, d28, thread2));
            i18++;
            jSONArray3 = jSONArray4;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        org.json.JSONArray jSONArray5 = jSONObject.getJSONArray("screenShotInfoList");
        int length3 = jSONArray5.length();
        int i19 = 0;
        while (i19 < length3) {
            org.json.JSONObject jSONObject4 = jSONArray5.getJSONObject(i19);
            java.lang.String data = jSONObject4.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            java.util.ArrayList arrayList4 = arrayList;
            double d29 = jSONObject4.getDouble("startTime");
            kotlin.jvm.internal.o.f(data, "data");
            arrayList3.add(new com.luggage.trace.ScreenShotInfo(data, d29));
            i19++;
            arrayList = arrayList4;
            arrayList2 = arrayList2;
        }
        java.util.ArrayList arrayList5 = arrayList;
        java.util.ArrayList arrayList6 = arrayList2;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        org.json.JSONArray jSONArray6 = jSONObject.getJSONArray("memoryUsagesList");
        int length4 = jSONArray6.length();
        for (int i27 = 0; i27 < length4; i27++) {
            org.json.JSONObject jSONObject5 = jSONArray6.getJSONObject(i27);
            arrayList7.add(new com.luggage.trace.MemoryUsages(jSONObject5.getLong("jsHeapSizeUsed"), jSONObject5.getLong("allUsed"), jSONObject5.getDouble("startTime")));
        }
        return new com.luggage.trace.ProfileInfo(d17, d18, arrayList5, arrayList6, arrayList3, arrayList7);
    }
}
