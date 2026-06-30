package lw1;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.a f321550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f321551e;

    public e(iw1.a aVar, android.os.HandlerThread handlerThread) {
        this.f321550d = aVar;
        this.f321551e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runGlEnvironmentRunnable ");
        iw1.a aVar = this.f321550d;
        sb6.append(aVar.f295196m);
        sb6.append(" enter loop");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", sb6.toString());
        aVar.run();
        this.f321551e.quitSafely();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f295196m + " quit loop");
    }
}
