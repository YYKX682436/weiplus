package he;

/* loaded from: classes7.dex */
public abstract class b {
    public static int a(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        android.view.WindowInsets b17;
        int stableInsetTop;
        if (yVar.t3() != null && yVar.z1(ae.a.class) != null) {
            if (((ae.q) yVar.z1(ae.q.class)) == null || !(yVar.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0)) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameCommonUtil", new ae.s(), "hy: not game service", new java.lang.Object[0]);
            } else {
                android.app.Activity Z0 = yVar.Z0();
                if (Z0 != null && (b17 = com.tencent.mm.ui.qk.b(Z0)) != null && (stableInsetTop = b17.getStableInsetTop()) > 0) {
                    return ik1.w.e(stableInsetTop);
                }
            }
        }
        return 0;
    }
}
