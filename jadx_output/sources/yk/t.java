package yk;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f462759d;

    public t(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f462759d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f462759d;
        if (cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.ImgInfoDataCleanWorkManager", "do cancel query");
        cancellationSignal.cancel();
    }
}
