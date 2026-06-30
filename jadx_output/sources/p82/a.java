package p82;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f352727v;

    public a(dp1.x xVar) {
        super(xVar);
        this.f352727v = "";
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f352727v);
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f352727v);
        this.f93246u = false;
        dp1.x xVar = this.f93239n;
        if (xVar == null || xVar.getActivity() == null) {
            return;
        }
        xVar.getActivity().finish();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f352727v) || com.tencent.mm.vfs.w6.j(this.f352727v);
    }
}
