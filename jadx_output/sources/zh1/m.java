package zh1;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.h6 f472900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f472903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472904h;

    public m(com.tencent.mm.plugin.appbrand.service.h6 h6Var, zh1.n nVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f472900d = h6Var;
        this.f472901e = nVar;
        this.f472902f = str;
        this.f472903g = i17;
        this.f472904h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, launch appBrand");
        zh1.n nVar = this.f472901e;
        android.content.Context context = nVar.f472912d;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = this.f472902f;
        b1Var.f317016c = this.f472903g;
        b1Var.f317022f = this.f472904h;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.CTRL_INDEX;
        java.lang.String mimeType = nVar.f472914f.f86249d.f86269d;
        kotlin.jvm.internal.o.f(mimeType, "mimeType");
        java.lang.String materialPath = nVar.f472914f.f86249d.f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        b1Var.f317028i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        ((com.tencent.mm.plugin.appbrand.launching.xc) this.f472900d).bj(context, b1Var);
        ai1.p pVar = ai1.p.f5102b;
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = nVar.f472914f.f86249d;
        kotlin.jvm.internal.o.f(materialModel, "materialModel");
        ((ku5.t0) ku5.t0.f312615d).k(new ai1.o(materialModel), 5000L);
    }
}
