package ta1;

/* loaded from: classes7.dex */
public class g implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.h f416619a;

    public g(ta1.h hVar) {
        this.f416619a = hVar;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.h hVar = this.f416619a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                hVar.f416623e.a(0, 0, "ok", jSONObject);
            } else {
                hVar.f416623e.a(1, optInt, java.lang.String.format("remux failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            hVar.f416623e.a(1, -1, "remux error: " + e17.getMessage(), new org.json.JSONObject());
        } catch (java.lang.Exception e18) {
            hVar.f416623e.a(1, -1, "remux error: " + e18.getMessage(), new org.json.JSONObject());
        }
    }
}
