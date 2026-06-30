package vv4;

/* loaded from: classes12.dex */
public final class k0 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440474d;

    public k0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f440474d = webSearchImageLoadingUI;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440474d;
        com.tencent.mars.xlog.Log.i(webSearchImageLoadingUI.f181654d, "onImgTaskEnd msgId: %d, imgLocalId: %d, compressType: %d, errType %d, errCode: %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        webSearchImageLoadingUI.f181661n = false;
        webSearchImageLoadingUI.W6(false);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440474d;
        com.tencent.mars.xlog.Log.i(webSearchImageLoadingUI.f181654d, "onImgTaskCanceled msgId: %d, imgLocalId: %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        webSearchImageLoadingUI.f181661n = false;
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f440474d.f181654d;
    }
}
