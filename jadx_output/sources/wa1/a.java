package wa1;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.o6 a(com.tencent.mm.plugin.appbrand.o6 embedWxa) {
        com.tencent.mm.plugin.appbrand.hc hcVar;
        kotlin.jvm.internal.o.g(embedWxa, "embedWxa");
        if (b(embedWxa) && (hcVar = embedWxa.f74796e) != null && hcVar.n(embedWxa)) {
            return (com.tencent.mm.plugin.appbrand.o6) hcVar.i(embedWxa);
        }
        return null;
    }

    public final boolean b(com.tencent.mm.plugin.appbrand.o6 embedWxa) {
        kotlin.jvm.internal.o.g(embedWxa, "embedWxa");
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = embedWxa.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c()) {
            if (halfScreenConfig.D == k91.x2.f305817e) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(com.tencent.mm.plugin.appbrand.o6 host) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.plugin.appbrand.hc hcVar = host.f74796e;
        if (hcVar != null && (o6Var = (com.tencent.mm.plugin.appbrand.o6) hcVar.getActiveRuntime()) != null && !kotlin.jvm.internal.o.b(host, o6Var) && b(o6Var)) {
            try {
                appBrandRuntime = hcVar.i(o6Var);
            } catch (java.lang.Throwable unused) {
                appBrandRuntime = null;
            }
            if (appBrandRuntime == host) {
                return true;
            }
        }
        return false;
    }
}
