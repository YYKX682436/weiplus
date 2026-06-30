package yc1;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    private static final int CTRL_INDEX = 530;
    private static final java.lang.String NAME = "onLocalServiceEvent";

    public static synchronized void u(com.tencent.mm.plugin.appbrand.jsapi.l lVar, uh1.n1 n1Var, java.lang.String str, int i17) {
        synchronized (yc1.a.class) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", str);
            if (android.text.TextUtils.equals(str, "found") || android.text.TextUtils.equals(str, "lost") || android.text.TextUtils.equals(str, "resolveFail")) {
                hashMap.put("serviceType", n1Var.f427844c);
                hashMap.put("serviceName", n1Var.f427843b);
                if (android.text.TextUtils.equals(str, "resolveFail")) {
                    hashMap.put("errno", 606101);
                    hashMap.put("errnMsg", java.lang.String.format("fail:mdns resolve system error:%d", java.lang.Integer.valueOf(i17)));
                } else {
                    hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, n1Var.f427845d);
                    hashMap.put("port", java.lang.Integer.valueOf(n1Var.f427846e));
                    hashMap.put("attributes", n1Var.f427842a);
                }
            }
            yc1.a aVar = new yc1.a();
            aVar.t(hashMap);
            aVar.p(lVar);
            aVar.m();
        }
    }
}
