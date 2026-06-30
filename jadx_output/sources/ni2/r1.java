package ni2;

/* loaded from: classes10.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f337451a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f337452b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f337453c;

    /* renamed from: d, reason: collision with root package name */
    public xh2.a f337454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337455e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f337456f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f337457g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f337458h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f337459i;

    public r1(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(server, "server");
        this.f337451a = context;
        this.f337452b = buContext;
        this.f337453c = server;
        this.f337455e = "";
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        this.f337456f = k0Var;
        this.f337457g = jz5.h.b(new ni2.q1(this));
        this.f337458h = jz5.h.b(new ni2.p1(this));
        this.f337459i = true;
        k0Var.V1 = true;
        k0Var.f211872n = new ni2.m1(this);
        k0Var.f211881s = new ni2.n1(this);
    }

    public final void a(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        if (micCoverData.f454520a == null) {
            this.f337459i = true;
        } else {
            this.f337459i = false;
        }
        this.f337454d = micCoverData;
        this.f337455e = ((mm2.y2) this.f337452b.a(mm2.y2.class)).R6(micCoverData.f454521b.f454553e);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f337456f;
        k0Var.q(this.f337451a.getResources().getString(com.tencent.mm.R.string.lzl, java.lang.Integer.valueOf(micCoverData.f454521b.f454553e)), 17);
        k0Var.v();
    }
}
