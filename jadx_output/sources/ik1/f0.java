package ik1;

/* loaded from: classes7.dex */
public abstract class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f291829d;

    public f0(java.lang.Runnable runnable) {
        this.f291829d = new java.util.concurrent.FutureTask(runnable, 0);
    }

    public void onDestroy() {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f291829d.run();
    }
}
