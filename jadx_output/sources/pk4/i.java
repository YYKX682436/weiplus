package pk4;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout) {
        super(1);
        this.f356492d = mMMvVideoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356492d;
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = mMMvVideoLayout.textureView;
        if (mMThumbPlayerTextureView != null) {
            mMThumbPlayerTextureView.setAlpha(1.0f);
        }
        boolean pauseVideoOnPlay = mMMvVideoLayout.getPauseVideoOnPlay();
        java.lang.String str = mMMvVideoLayout.f174512d;
        if (pauseVideoOnPlay) {
            com.tencent.mars.xlog.Log.i(str, "pauseVideoOnPlay, timestamp:" + longValue);
            pk4.t tVar = mMMvVideoLayout.mvMusicProxy;
            if (tVar != null) {
                mMMvVideoLayout.lastPauseMvPosition = tVar.getCurrentPosition();
                kk4.v vVar = mMMvVideoLayout.currentPlayer;
                if (vVar != null) {
                    kk4.b.i(vVar, false, false, 3, null);
                }
                com.tencent.mars.xlog.Log.i(str, "removeCompleteTimer");
                kk4.v vVar2 = mMMvVideoLayout.currentPlayer;
                if (vVar2 != null) {
                    kk4.b.g(vVar2, null, 0L, 2, null);
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = mMMvVideoLayout.playTimer;
                if (n3Var != null) {
                    n3Var.removeCallbacksAndMessages(null);
                }
            }
            com.tencent.mars.xlog.Log.i(str, "pause lastPauseMvPosition:" + mMMvVideoLayout.lastPauseMvPosition);
            mMMvVideoLayout.setPauseVideoOnPlay(false);
        }
        if (!mMMvVideoLayout.getLogFrameRender()) {
            com.tencent.mars.xlog.Log.i(str, "first frame render");
            mMMvVideoLayout.setLogFrameRender(true);
        }
        if (mMMvVideoLayout.A > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first frame render cost:");
            long j17 = mMMvVideoLayout.A;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            mMMvVideoLayout.A = -1L;
        }
        return jz5.f0.f302826a;
    }
}
