package l36;

/* loaded from: classes16.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.Executor f315638g;

    /* renamed from: a, reason: collision with root package name */
    public final int f315639a;

    /* renamed from: b, reason: collision with root package name */
    public final long f315640b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f315641c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Deque f315642d;

    /* renamed from: e, reason: collision with root package name */
    public final o36.e f315643e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f315644f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.SynchronousQueue synchronousQueue = new java.util.concurrent.SynchronousQueue();
        byte[] bArr = m36.e.f323386a;
        f315638g = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new m36.d("OkHttp ConnectionPool", true));
    }

    public t() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        this.f315641c = new l36.s(this);
        this.f315642d = new java.util.ArrayDeque();
        this.f315643e = new o36.e();
        this.f315639a = 5;
        this.f315640b = timeUnit.toNanos(5L);
    }

    public final int a(o36.d dVar, long j17) {
        java.util.List list = dVar.f342771n;
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 >= arrayList.size()) {
                return arrayList.size();
            }
            java.lang.ref.Reference reference = (java.lang.ref.Reference) arrayList.get(i17);
            if (reference.get() != null) {
                i17++;
            } else {
                t36.k.f415461a.m("A connection to " + dVar.f342760c.f315475a.f315444a + " was leaked. Did you forget to close a response body?", ((o36.i) reference).f342785a);
                arrayList.remove(i17);
                dVar.f342768k = true;
                if (arrayList.isEmpty()) {
                    dVar.f342772o = j17 - this.f315640b;
                    return 0;
                }
            }
        }
    }
}
