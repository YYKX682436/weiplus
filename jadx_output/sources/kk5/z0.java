package kk5;

/* loaded from: classes8.dex */
public final class z0 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk5.i1 f308705a;

    public z0(kk5.i1 i1Var) {
        this.f308705a = i1Var;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        ((qg5.e3) this.f308705a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
    }

    @Override // xj.l
    public void onJumpAppFail() {
        ((qg5.e3) this.f308705a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        ((qg5.e3) this.f308705a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        kk5.i1 i1Var = this.f308705a;
        qg5.e3 e3Var = (qg5.e3) i1Var.T6();
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_copy"), 35480);
        ((qg5.e3) i1Var.T6()).oj("journey_copy");
    }
}
