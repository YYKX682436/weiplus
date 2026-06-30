package zc3;

/* loaded from: classes7.dex */
public final class g implements zc3.c {

    /* renamed from: a, reason: collision with root package name */
    public iq0.c f471415a;

    /* renamed from: b, reason: collision with root package name */
    public zq0.a f471416b;

    /* renamed from: c, reason: collision with root package name */
    public final jc3.y0 f471417c;

    public g() {
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicFlutterWebDemo");
        wi6.f299012a = kz5.n0.t0(wi6.f299012a, kz5.c0.i(new rd3.k(), new rd3.j(), new vd3.f(), new vd3.d(), new ce3.a("")));
        this.f471417c = wi6;
    }

    @Override // zc3.c
    public void a() {
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        jc3.s0 s0Var = jc3.s0.f298984d;
        jc3.y0 y0Var = this.f471417c;
        ((nq0.p) tVar).Vi(new iq0.i("MagicFlutterWebDemo", s0Var, 0L, null, kz5.n0.S0(y0Var.f299012a), kz5.n0.Q0(y0Var.f299013b), 0.0d, null, null, 460, null));
    }

    @Override // zc3.c
    public void b(zq0.a container) {
        kotlin.jvm.internal.o.g(container, "container");
        if (this.f471415a == null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.d(tVar);
            iq0.c de6 = gq0.t.de(tVar, new zc3.f(this, container), null, 2, null);
            gq0.t.bh(tVar, de6, null, 2, null);
            this.f471415a = de6;
            this.f471416b = container;
        }
    }

    @Override // zc3.c
    public void show() {
        zq0.a aVar;
        iq0.c cVar = this.f471415a;
        if (cVar == null || (aVar = this.f471416b) == null) {
            return;
        }
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.demo.ui.MBJsEventCreateCanvas(aVar.getWidth(), aVar.getHeight(), 0, 0, null, 28, null));
    }

    @Override // zc3.c
    public void stop() {
        iq0.c cVar = this.f471415a;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f471415a = null;
            this.f471416b = null;
        }
    }
}
