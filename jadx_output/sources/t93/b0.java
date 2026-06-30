package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/b0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class b0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsapiGetLocalLiveInfo", "invoke appId:" + str + ",data:" + jSONObject);
        boolean z18 = false;
        boolean z19 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() || ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
        boolean fk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && w0Var.X()) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsapiGetLocalLiveInfo", "get hasLive = " + z19 + ", isAnchor = " + fk6 + ", isLinkMic = " + z18);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("hasLive", java.lang.Boolean.valueOf(z19));
        hashMap.put("isAnchor", java.lang.Boolean.valueOf(fk6));
        hashMap.put("isConnectingMic", java.lang.Boolean.valueOf(z18));
        this.f143443f.b(hashMap);
    }
}
