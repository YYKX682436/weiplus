package dj;

/* loaded from: classes12.dex */
public class b extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final ej.c f232814h;

    /* renamed from: i, reason: collision with root package name */
    public kj.c f232815i;

    /* renamed from: m, reason: collision with root package name */
    public kj.e0 f232816m;

    /* renamed from: n, reason: collision with root package name */
    public kj.m f232817n;

    /* renamed from: o, reason: collision with root package name */
    public kj.u f232818o;

    public b(ej.c cVar) {
        this.f232814h = cVar;
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        if (this.f363454f) {
            kj.m mVar = this.f232817n;
            if (mVar != null) {
                mVar.getClass();
            }
            kj.u uVar = this.f232818o;
            if (uVar != null) {
                uVar.getClass();
            }
            kj.c cVar = this.f232815i;
            if (cVar != null) {
                cVar.getClass();
            }
            kj.e0 e0Var = this.f232816m;
            if (e0Var != null) {
                e0Var.a(z17);
            }
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "Trace";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        ej.c cVar2 = this.f232814h;
        oj.j.c("Matrix.TracePlugin", "trace plugin init, trace config: %s", cVar2.toString());
        this.f232818o = new kj.u(cVar2);
        this.f232817n = new kj.m(application, cVar2);
        this.f232815i = new kj.c(cVar2);
        this.f232816m = new kj.e0(cVar2);
        new com.tencent.matrix.trace.tracer.StackTracer(cVar2);
    }

    @Override // qi.b
    public void e() {
        super.e();
        if (!this.f363454f) {
            oj.j.f("Matrix.TracePlugin", "[start] Plugin is unSupported!", new java.lang.Object[0]);
            return;
        }
        oj.j.f("Matrix.TracePlugin", "start!", new java.lang.Object[0]);
        dj.a aVar = new dj.a(this);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            oj.j.f("Matrix.TracePlugin", "start TracePlugin in Thread[%s] but not in mainThread!", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            oj.g.f345703c.post(aVar);
        }
    }
}
