package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes7.dex */
public abstract class x {
    public static final org.json.JSONArray a() {
        java.util.List R6;
        ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
        if (eVar == null || (R6 = eVar.R6()) == null) {
            return null;
        }
        java.util.ArrayList<ft.b> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : R6) {
            if (((ft.b) obj).a()) {
                arrayList.add(obj);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (ft.b bVar : arrayList) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONArray.put(jSONObject);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, bVar.getF65038d());
                jSONObject.put("size", bVar.getF65039e().size());
                for (java.lang.String str : bVar.c()) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(str);
                    jSONObject.put("app", jSONArray2);
                }
            }
            return jSONArray;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryReportHelper", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
