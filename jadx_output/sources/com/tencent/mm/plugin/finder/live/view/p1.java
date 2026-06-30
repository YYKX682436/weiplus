package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class p1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f116574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116576c;

    public p1(kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2) {
        this.f116574a = continuation;
        this.f116575b = str;
        this.f116576c = str2;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorDataPanelView", "updateLiteApp: createStore fail!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f116574a.resumeWith(kotlin.Result.m521constructorimpl(-1000));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorDataPanelView", "updateLiteApp: createStore success!");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        this.f116574a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(((com.tencent.mm.feature.lite.i) g0Var).rj(this.f116575b, "dataPanelStore/updateDataPanelStr", this.f116576c))));
    }
}
