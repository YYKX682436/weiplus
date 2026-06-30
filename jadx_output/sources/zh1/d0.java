package zh1;

/* loaded from: classes8.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f472872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel f472873e;

    public d0(zh1.r0 r0Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f472872d = r0Var;
        this.f472873e = appBrandOpenMaterialModel;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.List list;
        kotlin.jvm.internal.o.g(it, "it");
        zh1.y0 y0Var = zh1.y0.ENABLE;
        zh1.r0 r0Var = this.f472872d;
        int i17 = 0;
        if (y0Var != r0Var.f472935o.f472863a) {
            return false;
        }
        di1.f fVar = r0Var.f472952m;
        fVar.getClass();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel openMaterialModel = this.f472873e;
        kotlin.jvm.internal.o.g(openMaterialModel, "openMaterialModel");
        com.tencent.mars.xlog.Log.i(fVar.f232641m, "onBottomSheetAppBrandClick");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = fVar.f232631c;
        if (appBrandOpenMaterialCollection != null && (list = appBrandOpenMaterialCollection.f86251f) != null) {
            i17 = list.indexOf(openMaterialModel);
        }
        long j17 = i17 + 1;
        com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c17 = fVar.c();
        c17.p(fVar.f232640l);
        c17.f62904k = fVar.f232629a;
        c17.f62898e = 6L;
        c17.f62899f = fVar.a();
        c17.f62900g = fVar.b();
        c17.f62901h = j17;
        c17.f62902i = c17.b("weapp_id", openMaterialModel.f86262d, true);
        java.lang.String str = openMaterialModel.f86267i;
        if (str == null) {
            str = "";
        }
        c17.f62903j = c17.b("weapp_name", str, true);
        c17.k();
        ((yz5.l) ((jz5.n) r0Var.f472937q).getValue()).invoke(openMaterialModel);
        return true;
    }
}
