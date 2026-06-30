package n91;

/* loaded from: classes7.dex */
public abstract class t {
    public static final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfigWC) {
        kotlin.jvm.internal.o.g(initConfigWC, "initConfigWC");
        if (initConfigWC.C1 != null) {
            initConfigWC.L1 = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y;
            initConfigWC.Y = false;
            initConfigWC.f77292e2 = false;
            initConfigWC.M1 = false;
        }
    }

    public static final boolean b(com.tencent.mm.plugin.appbrand.o6 appBrandRuntimeWC) {
        kotlin.jvm.internal.o.g(appBrandRuntimeWC, "appBrandRuntimeWC");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = appBrandRuntimeWC.u0();
        kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
        return c(u07);
    }

    public static final boolean c(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        return (initConfig.C1 == null || !initConfig.k() || k01.j.f303039a.b(initConfig.f47278x, initConfig.f77278d)) ? false : true;
    }
}
