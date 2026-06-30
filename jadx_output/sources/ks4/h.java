package ks4;

/* loaded from: classes8.dex */
public final class h extends ks4.i {
    public h(r45.gc5 request) {
        kotlin.jvm.internal.o.g(request, "request");
        request.f375092o = js4.r.f301567c;
        request.f375094q = com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion();
        s(request, new r45.hc5(), 6242, "/cgi-bin/micromsg-bin/preparewecoinrecharge");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiPrepareWecoinRechargeRequest: requestID: " + request.f375084d + ", productID:  " + request.f375085e);
    }
}
