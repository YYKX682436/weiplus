package qa3;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qa3.l f361049d = new qa3.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        while (true) {
            qa3.a aVar = (qa3.a) qa3.o.f361053c.take();
            com.tencent.mars.xlog.Log.i("LiteAppTestService", "consumer " + aVar);
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            aVar.a(countDownLatch);
            countDownLatch.await();
        }
    }
}
