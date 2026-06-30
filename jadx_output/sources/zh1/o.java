package zh1;

/* loaded from: classes8.dex */
public final class o implements zh1.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f472924d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472925e;

    /* renamed from: f, reason: collision with root package name */
    public final zh1.w0 f472926f;

    public o(android.content.Context context, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.w0 openMaterialReporter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        kotlin.jvm.internal.o.g(openMaterialReporter, "openMaterialReporter");
        this.f472924d = context;
        this.f472925e = openMaterialCollection;
        this.f472926f = openMaterialReporter;
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = this.f472925e.f86249d;
        kotlin.jvm.internal.o.f(materialModel, "materialModel");
        zh1.w0 w0Var = this.f472926f;
        ((di1.f) w0Var).e();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "showInner materialModel:" + materialModel);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        long j17 = ((di1.f) w0Var).f232629a;
        java.lang.String str = ((di1.f) w0Var).f232640l;
        long a17 = ((di1.f) w0Var).a();
        java.lang.String mimeType = materialModel.f86269d;
        kotlin.jvm.internal.o.f(mimeType, "mimeType");
        java.lang.String materialExtension = materialModel.f86270e;
        kotlin.jvm.internal.o.f(materialExtension, "materialExtension");
        java.lang.String materialPath = materialModel.f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        ((gb0.n) kVar).getClass();
        android.content.Context context = this.f472924d;
        kotlin.jvm.internal.o.g(context, "context");
        ib0.e.f290029a.a(context, new gb0.k(context, j17, str, a17, mimeType, materialExtension, materialPath));
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "dead");
    }

    @Override // zh1.v0
    public void e(zh1.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "setListener");
    }

    @Override // zh1.v0
    public void hide() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "hide");
    }

    @Override // zh1.v0
    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "showDirectly");
        a();
    }

    @Override // zh1.v0
    public void show() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "show");
        a();
    }
}
