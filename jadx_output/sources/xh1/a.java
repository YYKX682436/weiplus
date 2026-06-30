package xh1;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final xh1.g a(com.tencent.mm.plugin.appbrand.jsapi.d0 component) {
        xh1.g gVar;
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        kotlin.jvm.internal.o.e(t37, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
        ze.n nVar = (ze.n) t37;
        if (nVar.Z1[0] == null) {
            if (nVar.L0() || nVar.S) {
                gVar = null;
                kotlin.jvm.internal.o.f(gVar, "getCgiServiceImplByLibServer(...)");
                return gVar;
            }
            synchronized (nVar.Z1) {
                xh1.g[] gVarArr = nVar.Z1;
                if (gVarArr[0] == null) {
                    com.tencent.mm.plugin.appbrand.networking.c0 c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) nVar.K1(com.tencent.mm.plugin.appbrand.networking.c0.class);
                    java.util.Objects.requireNonNull(c0Var);
                    gVarArr[0] = new xh1.g(nVar, c0Var);
                }
            }
        }
        gVar = nVar.Z1[0];
        kotlin.jvm.internal.o.f(gVar, "getCgiServiceImplByLibServer(...)");
        return gVar;
    }
}
