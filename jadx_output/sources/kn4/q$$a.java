package kn4;

/* loaded from: classes12.dex */
public final /* synthetic */ class q$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) kn4.q.f309746d;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (currentTimeMillis - ((kn4.s) entry.getValue()).f309750b > kn4.q.f309745c) {
                concurrentHashMap.remove(entry.getKey());
            }
        }
    }
}
