package km1;

/* loaded from: classes7.dex */
public abstract class u {
    public static final com.tencent.mm.plugin.appbrand.jsruntime.t a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        com.tencent.mm.plugin.appbrand.e9 C0;
        com.tencent.mm.plugin.appbrand.y yVar = lVar instanceof com.tencent.mm.plugin.appbrand.y ? (com.tencent.mm.plugin.appbrand.y) lVar : null;
        if (yVar == null || (runtime = yVar.getRuntime()) == null || (C0 = runtime.C0()) == null) {
            return null;
        }
        return C0.getF147808e();
    }
}
