package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h5 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView f116348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f116349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f116350c;

    public h5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f116348a = finderLiveGameDataView;
        this.f116349b = c0Var;
        this.f116350c = continuation;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f116348a;
        com.tencent.mars.xlog.Log.w(finderLiveGameDataView.f115900f, "startLiteAppView success,liteAppView:" + liteAppView);
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView.d(this.f116349b, this.f116350c, finderLiveGameDataView, true);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f116348a;
        com.tencent.mars.xlog.Log.e(finderLiveGameDataView.f115900f, "startLiteAppView fail!");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView.d(this.f116349b, this.f116350c, finderLiveGameDataView, false);
    }
}
