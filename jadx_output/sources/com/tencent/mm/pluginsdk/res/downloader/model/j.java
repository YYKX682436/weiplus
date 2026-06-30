package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public class j extends ku5.f {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.n f189678v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.pluginsdk.res.downloader.model.n nVar, java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        super(str, i17, i18, blockingQueue);
        this.f189678v = nVar;
    }

    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
        if (!(runnable instanceof com.tencent.mm.pluginsdk.res.downloader.model.l)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
            return;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l lVar = (com.tencent.mm.pluginsdk.res.downloader.model.l) runnable;
        com.tencent.mm.pluginsdk.res.downloader.model.n nVar = this.f189678v;
        ((java.util.concurrent.ConcurrentHashMap) nVar.f189692b).remove(lVar.f189681d.a());
        ((java.util.concurrent.ConcurrentHashMap) nVar.f189691a).remove(lVar.f189681d.a());
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        if (!(runnable instanceof com.tencent.mm.pluginsdk.res.downloader.model.l)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
            return;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l lVar = (com.tencent.mm.pluginsdk.res.downloader.model.l) runnable;
        com.tencent.mm.pluginsdk.res.downloader.model.n nVar = this.f189678v;
        if (((java.util.concurrent.ConcurrentHashMap) nVar.f189692b).containsKey(lVar.f189681d.a())) {
            lVar.cancel(false);
            return;
        }
        java.util.Map map = nVar.f189692b;
        com.tencent.mm.pluginsdk.res.downloader.model.k kVar = lVar.f189681d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(kVar.a(), lVar);
        ((java.util.concurrent.ConcurrentHashMap) nVar.f189691a).remove(kVar.a());
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return runnable instanceof com.tencent.mm.pluginsdk.res.downloader.model.m ? new com.tencent.mm.pluginsdk.res.downloader.model.l(runnable, obj, ((com.tencent.mm.pluginsdk.res.downloader.model.m) runnable).f189688d) : super.newTaskFor(runnable, obj);
    }

    @Override // ku5.f
    public void q() {
        ((java.util.concurrent.ConcurrentHashMap) this.f189678v.f189692b).clear();
        super.q();
    }
}
