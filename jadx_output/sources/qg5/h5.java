package qg5;

/* loaded from: classes8.dex */
public final class h5 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f363011a;

    public h5(qg5.n5 n5Var) {
        this.f363011a = n5Var;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        ((qg5.e3) qg5.n5.U6(this.f363011a)).oj("journey_summarize");
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
    }

    @Override // xj.l
    public void onJumpAppFail() {
        ((qg5.e3) qg5.n5.U6(this.f363011a)).oj("journey_summarize");
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        ((qg5.e3) qg5.n5.U6(this.f363011a)).oj("journey_summarize");
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        qg5.n5 n5Var = this.f363011a;
        qg5.e3 e3Var = (qg5.e3) qg5.n5.U6(n5Var);
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_summarize"), 35480);
        ((qg5.e3) qg5.n5.U6(n5Var)).oj("journey_summarize");
    }
}
