package ta1;

/* loaded from: classes7.dex */
public class q implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.r f416662a;

    public q(ta1.r rVar) {
        this.f416662a = rVar;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.r rVar = this.f416662a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                rVar.f416672e.a(0, 0, "ok", jSONObject);
            } else {
                rVar.f416672e.a(1, optInt, java.lang.String.format("editorRemoveTrack failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            rVar.f416672e.a(1, -1, "editorRemoveTrack error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            rVar.f416672e.a(1, -1, "editorRemoveTrack error: " + e18.getMessage(), null);
        }
    }
}
