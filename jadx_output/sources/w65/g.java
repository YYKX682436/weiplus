package w65;

/* loaded from: classes12.dex */
public abstract class g implements w65.m {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f443354g = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f443355d = "WeTask-" + f443354g.incrementAndGet();

    /* renamed from: e, reason: collision with root package name */
    public w65.q f443356e = w65.q.f443366d;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.flow.i2 f443357f;

    @Override // w65.m
    public java.lang.String Z0() {
        return "";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof w65.g) {
            return kotlin.jvm.internal.o.b(id(), ((w65.g) obj).id());
        }
        return false;
    }

    @Override // w65.m
    public void f1() {
        w65.p event = f0();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", "submitTaskEvent " + event);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) ((lm.r) ((w65.n) i95.n0.c(w65.n.class))).f319329m).getValue(), null, new w65.f(this, event, null), 1, null);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f319329m).getValue(), null, new lm.g(event, rVar, null), 1, null);
    }

    public java.lang.Integer h() {
        w65.q qVar = this.f443356e;
        if (qVar == w65.q.f443371i) {
            return -600001;
        }
        return qVar == w65.q.f443372m ? -600002 : null;
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " after run");
        this.f443356e = w65.q.f443369g;
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " before run");
        this.f443356e = w65.q.f443367e;
    }

    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " duplicated");
        this.f443356e = w65.q.f443373n;
    }

    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " finish");
        this.f443356e = w65.q.f443370h;
        z();
    }

    public void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " run");
        this.f443356e = w65.q.f443368f;
    }

    @Override // w65.m
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseWeTask", id() + " cancel");
        this.f443356e = w65.q.f443371i;
    }
}
