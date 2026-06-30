package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/n;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String liteAppId, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            jSONObject.put("tipsWording", jSONObject2);
            try {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((c61.l7) b6Var).qj(context, null, jSONObject.toString(), true, new t93.m(this));
            } catch (java.lang.Exception e17) {
                this.f143443f.a("fail");
                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateContactHalfVC", e17, "", new java.lang.Object[0]);
            }
        } catch (org.json.JSONException e18) {
            this.f143443f.a("fail");
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateContactHalfVC", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
