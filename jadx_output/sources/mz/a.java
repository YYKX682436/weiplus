package mz;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f332861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f332862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f332861d = atomicReference;
        this.f332862e = countDownLatch;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipc.GetSimpleDnsResponse it = (com.tencent.mm.ipc.GetSimpleDnsResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f332861d.set(it.f68324d.toArray(new java.lang.String[0]));
        this.f332862e.countDown();
        return jz5.f0.f302826a;
    }
}
