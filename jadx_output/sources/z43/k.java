package z43;

/* loaded from: classes.dex */
public class k extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.L0(Ai)) {
            this.f143443f.d(false);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo = (com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo) it.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("appid", downloadWidgetTaskInfo.f97227d);
                jSONObject3.put("status", downloadWidgetTaskInfo.f97229f);
                jSONObject3.put("download_id", downloadWidgetTaskInfo.f97228e);
                jSONObject3.put("progress", downloadWidgetTaskInfo.f97230g);
                jSONObject3.put("progress_float", downloadWidgetTaskInfo.f97232i);
                if (downloadWidgetTaskInfo.f97231h) {
                    jSONObject3.put("reserve_for_wifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject3);
        }
        try {
            jSONObject2.put("result", jSONArray.toString());
        } catch (org.json.JSONException unused2) {
        }
        this.f143443f.c(jSONObject2, false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
