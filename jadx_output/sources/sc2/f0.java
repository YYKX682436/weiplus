package sc2;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f405874h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f405875i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f405876m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405877n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405878o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(sc2.h1 h1Var, in5.s0 s0Var, int i17, int i18, r45.t01 t01Var, int i19, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, android.view.View view, xc2.p0 p0Var) {
        super(1);
        this.f405870d = h1Var;
        this.f405871e = s0Var;
        this.f405872f = i17;
        this.f405873g = i18;
        this.f405874h = t01Var;
        this.f405875i = i19;
        this.f405876m = refreshLoadMoreLayout;
        this.f405877n = view;
        this.f405878o = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lw2.m videoScaleCleanHelper;
        ey2.j1 info = (ey2.j1) obj;
        kotlin.jvm.internal.o.g(info, "info");
        sc2.h1 h1Var = this.f405870d;
        com.tencent.mars.xlog.Log.i(h1Var.f405928w, "onPlayInfoUpdate");
        if (!la5.b.f317600a.g(true)) {
            in5.s0 s0Var = this.f405871e;
            if (s0Var.f293121e.getResources().getConfiguration().orientation == 1) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = h1Var.Y;
                if (!((finderVideoLayout == null || (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) == null || !videoScaleCleanHelper.f321578c) ? false : true) && info.f257403b / 1000 > this.f405872f && info.f257404c > this.f405873g && (java.lang.System.currentTimeMillis() - info.f257405d) / 1000 >= this.f405874h.getInteger(15) && info.f257402a - info.f257404c > this.f405875i) {
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f405876m;
                    if (!(refreshLoadMoreLayout != null && refreshLoadMoreLayout.isRefreshing)) {
                        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.trm);
                        if (!(p17 != null && p17.getVisibility() == 0)) {
                            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.trk);
                            if (!(p18 != null && p18.getVisibility() == 0)) {
                                pm0.v.X(new sc2.e0(h1Var, s0Var, this.f405877n, this.f405878o));
                                android.content.Context context = s0Var.f293121e;
                                kotlin.jvm.internal.o.f(context, "getContext(...)");
                                pf5.z zVar = pf5.z.f353948a;
                                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                ((ey2.k1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ey2.k1.class)).f257418e.remove(java.lang.Long.valueOf(h1Var.f3145f));
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
