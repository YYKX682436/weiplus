package z43;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("invalid_params");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameCenter", "JsonData = %s", jSONObject.toString());
        com.tencent.mm.autogen.events.OpenGameCenterEvent openGameCenterEvent = new com.tencent.mm.autogen.events.OpenGameCenterEvent();
        am.qn qnVar = openGameCenterEvent.f54597g;
        qnVar.f7723a = jSONObject;
        qnVar.f7724b = com.tencent.mm.sdk.platformtools.x2.f193071a;
        openGameCenterEvent.e();
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
