package u93;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("param is nil");
            return;
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ej("nativeShareToGameLive", jSONObject.optString("referrerAppId"), jSONObject.optString("extInfo"), true);
    }
}
