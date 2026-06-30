package yg0;

/* loaded from: classes8.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f462196d;

    public i3(yg0.o3 o3Var) {
        this.f462196d = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
        yg0.o3 o3Var = this.f462196d;
        queue.removeIdleHandler(o3Var.f462236m);
        android.os.Looper.getMainLooper().getQueue().addIdleHandler(o3Var.f462236m);
    }
}
