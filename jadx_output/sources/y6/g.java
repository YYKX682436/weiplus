package y6;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f459590a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final y6.f f459591b = new y6.f();

    public void a(java.lang.String str) {
        y6.e eVar;
        synchronized (this) {
            java.lang.Object obj = ((java.util.HashMap) this.f459590a).get(str);
            q7.n.b(obj);
            eVar = (y6.e) obj;
            int i17 = eVar.f459588b;
            if (i17 < 1) {
                throw new java.lang.IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + eVar.f459588b);
            }
            int i18 = i17 - 1;
            eVar.f459588b = i18;
            if (i18 == 0) {
                y6.e eVar2 = (y6.e) ((java.util.HashMap) this.f459590a).remove(str);
                if (!eVar2.equals(eVar)) {
                    throw new java.lang.IllegalStateException("Removed the wrong lock, expected to remove: " + eVar + ", but actually removed: " + eVar2 + ", safeKey: " + str);
                }
                y6.f fVar = this.f459591b;
                synchronized (fVar.f459589a) {
                    if (((java.util.ArrayDeque) fVar.f459589a).size() < 10) {
                        ((java.util.ArrayDeque) fVar.f459589a).offer(eVar2);
                    }
                }
            }
        }
        ((java.util.concurrent.locks.ReentrantLock) eVar.f459587a).unlock();
    }
}
