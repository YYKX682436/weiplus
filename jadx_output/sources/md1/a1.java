package md1;

/* loaded from: classes7.dex */
public class a1 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 1444;
    public static final java.lang.String NAME = "onVoIPChatCmdMsg";

    public a1() {
        si1.e.a(NAME);
    }

    public void x(com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OnVoIPChatCmdMsgEvent", "dispatch onVoipChatCmdMsgEvent");
        com.tencent.mm.plugin.appbrand.utils.u3 d17 = com.tencent.mm.plugin.appbrand.utils.v3.d(c0Var.getF147808e(), map, (com.tencent.mm.plugin.appbrand.utils.t3) c0Var.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OnVoIPChatCmdMsgEvent", "get native buffer ret: %s", d17.toString());
        if (d17 != com.tencent.mm.plugin.appbrand.utils.u3.OK) {
            if (d17 == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.tencent.mm.plugin.appbrand.utils.v3.b(c0Var, yc1.p.NAME);
            }
        } else {
            java.lang.String jSONObject = new org.json.JSONObject(map).toString();
            u(c0Var);
            this.f82374f = jSONObject;
            m();
        }
    }
}
