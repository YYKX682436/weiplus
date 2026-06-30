package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class d0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getDownloadWidgetTaskInfos";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.L0(Ai)) {
            q5Var.a(null, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo = (com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("appid", downloadWidgetTaskInfo.f97227d);
                jSONObject2.put("status", downloadWidgetTaskInfo.f97229f);
                jSONObject2.put("download_id", downloadWidgetTaskInfo.f97228e);
                jSONObject2.put("progress", downloadWidgetTaskInfo.f97230g);
                jSONObject2.put("progress_float", downloadWidgetTaskInfo.f97232i);
                if (downloadWidgetTaskInfo.f97231h) {
                    jSONObject2.put("reserve_for_wifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("result", jSONArray.toString());
        } catch (org.json.JSONException unused2) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
