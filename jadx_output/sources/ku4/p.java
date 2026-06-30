package ku4;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.plugin.appbrand.service.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f312528b;

    public p(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        this.f312527a = str;
        this.f312528b = continuation;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.m6
    public final void a(com.tencent.mm.plugin.appbrand.appcache.n9 record, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchBizPrefetchPkg(appId:");
        java.lang.String str = this.f312527a;
        sb6.append(str);
        sb6.append("), onSuccess(path:");
        sb6.append(filePath);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", sb6.toString());
        boolean j17 = com.tencent.mm.vfs.w6.j(filePath);
        kotlin.coroutines.Continuation continuation = this.f312528b;
        if (!j17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg download success. appId=" + str);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
