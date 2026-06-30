package t93;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String optString = jSONObject.optString("encryptedId");
            java.lang.String optString2 = jSONObject.optString("nonceId");
            java.lang.String optString3 = jSONObject.optString("requestId");
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).sk(optString, optString2, null, new t93.b(this, hashMap, optString3), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewMicCover", e17, "getFinderLivePreviewMicCover fail", new java.lang.Object[0]);
            this.f143443f.a("Invalid input parameters");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
