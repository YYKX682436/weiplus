package lp4;

/* loaded from: classes10.dex */
public final class k0 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.l0 f320370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f320371e;

    public k0(lp4.l0 l0Var, ju3.d0 d0Var) {
        this.f320370d = l0Var;
        this.f320371e = d0Var;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 0L);
        this.f320370d.f320373f.j(j17);
    }

    @Override // bp4.c0
    public void pause() {
        ju3.d0.k(this.f320371e, ju3.c0.f301895p1, null, 2, null);
    }

    @Override // bp4.c0
    public void resume() {
        ju3.d0.k(this.f320371e, ju3.c0.f301913x1, null, 2, null);
    }
}
