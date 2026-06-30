package ne1;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f336517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f336518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ne1.f f336519c;

    public e(ne1.f fVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f336519c = fVar;
        this.f336517a = c0Var;
        this.f336518b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (appBrandInitConfigWC == null) {
            this.f336517a.a(this.f336518b, this.f336519c.o("fail sync error"));
        } else if (this.f336517a.t3() == null || this.f336517a.t3().S || this.f336517a.t3().L0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiUpdateApp", "onResult with newConfig(%s %d %d) but runtime destroyed", appBrandInitConfigWC.f77278d, java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g), java.lang.Integer.valueOf(appBrandInitConfigWC.L));
        } else {
            this.f336517a.m(new ne1.d(this, appBrandInitConfigWC));
        }
    }
}
