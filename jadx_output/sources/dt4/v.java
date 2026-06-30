package dt4;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f243298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243299e;

    public v(dt4.w wVar, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.lang.String str) {
        this.f243298d = cancellationSignal;
        this.f243299e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f243298d;
        if (cancellationSignal == null || cancellationSignal.isCanceled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLuckyMoneyStg", "do cancel query: %s", this.f243299e);
        cancellationSignal.cancel();
    }
}
