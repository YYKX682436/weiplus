package dd;

/* loaded from: classes9.dex */
public final class l implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228883a;

    public l(yz5.p pVar) {
        this.f228883a = pVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeixinPayService.openBioSettingImpl", "callback from openBioSettingImpl");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean bool = data.getBool("result");
        java.lang.String string = data.getString("token");
        jSONObject.putOpt("result", java.lang.Boolean.valueOf(bool));
        jSONObject.putOpt("token", string);
        this.f228883a.invoke(dd.c.j(dd.d.f228871a, jSONObject, null, 2, null), java.lang.Boolean.FALSE);
    }
}
