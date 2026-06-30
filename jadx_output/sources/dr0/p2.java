package dr0;

/* loaded from: classes5.dex */
public final class p2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.d f242494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f242495e;

    public p2(m3.d dVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f242494d = dVar;
        this.f242495e = countDownLatch;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "disconnect done, proc=" + ((java.lang.String) this.f242494d.f323093b));
        this.f242495e.countDown();
    }
}
