package r6;

/* loaded from: classes13.dex */
public final class b implements java.util.concurrent.ThreadFactory {
    public b(r6.a aVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public synchronized java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread;
        thread = new java.lang.Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
