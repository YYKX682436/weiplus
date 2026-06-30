package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class c5 implements com.tencent.mm.pluginsdk.ui.tools.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f191543a;

    public c5(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f191543a = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e5
    public void a(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, com.tencent.mm.plugin.appbrand.service.k5 k5Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f191543a.get();
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, bottomSheet is null");
            return;
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (!pVar.Zi(k0Var, appBrandOpenMaterialCollection)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, not need enhance");
            return;
        }
        zh1.z0 z0Var = miniQBReaderUI.N;
        if (z0Var != null) {
            z0Var.dead();
        }
        miniQBReaderUI.N = pVar.Ai(bi1.g.ATTACH, miniQBReaderUI, k0Var, appBrandOpenMaterialCollection, null, null);
    }
}
