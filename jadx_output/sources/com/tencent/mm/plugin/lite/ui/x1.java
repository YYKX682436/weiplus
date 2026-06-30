package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class x1 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.z1 f144498a;

    public x1(com.tencent.mm.plugin.lite.ui.z1 z1Var) {
        this.f144498a = z1Var;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        if (liteAppView instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppView) {
            java.util.HashMap platformViewHashMap = com.tencent.mm.plugin.lite.w.f144514q;
            kotlin.jvm.internal.o.f(platformViewHashMap, "platformViewHashMap");
            com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = (com.tencent.mm.plugin.lite.ui.WxaLiteAppView) liteAppView;
            java.lang.Long valueOf = java.lang.Long.valueOf(wxaLiteAppView.getAppUuid());
            com.tencent.mm.plugin.lite.ui.z1 z1Var = this.f144498a;
            platformViewHashMap.put(valueOf, z1Var);
            com.tencent.mars.xlog.Log.w(z1Var.f144506e, "startLiteAppView success,liteAppView uuid:" + wxaLiteAppView.getAppUuid());
            z1Var.f144508g = true;
        }
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f144498a.f144506e, "startLiteAppView fail!");
    }
}
