package fo0;

/* loaded from: classes14.dex */
public final class j extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo0.n f264814a;

    public j(fo0.n nVar) {
        this.f264814a = nVar;
    }

    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoReplaced replacedBallInfo: " + ballInfo + " targetBallInfo: " + ballInfo2);
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = this.f264814a.f264824h;
        if (absLiveMiniView != null) {
            absLiveMiniView.d();
        }
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoRemoved ballInfo: " + ballInfo);
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "onFloatBallDeleteButtonClick ballInfo: " + ballInfo);
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = this.f264814a.f264824h;
        if (absLiveMiniView != null) {
            absLiveMiniView.d();
        }
    }

    @Override // gp1.a0, gp1.z
    public void S(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "onFloatBallCollapseStateChanged ballInfo: " + ballInfo + " oldCollapseState: " + i17 + " newCollapseState: " + i18 + " collapseReason: " + i19 + " expandReason: " + i27);
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo2;
        fo0.n nVar = this.f264814a;
        fo0.b d17 = nVar.f264820d.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick ballInfo: ");
        sb6.append((ballInfo == null || (ballButtonInfo2 = ballInfo.f93054o) == null) ? null : java.lang.Boolean.valueOf(ballButtonInfo2.f93069d));
        sb6.append(" player: ");
        sb6.append(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", sb6.toString());
        boolean z17 = false;
        if ((ballInfo == null || (ballButtonInfo = ballInfo.f93054o) == null || ballButtonInfo.f93069d) ? false : true) {
            if (d17 != null) {
                d17.a1();
            }
            com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = nVar.f264824h;
            if (absLiveMiniView != null) {
                absLiveMiniView.e(false);
                return;
            }
            return;
        }
        if (d17 != null && !d17.isPlaying()) {
            z17 = true;
        }
        if (z17) {
            if (d17 != null) {
                d17.u();
            }
            com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView2 = nVar.f264824h;
            if (absLiveMiniView2 != null) {
                absLiveMiniView2.e(true);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "onFloatBallInfoAdded ballInfo: " + ballInfo);
    }
}
