package md1;

/* loaded from: classes7.dex */
public class c1 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 520;
    public static final java.lang.String NAME = "onVoIPChatInterrupted";

    public c1() {
        si1.e.a(NAME);
    }

    public void x(dz.k kVar) {
        md1.b1 b1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OnVoIPChatInterruptedJsEvent", "hy: dispath reason: %s", kVar);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        switch (kVar) {
            case ReasonInterrupted:
                b1Var = new md1.b1(this, "call interrupted due to native reason", -1000);
                break;
            case ReasonManual:
                b1Var = new md1.b1(this, "user manually exit the call", -1000);
                break;
            case ReasonDevice:
                b1Var = new md1.b1(this, "device start failed", -1000);
                break;
            case ReasonInCommingCall:
                b1Var = new md1.b1(this, "in comming call", -2);
                break;
            case ReasonSessionUpdateFailed:
                b1Var = new md1.b1(this, "session update failed", -1000);
                break;
            case ReasonWeappEnterBackground:
                b1Var = new md1.b1(this, "current mini app entered background", -1);
                break;
            case ReasonWeappStopFromPassiveFloatBall:
                b1Var = new md1.b1(this, "call interrupted due to close passive float ball", -3);
                break;
            default:
                b1Var = new md1.b1(this, "unknown reason", -1000);
                break;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = b1Var.f325720a;
        sb6.append(str);
        sb6.append(", room id: ");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        sb6.append(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.Y);
        hashMap.put("errMsg", sb6.toString());
        hashMap.put("errCode", java.lang.Integer.valueOf(b1Var.f325721b));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str);
        t(hashMap);
        m();
    }
}
