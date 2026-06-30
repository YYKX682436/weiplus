package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/d;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends com.tencent.mm.plugin.lite.api.p {
    public final java.lang.String A() {
        return com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : su4.r2.k() ? "wangka" : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : !com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "fail" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetNetworkType", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("retCode", 0);
                jSONObject2.put("networkType", A());
                this.f143443f.c(jSONObject2, false);
            } catch (java.lang.Exception unused) {
                this.f143443f.a("Error");
            }
        }
    }
}
