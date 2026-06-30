package qa3;

/* loaded from: classes15.dex */
public final class r implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa3.s f361063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f361064b;

    public r(qa3.s sVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f361063a = sVar;
        this.f361064b = countDownLatch;
    }

    @Override // q80.f0
    public void fail() {
        qa3.o.f361051a.c(this.f361063a.f361035a, false, "start fail");
        this.f361064b.countDown();
    }

    @Override // q80.f0
    public void success() {
        qa3.o.f361051a.c(this.f361063a.f361035a, true, "");
        this.f361064b.countDown();
    }
}
