package ph2;

/* loaded from: classes10.dex */
public final class b implements ph2.e {

    /* renamed from: d, reason: collision with root package name */
    public ph2.d f354375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354376e;

    /* renamed from: f, reason: collision with root package name */
    public ah2.f f354377f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f354378g;

    public b() {
        com.tencent.mars.xlog.Log.i("CoroutineScopeDrawerLoop", "create hashCode: " + hashCode());
    }

    @Override // ph2.e
    public void a() {
        this.f354376e = false;
        kotlinx.coroutines.r2 r2Var = this.f354378g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // ph2.e
    public void b(ph2.d callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f354375d = callback;
    }

    @Override // ph2.e
    public void c() {
        kotlinx.coroutines.y0 a17;
        this.f354376e = true;
        kotlinx.coroutines.r2 r2Var = this.f354378g;
        kotlinx.coroutines.r2 r2Var2 = null;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ah2.f fVar = this.f354377f;
        if (fVar != null && (a17 = fVar.a()) != null) {
            r2Var2 = kotlinx.coroutines.l.d(a17, null, null, new ph2.a(this, null), 3, null);
        }
        this.f354378g = r2Var2;
    }

    @Override // ph2.e
    public void d(ah2.f fVar) {
        this.f354377f = fVar;
    }
}
