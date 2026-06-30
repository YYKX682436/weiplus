package ij3;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.a f291702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f291703e;

    public e(fj3.a aVar, android.os.HandlerThread handlerThread) {
        this.f291702d = aVar;
        this.f291703e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runGlEnvironmentRunnable ");
        fj3.a aVar = this.f291702d;
        sb6.append(aVar.f263191m);
        sb6.append(" enter loop");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", sb6.toString());
        aVar.run();
        this.f291703e.quitSafely();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f263191m + " quit loop");
    }
}
