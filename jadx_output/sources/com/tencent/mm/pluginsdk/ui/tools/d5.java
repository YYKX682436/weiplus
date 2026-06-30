package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class d5 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f191573a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f191574b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.k5 f191575c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.e5 f191576d;

    public d5(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, com.tencent.mm.plugin.appbrand.service.k5 k5Var, com.tencent.mm.pluginsdk.ui.tools.e5 e5Var) {
        this.f191573a = new java.lang.ref.WeakReference(miniQBReaderUI);
        this.f191574b = materialModel;
        this.f191575c = k5Var;
        this.f191576d = e5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = (com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI) this.f191573a.get();
        if (miniQBReaderUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGo, ui is null");
        } else {
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGot, fail");
                return;
            }
            miniQBReaderUI.K = this.f191574b.f86271f;
            miniQBReaderUI.L = appBrandOpenMaterialCollection;
            this.f191576d.a(miniQBReaderUI, this.f191575c, appBrandOpenMaterialCollection);
        }
    }
}
