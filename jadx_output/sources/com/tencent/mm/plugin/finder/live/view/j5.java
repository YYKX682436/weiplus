package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class j5 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView f116409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f116410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116412d;

    public j5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView, kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2) {
        this.f116409a = finderLiveGameDataView;
        this.f116410b = continuation;
        this.f116411c = str;
        this.f116412d = str2;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f116409a.f115900f, "createStore fail!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f116410b.resumeWith(kotlin.Result.m521constructorimpl(-1000));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f116409a.f115900f, "createStore success!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        this.f116410b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(((com.tencent.mm.feature.lite.i) g0Var).rj(this.f116411c, "updateBannerInfo", this.f116412d))));
    }
}
