package zh1;

/* loaded from: classes8.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.h6 f472905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f472906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel f472908g;

    public m0(com.tencent.mm.plugin.appbrand.service.h6 h6Var, android.content.Context context, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f472905d = h6Var;
        this.f472906e = context;
        this.f472907f = appBrandOpenMaterialCollection;
        this.f472908g = appBrandOpenMaterialModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, launch appBrand");
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f472908g;
        b1Var.f317014b = appBrandOpenMaterialModel.f86262d;
        b1Var.f317016c = appBrandOpenMaterialModel.f86263e;
        b1Var.f317022f = appBrandOpenMaterialModel.f86264f;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.CTRL_INDEX;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f472907f;
        java.lang.String mimeType = appBrandOpenMaterialCollection.f86249d.f86269d;
        kotlin.jvm.internal.o.f(mimeType, "mimeType");
        java.lang.String materialPath = appBrandOpenMaterialCollection.f86249d.f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        b1Var.f317028i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        ((com.tencent.mm.plugin.appbrand.launching.xc) this.f472905d).bj(this.f472906e, b1Var);
        ai1.p pVar = ai1.p.f5102b;
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = appBrandOpenMaterialCollection.f86249d;
        kotlin.jvm.internal.o.f(materialModel, "materialModel");
        ((ku5.t0) ku5.t0.f312615d).k(new ai1.o(materialModel), 5000L);
    }
}
