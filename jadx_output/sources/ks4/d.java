package ks4;

/* loaded from: classes2.dex */
public final class d extends ks4.i {
    public d() {
        r45.oi3 oi3Var = new r45.oi3();
        oi3Var.f382277d = js4.r.f301567c;
        oi3Var.f382278e = com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
        s(oi3Var, new r45.pi3(), 6684, "/cgi-bin/micromsg-bin/getmidassdkinfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiGetMidasSdkInfoRequest: ");
    }
}
