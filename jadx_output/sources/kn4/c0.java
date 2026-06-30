package kn4;

/* loaded from: classes12.dex */
public enum c0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f309680d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f309681e = new java.util.concurrent.ConcurrentHashMap();

    c0() {
    }

    public final java.util.Map a(java.util.concurrent.ConcurrentMap concurrentMap) {
        if (!kn4.d0.f309682d) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : concurrentMap.entrySet()) {
            if (((java.util.concurrent.atomic.AtomicLong) entry.getValue()).get() >= 100) {
                hashMap.put((java.lang.String) entry.getKey(), java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) entry.getValue()).get()));
            }
        }
        return hashMap;
    }

    public void b(java.lang.String str, long j17, long j18, long j19, long j27) {
        if (kn4.d0.f309682d) {
            java.util.concurrent.ConcurrentMap concurrentMap = this.f309680d;
            java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
            java.util.concurrent.ConcurrentMap concurrentMap2 = this.f309681e;
            java.util.concurrent.atomic.AtomicLong atomicLong2 = (java.util.concurrent.atomic.AtomicLong) ((java.util.concurrent.ConcurrentHashMap) concurrentMap2).get(str);
            if (atomicLong == null) {
                atomicLong = new java.util.concurrent.atomic.AtomicLong(0L);
                ((java.util.concurrent.ConcurrentHashMap) concurrentMap).put(str, atomicLong);
            }
            if (atomicLong2 == null) {
                atomicLong2 = new java.util.concurrent.atomic.AtomicLong(0L);
                ((java.util.concurrent.ConcurrentHashMap) concurrentMap2).put(str, atomicLong2);
            }
            atomicLong.addAndGet(j27);
            atomicLong2.addAndGet(j19);
        }
    }
}
