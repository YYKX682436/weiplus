package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class s9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f116675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116678d;

    public s9(kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f116675a = continuation;
        this.f116676b = str;
        this.f116677c = str2;
        this.f116678d = str3;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("FinderLiveProductSizeAssistPanelView", "updateLiteApp: createStore fail!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f116675a.resumeWith(kotlin.Result.m521constructorimpl(-1000));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FinderLiveProductSizeAssistPanelView", "updateLiteApp: createStore success!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        this.f116675a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(((com.tencent.mm.feature.lite.i) g0Var).rj(this.f116676b, this.f116677c, this.f116678d))));
    }
}
