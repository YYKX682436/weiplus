package md1;

/* loaded from: classes7.dex */
public class s0 extends md1.q0 {
    public static final int CTRL_INDEX = 1443;
    public static final java.lang.String NAME = "sendVoIPChatCmdMsg";

    public s0() {
        si1.e.a(NAME);
    }

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiSendVoIPChatCmdMsg", "on sendVoIPChatCmdMsg invokeImp");
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (byteBuffer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiSendVoIPChatCmdMsg", "buffer is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid request parameter" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1001);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        byte[] array = byteBuffer.array();
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        int length = array.length;
        p0Var.getClass();
        int SendCmdMsg = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.SendCmdMsg(array, length);
        if (SendCmdMsg == 0) {
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str2, jSONObject3));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiSendVoIPChatCmdMsg", "Failed to send CmdMsg");
        str = android.text.TextUtils.isEmpty(null) ? "fail:" + SendCmdMsg : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", SendCmdMsg);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str2, jSONObject4));
    }
}
