package i81;

/* loaded from: classes7.dex */
public final class y implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f289629a;

    public y(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f289629a = appBrandRuntime;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime it = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) obj;
        kotlin.jvm.internal.o.g(it, "it");
        i81.a0 a0Var = new i81.a0(null);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f289629a;
        i81.x xVar = new i81.x(appBrandRuntime, a0Var);
        kotlin.jvm.internal.o.g(appBrandRuntime, "<this>");
        java.lang.String str = appBrandRuntime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        xVar.invoke(mVar);
        appBrandRuntime.N.a(mVar);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f289629a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = i81.a0.f289518e;
        java.lang.String str2 = appBrandRuntime2.f74803n;
        kotlin.jvm.internal.o.f(str2, "getAppId(...)");
        concurrentHashMap.put(str2, appBrandRuntime2);
        return a0Var;
    }
}
