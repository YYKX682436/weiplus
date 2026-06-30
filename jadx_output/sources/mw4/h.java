package mw4;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f331768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f331769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f331770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlin.jvm.internal.h0 h0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f331768d = atomicBoolean;
        this.f331769e = h0Var;
        this.f331770f = countDownLatch;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (this.f331768d.compareAndSet(false, true)) {
            this.f331769e.f310123d = str;
            this.f331770f.countDown();
        }
        return jz5.f0.f302826a;
    }
}
