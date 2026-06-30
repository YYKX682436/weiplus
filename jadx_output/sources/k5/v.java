package k5;

/* loaded from: classes13.dex */
public class v implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public int f304168d = 0;

    public v(k5.y yVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f304168d);
        this.f304168d = this.f304168d + 1;
        return newThread;
    }
}
