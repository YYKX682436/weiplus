package ru5;

/* loaded from: classes10.dex */
public class l implements ru5.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f399810d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        long id6 = java.lang.Thread.currentThread().getId();
        android.os.Handler handler = this.f399810d;
        if (id6 == handler.getLooper().getThread().getId()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // ru5.j
    public java.lang.String getTag() {
        return xu5.b.b().f457302a;
    }

    @Override // ru5.j
    public void j() {
        this.f399810d.removeCallbacksAndMessages(null);
    }
}
