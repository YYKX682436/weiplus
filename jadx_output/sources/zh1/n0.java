package zh1;

/* loaded from: classes8.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f472920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.c1 f472921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f472922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.ui.widget.dialog.k0 k0Var, zh1.c1 c1Var, android.content.Context context, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        super(1);
        this.f472920d = k0Var;
        this.f472921e = c1Var;
        this.f472922f = context;
        this.f472923g = appBrandOpenMaterialCollection;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel openMaterialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel) obj;
        kotlin.jvm.internal.o.g(openMaterialModel, "openMaterialModel");
        this.f472920d.u();
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, appBrandLauncher is null");
        } else {
            this.f472921e.a(new zh1.m0(h6Var, this.f472922f, this.f472923g, openMaterialModel));
        }
        return jz5.f0.f302826a;
    }
}
