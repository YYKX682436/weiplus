package kd1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 635;
    public static final java.lang.String NAME = "loadPaySpeechDialectConfig";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "invoke JsApiLoadPaySpeechDialectConfig!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:component is null");
        } else if (lVar.getContext() != null) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, null, kd1.a.class, new kd1.b(this, lVar, i17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:context is null");
            lVar.a(i17, o("fail"));
        }
    }
}
