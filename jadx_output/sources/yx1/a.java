package yx1;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f467822d;

    public a(yx1.d dVar, java.lang.Runnable runnable) {
        this.f467822d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.INotificationManagerInvocationHandler", "run on my runnable");
            this.f467822d.run();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
        }
    }
}
