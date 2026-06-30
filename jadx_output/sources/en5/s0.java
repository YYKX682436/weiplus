package en5;

/* loaded from: classes14.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f255500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f255501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f255502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f255503h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fn5.n0 n0Var, n0.e5 e5Var, n0.v2 v2Var, g2.g0 g0Var, c1.d0 d0Var) {
        super(0);
        this.f255499d = n0Var;
        this.f255500e = e5Var;
        this.f255501f = v2Var;
        this.f255502g = g0Var;
        this.f255503h = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fn5.n0 n0Var = this.f255499d;
        n0Var.c7("");
        if (!kotlin.jvm.internal.o.b(((fn5.o0) this.f255500e.getValue()).name(), "NO_START")) {
            n0Var.f264723f.setValue(fn5.o0.f264743d);
        }
        if (!((java.lang.Boolean) this.f255501f.getValue()).booleanValue()) {
            g2.g0 g0Var = this.f255502g;
            if (g0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageQuerySearchBar", "input service is null");
            }
            if (g0Var != null && g0Var.f267702b.get() != null) {
                ((u26.o) ((g2.p0) g0Var.f267701a).f267741j).e(g2.h0.ShowKeyboard);
            }
            this.f255503h.a();
        }
        return jz5.f0.f302826a;
    }
}
