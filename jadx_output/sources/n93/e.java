package n93;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("fail: params error");
        } else {
            ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).xh(optString);
            this.f143443f.d(false);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
