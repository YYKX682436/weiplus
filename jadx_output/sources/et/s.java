package et;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements ft.f4 {
    public void wi(com.tencent.mm.plugin.appbrand.page.v5 v5Var, boolean z17, int i17, java.lang.String str, boolean z18, boolean z19, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        if (v5Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = v5Var.t3();
        com.tencent.mm.plugin.appbrand.o6 o6Var = t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t37 : null;
        java.lang.String str3 = (o6Var == null || (u07 = o6Var.u0()) == null) ? null : u07.f47276v;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t38 = v5Var.t3();
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = t38 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) t38 : null;
        int g27 = o6Var2 != null ? o6Var2.g2() : 0;
        kd0.d2 d2Var = (kd0.d2) i95.n0.c(kd0.d2.class);
        java.lang.String appId = v5Var.getAppId();
        java.lang.String Y1 = v5Var.Y1();
        ((jd0.a) d2Var).getClass();
        com.tencent.mm.plugin.scanner.a.f158657a.b(str4, g27, appId, z18, Y1, i17, str, z17, z19, str2);
    }
}
