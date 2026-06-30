package mm2;

/* loaded from: classes3.dex */
public final class t2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.iy1 f329427f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329428g;

    /* renamed from: h, reason: collision with root package name */
    public int f329429h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f329430i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f329431m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f329432n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f329433o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qp1 f329434p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f329435q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    public final void N6(java.lang.Integer num) {
        this.f329435q = num;
    }

    public final void O6(r45.qp1 qp1Var) {
        this.f329434p = qp1Var;
    }

    public final void P6(boolean z17) {
        this.f329433o = z17;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f329427f = null;
        this.f329428g = false;
        this.f329429h = 0;
        this.f329430i = false;
        this.f329431m = null;
        this.f329432n = null;
        this.f329433o = false;
        this.f329434p = null;
        this.f329435q = null;
    }
}
