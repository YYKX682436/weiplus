package i53;

/* loaded from: classes15.dex */
public class s0 implements com.tencent.mm.plugin.webview.model.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.v0 f288709a;

    public s0(i53.v0 v0Var) {
        this.f288709a = v0Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.v0 v0Var = this.f288709a;
        if (!((java.util.HashSet) v0Var.f288750b).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "onProgress, not in uploadingList, localId: %s", str);
            return;
        }
        int size = v0Var.f288749a.size();
        float f17 = size;
        float f18 = ((size - r0) / f17) + ((1.0f / f17) * (i18 / 100.0f));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "onProgress, localId : %s, percent : %d, initSize : %d, uploadingSize : %d, uploadProgress : %f", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(((java.util.HashSet) v0Var.f288750b).size()), java.lang.Float.valueOf(f18));
        m33.o1 o1Var = v0Var.f288753e;
        if (o1Var != null) {
            u93.n nVar = ((u93.m) o1Var).f425827a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, nVar.f425828g);
                jSONObject.put("percent", f18);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiUploadGameMediaFile", e17, "", new java.lang.Object[0]);
            }
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = nVar.f143442e;
            ((com.tencent.mm.feature.lite.i) g0Var).Uj(cVar.f299024a, cVar.f299026c, "game.mediaFileUploadProgress", jSONObject);
        }
    }
}
