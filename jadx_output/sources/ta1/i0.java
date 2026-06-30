package ta1;

/* loaded from: classes7.dex */
public class i0 implements com.hilive.mediasdk.MediaSdk.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.j0 f416628a;

    public i0(ta1.j0 j0Var) {
        this.f416628a = j0Var;
    }

    @Override // com.hilive.mediasdk.MediaSdk.MediaCallbacker
    public void onResult(byte[] bArr) {
        ta1.j0 j0Var = this.f416628a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            ta1.k0 k0Var = new ta1.k0(j0Var.f416634f);
            k0Var.f416636a = jSONObject.optLong("duration", 0L);
            k0Var.f416637b = jSONObject.optLong("size", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: duration is %d, size is %d", java.lang.Long.valueOf(k0Var.f416636a), java.lang.Long.valueOf(k0Var.f416637b));
            j0Var.f416633e.a(0, 0, "ok", k0Var);
        } catch (org.json.JSONException e17) {
            j0Var.f416633e.a(1, -1, "analysis error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            j0Var.f416633e.a(1, -1, "analysis error: " + e18.getMessage(), null);
        }
    }
}
