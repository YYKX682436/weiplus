package i32;

/* loaded from: classes13.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f288133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i32.s f288134e;

    public p(i32.s sVar, long j17) {
        this.f288134e = sVar;
        this.f288133d = -1L;
        iz5.a.g(null, j17 >= 0);
        this.f288133d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f288133d;
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Time Out Sequnence(%d)", java.lang.Long.valueOf(j17));
        this.f288134e.f288141e.obtainMessage(0, java.lang.Long.valueOf(j17)).sendToTarget();
    }
}
