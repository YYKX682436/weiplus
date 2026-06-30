package k5;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f304143g = a5.a0.e("StopWorkRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f304144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f304145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f304146f;

    public n(b5.w wVar, java.lang.String str, boolean z17) {
        this.f304144d = wVar;
        this.f304145e = str;
        this.f304146f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean containsKey;
        boolean i17;
        b5.w wVar = this.f304144d;
        androidx.work.impl.WorkDatabase workDatabase = wVar.f17897c;
        b5.e eVar = wVar.f17900f;
        j5.x n17 = workDatabase.n();
        workDatabase.c();
        try {
            java.lang.String str = this.f304145e;
            synchronized (eVar.f17868q) {
                containsKey = ((java.util.HashMap) eVar.f17863i).containsKey(str);
            }
            if (this.f304146f) {
                i17 = this.f304144d.f17900f.h(this.f304145e);
            } else {
                if (!containsKey) {
                    j5.g0 g0Var = (j5.g0) n17;
                    if (g0Var.f(this.f304145e) == a5.q0.RUNNING) {
                        g0Var.p(a5.q0.ENQUEUED, this.f304145e);
                    }
                }
                i17 = this.f304144d.f17900f.i(this.f304145e);
            }
            a5.a0.c().a(f304143g, java.lang.String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f304145e, java.lang.Boolean.valueOf(i17)), new java.lang.Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
