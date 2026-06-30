package xe1;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe1.p f453827d;

    public a(xe1.p pVar) {
        this.f453827d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int currPosMs;
        xe1.p pVar = this.f453827d;
        try {
            currPosMs = pVar.f453828d.getCurrPosMs();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e17);
        }
        if (java.lang.Math.abs(currPosMs - pVar.f453831g) < 250) {
            return true;
        }
        org.json.JSONObject b17 = pVar.b();
        pVar.f453831g = currPosMs;
        b17.put("position", new java.math.BigDecimal((currPosMs * 1.0d) / 1000.0d).setScale(3, 4).doubleValue());
        b17.put("duration", pVar.f453828d.getDuration());
        pVar.a(new xe1.n(null), b17);
        return true;
    }
}
