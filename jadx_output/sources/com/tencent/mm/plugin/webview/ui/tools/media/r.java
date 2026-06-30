package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class r implements com.tencent.xweb.VideoJsCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f185816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185817b;

    public r(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185817b = mPVideoPlayFullScreenView;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public boolean onSetRequestedOrientation(int i17) {
        return false;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEmptied() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoEmptied");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEnded() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoEnded");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, false);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, 7, mPVideoPlayFullScreenView.getEnterId(), 101);
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 4;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEnterFullscreen(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr) {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoEnterFullscreen isVideoTag:" + z17 + ", id:" + j17 + ", width:" + d17 + ", height:" + d18 + ", paused:" + z18 + ", seeking:" + z19 + ", currentTime:" + d19 + ", duration:" + d27 + ", buffered:" + java.util.Arrays.toString(dArr));
        boolean z27 = z18 ^ true;
        mPVideoPlayFullScreenView.E = z27;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, z27);
        if (mPVideoPlayFullScreenView.E) {
            mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 1;
            mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, mPVideoPlayFullScreenView.getMpShareVideoReport().a(), mPVideoPlayFullScreenView.getEnterId(), 101);
        }
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoError(int i17, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.e(mPVideoPlayFullScreenView.f185707d, "onVideoError " + i17 + ", " + str);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, false);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 4;
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185839e = str;
        mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, 11, mPVideoPlayFullScreenView.getEnterId(), 101);
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoExitFullscreen() {
        com.tencent.mars.xlog.Log.i(this.f185817b.f185707d, "onVideoExitFullscreen");
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPause() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoPause");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, false);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        if (mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i != 3) {
            mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, 8, mPVideoPlayFullScreenView.getEnterId(), 101);
        }
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 3;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPlay() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoPlay");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, true);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        if (mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i != 2) {
            mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, mPVideoPlayFullScreenView.getMpShareVideoReport().a(), mPVideoPlayFullScreenView.getEnterId(), 101);
        }
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 2;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPlaying() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        java.lang.String str = mPVideoPlayFullScreenView.f185707d;
        if (!mPVideoPlayFullScreenView.E) {
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.d(mPVideoPlayFullScreenView, true);
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        }
        mPVideoPlayFullScreenView.getMpShareVideoReport().f185843i = 2;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoRateChange(double d17) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSeeked() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoSeeked");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
        mPVideoPlayFullScreenView.getMpShareVideoReport().b(mPVideoPlayFullScreenView.f185725x, 13, mPVideoPlayFullScreenView.getEnterId(), 101);
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSeeking() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoSeeking");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.d0(mPVideoPlayFullScreenView));
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSizeUpdate(double d17, double d18) {
        ot0.m1 m1Var = this.f185817b.f185725x;
        if (!(m1Var != null && m1Var.f373345m == 0)) {
            if (!(m1Var != null && m1Var.f373346n == 0)) {
                return;
            }
        }
        if (m1Var != null) {
            m1Var.f373345m = (int) d17;
        }
        if (m1Var == null) {
            return;
        }
        m1Var.f373346n = (int) d18;
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoTimeUpdate(double d17, double d18, double[] dArr) {
        if (java.lang.System.currentTimeMillis() - this.f185816a >= 500) {
            this.f185816a = java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.q(this.f185817b, d18, d17, dArr));
        }
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        mPVideoPlayFullScreenView.D = d17;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.a(mPVideoPlayFullScreenView);
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoVolumeChange(boolean z17) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoWaiting() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185817b;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "onVideoWaiting");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.d0(mPVideoPlayFullScreenView));
    }
}
