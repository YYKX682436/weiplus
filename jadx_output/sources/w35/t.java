package w35;

/* loaded from: classes8.dex */
public final class t extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.pluginsdk.model.g2 params, w35.a aVar) {
        super(params, aVar);
        kotlin.jvm.internal.o.g(params, "params");
        this.f442768e = "MicroMsg.OpenWayControllerMiniProgram";
    }

    @Override // w35.b
    public void a() {
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel;
        java.lang.String str = this.f442725c;
        boolean b17 = kotlin.jvm.internal.o.b(str, "text/html");
        java.lang.String str2 = this.f442726d;
        if (b17) {
            if (str2 == null) {
                str2 = "";
            }
            materialModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("text/html", "html", str2);
        } else {
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = this.f442723a.f189311d;
            if (str3 == null) {
                str3 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            materialModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(str, str3, str2);
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var != null) {
            ((zh1.p) k5Var).Ni(materialModel, new w35.r(new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = info.f191015e;
        if (appBrandOpenMaterialDetailModel != null) {
            com.tencent.mars.xlog.Log.i(this.f442768e, "tryLaunchAppBrand, appId: " + appBrandOpenMaterialDetailModel.f86255d.f86262d + ", versionType: " + appBrandOpenMaterialDetailModel.f86255d.f86263e + ", enterPath: " + appBrandOpenMaterialDetailModel.f86255d.f86264f);
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            w35.a aVar = this.f442724b;
            if (aVar != null) {
                ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
            }
            if (h6Var == null) {
                com.tencent.mars.xlog.Log.w(this.f442768e, "tryLaunchAppBrand, appBrandLauncher is null");
                return;
            }
            com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(info.b(), this.f442725c);
            w35.s sVar = new w35.s(this, h6Var, context, appBrandOpenMaterialDetailModel);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                sVar.run();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(sVar);
            }
        }
    }
}
