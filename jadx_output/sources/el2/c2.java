package el2;

/* loaded from: classes3.dex */
public final class c2 extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f253761d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f253762e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f253763f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f253764g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f253765h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f253766i;

    public c2(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f253761d = root;
        this.f253762e = basePlugin;
        this.f253763f = "FinderLivePromoteFixedEntranceWidget";
        this.f253764g = jz5.h.b(new el2.r1(this));
        this.f253765h = jz5.h.b(new el2.p1(this));
        this.f253766i = jz5.h.b(new el2.o1(this));
    }

    public static final void k(el2.c2 c2Var, yz5.a aVar) {
        el2.n1 n1Var;
        c2Var.getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context m17 = c2Var.m();
        kotlin.jvm.internal.o.f(m17, "<get-context>(...)");
        if (!(r4Var.Y1(m17) && !r4Var.w1())) {
            aVar.invoke();
            return;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (n1Var = (el2.n1) liveRoomControllerStore.controller(el2.n1.class)) == null) {
            return;
        }
        n1Var.W6(new el2.b2(aVar));
    }

    @Override // jf2.l
    public void F(int i17) {
        o();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f253761d;
        if (viewGroup.getVisibility() != 0) {
            o();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_link), java.lang.Integer.valueOf(com.tencent.mm.R.string.mis));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f253761d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f253761d.findViewById(com.tencent.mm.R.id.lc8);
    }

    @Override // jf2.o
    public void g() {
        this.f253761d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f253761d;
    }

    @Override // jf2.o
    public boolean i() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData;
        el2.n1 n1Var = (el2.n1) this.f253762e.U0(el2.n1.class);
        return ((n1Var == null || (diffMutableLiveData = n1Var.f253875q) == null) ? null : (r45.y42) diffMutableLiveData.getValue()) != null;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f253761d.findViewById(com.tencent.mm.R.id.lc9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final gk2.e l() {
        return (gk2.e) ((jz5.n) this.f253766i).getValue();
    }

    public final android.content.Context m() {
        return (android.content.Context) ((jz5.n) this.f253765h).getValue();
    }

    public final void n(r45.y42 y42Var, java.lang.Long l17, yz5.l lVar) {
        if (zl2.q4.f473933a.E()) {
            db5.t7.makeText(m(), "getJumpInfo!!", 0).show();
        }
        mm2.e1 e1Var = (mm2.e1) l().a(mm2.e1.class);
        long j17 = e1Var.f328983m;
        long j18 = e1Var.f328988r.getLong(0);
        int integer = y42Var.getInteger(1);
        android.content.Context m17 = m();
        kotlin.jvm.internal.o.f(m17, "<get-context>(...)");
        java.lang.String e17 = xy2.c.e(m17);
        byte[] bArr = ((mm2.e1) l().a(mm2.e1.class)).f328985o;
        java.lang.String string = y42Var.getString(4);
        if (string == null) {
            string = "";
        }
        java.lang.String str = string;
        com.tencent.mm.protobuf.g byteString = y42Var.getByteString(2);
        new ke2.v(j17, j18, integer, e17, bArr, str, new com.tencent.mm.protobuf.g(byteString != null ? byteString.g() : null), zl2.r4.f473950a.f1(l(), l17), ((mm2.e1) l().a(mm2.e1.class)).f328993w, null, 512, null).l().K(new el2.q1(this, y42Var, lVar));
    }

    public final void o() {
        df2.nt ntVar;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f253762e;
        el2.n1 n1Var = (el2.n1) lVar.U0(el2.n1.class);
        r45.y42 y42Var = (n1Var == null || (diffMutableLiveData = n1Var.f253875q) == null) ? null : (r45.y42) diffMutableLiveData.getValue();
        if (y42Var == null || (ntVar = (df2.nt) lVar.U0(df2.nt.class)) == null) {
            return;
        }
        r45.yp5 yp5Var = new r45.yp5();
        yp5Var.set(0, java.lang.Long.valueOf(y42Var.getLong(0)));
        yp5Var.set(2, 1);
        yp5Var.set(1, 3);
        yp5Var.set(3, y42Var.getByteString(5));
        ntVar.a7(yp5Var);
    }

    @Override // jf2.o
    public int type() {
        return 19;
    }
}
