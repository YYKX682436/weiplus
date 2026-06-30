package kh;

/* loaded from: classes12.dex */
public abstract class m2 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f307864b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f307865c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f307866d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f307867e;

    public m2(java.lang.String trackerName, int i17) {
        kotlin.jvm.internal.o.g(trackerName, "trackerName");
        this.f307863a = trackerName;
        this.f307864b = i17;
        this.f307865c = new java.util.concurrent.ConcurrentHashMap();
        jz5.i iVar = jz5.i.f302829d;
        this.f307866d = jz5.h.a(iVar, kh.i2.f307832d);
        this.f307867e = jz5.h.a(iVar, new kh.k2(this));
    }

    public final kh.f2 a(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        kh.h2 h2Var = new kh.h2();
        h2Var.f307794d = i17;
        h2Var.f307795e = name;
        jz5.g gVar = this.f307866d;
        if (((java.lang.Boolean) gVar.getValue()).booleanValue() && i17 == android.os.Process.myTid()) {
            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
            h2Var.f307797g = rh.x2.b(java.lang.Long.valueOf(currentThreadTimeMillis / 10));
            h2Var.f307798h = rh.x2.b(java.lang.Long.valueOf(currentThreadTimeMillis));
            return h2Var;
        }
        wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), i17);
        if (e17 != null) {
            long a17 = ((java.lang.Boolean) gVar.getValue()).booleanValue() ? e17.f445876d + e17.f445875c : e17.a();
            h2Var.f307797g = rh.x2.b(java.lang.Long.valueOf(a17));
            h2Var.f307798h = rh.x2.b(java.lang.Long.valueOf(a17 * 10));
            return h2Var;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TaskTracker", "parse task procStat fail, name = " + name + ", tid = " + i17);
        return null;
    }

    public final long b(kh.f2 snapshot) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        rh.x2 x2Var = this.f307864b == 1 ? snapshot.f307798h : snapshot.f307797g;
        kotlin.jvm.internal.o.d(x2Var);
        java.lang.Number number = x2Var.f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        return number.longValue();
    }

    public boolean c() {
        kh.p2 p2Var = kh.p2.f307885a;
        return ((java.util.List) kh.p2.f307887c.getValue()).contains(this);
    }

    @Override // kh.e2
    public void d() {
    }

    public void e(java.lang.String key, int i17) {
        kh.f2 a17;
        kotlin.jvm.internal.o.g(key, "key");
        kh.f2 f2Var = (kh.f2) ((java.util.concurrent.ConcurrentHashMap) this.f307865c).remove(java.lang.Integer.valueOf(i17));
        if (f2Var == null || (a17 = a(key, android.os.Process.myTid())) == null) {
            return;
        }
        if (a17.f307794d != f2Var.f307794d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskTracker", "task tid mismatch: " + f2Var + " vs " + a17);
            return;
        }
        rh.o2 a18 = a17.a(f2Var);
        kh.d2 d2Var = (kh.d2) this.f307867e.getValue();
        rh.d3 dlt = a18.f395486c;
        java.lang.String str = ((kh.f2) dlt).f307795e;
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.f(dlt, "dlt");
        long b17 = b((kh.f2) dlt);
        d2Var.getClass();
        if (kh.d2.f307778c.a()) {
            d2Var.b().lock(new kh.b2(d2Var, str, b17));
        }
    }

    @Override // kh.e2
    public void f() {
        ((kh.d2) this.f307867e.getValue()).a();
    }

    public void g(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        kh.f2 a17 = a(key, android.os.Process.myTid());
        if (a17 != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f307865c).put(java.lang.Integer.valueOf(i17), a17);
        }
    }

    public final java.lang.Object h(java.lang.String str, int i17, yz5.a taskBlock) {
        kotlin.jvm.internal.o.g(taskBlock, "taskBlock");
        int i18 = 0;
        boolean z17 = str != null;
        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        pj.e eVar = pj.e.f354903a;
        if (z17) {
            try {
                kotlin.jvm.internal.o.d(str);
                g(str, i17);
            } finally {
                if (z17) {
                    kotlin.jvm.internal.o.d(str);
                    e(str, i17);
                }
                if (eVar.g("MicroMsg.TaskTracker", 100, new kh.l2(this, str, i17, currentThreadTimeMillis)) && eVar.i(10)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskTracker", "#tracking from:");
                    java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                    kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
                    int length = stackTrace.length;
                    while (i18 < length) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TaskTracker", " - " + stackTrace[i18]);
                        i18++;
                    }
                }
            }
        }
        return taskBlock.invoke();
    }
}
