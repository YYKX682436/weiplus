package ks4;

/* loaded from: classes8.dex */
public final class g extends ks4.i {
    public g(int i17, int i18, java.lang.Integer num) {
        r45.is3 is3Var = new r45.is3();
        is3Var.f377302d = i17;
        is3Var.f377305g = i18;
        is3Var.f377306h = js4.r.f301567c;
        is3Var.f377307i = com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
        if (num != null) {
            is3Var.f377304f = num.intValue();
        }
        s(is3Var, new r45.js3(), 6299, "/cgi-bin/micromsg-bin/getwecoinpricelist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiGetWecoinPriceListRequest: ");
    }
}
