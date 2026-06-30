package du3;

/* loaded from: classes3.dex */
public final class t0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243708f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243709g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243710h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243711i;

    /* renamed from: m, reason: collision with root package name */
    public final eu3.c f243712m;

    /* renamed from: n, reason: collision with root package name */
    public hk0.e f243713n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243714o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243708f = parent;
        this.f243709g = jz5.h.b(new du3.m0(this));
        this.f243710h = jz5.h.b(new du3.l0(this));
        this.f243711i = jz5.h.b(new du3.k0(this));
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f243712m = new eu3.c(context);
        this.f243713n = new hk0.e(hk0.h.f281740e, -707825, 2);
        this.f243714o = jz5.h.b(new du3.s0(this));
    }

    public final androidx.recyclerview.widget.RecyclerView A() {
        java.lang.Object value = ((jz5.n) this.f243710h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final hk0.u0 B() {
        return (hk0.u0) ((jz5.n) this.f243714o).getValue();
    }

    @Override // yt3.r2
    public void onAttach() {
        B().Z6(1, new du3.p0(this));
        B().a7(1, new du3.q0(this));
        hk0.u0 B = B();
        du3.r0 r0Var = new du3.r0(this);
        B.getClass();
        B.f281816g.observe(B.f281813d, r0Var);
    }

    @Override // yt3.r2
    public void onDetach() {
        z().setBackground(null);
        eu3.c cVar = this.f243712m;
        android.view.View view = cVar.f256823f;
        if (view != null) {
            cVar.f256822e = -1;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        z().setOnClickListener(new du3.o0(this));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f243708f.getContext());
        linearLayoutManager.Q(0);
        A().setLayoutManager(linearLayoutManager);
        A().N(new eu3.d(10));
        androidx.recyclerview.widget.RecyclerView A = A();
        eu3.c cVar = this.f243712m;
        A.setAdapter(cVar);
        du3.n0 n0Var = new du3.n0(this);
        cVar.getClass();
        cVar.f256825h = n0Var;
    }

    public final android.view.View z() {
        java.lang.Object value = ((jz5.n) this.f243711i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }
}
