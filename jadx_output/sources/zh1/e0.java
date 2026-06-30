package zh1;

/* loaded from: classes8.dex */
public final class e0 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f472876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel f472877b;

    public e0(zh1.r0 r0Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f472876a = r0Var;
        this.f472877b = appBrandOpenMaterialModel;
    }

    @Override // db5.v4
    public final void a(android.view.MenuItem menuItem, android.view.View view) {
        java.util.List list;
        kotlin.jvm.internal.o.d(view);
        zh1.r0 r0Var = this.f472876a;
        if (zh1.r0.a(r0Var, view)) {
            di1.f fVar = r0Var.f472952m;
            fVar.getClass();
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel openMaterialModel = this.f472877b;
            kotlin.jvm.internal.o.g(openMaterialModel, "openMaterialModel");
            com.tencent.mars.xlog.Log.i(fVar.f232641m, "onBottomSheetAppBrandExposure");
            java.util.HashSet hashSet = fVar.f232637i;
            if (hashSet.contains(openMaterialModel)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = fVar.f232631c;
            long indexOf = ((appBrandOpenMaterialCollection == null || (list = appBrandOpenMaterialCollection.f86251f) == null) ? 0 : list.indexOf(openMaterialModel)) + 1;
            com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct wechat_use_weapp_exposestruct = (com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct) fVar.f232634f.getValue();
            wechat_use_weapp_exposestruct.f63209d = wechat_use_weapp_exposestruct.b("session", fVar.f232640l, true);
            wechat_use_weapp_exposestruct.f63214i = fVar.f232629a;
            wechat_use_weapp_exposestruct.f63215j = 2L;
            wechat_use_weapp_exposestruct.f63210e = 1L;
            wechat_use_weapp_exposestruct.f63213h = indexOf;
            wechat_use_weapp_exposestruct.f63211f = wechat_use_weapp_exposestruct.b("weapp_id", openMaterialModel.f86262d, true);
            java.lang.String str = openMaterialModel.f86267i;
            if (str == null) {
                str = "";
            }
            wechat_use_weapp_exposestruct.f63212g = wechat_use_weapp_exposestruct.b("weapp_name", str, true);
            wechat_use_weapp_exposestruct.k();
            hashSet.add(openMaterialModel);
        }
    }
}
