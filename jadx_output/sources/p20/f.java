package p20;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p20.a f351413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p20.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351413d = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p20.f(this.f351413d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((p20.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = p20.i.f351421g.get();
        jz5.f0 f0Var = jz5.f0.f302826a;
        p20.a aVar2 = this.f351413d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Preloader is paused, task will not be executed: " + aVar2.a());
            ((kotlinx.coroutines.sync.o) p20.i.f351417c).c();
            ((java.util.concurrent.ConcurrentHashMap) p20.i.f351418d).remove(aVar2.a());
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start executing preload task: ");
        sb6.append(aVar2.a());
        sb6.append(", current preloading: ");
        java.util.Map map = p20.i.f351418d;
        sb6.append(((java.util.concurrent.ConcurrentHashMap) map).size());
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", sb6.toString());
        ((java.util.concurrent.ConcurrentHashMap) map).put(aVar2.a(), aVar2);
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class);
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20302;
        c2CDownloadRequest.fileKey = aVar2.a();
        p20.j jVar = aVar2.f351407a;
        c2CDownloadRequest.setSavePath(jVar.a());
        c2CDownloadRequest.setUrl(jVar.f351423a);
        c2CDownloadRequest.maxFileSize = aVar2.f351408b;
        cdnManager.startSNSDownload(c2CDownloadRequest, new p20.d(), new p20.e(), 2);
        return f0Var;
    }
}
