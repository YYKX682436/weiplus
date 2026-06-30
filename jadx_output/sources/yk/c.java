package yk;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f462741d;

    public c(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f462741d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f462741d;
        if (cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.AppMessageDataCleanWorkManager", "do cancel query");
        cancellationSignal.cancel();
    }
}
