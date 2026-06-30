package ku4;

/* loaded from: classes5.dex */
public final class q implements com.tencent.mm.plugin.appbrand.service.l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f312530b;

    public q(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        this.f312529a = str;
        this.f312530b = continuation;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.l6
    public final void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f312529a + "), onError(errCode:" + i17 + ", errMsg:" + str + ')');
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f312530b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
