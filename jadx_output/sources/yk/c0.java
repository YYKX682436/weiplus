package yk;

/* loaded from: classes12.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f462742d;

    public c0(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f462742d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f462742d;
        if (cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "do cancel query");
        cancellationSignal.cancel();
    }
}
