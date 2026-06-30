package ni2;

/* loaded from: classes10.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f337359a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f337360b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f337361c;

    /* renamed from: d, reason: collision with root package name */
    public xh2.a f337362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337363e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f337364f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f337365g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f337366h;

    public k2(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(server, "server");
        this.f337359a = context;
        this.f337360b = buContext;
        this.f337361c = server;
        this.f337363e = "";
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        this.f337364f = k0Var;
        this.f337365g = jz5.h.b(new ni2.j2(this));
        this.f337366h = jz5.h.b(new ni2.i2(this));
        k0Var.V1 = true;
        k0Var.f211872n = new ni2.f2(this);
        k0Var.f211881s = new ni2.g2(this);
    }

    public final void a() {
        java.lang.String str;
        km2.q qVar;
        fj2.s sVar = fj2.s.f263183a;
        ml2.w4 w4Var = ml2.w4.f328189g;
        xh2.a aVar = this.f337362d;
        if (aVar == null || (qVar = aVar.f454520a) == null || (str = qVar.f309172c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        ((nj2.b) ((jz5.n) this.f337366h).getValue()).w();
    }
}
