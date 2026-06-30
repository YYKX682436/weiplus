package yk;

/* loaded from: classes12.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f462740d;

    public a0(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f462740d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f462740d;
        if (cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.QuoteMsgInfoDataCleanWorkManager", "do cancel query");
        cancellationSignal.cancel();
    }
}
