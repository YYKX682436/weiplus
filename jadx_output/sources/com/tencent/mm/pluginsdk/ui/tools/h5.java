package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class h5 implements com.tencent.mm.pluginsdk.ui.tools.e5 {
    public h5(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.AnonymousClass1 anonymousClass1) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e5
    public void a(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, com.tencent.mm.plugin.appbrand.service.k5 k5Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        zh1.v0 v0Var = miniQBReaderUI.M;
        if (v0Var != null) {
            v0Var.dead();
        }
        k5Var.getClass();
        zh1.a aVar = zh1.n.f472909o;
        bi1.g gVar = bi1.g.ATTACH;
        gVar.toString();
        zh1.n.f472910p = gVar;
        zh1.v0 b17 = aVar.b(miniQBReaderUI, null, appBrandOpenMaterialCollection, null, miniQBReaderUI.P);
        miniQBReaderUI.M = b17;
        b17.e(new com.tencent.mm.pluginsdk.ui.tools.g5(this, miniQBReaderUI));
        miniQBReaderUI.M.show();
    }
}
