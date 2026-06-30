package kl4;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k f308919d;

    public j(kl4.k kVar) {
        this.f308919d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k kVar = this.f308919d;
        try {
            java.lang.String str = kVar.f308924g;
            if (str != null) {
                kl4.k.a(kVar, str);
            }
        } finally {
            java.util.concurrent.CountDownLatch countDownLatch = kVar.f308926i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
