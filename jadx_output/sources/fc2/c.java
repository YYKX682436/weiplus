package fc2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f260939a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f260940b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f260941c;

    public c(java.lang.String threadTag) {
        kotlin.jvm.internal.o.g(threadTag, "threadTag");
        this.f260940b = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(threadTag);
        n3Var.setLogging(false);
        this.f260941c = n3Var;
    }

    public final void a(fc2.d observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f260940b.put(observer, new java.lang.Object());
    }

    public final void b(fc2.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f260939a) {
            return;
        }
        for (java.util.Map.Entry entry : this.f260940b.entrySet()) {
            if (((fc2.d) entry.getKey()).F0(this, event)) {
                fc2.d dVar = (fc2.d) entry.getKey();
                if (kz5.z.G(dVar.f417627e, dVar.f417626d)) {
                    if (((fc2.d) entry.getKey()).E0()) {
                        this.f260941c.post(new fc2.b(entry, event));
                    } else {
                        ((fc2.d) entry.getKey()).G0(event);
                    }
                }
            }
        }
    }

    public final void c() {
        this.f260939a = true;
        this.f260941c.quitSafely();
        java.util.Iterator it = this.f260940b.entrySet().iterator();
        while (it.hasNext()) {
            ((fc2.d) ((java.util.Map.Entry) it.next()).getKey()).H0();
        }
        this.f260940b.clear();
    }

    public final void d(fc2.d dVar) {
        if (dVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f260940b;
            if (concurrentHashMap.containsKey(dVar)) {
                concurrentHashMap.remove(dVar);
            }
        }
    }
}
