package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public final class a0 extends java.util.concurrent.PriorityBlockingQueue {
    public a0() {
        super(11, new com.tencent.mm.pluginsdk.res.downloader.model.z());
    }

    public static java.lang.String d(java.lang.Runnable runnable) {
        if (!(runnable instanceof com.tencent.mm.pluginsdk.res.downloader.model.l)) {
            return java.lang.String.format("unknown runnable = %s", runnable);
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l lVar = (com.tencent.mm.pluginsdk.res.downloader.model.l) runnable;
        com.tencent.mm.pluginsdk.res.downloader.model.k kVar = lVar.f189681d;
        return kVar instanceof com.tencent.mm.pluginsdk.res.downloader.model.u ? java.lang.String.format("priority = %d, urlKey = %s", java.lang.Integer.valueOf(((com.tencent.mm.pluginsdk.res.downloader.model.u) kVar).f189716e), lVar.f189681d.a()) : java.lang.String.format("unknown request = %s", kVar);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(java.lang.Object obj) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        boolean offer = super.offer(runnable);
        d(runnable);
        java.lang.Thread.currentThread().getId();
        return offer;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public java.lang.Object poll(long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runnable runnable = (java.lang.Runnable) super.poll(j17, timeUnit);
        if (runnable != null) {
            d(runnable);
            java.lang.Thread.currentThread().getId();
        }
        return runnable;
    }
}
