package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class r9 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f116654a;

    public r9(v65.n nVar) {
        this.f116654a = nVar;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        com.tencent.mars.xlog.Log.w("FinderLiveProductSizeAssistPanelView", "startLiteAppView: success,liteAppView:" + liteAppView);
        this.f116654a.a(java.lang.Boolean.TRUE);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e("FinderLiveProductSizeAssistPanelView", "startLiteAppView: fail!");
        this.f116654a.a(java.lang.Boolean.FALSE);
    }
}
