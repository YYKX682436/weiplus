package ta1;

/* loaded from: classes7.dex */
public class i implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.j f416627a;

    public i(ta1.j jVar) {
        this.f416627a = jVar;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.j jVar = this.f416627a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                jVar.f416630e.a(0, 0, "ok", jSONObject);
            } else {
                jVar.f416630e.a(1, optInt, java.lang.String.format("editorCreate failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            jVar.f416630e.a(1, -1, "editorCreate error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            jVar.f416630e.a(1, -1, "editorCreate error: " + e18.getMessage(), null);
        }
    }
}
