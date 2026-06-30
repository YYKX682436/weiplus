package ta1;

/* loaded from: classes7.dex */
public class s implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.t f416674a;

    public s(ta1.t tVar) {
        this.f416674a = tVar;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.t tVar = this.f416674a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                tVar.f416685e.a(0, 0, "ok", jSONObject);
            } else {
                tVar.f416685e.a(1, optInt, java.lang.String.format("editorExport failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            tVar.f416685e.a(1, -1, "editorExport error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            tVar.f416685e.a(1, -1, "editorExport error: " + e18.getMessage(), null);
        }
    }
}
