package qu2;

/* loaded from: classes5.dex */
public final class r implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366812a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f366813b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f366814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f366815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f366816e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366817f;

    public r(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366812a = collectWhat;
        this.f366814c = new java.util.ArrayList();
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        kotlinx.coroutines.r2 r2Var = this.f366813b;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f366813b = null;
        if (this.f366816e && !this.f366817f) {
            this.f366816e = false;
            this.f366817f = true;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), lu5.a.f321457f, null, new qu2.q(this, map, null), 2, null);
        }
    }

    @Override // ts5.d
    public void cancel() {
        this.f366817f = true;
        this.f366816e = false;
        kotlinx.coroutines.r2 r2Var = this.f366813b;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f366813b = null;
    }

    @Override // ts5.d
    public void start() {
        if (this.f366816e) {
            return;
        }
        this.f366816e = true;
        this.f366817f = false;
        this.f366813b = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), lu5.a.f321457f, null, new qu2.p(this, null), 2, null);
    }
}
