package w35;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.t f442764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.h6 f442765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel f442767g;

    public s(w35.t tVar, com.tencent.mm.plugin.appbrand.service.h6 h6Var, android.content.Context context, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel) {
        this.f442764d = tVar;
        this.f442765e = h6Var;
        this.f442766f = context;
        this.f442767g = appBrandOpenMaterialDetailModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w35.t tVar = this.f442764d;
        com.tencent.mars.xlog.Log.i(tVar.f442768e, "tryLaunchAppBrand, launch appBrand, " + tVar.f442725c + ", " + tVar.f442726d);
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f442767g.f86255d;
        b1Var.f317014b = appBrandOpenMaterialModel.f86262d;
        b1Var.f317016c = appBrandOpenMaterialModel.f86263e;
        b1Var.f317022f = appBrandOpenMaterialModel.f86264f;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.CTRL_INDEX;
        java.lang.String str = tVar.f442725c;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = tVar.f442726d;
        if (str3 == null) {
            str3 = "";
        }
        b1Var.f317028i = new bi1.e(str2, str3, null, 0, 12, null);
        ((com.tencent.mm.plugin.appbrand.launching.xc) this.f442765e).bj(this.f442766f, b1Var);
    }
}
