package fo0;

/* loaded from: classes14.dex */
public final class e extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo0.f f264806a;

    public e(fo0.f fVar) {
        this.f264806a = fVar;
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "onFloatBallDeleteButtonClick ballInfo: " + ballInfo);
        fo0.f fVar = this.f264806a;
        fVar.b();
        fVar.d(null);
    }
}
