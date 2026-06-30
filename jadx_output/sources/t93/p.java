package t93;

/* loaded from: classes.dex */
public class p extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        try {
            java.lang.String jSONObject2 = jSONObject.toString();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.v(c(), jSONObject2, 3, new t93.o(this));
            this.f143443f.d(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderPostView", e17, "openFinderPostView fail", new java.lang.Object[0]);
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
