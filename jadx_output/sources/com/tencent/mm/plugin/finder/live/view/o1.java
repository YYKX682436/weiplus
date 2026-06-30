package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class o1 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f116552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f116553b;

    public o1(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f116552a = c0Var;
        this.f116553b = continuation;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        com.tencent.mars.xlog.Log.w("FinderLiveAnchorDataPanelView", "startLiteAppView: success,liteAppView:" + liteAppView);
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView.d(this.f116552a, this.f116553b, true);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorDataPanelView", "startLiteAppView: fail!");
        com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView.d(this.f116552a, this.f116553b, false);
    }
}
