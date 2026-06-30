package dd;

/* loaded from: classes9.dex */
public final class t implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228893a;

    public t(yz5.p pVar) {
        this.f228893a = pVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String json = iTransmitKvData != null ? iTransmitKvData.toJson() : null;
        if (json == null) {
            json = "";
        }
        try {
            this.f228893a.invoke(dd.c.j(dd.d.f228871a, new org.json.JSONObject(json), null, 2, null), java.lang.Boolean.TRUE);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeixinPayService.StartKindaUseCaseImpl", "startUseCase json parse failed: %s", json);
        }
    }
}
