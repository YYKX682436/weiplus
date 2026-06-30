package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class i0 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f201824a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f201825b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.k5 f201826c;

    public i0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, com.tencent.mm.plugin.appbrand.service.k5 k5Var) {
        this.f201824a = new java.lang.ref.WeakReference(appAttachNewDownloadUI);
        this.f201825b = materialModel;
        this.f201826c = k5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = (com.tencent.mm.ui.chatting.AppAttachNewDownloadUI) this.f201824a.get();
        if (appAttachNewDownloadUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, ui is null");
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, fail");
            return;
        }
        appAttachNewDownloadUI.M1 = this.f201825b.f86271f;
        appAttachNewDownloadUI.N1 = appBrandOpenMaterialCollection;
        if (!appAttachNewDownloadUI.M) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, download not finish");
            return;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = this.f201826c;
        k5Var.getClass();
        zh1.a aVar = zh1.n.f472909o;
        boolean a17 = aVar.a(appBrandOpenMaterialCollection);
        bi1.g gVar = bi1.g.ATTACH;
        if (a17) {
            zh1.v0 v0Var = appAttachNewDownloadUI.O1;
            if (v0Var != null) {
                v0Var.dead();
            }
            gVar.toString();
            zh1.n.f472910p = gVar;
            zh1.n.f472911q = 1L;
            appAttachNewDownloadUI.O1 = aVar.b(appAttachNewDownloadUI, appAttachNewDownloadUI.Q1, appAttachNewDownloadUI.N1, null, null);
            appAttachNewDownloadUI.A7(0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, can not create");
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = appAttachNewDownloadUI.Q1;
        if (k0Var != null) {
            zh1.p pVar = (zh1.p) k5Var;
            if (!pVar.Zi(k0Var, appBrandOpenMaterialCollection)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, not need enhance");
                return;
            }
            zh1.z0 z0Var = appAttachNewDownloadUI.P1;
            if (z0Var != null) {
                z0Var.dead();
            }
            appAttachNewDownloadUI.P1 = pVar.Ai(gVar, appAttachNewDownloadUI, appAttachNewDownloadUI.Q1, appAttachNewDownloadUI.N1, appAttachNewDownloadUI.O1, null);
        }
    }
}
