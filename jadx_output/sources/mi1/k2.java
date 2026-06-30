package mi1;

/* loaded from: classes7.dex */
public final class k2 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 1374;
    public static final java.lang.String NAME = "onMenuButtonBoundingClientRectWeightChange";

    public final void x(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (e9Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(e9Var);
        if (a17 != null) {
            try {
                xi1.g windowAndroid = e9Var.getWindowAndroid();
                r1 = windowAndroid != null ? windowAndroid.shouldInLargeScreenCompatMode() : false ? mi1.a1.a(com.tencent.mm.plugin.appbrand.jsapi.gg.b(e9Var)) : null;
                if (r1 == null) {
                    r1 = mi1.a1.b(a17);
                }
                if (r1 != null) {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (r1 == null) {
            r1 = mi1.a1.a(com.tencent.mm.plugin.appbrand.jsapi.gg.b(e9Var));
        }
        t(r1);
        u(e9Var);
        m();
    }
}
