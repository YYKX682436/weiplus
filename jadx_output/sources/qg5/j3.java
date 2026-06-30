package qg5;

/* loaded from: classes8.dex */
public final class j3 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f363025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363026b;

    public j3(qg5.u3 u3Var, yz5.a aVar) {
        this.f363025a = u3Var;
        this.f363026b = aVar;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        ((qg5.e3) qg5.u3.T6(this.f363025a)).oj("journey_copy");
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
    }

    @Override // xj.l
    public void onJumpAppFail() {
        ((qg5.e3) qg5.u3.T6(this.f363025a)).oj("journey_copy");
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        ((qg5.e3) qg5.u3.T6(this.f363025a)).oj("journey_copy");
        yz5.a aVar = this.f363026b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        qg5.u3 u3Var = this.f363025a;
        qg5.e3 e3Var = (qg5.e3) qg5.u3.T6(u3Var);
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_copy"), 35480);
        ((qg5.e3) qg5.u3.T6(u3Var)).oj("journey_copy");
    }
}
