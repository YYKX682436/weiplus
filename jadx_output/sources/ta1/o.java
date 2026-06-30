package ta1;

/* loaded from: classes7.dex */
public class o implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.p f416651a;

    public o(ta1.p pVar) {
        this.f416651a = pVar;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.p pVar = this.f416651a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                pVar.f416658e.a(0, 0, "ok", jSONObject);
            } else {
                pVar.f416658e.a(1, optInt, java.lang.String.format("editorUpdateTrack failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            pVar.f416658e.a(1, -1, "editorUpdateTrack error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            pVar.f416658e.a(1, -1, "editorUpdateTrack error: " + e18.getMessage(), null);
        }
    }
}
