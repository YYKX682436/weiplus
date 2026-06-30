package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/a0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsapiGetLiveInfo", "invoke appId:" + str + ",data:" + jSONObject);
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("anchor");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.d(optString);
        t93.z zVar = new t93.z(this);
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.tencent.mm.feature.finder.live.a3 a3Var = new com.tencent.mm.feature.finder.live.a3(zVar);
        ((b92.d1) zbVar).getClass();
        new ek2.y0(optString, a3Var).l();
    }
}
