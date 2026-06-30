package tj1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f419712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj1.u f419713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f419714f;

    public s(com.tencent.mm.plugin.appbrand.e9 e9Var, tj1.u uVar, int i17) {
        this.f419712d = e9Var;
        this.f419713e = uVar;
        this.f419714f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f419712d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
        mi1.v vVar = t37 != null ? t37.f74821z : null;
        tj1.u uVar = this.f419713e;
        if (uVar.f419718g == null) {
            uVar.f419718g = new tj1.q(e9Var, vVar);
            if (vVar != null) {
                com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout e17 = vVar.e();
                al1.z zVar = uVar.f419718g;
                kotlin.jvm.internal.o.d(zVar);
                e17.setOnHideCallback(zVar);
            }
        }
        if (uVar.f419719h == null) {
            uVar.f419719h = new tj1.r(vVar, e9Var);
            if (vVar != null) {
                com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout e18 = vVar.e();
                al1.b0 b0Var = uVar.f419719h;
                kotlin.jvm.internal.o.d(b0Var);
                e18.setOnTranslateRectCallback(b0Var);
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t38 = e9Var.t3();
        kotlin.jvm.internal.o.f(t38, "getRuntime(...)");
        int i17 = this.f419714f;
        if (mi1.o0.f326653b) {
            t38.f74821z.f326706e.c(new mi1.j0(2, i17, 3, 0L, -1, 0L, null, 0, 0L, null, 1000, null));
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTranslate: isEnable = false");
        }
    }
}
