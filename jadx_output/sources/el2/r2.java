package el2;

/* loaded from: classes3.dex */
public final class r2 extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f253899d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f253900e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f253901f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f253902g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f253903h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f253904i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f253905m;

    public r2(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f253899d = root;
        this.f253900e = basePlugin;
        this.f253901f = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.s5o);
        this.f253902g = root.findViewById(com.tencent.mm.R.id.s5n);
        this.f253903h = root.findViewById(com.tencent.mm.R.id.s5q);
        this.f253904i = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.too);
        this.f253905m = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f6i);
        ym5.a1.h(root, new el2.k2(this));
    }

    public static final int k(el2.r2 r2Var) {
        android.view.ViewGroup viewGroup = r2Var.f253899d;
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return -1;
        }
        q26.n i17 = q26.h0.i(new n3.r1(viewGroup2), el2.l2.f253853d);
        return (q26.h0.f(i17) - q26.h0.n(i17, viewGroup)) + 1;
    }

    @Override // jf2.l
    public void F(int i17) {
        jf2.k0.f299377y.b(3, i17 + 1);
    }

    @Override // jf2.o
    public void b() {
        this.f253899d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_share), java.lang.Integer.valueOf(com.tencent.mm.R.string.mit));
    }

    @Override // jf2.m
    public void e(int i17) {
        df2.ox oxVar = (df2.ox) this.f253900e.U0(df2.ox.class);
        if (oxVar != null) {
            oxVar.d7();
        }
        jf2.k0.f299377y.a(3, i17 + 1);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f253902g;
    }

    @Override // jf2.o
    public void g() {
        this.f253899d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f253899d;
    }

    @Override // jf2.o
    public boolean i() {
        if (((mm2.c1) this.f253900e.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f253900e.P0(mm2.n0.class)).f329273r);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = this.f253901f;
        kotlin.jvm.internal.o.f(imageView, "imageView");
        return imageView;
    }

    @Override // jf2.o
    public int type() {
        return 20;
    }
}
