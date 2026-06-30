package k5;

/* loaded from: classes13.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f304171e = a5.a0.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f304172a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f304173b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f304174c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f304175d;

    public y() {
        k5.v vVar = new k5.v(this);
        this.f304173b = new java.util.HashMap();
        this.f304174c = new java.util.HashMap();
        this.f304175d = new java.lang.Object();
        this.f304172a = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(vVar);
    }

    public void a(java.lang.String str, long j17, k5.w wVar) {
        synchronized (this.f304175d) {
            a5.a0.c().a(f304171e, java.lang.String.format("Starting timer for %s", str), new java.lang.Throwable[0]);
            b(str);
            k5.x xVar = new k5.x(this, str);
            ((java.util.HashMap) this.f304173b).put(str, xVar);
            ((java.util.HashMap) this.f304174c).put(str, wVar);
            this.f304172a.schedule(xVar, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public void b(java.lang.String str) {
        synchronized (this.f304175d) {
            if (((k5.x) ((java.util.HashMap) this.f304173b).remove(str)) != null) {
                a5.a0.c().a(f304171e, java.lang.String.format("Stopping timer for %s", str), new java.lang.Throwable[0]);
                ((java.util.HashMap) this.f304174c).remove(str);
            }
        }
    }
}
