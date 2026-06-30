package t93;

/* loaded from: classes.dex */
public class u extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("extInfo", new org.json.JSONObject(jSONObject.optString("extInfo")));
            android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.F(ll6, jSONObject2.toString(), null, null);
            this.f143443f.d(false);
        } catch (org.json.JSONException unused) {
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
