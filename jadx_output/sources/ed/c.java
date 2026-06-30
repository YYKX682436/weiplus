package ed;

/* loaded from: classes9.dex */
public final class c implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ed.d f251200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.a f251201b;

    public c(ed.d dVar, ed.a aVar) {
        this.f251200a = dVar;
        this.f251201b = aVar;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        byte[] byteArrayExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back respCode=%d, resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 5) {
            ed.a aVar = this.f251201b;
            ed.d dVar = this.f251200a;
            try {
                if (i18 == -1) {
                    if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("key_envelope_source")) == null) {
                        ed.d.a(dVar, "on pick envelope activity call back fail, info is empty", aVar);
                        return;
                    } else {
                        ed.d.b(dVar, byteArrayExtra, aVar);
                        return;
                    }
                }
                if (i18 != 0) {
                    ed.d.a(dVar, "on pick envelope activity call back fail, result code:" + i18, aVar);
                } else {
                    dVar.getClass();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("status", ed.b.f251197e);
                    jSONObject.put("msg", "on pick envelope activity call back cancel");
                    com.tencent.mars.xlog.Log.e("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back cancel");
                    aVar.onCall(jSONObject);
                }
            } catch (org.json.JSONException e17) {
                ed.d.a(dVar, "on pick envelope activity call back fail, exception: " + e17 + ".message", aVar);
            }
        }
    }
}
