package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class b implements zh1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppBrandOpenMaterialUI f191518a;

    public b(com.tencent.mm.pluginsdk.ui.tools.AppBrandOpenMaterialUI appBrandOpenMaterialUI) {
        this.f191518a = appBrandOpenMaterialUI;
    }

    @Override // zh1.u0
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialUI", "onHidden#tryShowOpenMaterial");
        this.f191518a.finish();
    }
}
