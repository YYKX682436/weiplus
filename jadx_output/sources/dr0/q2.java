package dr0;

/* loaded from: classes5.dex */
public final class q2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f242502d;

    public q2(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f242502d = countDownLatch;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "disconnect done, proc=" + com.tencent.mm.sdk.platformtools.w9.f193054b);
        this.f242502d.countDown();
    }
}
