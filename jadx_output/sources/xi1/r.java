package xi1;

/* loaded from: classes7.dex */
public final class r extends xi1.q implements xi1.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xi1.g base, xi1.s windowViewImplScope) {
        super(base, windowViewImplScope);
        kotlin.jvm.internal.o.g(base, "base");
        kotlin.jvm.internal.o.g(windowViewImplScope, "windowViewImplScope");
    }

    @Override // xi1.i
    public void a(com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams params, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        xi1.g gVar = this.f454713d;
        xi1.i iVar = gVar instanceof xi1.i ? (xi1.i) gVar : null;
        if (iVar != null) {
            iVar.a(params, runtime);
        }
    }

    @Override // xi1.i
    public android.view.ViewGroup.LayoutParams b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        xi1.g gVar = this.f454713d;
        xi1.i iVar = gVar instanceof xi1.i ? (xi1.i) gVar : null;
        if (iVar != null) {
            return iVar.b(appBrandRuntime);
        }
        return null;
    }

    @Override // xi1.i
    public void d(int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        xi1.g gVar = this.f454713d;
        xi1.i iVar = gVar instanceof xi1.i ? (xi1.i) gVar : null;
        if (iVar != null) {
            iVar.d(i17, runtime);
        }
    }
}
