package tp5;

/* loaded from: classes7.dex */
public final /* synthetic */ class c$$a implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "WCDBLazyResultLeakMonitor");
        thread.setDaemon(true);
        return thread;
    }
}
