package md1;

/* loaded from: classes7.dex */
public class c0 extends md1.q0 {
    public static final int CTRL_INDEX = 521;
    public static final java.lang.String NAME = "updateVoIPChatMuteConfig";

    /* renamed from: i, reason: collision with root package name */
    public boolean f325722i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f325723m = false;

    public c0() {
        si1.e.a(NAME);
    }

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            boolean z17 = jSONObject2.getBoolean("muteMicrophone");
            boolean z18 = jSONObject2.getBoolean("muteEarphone");
            boolean optBoolean = jSONObject.optBoolean("handsFree", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: muteMicroPhone:%b, muteEarPhone:%b, handsFree:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(optBoolean));
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "invokeImp data:%s", jSONObject);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
            p0Var.s(z18, new md1.y(this, c0Var, i17));
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.t(z17, new md1.a0(this, z17, c0Var, i17));
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.r(optBoolean, new md1.b0(this));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", e17, "", new java.lang.Object[0]);
        }
    }
}
