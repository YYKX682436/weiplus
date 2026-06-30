package jy2;

/* loaded from: classes3.dex */
public final class b extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f302486d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f302487e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f302488f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f302489g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f302490h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f302491i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f302492m;

    public b(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f302486d = root;
        this.f302487e = statusMonitor;
        this.f302488f = basePlugin;
        this.f302489g = "portrait_action_goto_create_lottery";
        this.f302490h = true;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.p_3);
        this.f302491i = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.p8x);
        this.f302492m = "anchorlive.bottom.tools.vote";
        root.setOnClickListener(new jy2.a(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.tools.vote", findViewById, textView, null, 16, null);
    }

    @Override // jf2.l
    public void F(int i17) {
    }

    @Override // jf2.h
    public void b() {
        if (this.f302490h) {
            ll2.e.f319133a.j(this.f302492m, false);
            this.f302490h = false;
        }
        this.f302486d.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_live_vote), java.lang.Integer.valueOf(com.tencent.mm.R.string.ej_));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f302486d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f302486d.findViewById(com.tencent.mm.R.id.p97);
    }

    @Override // jf2.h
    public void g() {
        this.f302486d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f302486d;
    }

    @Override // jf2.h
    public boolean i() {
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderLiveVotingSwitch", 0) == 1;
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233384g) {
            return z17;
        }
        return (((mm2.c1) this.f302488f.P0(mm2.c1.class)).T || (((mm2.n0) this.f302488f.P0(mm2.n0.class)).f329273r)) && z17;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f302486d.findViewById(com.tencent.mm.R.id.fqi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    public int type() {
        return 2;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f473950a.w1();
    }
}
