package el2;

/* loaded from: classes3.dex */
public final class l0 extends xt2.m6 implements jf2.o, jf2.m, jf2.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f253845d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f253846e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f253847f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f253848g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f253849h;

    public l0(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f253845d = root;
        this.f253846e = statusMonitor;
        this.f253847f = basePlugin;
        this.f253848g = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.f486432l65);
        this.f253849h = root.findViewById(com.tencent.mm.R.id.f486431l64);
        root.setOnClickListener(new el2.j0(this));
        ym5.a1.h(root, new el2.k0(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        bf2.c.b(bf2.c.f19598a, this.f253847f.S0(), 1, 0, null, 0, 28, null);
    }

    @Override // jf2.o
    public void b() {
        this.f253845d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_link), java.lang.Integer.valueOf(com.tencent.mm.R.string.mis));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f253845d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f253849h;
    }

    @Override // jf2.o
    public void g() {
        this.f253845d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f253845d;
    }

    @Override // jf2.o
    public boolean i() {
        mm2.n0 n0Var = (mm2.n0) this.f253847f.S0().a(mm2.n0.class);
        boolean z17 = ((mm2.c1) this.f253847f.S0().a(mm2.c1.class)).T;
        boolean z18 = n0Var.f329273r;
        kotlinx.coroutines.flow.f3 f3Var = n0Var.f329271p;
        boolean z19 = z17 && !((f3Var != null ? (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue() : null) != null);
        if (zl2.q4.f473933a.D(this.f253847f.S0())) {
            return z19 || z18;
        }
        return false;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imgView = this.f253848g;
        kotlin.jvm.internal.o.f(imgView, "imgView");
        return imgView;
    }

    @Override // jf2.o
    public int type() {
        return 4;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f473950a.w1();
    }
}
