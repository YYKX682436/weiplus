package on2;

/* loaded from: classes3.dex */
public final class d extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f346860d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f346861e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f346862f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f346863g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f346864h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f346865i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f346866m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f346867n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f346868o;

    public d(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f346860d = root;
        this.f346861e = statusMonitor;
        this.f346862f = basePlugin;
        this.f346863g = "Finder.FinderLiveAnchorLotteryEntranceWidget";
        this.f346864h = true;
        this.f346865i = "anchorlive.bottom.lottery";
        this.f346866m = "anchorlive.bottom.lottery.lottery";
        this.f346867n = "anchorlive.bottom.lottery.redpacket";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f87);
        findViewById = findViewById == null ? root : findViewById;
        this.f346868o = findViewById;
        findViewById.setOnClickListener(new on2.a(this));
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.isg);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.ir7);
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.lottery", findViewById2, null, textView, 8, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        l();
    }

    @Override // jf2.o
    public void b() {
        if (this.f346864h && this.f346860d.getVisibility() != 0) {
            this.f346864h = false;
            l();
            boolean z17 = ((mm2.c1) this.f346862f.P0(mm2.c1.class)).T;
            boolean z18 = ((mm2.n0) this.f346862f.P0(mm2.n0.class)).f329273r;
            if (z17 || z18) {
                com.tencent.mars.xlog.Log.i(this.f346863g, "prepare lottery panel for assistant or co-live invitee anchor!");
                com.tencent.mm.plugin.finder.live.util.y.a(this.f346862f, kotlinx.coroutines.q1.f310570c, null, new on2.c(this, null), 2, null);
            }
        }
        this.f346860d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_reward_new), java.lang.Integer.valueOf(com.tencent.mm.R.string.dol));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f346868o.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f346860d.findViewById(com.tencent.mm.R.id.f87);
    }

    @Override // jf2.o
    public void g() {
        this.f346860d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f346860d;
    }

    @Override // jf2.o
    public boolean i() {
        return ((mm2.c1) this.f346862f.P0(mm2.c1.class)).T;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f346860d.findViewById(com.tencent.mm.R.id.f8c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        if (this.f346861e.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327592e, "");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.T, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        df2.gq gqVar = (df2.gq) this.f346862f.U0(df2.gq.class);
        if (gqVar != null) {
            gqVar.b7();
        }
    }

    public final void l() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.T, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        ll2.e.f319133a.j(this.f346865i, false);
    }

    @Override // jf2.o
    public int type() {
        return 6;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f473950a.w1();
    }
}
