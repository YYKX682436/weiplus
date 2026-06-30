package yk;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f462744d;

    public e0(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f462744d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f462744d;
        if (cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VoiceInfoDataCleanWorkManager", "do cancel query");
        cancellationSignal.cancel();
    }
}
