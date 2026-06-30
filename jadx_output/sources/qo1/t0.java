package qo1;

/* loaded from: classes5.dex */
public final class t0 implements com.tencent.wechat.aff.affroam.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f365549a;

    public t0(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f365549a = countDownLatch;
    }

    @Override // com.tencent.wechat.aff.affroam.y1
    public final void complete(int i17) {
        this.f365549a.countDown();
    }
}
