package zv2;

/* loaded from: classes10.dex */
public final class m extends zv2.b {

    /* renamed from: t, reason: collision with root package name */
    public static final zv2.c f476411t = new zv2.c(null);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f476412h;

    /* renamed from: i, reason: collision with root package name */
    public uc0.v f476413i;

    /* renamed from: m, reason: collision with root package name */
    public int f476414m;

    /* renamed from: n, reason: collision with root package name */
    public int f476415n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f476416o;

    /* renamed from: p, reason: collision with root package name */
    public sc2.m3 f476417p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f476418q;

    /* renamed from: r, reason: collision with root package name */
    public so2.i5 f476419r;

    /* renamed from: s, reason: collision with root package name */
    public final android.webkit.ValueCallback f476420s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476414m = -1;
        this.f476415n = -1;
        n(jumpView.getTipsTv(), "product_title_too_long_tips", -1);
        this.f476420s = new zv2.g(this);
    }

    public static final void m(zv2.m mVar) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        android.view.View view = mVar.f476416o;
        if (view == null || (finderJumpInfo = mVar.f476397f) == null) {
            return;
        }
        in5.s0 s0Var = new in5.s0(view);
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        if (mVar.f476417p == null) {
            mVar.f476417p = new sc2.m3();
        }
        sc2.m3 m3Var = mVar.f476417p;
        if (m3Var != null) {
            m3Var.q(new so2.u1(new com.tencent.mm.plugin.finder.storage.FinderItem()), s0Var, view, p0Var, "");
        }
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v vVar = qs2.v.f366327a;
        android.webkit.ValueCallback valueCallback = this.f476420s;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476418q;
        androidx.appcompat.app.AppCompatActivity context = this.f476395d;
        kotlin.jvm.internal.o.g(context, "context");
        if (finderJumpInfo == null) {
            ip.j b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
            java.lang.String d17 = b17.d("FinderMiniAppShopAppId");
            if (d17 == null) {
                d17 = "wx2bff878c51bab23b";
            }
            java.lang.String str = d17;
            java.lang.String d18 = b17.d("FinderMiniAppShopAppPath");
            if (d18 == null) {
                d18 = "/pages/commodityToAdd/index.html?from=post";
            }
            qs2.v.h(vVar, context, str, d18, 0, valueCallback, 8, null);
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317037o = valueCallback;
        b1Var.M = true;
        com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo.getMini_app_info();
        if (mini_app_info != null && mini_app_info.getTransparent_mode()) {
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453251m = b1Var;
        xc2.y2.i(xc2.y2.f453343a, context, p0Var, 0, null, 12, null);
    }

    @Override // zv2.b
    public boolean c() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo == null || finderJumpInfo == null || finderJumpInfo.getMini_app_info() == null || finderJumpInfo.getJumpinfo_type() != 1) {
            return false;
        }
        return finderJumpInfo.getBusiness_type() == 1 || finderJumpInfo.getBusiness_category() == 1;
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        if (com.tencent.mm.ui.bk.C()) {
            so2.i5 i5Var = this.f476419r;
            if (i5Var != null) {
                str = i5Var.f410424b;
            }
            str = null;
        } else {
            so2.i5 i5Var2 = this.f476419r;
            if (i5Var2 != null) {
                str = i5Var2.f410423a;
            }
            str = null;
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setIconUrl(str);
        java.lang.String wording = jumpInfo.getWording();
        if (wording == null) {
            wording = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(finderJumperView, wording, false, 2, null);
        o(this.f476412h);
    }

    @Override // zv2.b
    public void e() {
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(this.f476395d), false, 2, null);
        this.f476418q = j37 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) j37.u0().getCustom(53) : null;
    }

    @Override // zv2.b
    public void f() {
        super.f();
        java.lang.String string = this.f476395d.getString(com.tencent.mm.R.string.eeq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.weixin_store_regular);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.weixin_store_filled);
    }

    @Override // zv2.b
    public void j() {
        f476411t.a(this.f476395d, true, this.f476397f != null);
    }

    @Override // zv2.b
    public void k() {
        f476411t.a(this.f476395d, false, this.f476397f != null);
    }

    @Override // zv2.b
    public void l() {
        java.util.List k17 = kz5.c0.k(new ry2.f(1, 0, 0, new zv2.k(this), null, 22, null), new ry2.f(2, 0, com.tencent.mm.R.string.csu, new zv2.l(this), null, 18, null));
        java.lang.String str = this.f476412h;
        if ((str != null ? str.length() : 0) > 15) {
            k17.add(1, new ry2.f(3, 0, com.tencent.mm.R.string.eoo, new zv2.i(this), new zv2.j(this), 2, null));
        }
        ry2.j.f401398a.a(this.f476395d, k17, null);
    }

    public final void n(android.view.View view, java.lang.String str, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        if (i17 != -1) {
            aVar.ik(view, i17, 25496);
        }
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(this.f476395d);
        aVar.Ai(view, new zv2.f(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }

    public final void o(java.lang.String str) {
        boolean z17 = (str != null ? str.length() : 0) > 15;
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        if (!z17) {
            int i17 = com.tencent.mm.plugin.finder.view.FinderJumperView.f131171u;
            finderJumperView.a(null);
        } else {
            android.content.res.Resources resources = this.f476395d.getResources();
            finderJumperView.a(resources != null ? resources.getString(com.tencent.mm.R.string.evt) : null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", finderJumperView.getTipsTv(), null, 25496);
        }
    }
}
