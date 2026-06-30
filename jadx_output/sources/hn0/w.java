package hn0;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final hn0.w f282443a = new hn0.w();

    public final boolean a(java.lang.String playerName) {
        kotlin.jvm.internal.o.g(playerName, "playerName");
        com.tencent.mars.xlog.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", "doInject");
        int a17 = wo.r.a();
        boolean z17 = (a17 & 255) > 60;
        com.tencent.mars.xlog.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", playerName + " set HEVC soft dec, cpuFlag:" + a17 + ", svrEnable:true, cpuEnable:" + z17);
        if (!z17) {
            return false;
        }
        try {
            long a18 = com.tencent.mm.live.core.core.trtc.sdkadapter.feature.Vcodec2Decoder.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "setExternalDecoderFactoryInterface");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("factoryInterface", a18);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", playerName + " opens the vcodec2 decoder:" + jSONObject3 + ", ret:" + com.tencent.live2.V2TXLivePremier.callExperimentalAPI(jSONObject3));
        } catch (org.json.JSONException unused) {
        }
        return true;
    }
}
