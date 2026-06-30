package sc2;

/* loaded from: classes2.dex */
public final class z0 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.i9 f406404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.b f406406f;

    public z0(sc2.h1 h1Var, so2.b bVar) {
        this.f406405e = h1Var;
        this.f406406f = bVar;
        if (!cw2.i9.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cw2.i9.class.getClassLoader(), new java.lang.Class[]{cw2.i9.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoPlayLifecycle");
        }
        this.f406404d = (cw2.i9) newProxyInstance;
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f406404d.B(data);
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f406404d.C(data);
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        this.f406404d.D(mb4Var, j17);
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        this.f406404d.F(mb4Var);
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        this.f406404d.G(mb4Var);
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        this.f406404d.J(mb4Var, waVar, i17);
    }

    @Override // cw2.fb
    public void b(float f17) {
        this.f406404d.b(f17);
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        this.f406404d.d(mb4Var, waVar, i17);
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        this.f406404d.e(mb4Var, i17, i18, rVar);
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f406404d.f(data);
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        this.f406404d.g(mb4Var, tVar);
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar;
        java.lang.Long l17;
        java.lang.Long l18;
        so2.b bVar = this.f406406f;
        long longValue = (bVar == null || (l18 = bVar.f410265d) == null) ? 0L : l18.longValue();
        boolean z17 = false;
        sc2.h1 h1Var = this.f406405e;
        if (longValue > 0) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = h1Var.f405929x;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.f0((bVar == null || (l17 = bVar.f410265d) == null) ? 0L : l17.longValue(), false, 3);
            }
            if (bVar != null) {
                bVar.f410265d = 0L;
            }
        }
        long j17 = mb4Var != null ? mb4Var.getLong(24) : 0L;
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar2 = h1Var.U;
        if (finderHorizontalLongVideoPlayerSeekBar2 != null && finderHorizontalLongVideoPlayerSeekBar2.getV() == j17) {
            z17 = true;
        }
        if (z17 || (finderHorizontalLongVideoPlayerSeekBar = h1Var.U) == null) {
            return;
        }
        finderHorizontalLongVideoPlayerSeekBar.setVideoTotalTimeMs(mb4Var != null ? mb4Var.getLong(24) : 0L);
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        this.f406404d.n(mb4Var, aVar);
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f406404d.p(data);
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        this.f406404d.s(waVar, aVar);
    }

    @Override // cw2.fb
    public void t(long j17, long j18, long j19, java.lang.String str, int i17, bu2.h0 mediaHWInfo, java.lang.String specFormat) {
        kotlin.jvm.internal.o.g(mediaHWInfo, "mediaHWInfo");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        this.f406404d.t(j17, j18, j19, str, i17, mediaHWInfo, specFormat);
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        this.f406404d.u(mb4Var, j17, aVar);
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        sc2.h1 h1Var = this.f406405e;
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar = h1Var.U;
        if (finderHorizontalLongVideoPlayerSeekBar != null) {
            finderHorizontalLongVideoPlayerSeekBar.y(j17);
        }
        h1Var.f405936z1 = j17;
        h1Var.f405934y1 = j18;
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
        this.f406404d.x(mb4Var, waVar, i17, eVar);
    }
}
